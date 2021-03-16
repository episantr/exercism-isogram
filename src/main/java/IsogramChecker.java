import java.util.HashSet;
import java.util.Set;

public class IsogramChecker {

    boolean isIsogram(String phrase) {
        phrase = phrase.toLowerCase().replace(" ", "").replace("-", "");
        Set<Character> characterSet = new HashSet<>();
        for (Character character : phrase.toCharArray()) {
            characterSet.add(character);
        }
        return characterSet.size() == phrase.length();
    }

}
