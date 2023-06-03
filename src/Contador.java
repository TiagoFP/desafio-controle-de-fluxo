import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		try (Scanner terminal = new Scanner(System.in)) {
			System.out.println("Digite o primeiro parâmetro");
			int parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			int parametroDois = terminal.nextInt();
			

			try {
				int contar = Contador.contar(parametroUm, parametroDois);
				System.out.println(contar);
				} 
				catch (Exception e) 
				{
				System.out.println("O segundo parâmetro deverá ser maior que o primeiro");
				}
		}
	}

	static int contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if(parametroDois < parametroUm)
	        throw new ParametrosInvalidosException();

		int resultado = parametroDois - parametroUm;
		for (int unidade = 0; unidade < resultado; unidade++) {

		System.out.println("Imprimindo o número " + unidade);
		}return resultado;
		
	}

}
