
package CONDICIONALES;
import java.util.Scanner;
public class CONDICIONALES2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero entero");
        numero = entrada.nextInt();
        if (numero%10==0){   
            System.out.println("ES MULTIPLO DE 10");
           }
        else {
            System.out.println("NO ES MULTIMPLO DE 10");
        }
    }
    
}
