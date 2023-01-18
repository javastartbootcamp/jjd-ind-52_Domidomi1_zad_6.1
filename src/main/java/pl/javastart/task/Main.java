package pl.javastart.task;

import java.util.Scanner;

public class Main {

    @SuppressWarnings({"checkstyle:Indentation", "checkstyle:WhitespaceAround"})
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int userInput;
        int num = 0;

        System.out.println("Podaj liczbę: ");

        while ((userInput = reader.nextInt()) != num) {
            if (userInput < 100) {
                System.out.println("Podana liczba jest za mała ");
                continue;
            }
            if (userInput > 200) {
                System.out.println("Podana liczba jest za duża");
                continue;
            }
            if (userInput > 100 && userInput < 200 && userInput % 3 == 0) {
                System.out.println("Podana liczba jest dobra");
                break;
            } else {
                System.out.println("To zła liczba!");
            }
        }
    }
}
