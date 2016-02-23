package com.pruebaJSE.negocio;

import com.pruebaJSE.modelo.entidades.Colega;

public interface ServicioGestionColegas {

	
	public void darDeAltaUnNuevoColega(Colega colega);

	public void darDeBajaUnColega(int id);
}
