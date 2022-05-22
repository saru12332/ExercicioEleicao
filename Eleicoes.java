package JavaProjectAvaliacao;

import java.util.Scanner;

public class Eleicoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Scanner para entrada de dados
		Scanner ler = new Scanner(System.in);
		
		// Declaracao das variaveis 
		int voto, pt, pdt, pl, psdb, vn, vb; 
		int contPt=0, contPdt=0, contPl=0, contPsdb=0, contVn=0, contVb=0;
		int i=0;
		
		// Menu de entrada de dados dos votos
		System.out.print("- 1 - (13) PT;\r\n"
				+ "- 2 - (12) PDT;\r\n"
				+ "- 3 - (22) PL;\r\n"
				+ "- 4 - (45) PSDB;\r\n"
				+ "- 5 - voto nulo;\r\n"
				+ "- 6 - voto em branco;\n");
		
		// For para repeticao e contagem
		for (i = 0; i < 50; i++) {
			// Entrada de dados voto
			System.out.print("Selecione seu voto: ");
			// Leitura de dados do valor voto
			voto = ler.nextInt();
			
			// Estrutura de decisao em casos
			switch (voto) {
			// Casos 1 a 6 referente ao valor do voto
			case 1:
				// Entrada de dados: Indicar voto ao usuario
				System.out.println("(13) PT!");
				// Contagem
				pt = contPt;
				contPt++;
				// Parar caso
				break;
			case 2: 
				// Entrada de dados: Indicar voto ao usuario
				System.out.println("(12) PDT!");
				// Contagem
				pdt = contPdt;
				contPdt++;
				// Parar caso
				break;
			case 3: 
				// Entrada de dados: Indicar voto ao usuario
				System.out.println("(22) PL!");
				// Contagem
				pl = contPl;
				contPl++;
				// Parar caso
				break;
			case 4: 
				// Entrada de dados: Indicar voto ao usuario
				System.out.println("(45) PSDB!");
				// Contagem
				psdb = contPsdb;
				contPsdb++;
				// Parar caso
				break;
			case 5: 
				// Entrada de dados: Indicar voto ao usuario
				System.out.println("Voto Nulo!");
				// Contagem
				vn = contVn;
				contVn++;
				// Parar caso
				break;
			case 6: 
				// Entrada de dados: Indicar voto ao usuario
				System.out.println("Voto em Branco!");
				// Contagem
				vb = contVb;
				contVb++;
				// Parar caso
				break;
			// Caso opcao diferente
			default:
				System.out.print("Voto Inexistente!");
			}
		}
		// Declaracao da quantidade de votos na variavel
		pt = contPt;
		pdt = contPdt;
		pl = contPl;
		psdb = contPsdb;
		vn = contVn;
		vb = contVb;
		
		// Saida de dados referente aos votos da eleicao
		System.out.printf("Candidatos Votos: PT: %d\n",+pt);
		System.out.printf("PDT: %d\n",+pdt);
		System.out.printf("PL: %d\n",+pdt);
		System.out.printf("PSDB: %d\n",+pdt);
		System.out.printf("Voto Nulo: %d\n",+vn);
		System.out.printf("Voto em Branco :%d\n",+pdt);
		
	}

}
