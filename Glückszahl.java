import java.util.Scanner;

public class Glückszahl {
    public static void main(String[] args) {

        int glückszahl;

        Scanner scan = new Scanner(System.in);
        System.out.println("Bitte Glückszahl eingeben: ");
        glückszahl = scan.nextInt();

        if (glückszahl%2 == 0) {
            System.out.println("gerade Zahl");
        }
        else if (glückszahl%2 != 0) {
            System.out.println("ungerade Zahl");
        }

        if (glückszahl/10 == 0 ) {
            System.out.println("runde Zahl");
        }

        if (glückszahl/10 >= 1) {
            System.out.println("Zweistellige Zahl");
        }
        else  {
            System.out.println("keine Runde Zahl");
        }
        }








    }



