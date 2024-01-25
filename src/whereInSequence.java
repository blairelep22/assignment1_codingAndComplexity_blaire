import java.math.BigInteger;
import java.util.Scanner;

/*

Blaire Lepore
1/22/24
Given an integer output the position of that number in the NotFibonacci sequence from
problem 3. If the given input is not a number in the sequence, return the position of the closest
number lower than the input.
Example 1:
Input: 8
Output: 4
Explanation: The number 8 is not in the NotFibonacci sequence. Therefore, the closest
lower number is 7 which is the 4th number in the NotFibonacci sequence.
Example 2:
Input: 1640
Output: 9
Explanation: The number 1640 is the 9th number in the NotFibonacci sequence
 */

public class whereInSequence {

    private static int findPosition(BigInteger input) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;

        //start counter
        int position = 2;

        while (true) {
            //eq used from notFib also referencing stackoverflow
            BigInteger next = a.multiply(BigInteger.valueOf(3)).add(b.multiply(BigInteger.valueOf(2)));

            //equality
            if (input.equals(b)) {
                return position;

                //compare to find next pos
            } else if (input.compareTo(b) < 0) {
                return position - 1; // Closest lower number
            }

            // Move to the next pair
            a = b;
            b = next;
            position++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        BigInteger input = scanner.nextBigInteger();

        int position = findPosition(input);
        System.out.println("Output: " + position);
    }
}