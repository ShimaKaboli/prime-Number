import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        number = input.nextInt();
        System.out.println(isPrime(number) ? "Number IS Prime" : "Number IS Not Prime");
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i +"\t");
            }
        }





    }

    public static boolean isPrime(int number) {
        boolean prime = true;
        if (number < 2) {
            prime = false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            } else
                prime = true;
        }
        return prime;
    }


}