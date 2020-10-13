package project3.pkg282;


import java.util.Scanner;


public class UserInput {

    public static int getInt() {
        Scanner input = new Scanner(System.in);
        int n;
        if (input.hasNextInt()) {
            n = input.nextInt();
        } else {
            System.out.println("Invalid input. Try again");
            n = getInt();
        }
        return n;
    }

    public static char getChar() {
        Scanner input = new Scanner(System.in);
        char charValue = input.next().charAt(0);
        return (charValue);
    }

    public static double getDouble() {
        Scanner input = new Scanner(System.in);
        double doubleValue = input.nextDouble();
        return (doubleValue);
    }

    public static String getString() {
        Scanner input = new Scanner(System.in);
        String stringValue = input.nextLine();
        return (stringValue);
    }

    public static int getInt(int min, int max) {
        int I = getInt();
        if (I < min || I > max) {
            System.out.println("Invalid Entry. Try Again");
            I = getInt(min, max);
        }
        return I;
    }

    public static char getChar(char min, char max) {
        char c = getChar();
        if (c < min || c > max) {
            System.out.println("Invalid Entry. Try Again");
            c = getChar(min, max);
        }
        return c;
    }

    public static double getDouble(double min, double max) {
        double d = getDouble();
        if (d < min || d > max) {
            System.out.println("Invalid Entry. Try Again");
            d = getDouble(min, max);
        }
        return d;
    }

    public static String getString(int min, int max) {
        String string = getString();
        int s = string.length();
        if (s < min || s > max) {
            System.out.println("Invalid Entry. Try Again");
            string = getString(min, max);
        }
        return (string);
    }

    
        
    

    public static void main(String[] args) {

        // TODO code application logic here
    }
}


/**
 *
 * @author Student-HSLH133
 */
// TODO code application logic here

