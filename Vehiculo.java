// importamos Scanner para poder leer lo que escribe el usuario por teclado
import java.util.Scanner;

// clase principal del programa
class Vehiculo {
    // metodo main donde empieza a correr el programa
    public static void main(String[] args) {
        // creamos el scanner para leer datos del teclado
        Scanner sc = new Scanner(System.in);

        // variables para guardar los datos del vehiculo
        String marca;
        String modelo;
        String cilindrada;
        String tipoCombustible;
        int capacidad;

        // pedimos la marca al usuario
        System.out.print("Ingrese la marca: ");
        marca = sc.nextLine();

        // pedimos el modelo
        System.out.print("Ingrese el modelo: ");
        modelo = sc.nextLine();

        // pedimos la cilindrada
        System.out.print("Ingrese la cilindrada: ");
        cilindrada = sc.nextLine();

        // pedimos el tipo de combustible
        System.out.print("Ingrese el tipo de combustible: ");
        tipoCombustible = sc.nextLine();

        // pedimos capacidad de pasajeros (numero entero)
        System.out.print("Ingrese la capacidad en pasajeros: ");
        capacidad = sc.nextInt();

        // mostramos los datos que ingreso el usuario
        System.out.println("");
        System.out.println("La marca que ha ingresado es: " + marca);
        System.out.println("El modelo que ha ingresado es: " + modelo);
        System.out.println("La cilindrada que ha ingresado es: " + cilindrada);
        System.out.println("El tipo de combustible es: " + tipoCombustible);
        System.out.println("Tiene una capacidad de " + capacidad + " pasajeros.");

        // cerramos el scanner
        sc.close();
    }
}