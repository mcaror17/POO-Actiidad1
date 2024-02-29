/**
 *
 * @author MARILUZ CARO
 */
public class Salario {

    public static void main(String[] args) {
        double horas, rz, retenc, sbruto, sneto;
        horas = 48;
        rz = 5000;
        sbruto = horas * rz;
        retenc = sbruto * 0.125;
        sneto = sbruto - retenc;
        System.out.println("Horas trabajadas: " + horas);
        System.out.println("Valor hora: " + rz);
        System.out.println("El salario bruto es: " + sbruto);
        System.out.println("La retencion en la fuente es: " + retenc);
        System.out.println("El salario neto es: " + sneto);

    }
}
