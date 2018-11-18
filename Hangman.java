import java.util.Scanner;

public class Hangman {

	static Scanner sc = new Scanner(System.in);

	private static String playerName;
	private static char playerGender;

	public static void main(String[] args) {

		Messages messages = new Messages();
		Player player = new Player();
		Game start = new Game();

		System.out.print(messages.getAskName());
		player.setName(sc.next());
		playerName = player.getName();

		Messages namedMessages = new Messages(playerName);

		while (playerGender != 'm' && playerGender != 'M' && playerGender != 'f'
				&& playerGender != 'F') {

			System.out.print(messages.getAskGender());
			player.setGender(sc.next().charAt(0));
			playerGender = player.getGender();

			if (player.getGender() == 'm' || player.getGender() == 'M') {
				System.out.println(namedMessages.getLabelIntroM());
			} else if (player.getGender() == 'f' || player.getGender() == 'F') {
				System.out.println(namedMessages.getLabelIntroF());
			} else {
				System.out.println(messages.getWrongAnswer());
			}

		}

		System.out.println();

		System.out.println(messages.getLabelLevel1());
		System.out.println();
		System.out.println(messages.getOptionOut());
		System.out.println();

		if (player.getGender() == 'm' || player.getGender() == 'M') {
			System.out.println(messages.getLetsGoM());
			sc.nextLine();
		} else if (player.getGender() == 'f' || player.getGender() == 'F') {
			System.out.println(messages.getLetsGoF());
			sc.nextLine();
		}
		sc.nextLine();

		start.game();

	}

	public String getPlayerName() {
		return playerName;
	}

	public char getPlayerGender() {
		return playerGender;
	}

}
