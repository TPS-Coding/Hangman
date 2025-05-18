import java.util.Scanner;
import java.util.HashSet;


public class Hangman {

    private static final String WORD = "tuxedo";
    private static final int MAX_CHANCES = 6;
    public static String welcomeMessage =
	"**************************\n" +
	"**                      **\n" +
	"**                      **\n" +
	"**  Let's Play Hangman  **\n" +
	"**                      **\n" +
	"**                      **\n" +
	"**************************\n";
	

    public static void main (String[] args) {

	int chances = 0;
	HashSet<Character> guessedLetters = new HashSet<>();

	char[] lines = new char[WORD.length()];

	for (int i = 0; i < lines.length; i++) {
	    lines[i] = '_';
	}

	System.out.println(welcomeMessage);

	printHangman(chances);

	System.out.println(String.valueOf(lines));

    }

    public static void printHangman(int tries) {
        String[] hangman = {
             /* State 0: Initial state */
            "  +---+\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",

            /* State 1: Head */
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "      |\n" +
                    "      |\n" +
                    "=========",

            /* State 2: Head and body */
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    "  |   |\n" +
                    "      |\n" +
                    "=========",

            /* State 3: Head, body, and one arm */
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|   |\n" +
                    "      |\n" +
                    "=========",

            /* State 4: Head, body, and both arms */
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    "      |\n" +
                    "=========",

            /* State 5: Head, body, arms, and one leg */
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " /    |\n" +
                    "=========",

            /* State 6: Full hangman */
            "  +---+\n" +
                    "  |   |\n" +
                    "  O   |\n" +
                    " /|\\  |\n" +
                    " / \\  |\n" +
                    "========="
	};

	System.out.println(hangman[tries]);
            
	}

}
