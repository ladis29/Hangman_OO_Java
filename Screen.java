public class Screen {

	//Essa classe é responsável pela tela de jogo

	private int amountOfChars;
	private char[] showedSpaces;

public void wordMap(char[] wordToGuess) {

		// Verifica o numero de caracteres da palavra e imprime "_" na tela
		amountOfChars = wordToGuess.length;
		showedSpaces = new char[amountOfChars];
		for (int i = 0; i < showedSpaces.length; i++) {
			showedSpaces[i] = '_';
		}

	}

	public char[] getShowedSpaces() {
		return showedSpaces;
	}


	// Este método lê um array de caracteres e imprime
	public void printArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.println();
	}

	// Método criado para limpar a tela após cada rodada
	public void clearScreen() {
		for (int i = 0; i < 100; ++i)
			System.out.println();
	}

	// Método para imprimir o desenho da forca
	public void gibbet(int lostGuess, int level) {
		if (level == 2) {
			lostGuess += 1;
		}
		switch (lostGuess) {
		case 0:
			System.out.println("Nivel " + level);
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("___|___");
			System.out.println();
			break;

		case 1:
			System.out.println("Nivel " + level + " Tente novamente");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
			break;

		case 2:
			System.out.println("Nivel " + level + " Tente novamente");
			System.out.println("   ____________");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   | ");
			System.out.println("___|___");
			break;

		case 3:
			System.out.println("Nivel " + level + " Tente novamente");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("   |");
			System.out.println("___|___");
			break;

		case 4:
			System.out.println("Nivel " + level + " Tente novamente");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |");
			System.out.println("___|___");
			break;

		case 5:
			System.out.println("Nivel " + level + " Tente novamente");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |           |");
			System.out.println("   |           |");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			break;

		case 6:
			System.out.println("ACABOU, VOCE PERDEU!!!!!");
			System.out.println("   ____________");
			System.out.println("   |          _|_");
			System.out.println("   |         /   \\");
			System.out.println("   |        |     |");
			System.out.println("   |         \\_ _/");
			System.out.println("   |          _|_");
			System.out.println("   |         / | \\");
			System.out.println("   |          / \\ ");
			System.out.println("___|___      /   \\");
			break;
		}

	}

}
