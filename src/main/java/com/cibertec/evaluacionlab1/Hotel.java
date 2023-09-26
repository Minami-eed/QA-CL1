package com.cibertec.evaluacionlab1;

import java.time.LocalDate;

public class Hotel {

    // Definir los atributos de la clase
    private final String numeroHabitacion;
    private final String nombreCliente;
    private final LocalDate fechaReserva;

    // Definir el constructor de la clase
    public Hotel(String numeroHabitacion, String nombreCliente, LocalDate fechaReserva) {
        this.numeroHabitacion = numeroHabitacion;
        this.nombreCliente = nombreCliente;
        this.fechaReserva = fechaReserva;
    }

    // Método para validar el número de la habitación
    public boolean validarNumeroHabitacion() {
        // El número de la habitación debe tener 3 caracteres
        if (numeroHabitacion.length() != 3) {
            return false;
        }
        // El primer carácter debe ser 1, 2 o 3
        char primerCaracter = numeroHabitacion.charAt(0);
        if (primerCaracter != '1' && primerCaracter != '2' && primerCaracter != '3') {
            return false;
        }
        // Los dos caracteres restantes deben ser numéricos
        char segundoCaracter = numeroHabitacion.charAt(1);
        char tercerCaracter = numeroHabitacion.charAt(2);
        return Character.isDigit(segundoCaracter) && Character.isDigit(tercerCaracter);
    }

    // Método para validar el nombre del cliente
    public boolean validarNombreCliente() {
        // El nombre del cliente debe contener al menos 4 caracteres alfabéticos
        int contadorAlfabeticos = 0;
        for (int i = 0; i < nombreCliente.length(); i++) {
            char caracter = nombreCliente.charAt(i);
            if (Character.isAlphabetic(caracter)) {
                contadorAlfabeticos++;
            }
        }
        return contadorAlfabeticos >= 4;
    }

    // Método para validar la fecha de reserva
    public boolean validarFechaReserva() {
        // La fecha de reserva debe ser mayor a la fecha actual
        LocalDate fechaActual = LocalDate.now();
        return fechaReserva.isAfter(fechaActual);

    }

    // Método para registrar la habitación de hotel
    public String registrarHabitacion() {

        // Validar los datos ingresados
        boolean numeroValido = validarNumeroHabitacion();
        boolean nombreValido = validarNombreCliente();
        boolean fechaValida = validarFechaReserva();

        // Si todos los datos son válidos, mostrar el mensaje de éxito y guardar los
        // datos en la base de datos
        if (numeroValido && nombreValido && fechaValida) {
            // Aquí se podría implementar el código para guardar los datos en la base de
            // datos
            return "El registro ha sido exitoso";
        }

        // Si algún dato no es válido, mostrar el mensaje de error correspondiente
        else {
            if (!numeroValido) {
                return "Ingrese una habitación válida";
            }
            if (!nombreValido) {
                return "Recuerde que el nombre del cliente debe contener al menos 4 caracteres";
            }
            return "Debe ingresar una FECHA y DATOS válidos";
        }
    }
}
