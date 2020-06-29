import java.util.Scanner;

import static java.lang.Float.parseFloat;
import static org.apache.commons.lang3.StringUtils.*;

public class StringTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Something: ");
        String userInput = input.nextLine();

        System.out.println("You Entered: " + userInput);

        if(!isNumeric(userInput)){
            System.out.println("\"" + userInput + "\"" + " is not a number");
        } else{
            System.out.println("Hey! There's a number in this string: " + parseFloat(userInput) + "!");
        }

        System.out.println(swapCase(userInput));

        System.out.println(reverse(userInput));



    }
}
