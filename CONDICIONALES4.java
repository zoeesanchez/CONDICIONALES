import java.util.Scanner;
public class CONDICIONALES4 {
public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        int numero; 
        System.out.println("ingrese un numero del 1 al 100");
        numero = entrada.nextInt(); 
        int i = 1;
        while (i<=numero) {
            System.out.println(i);
            i++;
        }
    }
    
}
