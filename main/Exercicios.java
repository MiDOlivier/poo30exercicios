package main;

import java.awt.print.Printable;
import java.util.Iterator;
import java.util.Scanner;

public class Exercicios {
	
	Scanner input = new Scanner(System.in);
	
	public void exec01 () 
	{
		int i = input.nextInt();
		System.out.println("Numero Inserido: " + i);
	}
	
	public void exec02 () 
	{
		Double i = input.nextDouble();
		System.out.println("Numero Inserido: ");
		System.out.format("%.2f", i);
	}
	
	public void exec03 () 
	{
		int i = input.nextInt();
		System.out.println((i > 50) ? "Maior que 50" : (i == 50 ) ? "Igual a 50" : "Menor que 50");
	}
	
	public void exec04 () 
	{
		int i = input.nextInt();
		System.out.println((i <= 100) ? "Menor ou igual a 100" : "Maior que 100" );
	}
	
	public void exec05 () 
	{
		int i = input.nextInt();
		System.out.println((i%2 == 0) ? "Par" : "Impar" );
	}
	
	public void exec06 () 
	{
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(((a > 0) ? "V, " : "F, ") + ((b > 0) ? "V, " : "F, ") + ((a > 0 && b > 0) ? "V." : "F.") );
	}
	
	public void exec07 () 
	{
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println(((a == 0) ? "V, " : "F, ") + ((b < 0) ? "V, " : "F, ") + ((a > 0 || b > 0) ? "V." : "F.") );
	}
	
	public void exec08 () 
	{
		int maior = 0;
		int[] vect = new int[3];
		vect[0] = input.nextInt();
		vect[1] = input.nextInt();
		vect[2] = input.nextInt();
		
		for (int i = 0; i < 3; i++) {
			if (vect[i] > maior) {
				maior = vect[i];
			}
		}
		
		System.out.println("Maior Numero: " + maior);
	}
	
	public void exec09 () 
	{
		int menor = Integer.MAX_VALUE;
		int[] vect = new int[3];
		vect[0] = input.nextInt();
		vect[1] = input.nextInt();
		vect[2] = input.nextInt();
		
		for (int i = 0; i < 3; i++) {
			if (vect[i] < menor) {
				menor = vect[i];
			}
		}
		
		System.out.println("Menor Numero: " + menor);
	}
	
	public void exec10 () 
	{
		int[] vect = new int[3];
		vect[0] = input.nextInt();
		vect[1] = input.nextInt();
		vect[2] = input.nextInt();
		
		if (vect[0] > vect[2]) {
			int aux = vect [0];
			vect[0] = vect[2];
			vect[2] = aux;
		}
		if (vect[0] > vect[1]) {
			int aux = vect [0];
			vect[0] = vect[1];
			vect[1] = aux;
		}
		if (vect[1] > vect[2]) {
			int aux = vect [1];
			vect[1] = vect[2];
			vect[2] = aux;
		}
		
		System.out.println(vect[0] + ", " + vect[1] + ", " + vect[2]);
	}
	
	public void exec11 () 
	{
		Double a = input.nextDouble();
		Double b = input.nextDouble();
		System.out.println((a%b == 0 || b%a == 0) ? "Multiplos" : "Não Multiplos");
	}
	
	public void exec12 () 
	{
		Double a = input.nextDouble();
		a = (a > 500) ? a*0.035 : (a < 501 && a > 100) ? a*0.04 : (a <= 100) ? a*0.05 : a;
		System.out.print("Total de Preço: R$");
		System.out.format("%.2f", a);
	}
	
	public void exec13 () 
	{
		Float[] iFloats = new Float[3];
		iFloats[0] = input.nextFloat();
		iFloats[1] = input.nextFloat();
		iFloats[2] = input.nextFloat();
		
		int[] vect = new int[3];
		vect[0] = (int) Math.round(iFloats[0]);
		vect[1] = (int) Math.round(iFloats[1]);
		vect[2] = (int) Math.round(iFloats[2]);
		
		boolean isTrig = true;
		
		for (int i = 0; i < 3; i++) {
			if (vect[i] > ((vect[0]+vect[1]+vect[2])-vect[i])) {
				isTrig = false;
			}
		}
		
		int sidecount = 0;
		
		if (isTrig == true) {
			if ((vect[0] == vect[1]) || (vect[0] == vect[2]) || (vect[1] == vect[2])) {
				sidecount += 1;
				if (vect[0] == vect[1] && vect[0] == vect[2] && vect[1] == vect[2]) {
					sidecount +=1;
				} 
			}
			switch (sidecount) {
			case 2:{
				System.out.println("Equilatero");
				break;
			}
			case 1:{
				System.out.println("Isoceles");
				break;
			}
			case 0: {
				System.out.println("Escaleno");
				break;
			}
			default:
				System.out.println("null");
				break;
			}
		} else {
			System.out.println("Não é um Triagulo");
		}
		
		
	}
	
	public void exec14 ()
	{
		Float[] iFloats = new Float[3];
		iFloats[0] = input.nextFloat();
		iFloats[1] = input.nextFloat();
		iFloats[2] = input.nextFloat();
		
		float media = (iFloats[0]+iFloats[1]+iFloats[2])/3;
		
		System.out.print("Nota: ");
		System.out.format("%.2f", media);
		System.out.println("");
		System.out.println((media > 7)?"Aprovado":(media < 3)?"Reprovado":"Exame");
	}
	
	public void exec15 ()
	{
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println("X + Y = " + (a+b));
		System.out.println("X * Y = " + (a*b));
		System.out.println((a == b)?"X = Y":(a > b)?"X > Y":"X < Y");
		
	}
	
	public void exec16 ()
	{
		Float[] iFloats = new Float[2];
		iFloats[0] = input.nextFloat();
		iFloats[1] = input.nextFloat();
		
		float area = (iFloats[0]*iFloats[1])/2;
		
		System.out.print("Area: ");
		System.out.format("%.2f", area);
	}
	
	public void exec17 ()
	{
		int segs = input.nextInt();
		
		if (segs > 0) {
			float secs = segs;
			float horas = secs/3600f;
			System.out.print("Segundos: " + segs + ". Horas: ");
			System.out.format("%.1f", horas);
		} else {
			System.out.println("Erro! Segundos iguais ou abaixo de zero!");
		}
	}
	
	public void exec18 () {
		String[] text = {"zero","dez","vinte","trinta","quarenta","cinquenta","sessenta","setenta","oitenta","noventa",
		         "cem","um","dois","tres","quatro","cinco","seis","sete","oito","nove",
		         "e","onze","doze","treze","quatorze","quinze","dezeseis","dezesete","dezoito","dezenove"};
		int i = input.nextInt();
		if (i >= 0 && i <=100) {
			System.out.println( ((i < 20 && i > 10) ? text[i+10] : (i > 19 && i < 100) ? text[i/10]: "")
				+
				(	( i%10 != 0 && i > 20) ? " e " : ""	)
				+ 
				((i == 100) ? text[i/10] : (i == 10) ? text[1] : (i < 10 && i > 0 || (i > 19 && i%10 != 0)) ? text[(i%10)+10] : (i == 0) ? text[0] : ""));
		} else {System.out.println("Numero fora da Faixa!");}
	}
	
	public void exec19 () {
		String[] text = {"zero","dez","vinte","trinta","quarenta","cinquenta","sessenta","setenta","oitenta","noventa",
		         "cem","um","dois","tres","quatro","cinco","seis","sete","oito","nove",
		         "e","onze","doze","treze","quatorze","quinze","dezeseis","dezesete","dezoito","dezenove"};
		float f = input.nextFloat();
		int i = (int) f;
		f = ((f - ((float)i))*100f);
		int si = (int)Math.round(f);
		if (i >= 0 && i <=100) {
			System.out.print( ((i < 20 && i > 10) ? text[i+10] : (i > 19 && i < 100) ? text[i/10]: "")
				+
				(	( i%10 != 0 && i > 20) ? " e " : ""	)
				+ 
				((i == 100) ? text[i/10] : (i == 10) ? text[1] : (i < 10 && i > 0 || (i > 19 && i%10 != 0)) ? text[(i%10)+10] : (i == 0) ? text[0] : "") + 
				((i != 1)?" Reais":" Real"));
			//----------
			if (si >= 1 && si <= 99) {
				System.out.print(" e " + ((si < 20 && si > 10) ? text[si+10] : (si > 19 && si < 100) ? text[si/10]: "")
						+
						(	( si%10 != 0 && si > 20) ? " e " : ""	)
						+ 
						((si == 100) ? text[si/10] : (si == 10) ? text[1] : (si < 10 && si > 0 || (si > 19 && si%10 != 0)) ? text[(si%10)+10] : (si == 0) ? text[0] : "")
						 + ((si != 1)?" centavos":" centavo"));
			}
		} else {System.out.println("Numero fora da Faixa!");}
	}
	
	public void exec20()
	{
		float metros = input.nextFloat();
		
		if (metros >= 0f) {
			float pes = metros*3.315f;
			System.out.print("Metros: ");
			System.out.format("%.1f", metros);
			System.out.println("");
			System.out.print("Pes: ");
			System.out.format("%.1f", pes);
		} else {
			System.out.println("Erro! Metros abaixo de zero!");
		}
	};

}
