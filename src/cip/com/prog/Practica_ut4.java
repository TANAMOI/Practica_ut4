package cip.com.prog;

import java.util.*;

import javax.sound.midi.Soundbank;
import javax.swing.*;

public class Practica_ut4 {

	public static void main(String[] args) {
		// Ejercicio para usar la clase Math de la ut4
		// Dos jugadores lanzan sus dados opteniendo numeros aleatorios

		// Tiradas del jugador 1

		int dado1_jugador1 = (int) (Math.random() * 6) + 1;
		int dado2_jugador1 = (int) (Math.random() * 6) + 1;

		System.out.println("El jugador 1 va a lanzar dos dados\n");

		System.out.println("El dado n1 del juagador 1 es: " + dado1_jugador1);

		System.out.println("El dado n2 del juagador 1 es: " + dado2_jugador1);

		// Tiradas del jugador 2

		int dado1_jugador2 = (int) (Math.random() * 6) + 1;
		int dado2_jugador2 = (int) (Math.random() * 6) + 1;

		System.out.println("El jugador 2 va la lanzar sus dados\n ");

		System.out.println("El dado n1 del juagador 2 es: " + dado1_jugador2);

		System.out.println("El dado n2 del juagador 2 es: " + dado2_jugador2);

		double dados_jugador1 = (int) (dado1_jugador1 + dado2_jugador1);
		double dados_jugador2 = (int) (dado1_jugador2 + dado2_jugador2);

		System.out.println("La tirada mas alta es: " + Math.max(dados_jugador1, dados_jugador2));

		int jugador_1 = (int) dados_jugador1;
		int jugador_2 = (int) dados_jugador2;

		if (jugador_1 > jugador_2) {

			System.out.println("Enhorabuena jugador 1, eres el vencedor ");

		} else if (jugador_2 > jugador_1) {
			System.out.println("Enhorabuena jugador 2, eres el vencedor ");
		}
		else if (jugador_1 == jugador_2) {
			System.out.println("Caballeros la partida esta en tablas");
		}
		

		int media_4dados = (dado1_jugador1+dado2_jugador2+dado1_jugador2+dado2_jugador2)/4;
		
		System.out.println("La media de los 4 dados es: "+Math.round(media_4dados));
		

	}

}
