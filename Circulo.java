/**
 *
 * @author MARILUZ CARO
 */
import java.util.Scanner;
public class Circulo {

    public static void main(String args[]) {
        double r, area, per;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        r = entrada.nextFloat();
        area = Math.PI * Math.pow(r,2);
        per = 2 * Math.PI * r;
        System.out.println("El radio del circulo es: " + r);
        System.out.println("El area del circulo es: " + area);
        System.out.println("La longitud de la circunferencia es: " + per);
    }
}
