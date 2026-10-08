//      IMPORTS
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        //      DEFINING SCANNER
        Scanner scanner = new Scanner(System.in);

        //      TEXT COLOURS
        String Colour = "\u001B[32m";
        String Default = "\u001B[0m";
        String Error = "\u001B[31m";

        //      DEFINING VARIABLES
        double NUM1; 
        double NUM2;
        char Operator; 
        double RESULT = 0;

        //      PROMPT DISPLAY

        //      (USER INPUT: 1st Number) 
        System.out.println(Colour+"| Enter 1ST Number: "+Default);
        NUM1 = scanner.nextDouble(); // Returning input as a double value

        //      (DISPLAYING OPERATION OPTIONS)
        System.out.println(Colour+"| Enter a operator: \n| (+)\n| (-)\n| (X)\n| (/)"+Default);

        //      (USER INPUT: OPERATIONS)
        Operator = scanner.next().charAt(0);

        //      (USER INPUT: 2nd Number) 
        System.out.println(Colour+"| Enter 2ND Number: "+Default);
        NUM2 = scanner.nextDouble(); // // Returning input as a double value

        //      OPERATION PROCESSING
        switch(Operator){
            case '+' -> RESULT = NUM1 + NUM2;
            case '-' -> RESULT = NUM1 - NUM2;
            case 'X' -> RESULT = NUM1 * NUM2;
            case 'x' -> RESULT = NUM1 * NUM2;
            case '/' -> RESULT = NUM1 / NUM2;
            default -> {
                System.out.println(Error+"| Error: Invalid Input"+Colour);
            }
        }

        //      PRINTING OUT THE RESULT
        System.out.println(RESULT);

        scanner.close();
    }
}