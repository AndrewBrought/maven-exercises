import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static org.apache.commons.lang3.StringUtils.*;

public class StringTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String yesNo = "y";
        do {
            System.out.println("Enter Something: ");
            String userInput = input.nextLine();

            System.out.println("You Entered: " + userInput);

//            My first pass
//            if (!isNumeric(userInput)) {
//                System.out.println("\"" + userInput + "\"" + " is not a number");
//            } else {
//                System.out.println("Hey! There's a number in this string: " + parseFloat(userInput) + "!");
//            }

            System.out.println("\"" + userInput + "\" " + returnNumMessage(userInput));

            System.out.println("Flipped Case: " + swapCase(userInput));

            System.out.println("Reversed: " + reverse(userInput));

            System.out.println();

            System.out.println("Would you like to enter something else?");
            yesNo = input.nextLine();

        }while(yesNo.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing!");


    }
    //Justin's solution for determining if the input is a string or not
    public static String returnNumMessage(String input){
        return (StringUtils.isNumeric(input)) ? "is a number" : "is not a number";
    }
}
