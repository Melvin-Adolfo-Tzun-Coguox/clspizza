package edu.ejercicio;

    public class Topping {
        private String nombre;

        public Topping(String nombre) {
            this.nombre = nombre;
        }

        public void agregar(Pizza pizza) {
            pizza.getIngredientes().add(nombre);
        }
    }
