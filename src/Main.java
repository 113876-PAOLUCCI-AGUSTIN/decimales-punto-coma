import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // INGRESO CON DECIMAL SEPARADO POR COMA.
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número decimal separado por coma...");
        Double numeroIngresado01 = input.nextDouble();
        System.out.println("El número que ingresaste es: "+numeroIngresado01);

        // INGRESO CON DECIMAL SEPARADO POR PUNTO.
        input = new Scanner(System.in);
        System.out.println("Ingrese un número decimal separado por punto...");
        Double numeroIngresado02 = Double.parseDouble(input.nextLine());
        input.close();
        System.out.println("El número que ingresaste es: "+numeroIngresado02);
    }
}