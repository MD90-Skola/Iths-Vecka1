package se.Iths;

import java.util.Scanner;

// sc = scanner
// input = det användaren skriver in
// nextLine();
// nextInt();

        /*
        String = text
        int = heltal
        double = decimaltal
        boolean true/false
         */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in); //  ifall bugg finns

        System.out.println("skriv in ditt namn ");
        String name = sc.nextLine();
        int pinCode = 1337;   // camelCase

        System.out.println("Hej! " + name + " Ange PIN");
        int input = sc.nextInt();    // kommer spara det i input

        System.out.println(input);

        String test = sc2.nextLine();
        System.out.println(test);

        // System.out.println("hej " +name);
/*

    int nr1 = 5;
        int nr2 = 20;
        if (nr1==nr2)


 */


    }


}