import java.util.Scanner;

public class Ejercicio5 {
    /*Esta vez, el ordenador debe adivinar un número elegido por el usuario. El usuario le indica si el número es mayor (+), menor (-) o si lo ha encontrado (=).

Ejemplo de ejecución del algoritmo:

Elija un número del 1 al 100, luego presione cualquier tecla.

a

Pruebo con 45, ¿es mayor, menor o es el número (+/-/=)?

-

Pruebo con 10, ¿es mayor, menor o es el número (+/-/=)?

+

Pruebo con 22, ¿es mayor, menor o es el número (+/-/=)?

+

Pruebo con 27, ¿es mayor, menor o es el número (+/-/=)?

=

Fenomenal, lo he encontrado después de 4 intentos.
*/
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, intento;
        char respuesta;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla.");
        teclado.next();
        intento = 50;
        System.out.println("Pruebo con " + intento + ", ¿es mayor, menor o es el número (+/-/=)?");
        respuesta = teclado.next().charAt(0);
        while (respuesta != '=') {
            if (respuesta == '+') {
                intento = intento + (intento / 2);
            } else {
                intento = intento - (intento / 2);
            }
            System.out.println("Pruebo con " + intento + ", ¿es mayor, menor o es el número (+/-/=)?");
            respuesta = teclado.next().charAt(0);
        }
        System.out.println("Fenomenal, lo he encontrado después de" +  intento +"intentos.");

    }
}
