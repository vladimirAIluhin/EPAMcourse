import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input string for parsing:");
        String stringForParsing = scanner.nextLine();
        System.out.println("entered string is:" + stringForParsing);
        System.out.println("Unique characters are:" + getUniqueCharacters(stringForParsing));
        System.out.println("Non repeatable characters are:" + getNonRepeatableCharacters(stringForParsing));
    }

    private static List<String> getUniqueCharacters(String stringForParsing) {
        List<String> uniqueCharacters = new ArrayList<>();
        for (int i = 0; i < stringForParsing.length(); i++) {
            String currentCharacter = stringForParsing.substring(i, i + 1);
            if (!uniqueCharacters.contains(currentCharacter)) {
                uniqueCharacters.add(currentCharacter);
            }
        }
        return uniqueCharacters;
    }

    private static List<String> getNonRepeatableCharacters(String stringForParsing) {
        List<String> nonRepeatableCharacters = new ArrayList<>();
        for (int i = 0; i < stringForParsing.length(); i++) {
            String currentCharacter = stringForParsing.substring(i, i + 1);
            if (stringForParsing.indexOf(currentCharacter) == stringForParsing.lastIndexOf(currentCharacter))
                nonRepeatableCharacters.add(currentCharacter);
        }
        return nonRepeatableCharacters;
    }
}
