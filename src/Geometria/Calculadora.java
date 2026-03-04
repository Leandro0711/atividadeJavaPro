package Geometria;
import java.util.Scanner;
public class Calculadora {
	private double altura;
	private double lado;
	private double base;
	private int opcao;
	private double raio;
	
	
public void menu() {
	        System.out.println("1 - Calcular Área do Quadrado/Retângulo");
	        System.out.println("2 - Calcular Área do Triângulo");
	        System.out.println("3 - Calcular Área do Círculo");
	        System.out.println("4 - Sair");
}

	
public void executar() {

    Scanner s = new Scanner(System.in);

    System.out.print("Escolha uma opção: ");
    opcao = s.nextInt();

    switch (opcao) {

        case 1:
            System.out.print("Digite o lado do quadrado: ");
            lado = s.nextDouble();
            double aQ = lado * lado;
            System.out.printf("Área do quadrado: " + aQ);
            break;

        case 2:
            System.out.print("Digite a base do Triângulo: ");
            base = s.nextDouble();

            System.out.print("Digite a altura do Triângulo: ");
            altura = s.nextDouble();

            double aR = (base * altura)/2;
            System.out.printf("Área do Triângulo: " + aR);
            break;

        case 3:
            System.out.print("Digite o raio do círculo: ");
            raio = s.nextDouble();

            double aC = 3.14 * (raio * raio);
            System.out.printf("Área do círculo: " + aC);
            break;

        case 4:
            System.out.println("Saindo");
            break;

        default:
            System.out.println("Opção inválida");
    }

    s.close();
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public int getOpcao() {
		return opcao;
	}
	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	public double getRaio() {
		return raio;
	}
	public void setRaio(double raio) {
		this.raio = raio;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	
	    
	    
	    
}
