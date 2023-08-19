package edu.ejercicio;

import java.util.List;

public class PizzaItaliana extends Pizza {
        private String salsa;
        private int tiempoEnHorno;

        // Constructor
        public PizzaItaliana(String nombre, double precio, List<String> ingredientes, String salsa, int tiempoEnHorno) {
            super(nombre, precio, ingredientes);
            this.salsa = salsa;
            this.tiempoEnHorno = tiempoEnHorno;
        }

        // Método preparar (sobreescribe)
        @Override
        public void preparar() {
            super.preparar();
            System.out.println("Agregando la salsa: " + salsa);
            System.out.println("La pizza italiana está lista para ser servida.");
        }

        // Método toString (sobreescribe)
        @Override
        public String toString() {
            return super.toString() + ", salsa: " + salsa + ", tiempo en horno: " + tiempoEnHorno;
        }
    }


