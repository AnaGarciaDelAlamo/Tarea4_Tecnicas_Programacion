import java.util.Scanner;

public class Ejercicio3 {
    /*Modificar el algoritmo anterior para mostrar además el porcentaje de notas superiores a 10/20.

Ejemplo de ejecución del algoritmo:

¿Nota (-1 para terminar)?

14

¿Nota (-1 para terminar)?

12

¿Nota (-1 para terminar)?

9

¿Nota (-1 para terminar)?

7

¿Nota (-1 para terminar)?

10

¿Nota (-1 para terminar)?

-1

Media = 10,4 (60 % ≥10)*/

    public static void main(String[] args) {
        // TODO code application logic here
        double nota, suma, media;
        int n, superiores;
        Scanner teclado = new Scanner(System.in);
        suma = 0;
        n = 0;
        superiores = 0;
        System.out.println("¿Nota (-1 para terminar)?");
        nota = teclado.nextDouble();
        while (nota != -1) {
            suma = suma + nota;
            n = n + 1;
            if (nota >= 10) {
                superiores = superiores + 1;
            }
            System.out.println("¿Nota (-1 para terminar)?");
            nota = teclado.nextDouble();
        }
        media = suma / n;
        System.out.println("La nota media es " + media + " (" + (superiores * 100 / n) + "% ≥10)");
    }
}
