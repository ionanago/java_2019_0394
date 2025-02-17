package com.ipartek.formacion.uf2216.ejercicios.global.presentacionconsola;

import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.Crudable;
import com.ipartek.formacion.uf2216.ejercicios.global.accesodatos.LibrosDAOColeccion;
import com.ipartek.formacion.uf2216.ejercicios.global.entidades.Libro;

public class MantenimientoLibros {

	public static void main(String[] args) {
		Crudable<Libro> dao = LibrosDAOColeccion.getInstance();
		
		dao.insertar(new Libro(1, "T�tulo 1"));
		dao.insertar(new Libro(2, "T�tulo 2"));
		
		for(Libro libro: dao.obtenerTodos()) {
			System.out.println(libro);
		}
		
		//TODO Men� con insertar, modificar, borrar, listar, buscar por id
		//TODO Buscar por titulo
		
		System.out.println("1. A�adir");
		System.out.println("2. Modificar");
		System.out.println("3. Borrar");
		System.out.println("4. Listado");
		System.out.println("5. Buscar por Id");
	}

}
