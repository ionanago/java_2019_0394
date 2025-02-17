package com.ipartek.formacion.uf2216.ejemplos.poo.interfaces;

public class InterfacePrueba {

	public static void main(String[] args) {
		Rodable[] rodables = new Rodable[2];
		
		rodables[0] = new Naranja();
		rodables[1] = new Balon();
		
		for(Rodable rodable: rodables) {
			if(rodable instanceof Comestible) {
				((Comestible)rodable).comer();
			}
			
			if(rodable instanceof Balon) {
				System.out.println("El siguiente va a ser un bal�n");
			}
			
			rodable.rodar();
		}
	}

}
