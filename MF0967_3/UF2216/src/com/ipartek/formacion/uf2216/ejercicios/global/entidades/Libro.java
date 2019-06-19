package com.ipartek.formacion.uf2216.ejercicios.global.entidades;

public class Libro {
	//TODO: ISBN, Editorial, Autor, Descripci�n, G�nero, Edici�n, IsBorrado, Fecha de impresi�n
	private long id;
	private String titulo;
	
	public Libro(long id, String titulo) {
		super();
		this.id = id;
		this.titulo = titulo;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + "]";
	}
}
