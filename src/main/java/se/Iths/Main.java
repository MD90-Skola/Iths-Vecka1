package se.Iths;
import java.util.Scanner;


/*                  ( TABELL )
   nr1==nr2     Om nr1 har samma värde som nr2
   nr1!=nr2     Om nr1 inte har samma värde som nr2
   nr1<nr2      Om nr1 är mindre än nr2
   nr1>nr2      Om nr1 är större än nr2
   nr1<=nr2     Om nr1 är mindre än nr2 eller lika med nr2
   nr1=>nr2     Om nr1 är större än nr2 eller lika med nr2
 */









public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Michel";
        int pinCode = 1337;   // camelCase
        int input; // här deklarerar vi vår input variabl

        System.out.println("Hej! " + name + " Ange PIN");
        if(sc.hasNextInt())
        { // då kollar jag om användaren har skrivigt in en int

             input = sc.nextInt();    // kommer spara det i input  // initierar vår input med ett värde
        }else{
            input = 0;
            System.out.println("Endast siffror");
        }




        if (input == pinCode) {  // om detta inte stämmer!
            System.out.println("rätt pinkod");
        } else {
            System.out.println("fel kod");
        }

        System.out.println(input);


        System.out.println("-----");
        String color = "red";
        String color2 = "blue";

        boolean isEqualColors = color == color2;
        System.out.println("isEqualColors = " + isEqualColors);   // Arraylist
        System.out.println("false pga olika färger");
        System.out.println("------");

        if(color.equals(color2)){
           // denna koden körs om den har samma värde som color2
        }else{
            //då körs denna koden
        }




    }


}