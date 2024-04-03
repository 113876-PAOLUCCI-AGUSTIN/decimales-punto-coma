import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // INGRESO CON DECIMAL SEPARADO POR COMA.
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número decimal separado por coma...");
        Double num01 = input.nextDouble();
        System.out.println("El número que ingresaste es: "+num01);

        // INGRESO CON DECIMAL SEPARADO POR PUNTO.
        input = new Scanner(System.in);
        System.out.println("Ingrese un número decimal separado por punto...");
        Double num02 = Double.parseDouble(input.nextLine());
        input.close();
        System.out.println("El número que ingresaste es: "+num02);

        // PRUEBA DE QUE AMBOS NÚMEROS SON FACTIBLES PARA HACER OPERACIONES MATEMÁTICAS.
        double num03 = Math.pow(num01,num02);
        System.out.println("El primer número elevado al segundo número es: " +num03);
    }
}