package application;

import java.util.Scanner;

import service.ServicoDeImpressao;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ServicoDeImpressao<String> imprimir = new ServicoDeImpressao<>();

		System.out.print("Quantos valores deseja digitar? ");
		short numDigitar = sc.nextShort();

		for (short i = 0; i < numDigitar; i++) {
			String num = sc.next();
			imprimir.addValue(num);

		}
		imprimir.print();
		System.out.println("Primeiro: "+imprimir.primeiroNumero());

	}

}
