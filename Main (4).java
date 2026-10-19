import.java.util.Scanner;

public class main

public static void main(String[] args){
    
    Scanner teclado = new Scanner(System.in);
    
    int maior = 0;
       
       for (int i = 1; i <= 10; i++){
           System.out.println("Digite o" + i + "O número:");
           int número = teclado.nextInt();
           
           if (numero > maior){
               maior = numero;
           }
       }
       
       System.out.println("O maior número é:" + maior);
}
}
       
     

