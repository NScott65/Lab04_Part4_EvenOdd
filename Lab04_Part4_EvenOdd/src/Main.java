import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        double number;

        System.out.println("Enter a number and I will tell you if it's even or odd.");
        number = scan.nextDouble();

        if (number % 2 == 0){
            System.out.println("Your number is Even.");
        }else{
            System.out.println("Your number is Odd.");
        }
    }
}