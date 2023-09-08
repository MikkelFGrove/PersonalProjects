import java.util.Scanner;

public class BMI_Calculator {
    static Scanner newSc = new Scanner(System.in);
    static double bmi;
    static double weight;
    static double height;

    public static void main(String[] args) {
        getInputs();
        calculateBMI();
        System.out.println(bmi);
    }

    public static void getInputs(){
        System.out.println("Welcome to this BMI calculator!\nFirst type your weight: ");
        weight = newSc.nextDouble();

        System.out.println("Now type your height in meters: ");
        height = newSc.nextDouble();

    }
    public static void calculateBMI(){
        bmi = weight / (height*height);

    }
}
