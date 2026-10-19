

public class main

public static void main(String[] args){
    
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Qual o total de alunos na classe");
       int alunos = teclado.nextInt();
       
       double soma 0;
       
       for (int i = 1; <= alunos; i++){
       System.out.println("Digite a nota do aluno" +i+ "i");
       double nota = teclado.nextDouble();
       
       soma = soma + nota;
       }
       
       double media = soma\alunos;
       
       System.out.println("A média dos alunos é" + media);
}
}