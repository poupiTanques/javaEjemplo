package com.github.poupitanques.humanos;

public class Profesor extends Persona {

    public Profesor(String nombre, String apellido, Integer edad) {
        super(nombre, apellido, edad);
        this.setEdad(edad);
    }
}
