/**
 *
 * @author MARILUZ CARO
 */
public class PruebaDeEscritorio {

    public static void main(String[] args) {
        double suma, x, y;
        suma = 0;
        x = 20;
        suma = suma + x;
        y = 40;
        x = Math.pow(y, 2) + x;
        suma = suma + (x/y);
        System.out.println("El valor de la suma es: " + suma);
        
    }
}
