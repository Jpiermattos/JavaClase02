package com.senati.ddw05;
public class Personas {
	int id;
	String nombre;
	String apellido;
	String Sexo;
	String Fnac;
	public Personas(int id, String nombre, String apellido, String sexo, String fnac) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		Sexo = sexo;
		Fnac = fnac;
	}
	public Personas() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getSexo() {
		return Sexo;
	}
	public void setSexo(String sexo) {
		Sexo = sexo;
	}
	public String getFnac() {
		return Fnac;
	}
	public void setFnac(String fnac) {
		Fnac = fnac;
	}
	@Override
	public String toString() {
		return "Personas [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", Sexo=" + Sexo + ", Fnac="
				+ Fnac + "]";
	}
}
