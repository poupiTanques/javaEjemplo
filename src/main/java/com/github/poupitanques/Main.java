package com.github.poupitanques;

import com.github.poupitanques.humanos.Estudiante;
import com.github.poupitanques.humanos.Persona;
import com.github.poupitanques.humanos.Profesor;
import com.github.poupitanques.seres.Animal;
import com.github.poupitanques.seres.Gato;
import com.github.poupitanques.seres.Perro;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Johnny", "Deep", 59);

        Profesor profesor = new Profesor("Lucio", "Gayoso", 22);

        Estudiante estudiante = new Estudiante("Antonella", "Vega", 18);

        System.out.println(persona.saludar());
        System.out.println(profesor.saludar());
        System.out.println(estudiante.saludar());

        Animal animal1 = new Animal();
        animal1.sonido();
        Gato gato1 = new Gato();
        gato1.sonido();
        Perro perro1 = new Perro();
        perro1.sonido();
    }
}