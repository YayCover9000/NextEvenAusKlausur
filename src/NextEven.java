import java.util.Scanner;
import java.lang.Math;
public class NextEven {
    public static void main (String [] args ) {
        Scanner scanner = new Scanner(System.in);
        NextEven.getNextEven(scanner.nextDouble());
    }
    // Mit ceil() aus Math Klasse

    static void getNextEven (double p) {

        double q = p;
        if (q <= 0) {
            System.out.println("Error " + 0);
        } else {
            System.out.println("ceil: " + Math.ceil(q));
        }
    }

    // Versuche eigene Method zu schreiben, aber es kommt zu rundungsfehlern sodas die while schleife nicht funktioniert
    /*
    static void getNextEven(double p) {
        double q = p;
        if (q <= 0) {
            System.out.println("Error " + 0);
        } else if (q % 2 == 0) {
            System.out.println(q);
        } else {
            while (q % 2 != 0) {
                q = (q + 0.001);
                System.out.println(q);
            }
            System.out.println(q);
        }
    }
    */
}
