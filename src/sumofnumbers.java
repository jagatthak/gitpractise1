import java.util.Scanner;

import java.util.Scanner;

public class sumofnumbers {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int n = scanner.nextInt();
            int sum =0;
            for (int i = 1; i <= n; i++){
                sum = sum + i;
            }
            System.out.println("The sum of " +n +" natural numbers is : "+sum);
        }
    }


