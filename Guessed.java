public class Guessed {

	// Classe que verifica se todos os '_'(underscores) já foram substituídos por
	// letras e determina se o jogador descobriu a palavra
	public boolean verifyGuessed(char[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == '_')
				return false;
		}
		return true;
	}

}
