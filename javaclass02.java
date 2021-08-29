package javaproject02;
import java.util.Scanner;
public class javaclass02{
	public static void menu(){
		System.out.println("selecione uma forma geometrica:");
		System.out.println("Quadrado.[1]");
		System.out.println("Circulo..[2]");
		System.out.println("Triangulo[3]");
	}
	
	

		public static void main(String[] args)
		{	int escolha01,escolhavolta;
		escolhavolta=1;
			while (escolhavolta ==1)
		{escolhavolta=2;
			
			escolhavolta = 2;
			
			int raio,lado,lado2;
			int area,perimetro,diametro;
			System.out.printf("qual forma geometrica voce deseja saber a area?");
			menu();
			Scanner input = new Scanner(System.in);
			
			escolha01 = input.nextInt();
			
			/*quadrado*/
			
			if(escolha01==1)
			{
				System.out.println("voce selecionou o quadrado");
				System.out.printf("digite o valor dos dois lados\nLado1: ");
				lado = input.nextInt();
				System.out.printf("Lado2: ");
				lado2= input.nextInt();
				area = lado*lado2;
				perimetro = (lado+lado2)*2;
				System.out.printf("-----------\nArea = %d\nperimetro: %d",area,perimetro);
				
				
				
				System.out.println("\n\n\nDeseja retornar ao menu?");
				escolhavolta =input.nextInt();				
				
				
				
			}
			
			/*circulo*/
			
			if(escolha01 == 2)
			{
				System.out.println("voce selecionou o circulo");
				System.out.printf("raio:");
				raio = input.nextInt();
				diametro=raio*2;
				double circunferencia = raio * raio * 3.14159;
				System.out.printf("\n-------------------------------------------------\nRaio: %d\nDiametro: %d\nCircunferencia: %.2f",raio,diametro,circunferencia);
				
				
				System.out.println("\n\n\nDeseja retornar ao menu?");
				escolhavolta =input.nextInt();
			}
			
			/*triangulo*/
			
			if(escolha01 == 3)
			{
				System.out.println("voce selecionou o triangulo");
				System.out.printf("Digite o valor da base:");
				lado = input.nextInt();
				System.out.printf("Digite o valor da altura:");
				lado2 = input.nextInt();
				area = lado*lado2;
				System.out.printf("Area: %d",area);
				System.out.println("\n\n\nDeseja retornar ao menu?");
				escolhavolta =input.nextInt();
			}
		}
			
			
		}
	}
