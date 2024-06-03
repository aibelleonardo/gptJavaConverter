import java.util.Scanner;

public class BinaryToDecimal {
    public static int binaryToDecimal(long binaryNumber) {
        int decimalNumber = 0;
        int power = 0;
        while (binaryNumber != 0) {
            int remainder = (int) (binaryNumber % 10);
            decimalNumber += remainder * Math.pow(2, power);
            binaryNumber /= 10;
            power++;
        }
        return decimalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        long binaryNumber = scanner.nextLong();

        int decimalNumber = binaryToDecimal(binaryNumber);

        System.out.println("Decimal equivalent: " + decimalNumber);

        scanner.close();
    }
}
