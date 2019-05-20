package com.br.idade.em.dias;
import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("digite sua idade em anos : ");
		int IdadeAnos = entrada.nextInt();

		System.out.println("digite sua idade em meses : ");
		int IdadeMeses = entrada.nextInt();

		System.out.println("digite sua idade em dias : ");
		int IdadeDias = entrada.nextInt();

		int TotalEmDias = (IdadeAnos * 365 + IdadeMeses * 30 + IdadeDias);

		System.out.println("sua idade total em dias é = "+TotalEmDias+"/n");
	}
}
