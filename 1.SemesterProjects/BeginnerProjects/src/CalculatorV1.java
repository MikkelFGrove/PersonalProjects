import java.util.Scanner;

public class CalculatorV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator!");
        System.out.println();
        System.out.println("You now have the following options: +, -, * or /, type whichever operation you want to do:");

        String operationType = sc.nextLine();

        switch (operationType){

            case "+":
                System.out.println("Enter the two numbers to be added");
                float addN1 = sc.nextFloat();
                float addN2 = sc.nextFloat();
                float addResult = addN2 + addN1;
                System.out.println(addN2 + " + " + addN1 + " = " + addResult);
                break;

            case "*":
                System.out.println("Enter the two numbers to be multiplied");
                float multN1 = sc.nextFloat();
                float multN2 = sc.nextFloat();
                float multResult = multN2 * multN1;
                System.out.println(multN1 + " * " + multN2 + " = " + multResult);
                break;

            case "/":
                System.out.println("Enter the two numbers to be divided");
                float divN1 = sc.nextFloat();
                float divN2 = sc.nextFloat();
                float divResult = divN1 / divN2;
                System.out.println(divN1 + " / " + divN2 + " = " + divResult);
                break;

            case "-":
                System.out.println("Enter the two numbers to be subtracted");
                float subN1 = sc.nextFloat();
                float subN2 = sc.nextFloat();
                float subResult = subN1 - subN2;
                System.out.println(subN1 + " - " + subN2 + " = " + subResult);
                break;

            default:
                System.out.println("Not a valid operation type");
        }

    }
}