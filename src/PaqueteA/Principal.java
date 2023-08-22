/*
Nombre: Evelyn Paniagua | Fabio Torres
Fecha: 22/08/2023
 */
package PaqueteA;

public class Principal {

    public static void main(String[] args) {

        // Crear una instancia de Vehicle
        Vehicle vehicle = new Vehicle("BDC021", "Rojo", 5);

        // Crear una instancia de Pet
        Pet pet = new Pet("Cuki", "Perro");

        // Imprimir información de Vehicle
        System.out.println("\nClase Vehicle\n");
        System.out.println("Placa: " + vehicle.getPlacal() + "\nColor: " + vehicle.getColor() + "\nCant Asientos: " + vehicle.getCantAsientos());

        // Imprimir información de Pet
        System.out.println("\nClase Pet\n");

        System.out.println("Nombre: " + pet.getNombre() + "\nEspecie: " + pet.getEspecie());
    }

}
