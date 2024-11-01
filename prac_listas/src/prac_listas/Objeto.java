/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prac_listas;


public  class Objeto { //Atributos de la clase objeto
    private String nombre;
    private String tipo;
    private int id;

    public Objeto(String nombre, String tipo, int id) { //Constructor de la clase
        this.nombre = nombre;
        this.tipo = tipo;
        this.id = id;
    }
    public Objeto(){ //Constructor vacío
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() { //ToString que se mostrará al ejecutar el metodo de verObjetos
        return "Nombre objeto: "+this.nombre+"\nTipo: "+this.tipo+"\nID: "+this.id+"\n";
    }

    
    
}
