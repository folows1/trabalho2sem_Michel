package br.edu.univas.main;

import java.util.Scanner;
import java.util.Random;

public class StartBot {
	static String[][] jogo = new String[3][3];
	static String[][] posicoes = new String[][] { { "1a", "1b", "1c" }, { "2a", "2b", "2c" }, { "3a", "3b", "3c" } };

	public static void main(String[] args) {
		Scanner l = new Scanner(System.in);
		System.out.println("Digite o nome do jogador(X):");
		String player1 = l.nextLine();
		int r;
		do {
			limparJogo();
			jogodaVelha(player1, l);
			System.out.println("Jogar novamente? Digite 1 para SIM.");
			r = l.nextInt();
			l.nextLine();
		} while (r == 1);
		l.close();
	}

	public static void jogodaVelha(String nome1, Scanner l) {
		int numjogadas = 0;
		do {
			numjogadas++;
			if (numjogadas % 2 != 0) {
				System.out.println(numjogadas + ". Turno do jogador(X) " + nome1);
				String jogada = l.nextLine();
				realizarJogadaX(jogada);
			} else {
				System.out.println(numjogadas + ". Turno do BOT (O) ");
				realizarJogada_Bot(numjogadas);
				System.out.println("---- JOGO ----");
				imprimirJogo();
			}
			numjogadas = verificarJogo(numjogadas);
		} while (numjogadas < 9);
		resultadoFinal(numjogadas, nome1);
	}

	public static void realizarJogadaX(String jogada) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (posicoes[i][j].equals(jogada)) {
					jogo[i][j] = "X";
				}
			}
		}

	}
	public static void realizarJogada_Bot(int numjogadas) {
		Random random = new Random();
		do {
		int jogadaBOT = random.nextInt(9) + 1;
		if(jogadaBOT == 1 && jogo[0][0] == " ") {
			jogo[0][0]="O";
			break;
		}else if(jogadaBOT == 2 && jogo[0][1] == " " ) {
			jogo[0][1]="O";
			break;
		}else if(jogadaBOT == 3 && jogo[0][2] == " " ) {
			jogo[0][2]="O";
			break;
		}else if(jogadaBOT == 4 && jogo[1][0] == " " ) {
			jogo[1][0]="O";
			break;
		}else if(jogadaBOT == 5 && jogo[1][1] == " " ) {
			jogo[1][1]="O";
			break;
		}else if(jogadaBOT == 6 && jogo[1][2] == " " ) {
			jogo[1][2]="O";
			break;
		}else if(jogadaBOT == 7 && jogo[2][0] == " " ) {
			jogo[2][0]="O";
			break;
		}else if(jogadaBOT == 8 && jogo[2][1] == " " ) {
			jogo[2][1]="O";
			break;
		}else if(jogadaBOT == 9 && jogo[2][2] == " " ) {
			jogo[2][2]="O";
			break;
		}
		}while(true);
	}

	public static int verificarJogo(int numjogadas) {
		if (jogo[0][0] == "X" && jogo[0][1] == "X" && jogo[0][2] == "X") {
			return numjogadas = 11;
		}
		if (jogo[1][0] == "X" && jogo[1][1] == "X" && jogo[1][2] == "X") {
			return numjogadas = 11;
		}
		if (jogo[2][0] == "X" && jogo[2][1] == "X" && jogo[2][2] == "X") {
			return numjogadas = 11;
		}
		if (jogo[0][0] == "X" && jogo[1][0] == "X" && jogo[2][0] == "X") {
			return numjogadas = 11;
		}
		if (jogo[0][1] == "X" && jogo[1][1] == "X" && jogo[2][1] == "X") {
			return numjogadas = 11;
		}
		if (jogo[0][2] == "X" && jogo[1][2] == "X" && jogo[2][2] == "X") {
			return numjogadas = 11;
		}
		if (jogo[0][0] == "X" && jogo[1][1] == "X" && jogo[2][2] == "X") {
			return numjogadas = 11;
		}
		if (jogo[0][2] == "X" && jogo[1][1] == "X" && jogo[2][0] == "X") {
			return numjogadas = 11;
		}
		if (jogo[0][0] == "O" && jogo[0][1] == "O" && jogo[0][2] == "O") {
			return numjogadas = 12;
		}
		if (jogo[1][0] == "O" && jogo[1][1] == "O" && jogo[1][2] == "O") {
			return numjogadas = 12;
		}
		if (jogo[2][0] == "O" && jogo[2][1] == "O" && jogo[2][2] == "O") {
			return numjogadas = 12;
		}
		if (jogo[0][0] == "O" && jogo[1][0] == "O" && jogo[2][0] == "O") {
			return numjogadas = 12;
		}
		if (jogo[0][1] == "O" && jogo[1][1] == "O" && jogo[2][1] == "O") {
			return numjogadas = 12;
		}
		if (jogo[0][2] == "O" && jogo[1][2] == "O" && jogo[2][2] == "O") {
			return numjogadas = 12;
		}
		if (jogo[0][0] == "O" && jogo[1][1] == "O" && jogo[2][2] == "O") {
			return numjogadas = 12;
		}
		if (jogo[0][2] == "O" && jogo[1][1] == "O" && jogo[2][0] == "O") {
			return numjogadas = 12;
		}
		return numjogadas;

	}

	public static void resultadoFinal(int numjogadas, String nome1) {
		imprimirJogo();
		if (numjogadas == 12) {
			System.out.println("* RESULTADO: MÁQUINA (O) " + " VENCEU! *");
		} else if (numjogadas == 11) {
			System.out.println("* RESULTADO: (X) " + nome1 + " VENCEU! *");
		} else {
			System.out.println("* RESULTADO: Jogo deu VELHA! * ");
		}
	}

	public static void imprimirJogo() {
		System.out.println(jogo[0][0] + " | " + jogo[0][1] + " | " + jogo[0][2]);
		System.out.println("---------");
		System.out.println(jogo[1][0] + " | " + jogo[1][1] + " | " + jogo[1][2]);
		System.out.println("---------");
		System.out.println(jogo[2][0] + " | " + jogo[2][1] + " | " + jogo[2][2]);
	}

	public static void limparJogo() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				jogo[i][j] = " ";
			}
		}
	}
}
