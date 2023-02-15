public class Ejercicio8 {
    //Retomar el algoritmo anterior, modificándolo para que no se muestre siempre la misma cita de una película, sino que haya dos o tres y presente aleatoriamente una de ellas.
    public static void main(String[] args) {
        // TODO code application logic here
        int cita;
        cita = (int) (Math.random() * 4 + 1);
        switch (cita) {
            case 1:
                System.out.println("Una cita de la ciudad del miedo:");
                System.out.println("No hay nada más peligroso que un hombre sin nada que perder");
                break;
            case 2:
                System.out.println("Una cita de James Bond:");
                System.out.println("Bond. James Bond");
                break;
            case 3:
                System.out.println("Una cita de la vida es un largo río tranquilo:");
                System.out.println("La vida es un largo río tranquilo");
                break;
            case 4:
                System.out.println("Una cita de Star Wars:");
                System.out.println("No hay nada más peligroso que un hombre sin nada que perder");
                break;
        }
    }
}
