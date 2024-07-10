
import java.util.Scanner;

public class Armstrong {

    static boolean checkArmstrong(int num) {
        int sum = 0;
        int numcopy = num;
        while (numcopy > 0) {
            int digit = numcopy % 10;
            sum += Math.pow(digit, 3);
            numcopy /= 10;
        }
        return num == sum;
    }

    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("\n<--- Program for checking Armstrong number --->\n");
        System.out.print("Enter the number : ");
        int a = myobj.nextInt();
        if (checkArmstrong(a)) {
            System.out.println("\n" + a + " is an Armstrong number.\n");
        } else {
            System.out.println("\n" + a + " is not an Armstrong number.\n");
        }
    }
}
