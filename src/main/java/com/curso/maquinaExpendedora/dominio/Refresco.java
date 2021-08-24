package com.curso.maquinaExpendedora.dominio;

import java.io.Serializable;

public class Refresco implements Serializable {

	private static final long serialVersionUID = 1L;
	//variables
	private String sabor;
	private int cl;
	private double precio;
	private int stock;
	private boolean agotado;

	//constructor
	public Refresco(String sabor, int cl, double precio, int stock, boolean agotado) {
		super();
		this.sabor = sabor;
		this.cl = cl;
		this.precio = precio;
		this.stock = stock;
		this.agotado = agotado;
	}


	//metodos getters y setters
	public String getSabor() {
		return sabor;
	}


	public int getCl() {
		return cl;
	}


	public double getPrecio() {
		return precio;
	}


	public int getStock() {
		return stock;
	}


	public boolean isAgotado() {
		return agotado;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public void setCl(int cl) {
		this.cl = cl;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public void setStock(int stock) {
		this.stock = stock;
	}


	public void setAgotado(boolean agotado) {
		this.agotado = agotado;
	}


}
