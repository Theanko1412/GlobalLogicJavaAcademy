import java.util.*;

public class Main {

    public static void main(String[] args) {

        //using TreeMap so out values are sorted by key
        TreeMap<Character, Integer> letterCount = new TreeMap<>();

        for (int i = 0; i < args.length; i++) {
            char[] letters = args[i].toLowerCase().toCharArray();

            for (char character : letters) {
                if(!letterCount.containsKey(character)) {
                    letterCount.put(character, 1);
                } else {
                    letterCount.put(character, letterCount.get(character)+1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : letterCount.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
