package com.pruebaJSE.persistencia;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Date;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;

import com.pruebaJSE.modelo.entidades.Colega;

public class TestMysqlColegaDao {

	@Test
	public void test() {

		Colega colega = new Colega(1, "Raquel", "Mora", new Date());

		BasicDataSource ds = new BasicDataSource();
		ds.setUrl("jdbc:mysql://localhost:3306/colegajdbc");
		ds.setUsername("root");
		ds.setPassword("root");
		ds.setDriverClassName("com.mysql.jdbc.Driver");

		MySqlColegaDao sut = new MySqlColegaDao(ds);

		try {
			sut.alta(colega);

			Colega colegaObtenido = sut.consultarPorId(colega.getId());

			assertEquals(colega, colegaObtenido);
		} catch (SQLException e) {
			e.printStackTrace();
			fail("Aparece un SQLException, y no debería: " + e.getMessage());
		}

	}
}
