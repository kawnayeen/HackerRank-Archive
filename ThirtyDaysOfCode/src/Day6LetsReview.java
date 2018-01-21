import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;

public class Day6LetsReview {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = scanner.nextInt();
        scanner.nextLine();
        List<String> inputStrings = new ArrayList<>();
        for (int i = 0; i < numberOfInput; i++) {
            inputStrings.add(scanner.nextLine());
        }

        for (String str : inputStrings) {
            List<Character> oddCharacters = new ArrayList<>();
            List<Character> evenCharacters = new ArrayList<>();
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    evenCharacters.add(str.charAt(i));
                } else {
                    oddCharacters.add(str.charAt(i));
                }
            }
            String evenString = getSting(evenCharacters.stream());
            String oddString = getSting(oddCharacters.stream());
            System.out.println(evenString + " " + oddString);
        }
    }

    private static String getSting(Stream<Character> characterStream) {
        return characterStream.map(character -> character.toString()).collect(joining(""));
    }
}
