package org.example;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("pepito", "perez",  LocalDate.of(1972,Month.APRIL, 23));
        Persona p2 = new Persona("pepita", "perez", LocalDate.of(1985 , Month.DECEMBER, 14));
        Persona p3 = new Persona("fulanito", "menganito", LocalDate.of(2002, Month.FEBRUARY, 02));
        Persona p4 = new Persona("fulana", "mengana", LocalDate.of(1989, Month.OCTOBER, 14));


        ListaPersona lista = new ListaPersona();
        lista.agregarPersona(p1);
        lista.agregarPersona(p2);
        lista.agregarPersona(p3);
        lista.agregarPersona(p4);
        String mensaje =  lista.toString();
        System.out.println(mensaje);



    }
}