public class Test {
    public static void main(String[] args) {
        // Maak een sleutel-object.
        Sleutel sleutel = new Sleutel();
        // Druk de tabel met tekens en codes af.
        sleutel.printSleutel();
        // Maak een boodschap en codeer deze.
        String boodschap = "Er was eens ...";
        System.out.println("Boodschap: " + boodschap);
        System.out.print("Gecodeerde boodschap: ");
        System.out.println(sleutel.codeerBoodschap(boodschap));
        // Maak een boodschap in cijfercode en decodeer deze.
        boodschap = "5 18 0 23 1 19 0 5 5 14 19 0 27 27 27";
        System.out.println("Boodschap in code: " + boodschap);
        System.out.print("Gecodeerde boodschap: ");
        System.out.println(sleutel.decodeerBoodschap(boodschap));
    }
}
