/*
Nombre: Fabio Torres
Fecha: 22/08/2023
 */
package PaqueteA;

public class Vehicle {

    // Atributos
    private String placal;
    private String color;
    private int cantAsientos;

    // Constructor
    public Vehicle(String placal, String color, int cantAsientos) {
        this.placal = placal;
        this.color = color;
        this.cantAsientos = cantAsientos;
    }

    // Propiedades
    public void setPlacal(String placal) {
        this.placal = placal;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public String getPlacal() {
        return placal;
    }

    public String getColor() {
        return color;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

}
