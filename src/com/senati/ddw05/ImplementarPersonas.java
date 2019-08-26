package com.senati.ddw05;

public class ImplementarPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Personas Obrero1 = new Personas();
		Obrero1.id = 1;
		Obrero1.nombre = "Juan";
		Obrero1.apellido = "Perez";
		Obrero1.Sexo = "Masculino";
		Obrero1.Fnac = "26/12/2000";
		
		Personas Obrero2 = new Personas(2, "Alexis", "Huayanay", "Masculino", "02/02/2002");
		Personas Obrero3 = new Personas(3, "Adam", "Cabanillas", "Masculino", "22/10/2001");
		Personas Obrero4 = new Personas(4, "Rosali", "Nazario", "Femenino", "11/02/2002");
		Personas Obrero5 = new Personas(5, "Carla", "More", "Femenino", "20/10/2001");
		
		Personas Gerente = new Personas(1, "Jorge", "Luque", "Masculino", "11/06/1975");
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("Datos registrados de Obreros");
		System.out.println(Obrero1.toString());
		System.out.println(Obrero2.toString());
		System.out.println(Obrero3.toString());
		System.out.println(Obrero4.toString());
		System.out.println(Obrero5.toString());
		System.out.println("-----------------------------------------------------------");
		System.out.println("");
		System.out.println("-----------------------------------------------------------");
		System.out.println("Datos registrados de Gerente");
		System.out.println(Gerente.toString());
		System.out.println("-----------------------------------------------------------");
		
	}

}
