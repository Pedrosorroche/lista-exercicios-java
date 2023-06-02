package sorteio;

import java.util.Scanner;

public class Sorteador {

	int numeroSorteado;
	int palpiteUsuario;
	int i = 0;
	
	public int sortearNumero() {
		numeroSorteado = (int) (Math.random() * 5);
		capturarPalpite();
		return numeroSorteado;
	};
	
	public void capturarPalpite() {
		System.out.println("Escolha um número entre 0 e 1000: ");
		Scanner palpite = new Scanner(System.in);
		palpiteUsuario = palpite.nextInt();
		i++;
		validarPalpite();
	};
	
	public void validarPalpite() {
		if(palpiteUsuario <= 1000 && Math.signum(palpiteUsuario) != -1) {
			verificarPalpite();
		}if(Math.signum(palpiteUsuario) == -1 || palpiteUsuario > 1000) {
			System.out.println("O número informado é invalido, tente novamente!");
			capturarPalpite();
		}
	};
	
	public void verificarPalpite() {
		while(palpiteUsuario != numeroSorteado) {
			if(palpiteUsuario < numeroSorteado) {
				System.out.println("O seu palpite é menor que o número sorteado, tente outra vez!");
				capturarPalpite();
			} if(palpiteUsuario > numeroSorteado) {
				System.out.println("O seu palpite é maior que o número sorteado, tente outra vez!");
				capturarPalpite();
			}
		}
		if(palpiteUsuario == numeroSorteado) {
			System.out.println("Você acertou o número sorteado, após " + i + " tentativas!");
			return;
		}
	};
}
