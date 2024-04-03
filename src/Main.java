import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // INGRESO CON DECIMAL SEPARADO POR COMA.
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número decimal separado por coma...");
        Double numeroIngresado01 = input.nextDouble();
        System.out.println("El número que ingresaste es: "+numeroIngresado01);
    }
}