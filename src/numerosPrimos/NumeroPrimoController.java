package numerosPrimos;

import java.util.Scanner;

public class NumeroPrimoController {
	int n;
	public int receberNumero() {
		Scanner numeroPrimo = new Scanner(System.in);
		System.out.println("Digite um número: ");
		return n = numeroPrimo.nextInt();
	};

	boolean isPrimo = false;
	public boolean classificarPrimo(){
		for(int i=2; i<= n; i++) {
			if(n%i == 0 && n != i) {
				return isPrimo = false;
			}
			else {
				isPrimo = true;
			}
		}
		return isPrimo;
	};
	
	public void imprimirPrimo() {
		if(isPrimo) {
			System.out.println("O número " + n + " é primo!");
		} else {
			System.out.println("O número " + n + " não é primo!");
		}
	}
}
