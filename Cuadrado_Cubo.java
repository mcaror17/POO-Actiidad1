/**
 *
 * @author MARILUZ CARO
 */
import java.util.Scanner;
public class Cuadrado_Cubo {

    public static void main(String[] args) {
        double a, cuad, cubo; 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        a = entrada.nextFloat();
        cuad = Math.pow(a,2);
        cubo = Math.pow(a,3);
        System.out.println("El número es: " + a);
        System.out.println("Su cuadrado es: " + cuad);
        System.out.println("Su cubo es: " + cubo);
        
    }
}
