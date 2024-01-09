import java.util.Scanner; // Se importó Scanner

/*
 * Este programa solicita al usuario que ingrese un número.
 * El programa utiliza un bucle while para iterar sobre los dígitos del número y realiza
 * comparaciones para determinar la cantidad de dígitos afortunados (3, 7, 8, 9) y no afortunados (0,1,2,4,5,6).
 * Al final, se imprime un mensaje indicando si el número es afortunado o no, basándose en
 * la comparación de las cantidades de dígitos afortunados y no afortunados.
 */
public class Codigo5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // System.in como argumento

        System.out.print("Introduzca un número: ");
        int numUser = Integer.parseInt(s.nextLine()); // Se modificó el nombre de la variable y convertir string a int
        int numOriginal = numUser; // Guardar el valor original
        
        int counterDigitAf = 0; // Se modificó el nombre de la variable
        int counterDigitNotAf = 0; // Se modificó el nombre de la variable

        while (numUser > 0) {
            int digit = numUser % 10; // Se modificó el nombre de la variable
            if ((digit == 3) || (digit == 7) || (digit == 8) || (digit == 9)) {
            	counterDigitAf++;
            } else {
            	counterDigitNotAf++;
            }
            numUser /= 10; // Actualizar numIngresado dentro del ciclo
        }

        if (counterDigitAf > counterDigitNotAf) {
            System.out.println("El " + numOriginal + " es un número afortunado.");
        } else {
            System.out.println("El " + numOriginal + " no es un número afortunado.");
        }
        
        s.close(); // Se cierra el objeto scanner para liberar recursos
    }
}