import java.util.Scanner;

/**
 * Created by makasin41k on 05.09.2016.
 */

public class Calculator {
    public static void main(String[] args) {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 1st number: ");
        double operand1 = scanner.nextInt();
        System.out.println("Input operation's sing: ");
        String operation = scanner.next();
        /*if( operation == scanner.next("abs"))
        {
            result = Math.abs(operand1);
            System.out.println("Result: " + result);
        }*/
        System.out.println("Input 2nd number: ");
        double operand2 = scanner.nextInt();
        scanner.close();

        switch(operation){
            case "+": result = operand1+operand2;
                break;
            case "-": result = operand1-operand2;
                break;
            case "*": result = operand1*operand2;
                break;
            case "/": result = operand1/operand2;
                break;
        }
        System.out.println("Result: " + result);
    }
}
