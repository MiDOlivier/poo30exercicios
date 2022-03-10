package main;

public class Main {
	
	public static void main(String[] args) {
		Exercicios exec = new Exercicios();
		System.out.println("Insira Numero do Exercicio: Nota! Enunciados nao vão aparecer!");
		int opcao = exec.input.nextInt();
		System.out.println("Input do Exercicio:");
		switch (opcao) {
		case 1: {
			exec.exec01();
			break;
		}
		case 2: {
			exec.exec02();
			break;
		}
		case 3: {
			exec.exec03();
			break;
		}
		case 4: {
			exec.exec04();
			break;
		}
		case 5: {
			exec.exec05();
			break;
		}
		case 6: {
			exec.exec06();
			break;
		}
		case 7: {
			exec.exec07();
			break;
		}
		case 8: {
			exec.exec08();
			break;
		}
		case 9: {
			exec.exec09();
			break;
		}
		case 10: {
			exec.exec10();
			break;
		}
		case 11: {
			exec.exec11();
			break;
		}
		case 12: {
			exec.exec12();
			break;
		}
		case 13: {
			exec.exec13();
			break;
		}
		case 14: {
			exec.exec14();
			break;
		}
		case 15: {
			exec.exec15();
			break;
		}
		case 16: {
			exec.exec16();
			break;
		}
		case 17: {
			exec.exec17();
			break;
		}
		case 18: {
			exec.exec18();
			break;
		}
		case 19: {
			exec.exec19();
			break;
		}
		case 20: {
			exec.exec20();
			break;
		}
		default:
			System.out.println("Exercicio nao implementado!");
			break;
		}
	}

}
