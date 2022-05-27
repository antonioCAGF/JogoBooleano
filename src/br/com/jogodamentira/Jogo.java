package br.com.jogodamentira;

import java.util.Scanner;

public class Jogo {
	public static void main(String[] args) {
		
    	// Instagram: @pikdev_

		// Youtube: @Pikachu Gamer

		// GitHub: @antonioCAGF

		// Linkedin: https://www.linkedin.com/in/antonio-guimar%C3%A3es-007ba61a8

		Scanner key = new Scanner(System.in);

		System.out.println("Você tem mais de 18 anos? (Responda true ou false)");
		boolean resposta1 = key.nextBoolean();
		System.out.println();
		System.out.println("Você tem carta?  (Responda true ou false)");
		boolean resposta2 = key.nextBoolean();
		System.out.println();

		if (resposta1 == true && resposta2 == true) {
			System.out.println("Parabéns é verdade!!!");
		} else {
			System.out.println("Então é mentira!!");
		}

	}
}
