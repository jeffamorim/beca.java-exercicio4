package exercicio04;
import java.util.Scanner;

public class Equacao {
	
	Scanner entrada = new Scanner(System.in);
	public Double ValorA;
	public Double ValorB;
	public Double ValorC;
	private Double Delta;
	private Double X1;
	private Double X2;
	
	public Equacao() {
		
	}

	
	public void CapturarValores() {
		System.out.println("Digite o valor de A: ");
		ValorA = entrada.nextDouble();
		
		System.out.println("Digite o valor de B");
		ValorB = entrada.nextDouble();
		
		System.out.println("Digite o valor de C");
		ValorC = entrada.nextDouble();
		
	}
	
	
	public void CalcularX() {
		
		Delta = (ValorB * ValorB) + (-4 * (ValorA * ValorC));
		
		if(this.Delta < 0) {
			System.out.println("O valor de Delta é menor que zero! ");
		} else {
			
			X1 = (double) (((-ValorB) + Math.sqrt(Delta))/ 2 * ValorA);
			
			X2 = (double) (((-ValorB) + Math.sqrt(Delta))/ 2 * ValorB);
			
			System.out.println("O valor de delta é: " +Delta );
			
			System.out.println("O valor de x1 é: "+X1+ ", O VALOR DE x2 é: "+X2);
		}
	}
	
}
