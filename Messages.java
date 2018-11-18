public class Messages {

		//Declaração das variáveis
		private String askName = "Informe seu nome: ";

		private String askGender = "Informe o seu sexo(M ou F): ";

		private String wrongAnswer = "Resposta incorreta, por favor tente novamente";

		private String labelLevel1 = "No primeiro voce tera que tentar acertar uma entre as 50 palavras reservadas do java,\n"
				+ "Podera errar ate 5 letras, no sexto erro o personagem e enforcado e o jogo acaba.";

		private String labelLevel2 = "No segundo nivel voce  uma entre as 10 palavras reservadas do java relacionadas a tipos,\n"
				+ "Voce podera errar ate 4 letras, no quinto erro o personagem e enforcado e o jogo acaba.";

		private String optionOut = "A qualquer momento voce pode sair do jogo digitando o caractere '_'(underscore)";

		private String letsGoM = "Assim que estiver pronto aperte enter e vamos ao jogo";

		private String letsGoF = "Assim que estiver pronta aperte enter e vamos ao jogo";

		private String labelIntroM;

		private String labelIntroF;

		private String played = "Jogada: ";

		private String lifeRemaining = "Restam %d chances!!";

		private String commandToType = "Digite uma Letra: ";

		private String alreadyTyped = "Letra já digitada anteriormente, tente novamente";

		private String congrats = "Parabens você acertou a palavra";

		private String keepGoing = "Aperte enter e vamos continuar!!!";

		private String failed = "Acabaram as suas chances, a palavra era: ";

		private String gameOver = "Fim de Jogo!!!";

		//Encapsulamento das variáveis

		public String getAskName() {
			return askName;
		}

		public String getAskGender() {
			return askGender;
		}

		public String getWrongAnswer() {
			return wrongAnswer;
		}

		public String getLabelLevel1() {
			return labelLevel1;
		}

		public String getLabelLevel2() {
			return labelLevel2;
		}

		public String getOptionOut() {
			return optionOut;
		}

		public String getLetsGoM() {
			return letsGoM;
		}

		public String getLetsGoF() {
			return letsGoF;
		}

		public String getLabelIntroM() {
			return labelIntroM;
		}

		public String getLabelIntroF() {
			return labelIntroF;
		}

		public String getPlayed() {
			return played;
		}

		public String getLifeRemaining() {
			return lifeRemaining;
		}

		public String getCommandToType() {
			return commandToType;
		}

		public String getAlreadyTyped() {
			return alreadyTyped;
		}

		public String getCongrats() {
			return congrats;
		}

		public String getKeepGoing() {
			return keepGoing;
		}

		public String getFailed() {
			return failed;
		}

		public String getGameOver() {
			return gameOver;
		}

		//Vou criar um construtor vazio para poder chamar as variáveis que não precisam de passagem de parâmetros
		public Messages() {

		}

		//Este construtor é para as variáveis que usam o nome do jogador
		public Messages(String name) {


			labelIntroM = "Ola " + name + " bem vindo ao Hangman Game!!!\n"
					+ "O objetivo do jogo e acertar a palavra sorteada no minimo de tentativas possiveis.\n\n"
					+ "A cada acerto a letra aparecera no console e voce podera tentar a proxima letra,\n"
					+ "A cada erro uma parte da forca e criada.";

			labelIntroF = "Ola " + name + " bem vinda ao Hangman Game!!!\n"
					+ "O objetivo do jogo e acertar a palavra sorteada no minimo de tentativas possiveis.\n\n"
					+ "A cada acerto a letra aparecera no console e voce podera tentar a proxima letra,\n"
					+ "A cada erro uma parte da forca e criada.";



		}


}
