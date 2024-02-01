import java.util.*;
import java.util.Collection;

public class n8ejercicio2 {
    public static void main(String[] args) {

        List<String> listWords = new ArrayList<>();
        listWords.add("Francia");
        listWords.add("España");
        listWords.add("Alemania");
        listWords.add("Estados Unidos");
        listWords.add("Polonia");
        listWords.add("italia");
        listWords.add("Noruega");
        listWords.add("Cuba");
        listWords.add("Chad");

        listWords.forEach((words->System.out.println(words)));
        System.out.println();
        listWords.stream().filter(words->words.contains("o") && words.length()>5 ).forEach(words->System.out.println("Paises con letra o y más de 5 letras: " +words));


    }

}