package controller;

import common.Library;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;
import view.Menu;

public class CountProgramming extends Menu<String> {

    static String[] mc = {"Letter and Character Count", "Convert base number", "Exit"};
    String str;
    Library l;

    public CountProgramming() {
        super("PROGRAMMING", mc);
        l = new Library();
        str = l.getString("Input string: ");
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                countLetter(str);
                break;
            case 2:
                str = str.replaceAll("\\s+", "");
                countCharacter(str);
                break;
            case 3:
                System.exit(0);
        }
    }

    public void countLetter(String str) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        StringTokenizer tokenizer = new StringTokenizer(str," \t\n\r\f!\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~");
        
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            int count = lhm.getOrDefault(word, 0);
            lhm.put(word, count + 1);
        }

        lhm.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }

    public void countCharacter(String str) {
        LinkedHashMap<Character, Integer> lhm = new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetterOrDigit(ch)) { 
                int count = lhm.getOrDefault(ch, 0);
                lhm.put(ch, count + 1);
            }
        }

        lhm.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });
    }
}
 