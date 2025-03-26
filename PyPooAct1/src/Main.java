import java.util.Scanner; //Librería de java que permite el ingreso de datos 
public class Main {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);

    // Crear los rectángulos con valores ingresados por el usuario
    System.out.println("Ingrese las coordenadas del rectángulo A:");
    System.out.print("Ingrese X de la esquina superior izquierda: ");
    double ax1 = leer.nextDouble();
    System.out.print("Ingrese Y de la esquina superior izquierda: ");
    double ay1 = leer.nextDouble();
    System.out.print("Ingrese X de la esquina inferior derecha: ");
    double ax2 = leer.nextDouble();
    System.out.print("Ingrese Y de la esquina inferior derecha: ");
    double ay2 = leer.nextDouble();

    Rectangulo rectanguloA = new Rectangulo(new Coordenada(ax1, ay1), new Coordenada(ax2, ay2));

    System.out.println("Ingrese las coordenadas del rectángulo B:");

    System.out.print("Ingrese X de la esquina superior izquierda: ");
    double bx1 = leer.nextDouble();
    System.out.print("Ingrese Y de la esquina superior izquierda: ");
    double by1 = leer.nextDouble();
    System.out.print("Ingrese X de la esquina inferior derecha: ");
    double bx2 = leer.nextDouble();
    System.out.print("Ingrese Y de la esquina inferior derecha: ");
    double by2 = leer.nextDouble();

    Rectangulo rectanguloB = new Rectangulo(new Coordenada(bx1, by1), new Coordenada(bx2, by2));

    // Mensaje simple para confirmar que se crearon
    System.out.println("Se han creado los rectángulos correctamente.");

    leer.close(); // Cerrar scanner
    }   

}
