import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Napisz program, który będzie pobierał od użytkownika stolicę i kraj dopóki nie wprowadzi „/”, (wykorzystaj pętlę do while)
         następnie poproś użytkownika o podanie jednego z wcześniej wprowadzonych krajów i wyświetl odpowiadającą mu stolicę.
         */

        Map<String,String> names = new HashMap<>();

        Scanner scan = new Scanner(System.in);
        String stolica, kraj;

        while (true) {

            System.out.println("Podaj stolice :");
            stolica = scan.next();

            if (stolica.equals("/"))
                break;

            System.out.println("Podaj kraj :");
            kraj = scan.next();

            if (kraj.equals("/")){
                break;
            }
            names.put(stolica,kraj);

        }
        System.out.println("Podaj klucz");
        stolica = scan.next();
        System.out.println(names.get(stolica));











    }
}