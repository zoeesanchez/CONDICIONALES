import java.util.Scanner;
public class CONDICIONALES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("ingrese un numero entero");
        numero = entrada.nextInt();
        if (numero%2==0){   
            System.out.println("par");
           }
        else {
            System.out.println("impar");
        }
         
    }
    
}
