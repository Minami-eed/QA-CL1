package com.cibertec.evaluacionlab1;

import org.junit.Test;
import org.junit.Assert;
import java.time.LocalDate;

public class HotelTests {

    // Definir el caso de prueba 1: Registrar habitación de hotel con datos válidos
    @Test
    public void testRegistrarHabitacionConDatosValidos() {
        // Crear un objeto de la clase Hotel con los datos válidos
        Hotel hotel = new Hotel("123", "Juan Pérez", LocalDate.of(2023, 9, 26));

        // Ejecutar el método registrarHabitacion y obtener el resultado
        String resultado = hotel.registrarHabitacion();

        // Comparar el resultado con el esperado
        Assert.assertEquals("Debe ingresar una FECHA y DATOS válidos", resultado);

        //Imprimir un mensaje que indique que el test fue exitoso
        System.out.println("TEST 1: Exitoso");
        System.out.println("-------------------------------------");
        System.out.println("->  El registro fue correctamente validado");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
    }

    // Definir el caso de prueba 2: Registrar habitación de hotel con fecha de reserva inválida
    @Test
    public void testRegistrarHabitacionConFechaReservaInvalida() {
        // Crear un objeto de la clase Hotel con la fecha de reserva inválida
        Hotel hotel = new Hotel("123", "Juan Pérez", LocalDate.of(2023, 9, 26));

        // Ejecutar el método registrarHabitacion y obtener el resultado
        String resultado = hotel.registrarHabitacion();

        // Comparar el resultado con el esperado
        Assert.assertEquals("Debe ingresar una FECHA y DATOS válidos", resultado);

        //Imprimir un mensaje que indique que el test fue exitoso
        System.out.println("TEST 2: Exitoso");
        System.out.println("-------------------------------------");
        System.out.println("->  La Fecha fue correctamente validada");
    }
}
