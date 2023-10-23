package main;
import java.util.Scanner;

/**
 * class ejerciciopractica3
 * @author santi
 */
public class Calculadora {
	/**
	 * Este es el metodo de entrada del programa
	 * @param args
	 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nume1, num2, resultado;
        char operador;

        System.out.print("Ingrese el primer número: ");
        nume1 = scanner.nextDouble();

        System.out.print("Ingrese el operador (+, -, *, /): ");
        operador = scanner.next().charAt(0);

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        switch (operador) {
            case '+':
                resultado = nume1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '-':
                resultado = nume1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '*':
                resultado = nume1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case '/':
                if (num2 != 0) {
                    resultado = nume1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Error: División por cero no permitida.");
                }
                break;
            default:
                System.out.println("Operador no válido.");
        }

        scanner.close();
    }
}
