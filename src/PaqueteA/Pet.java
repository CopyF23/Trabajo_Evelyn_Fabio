/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaqueteA;

/**
 *
 * @author LENOVO
 */
public class Pet {

    //Atributos
    private String nombre;
    private String especie;

    //Constructor
    public Pet(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public Pet() {
        nombre = "";
        especie = "";
    }

    //Propiedades
    
    //Get
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    //Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

}
