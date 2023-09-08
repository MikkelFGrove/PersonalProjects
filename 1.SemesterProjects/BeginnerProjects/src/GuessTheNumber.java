import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 10;
        int min = 1;
        int randomInt = (int) Math.floor(Math.random() * (max + min));

        int userGuess = sc.nextInt();

        if (userGuess == randomInt){
            System.out.println("You won the game holy smokes!");
        }
        else {
            System.out.println("You lost");
        }


    }
}