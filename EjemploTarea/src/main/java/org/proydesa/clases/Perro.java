package org.proydesa.clases;

public class Perro {
    // Atributos
    private String nombre;
    private int edad;
    
    //Getter and Setters

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public Perro(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    
    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
}
