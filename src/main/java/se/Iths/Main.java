package se.Iths;

import java.util.Scanner;

                            /*Januari     – 31 dagar
                            Februari    – 28 dagar
                            Mars        – 31 dagar
                            April       – 30 dagar
                            Maj         – 31 dagar
                            Juni        – 30 dagar
                            Juli        – 31 dagar
                            Augusti     – 31 dagar
                            September   – 30 dagar
                            Oktober     – 31 dagar
                            November    – 30 dagar
                            December    – 31 dagar */

                /*1. Sout " skriv en månad "
                1.1 Användaren ska skria in namnet på en månad ( input )

                2. sout skriv ut antal dagar på den månaden
                2.1 if / else if*/

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Michel";

        System.out.println();
        System.out.println("hej! " + name + " Välkommen till MånadsKalkylatorn!");
        System.out.println("Skriv en månad.. så berättar jag hur många dagar");


        String input = sc.nextLine();
        String januari = "31";
        String februari = "28 eller 29";
        String mars = "31";
        String april = "30";
        String maj = "31";
        String juni = "30";
        String juli = "31";
        String augusti = "31";
        String september = "30";
        String oktober = "31";
        String november = "30";
        String december = "31";

        System.out.println();


        if (input.equals("januari")) {
            System.out.println(januari + " dagar");
        } else if (input.equals("februari")) {
            System.out.println(februari + " dagar");
        } else if (input.equals("mars")) {
            System.out.println(mars + " dagar");
        } else if (input.equals("april")) {
            System.out.println(april + " dagar");
        } else if (input.equals("maj")) {
            System.out.println(maj + " dagar");
        } else if (input.equals("juni")) {
            System.out.println(juni + " dagar");
        } else if (input.equals("juli")) {
            System.out.println(juli + " dagar");
        } else if (input.equals("augusti")) {
            System.out.println(augusti + " dagar");
        } else if (input.equals("september")) {
            System.out.println(september + " dagar");
        } else if (input.equals("oktober")) {
            System.out.println(oktober + " dagar");
        } else if (input.equals("november")) {
            System.out.println(november + " dagar");
        } else if (input.equals("december")) {
            System.out.println(december + " dagar");
        } else {
            System.out.println("error. skriv en månad");

        }

        sc.close();


    }

}