package org.example;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@AllArgsConstructor
@NoArgsConstructor
public class Persona {
    @Getter
    @Setter
    private String nombre, apellido;
    @Getter @Setter
    private LocalDate fechaDeNacimiento;

    @Override
    public String toString() {
        return  "*************************************************** \n " +
                "Nombre y Apellido: " + nombre + ' ' + apellido + '\n' +
                "Fecha De Nacimiento: " + fechaDeNacimiento + '\n' +
                "*************************************************** \n"
                ;
    }
}
