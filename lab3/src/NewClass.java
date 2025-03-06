import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        String ciag = "abc";
        char dane[] = {'a', 'b', 'c'};
        String ciag1 = new String(dane);
        System.out.println("ciag1: " +ciag);
        System.out.println("ciag2: " +ciag1);
        double number = 2.3;
        System.out.println("liczba rzeczywista: " +number);
        String liczbaString = Double.toString(number);
        System.out.println("Liczba po konwersji: " + liczbaString);
        double convertedDouble = Double.parseDouble(liczbaString);
        System.out.println("Liczba rzeczywista po konwersji: " + convertedDouble);

        String userData = "Liliia Hurko";
        System.out.println("Trzeci znaki: " + userData.charAt(4));
        String userData1 = "LiLiia HUrko";
        if (userData.equals(userData1)) {
            System.out.println("Taka sama zawartosc");
        } else {
            System.out.println("Rozna zawartosc obiektow");
        }

        System.out.println("Dane uzytkownika male litery: " + userData1.toLowerCase());
        System.out.println("pozycja pierwszego a: " + userData1.indexOf('a'));
        System.out.println("pozycja drugiego a: " + userData1.indexOf('a', 2));
        int spacePos = userData1.indexOf(' ');
        System.out.println("Nazwisko: " + userData1.substring(spacePos + 1));
        String city = "lUbLin";
        city = city.toLowerCase();
        System.out.println("after toLowerCase: " + city);
        String firstLetter = city.substring(0, 1);
        System.out.println("first letter: " + firstLetter);
        firstLetter = firstLetter.toUpperCase();
        System.out.println("uppercase first letter: " + firstLetter);
        city = firstLetter + city.substring(1);
        System.out.println("final name: " + city);
        System.out.println("string length: " + city.length());

        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you");
        int read;
        if (scan.hasNextInt()) {
            read = scan.nextInt();
            System.out.println("FROM keyboard: " + read);
        }

        char znak='a';
        int asciiCode=(int)znak;
        System.out.println("ASCII code: "+asciiCode);
        char znak1=(char)asciiCode;
        System.out.println("ASCII character: "+znak1);
        char[] tab=ciag.toCharArray();

        int toCipher=(int)znak1;
        toCipher+=3;
        int x=toCipher%90;
        toCipher=x<65?x+64:x;
        char ciphered=(char)toCipher;

    }
    }

