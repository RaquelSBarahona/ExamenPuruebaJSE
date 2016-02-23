package com.pruebaJSE.persistencia;


import java.sql.SQLException;
import java.util.Collection;

import com.pruebaJSE.modelo.entidades.Colega;

public interface ColegaDao {

	public void alta(Colega colega) throws SQLException;
	
	public void bajaPorId(int id) throws SQLException;
	
	public Collection<Colega>consultarTodos() throws SQLException;
	
    public Colega consultarPorId(int id) throws SQLException;
	
    public void modificar(Colega colega) throws SQLException;
	 
	
}
