package com.curso.maquinaExpendedora;

import com.curso.maquinaExpendedora.dominio.Maquina;
import com.curso.maquinaExpendedora.dominio.Refresco;

public class Application
{
	public static void main( String[] args )
	{
		Refresco refresco = new Refresco("fresa", 500, 2.75, 8, false);
		Maquina maquina = new Maquina(refresco);
		
		System.out.println("tenemos " + refresco.getStock() + " de cocacolas");
		
		maquina.vender();
		maquina.vender();
		maquina.vender();
		
		System.out.println("tenemos " + refresco.getStock() + " de cocacolas");
		
		System.out.println("reponemos las latas que se han vendido");
		
		maquina.reponer(3);
		
		System.out.println("tenemos " + refresco.getStock() + " de cocacolas");
		
		maquina.vender();
		maquina.vender();
		maquina.vender();
		maquina.vender();
		maquina.vender();
		maquina.vender();
		maquina.vender();
		maquina.vender();
		maquina.vender();
		maquina.vender();
		maquina.vender();
		maquina.vender();
		
		System.out.println("como no nos quedan cocacolas reponemos todas las latas");
		
		maquina.reponer(8);
		
		
	}
}