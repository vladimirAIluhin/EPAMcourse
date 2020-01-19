import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int intValueOfNumber = scanner.nextInt();
        System.out.println("Binary value of entered number is:" + Integer.toBinaryString(intValueOfNumber));
        System.out.println("Binary value by my method is:" + getBinaryValue(intValueOfNumber));
    }

    private static String getBinaryValue(int number) {
        String binaryValue = "";
        int decimalValue = number;
        do {
            binaryValue = (decimalValue % 2) + binaryValue;
            decimalValue = decimalValue / 2;
        } while (decimalValue > 0);
        return binaryValue;
    }
}
