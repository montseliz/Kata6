package kata6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static final Set<Character> vocals = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
    public static void main(String[] args) {
        String text = "Hola que tal";
        int num1 = 0;
        int num2 = 6;

        System.out.println(partOfString(text, num1, num2) + "\n");
        System.out.println(partOfString2(text, num1, num2) + "\n");
        System.out.println(hasVocals(text) + "\n");
        System.out.println(numberOfVocals(text) + "\n");
    }

    public static String partOfString(String text, int num1, int num2) { //APLICAR MÈTODE SUBSTRING
        String newText = "";
        newText = text.substring(num1, num2);

        return newText;
    }

    public static String partOfString2(String text, int num1, int num2) {  //RETORNAR LA PART D'UN STRING D'UN NÚMERO A UN ALTRE
        String newText = "";
        for (int i = num1; i <= num2; i++) {
            newText += text.charAt(i);
        }
        return newText;
    }

    public static boolean hasVocals (String text) { //COMPROVAR SI UN STRING TÉ O NO VOCALS
        boolean answer = false;
        int i = 0;
        text = text.toLowerCase();

        while (i < text.length() && !answer) {
            if(vocals.contains(text.charAt(i))) {
                answer = true;
            }
            i++;
        }
        return answer;
    }

    public static int numberOfVocals (String text) {  //OBTENIR EL NÚM DE VOCALS QUE TÉ UN STRING
        int numVocals = 0;

        for (int i = 0; i < text.length(); i++) {
            if (vocals.contains(text.charAt(i))) {
                numVocals++;
            }
        }
        return numVocals;
    }
}