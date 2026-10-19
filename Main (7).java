/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do lado:");
		int tamanho = teclado.nextInt();
		
		for (int linha = 1; linha <=tamanho; linha++){
		    
		    for (int coluna = 1; coluna <=tamanho; coluna++){
		        
		        if (linha == 1 || linha tamanho || coluna == 1 || coluna == tamnaho){
		            System.out.println("*");
		        } else {
		            System.out.print("");
		        }
		    }
		    System.out.println();
		}
	}
}

