import java.util.HashMap;

public class Sleutel {

    private HashMap<Character, Integer> secretMap;

    public Sleutel() {
        secretMap = new HashMap();
        fillsecretmap();
    }

    // We vullen de HashMap op met de tekens en bijbehorende codes.
    // 'A' krijgt code 1, 'B' krijgt code2, enzovoort
    public void fillsecretmap() {
        char kar;
        // Ascii-code van 'A' is 65, van 'B' is 66, enzovoort
        for (kar = 'A'; kar <= 'Z'; kar++) {
            secretMap.put(kar, (int) kar - 64);   // ('A',65 - 64)  of ('A', 1)  enz....
        }
        secretMap.put(' ', 0);   // spatie krijgt code 0
        secretMap.put('.', 27);  // punt krijgt code 27
    }

    // De methode printSleutel toont alle tekens en de
    // bijbehorende codes op het scherm.
    // Vervolledig de methode printSleutel.
    public void printSleutel() {

    }

    // De methode codeerBoodschap heeft een boodschap als parameter
    // en retourneert de gecodeerde boodschap als een String.
    // Bijvoorbeeld: de boodschap "Er was eens ..." retourneert
    // de gecodeerde boodschap "5 18 0 23 1 19 0 5 5 14 19 0 27 27 27"
    // Vul de methode codeerBoodschap verder aan.
    public String codeerBoodschap(String boodschap) {
        boodschap = boodschap.trim().toUpperCase();
        String gecodeerdeBoodschap = "";

        return gecodeerdeBoodschap;

    }

    // De methode decodeerBoodschap heeft een boodschap in cijfercode
    // als parameter en retourneert de boodschap als een String.
    // Bijvoorbeeld:
    // de boodschap in cijfercode "5 18 0 23 1 19 0 5 5 14 19 0 27 27 27"
    // retourneert de boodschap "ER WAS EENS ..."
    // Hier kan je de boodschap in cijfercode opsplitsen in aparte
    // cijfercodes door de methode split uit de klasse String toe te passen.
    // Vul de methode decodeerBoodschap verder aan.
    public String decodeerBoodschap(String boodschap) {
        String gedecodeerdeBoodschap = "";

        return gedecodeerdeBoodschap;
    }
}


