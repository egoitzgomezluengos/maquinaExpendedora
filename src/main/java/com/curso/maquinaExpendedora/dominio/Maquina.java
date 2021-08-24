package com.curso.maquinaExpendedora.dominio;

import java.io.Serializable;

public class Maquina implements Serializable{

	private static final long serialVersionUID = 1L;
	//variables
	private Refresco refresco;

	//constructores
	public Maquina( Refresco refresco) {
		super();
		this.refresco = refresco;
	}


	//metodos getter y setter

	
	//otros metodos
	public void reponer(int cantidad) {
		this.refresco.setStock(this.refresco.getStock()+ cantidad);
		System.out.println("latas repuestas");
		
	}

	public void vender() {
		if(this.refresco.getStock() == 0 ) {
			//throw exception
			System.out.println("No nos quedan latas de cocacola, lamentamos las molestias");
		}else {
			this.refresco.setStock(this.refresco.getStock()-1);
			System.out.println("Gracias por su compra");
		}
		
	}

}
