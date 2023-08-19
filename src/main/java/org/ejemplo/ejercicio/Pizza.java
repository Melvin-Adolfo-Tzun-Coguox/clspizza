package edu.ejercicio;

import java.util.Calendar;
import java.util.List;

public class Pizza {

        private String nombre;
        private double precio;
        private List<String> ingredientes;

        // Constructor
        public Pizza(String nombre, double precio, List<String> ingredientes) {
            this.nombre = nombre;
            this.precio = precio;
            this.ingredientes = ingredientes;
        }

        // Método preparar
        public void preparar() {
            System.out.println("La pizza está lista para ser servida.");
        }

        // Método toString
        @Override
        public String toString() {
            return "Nombre de la pizza: " + nombre + ", y su precio es: " + precio;
        }

        public List<String> getIngredientes() {
        return ingredientes;
        }
}
