package com.github.poupitanques.humanos;

public class Estudiante extends Persona {

    public Estudiante(String nombre, String apellido, Integer edad) {
        super(nombre, apellido, edad);
        this.setEdad(edad);
    }
}
