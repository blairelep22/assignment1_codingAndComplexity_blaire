import java.math.BigInteger;
import java.util.Scanner;

/*

Blaire Lepore
1.18

FROM INSTRUCTIONS:
This program produces the NotFibonacci sequence: the next number in the
sequence is produced by combining the previous two numbers.
The rule for generating the NotFibonacci sequence is follows:
• Start with the initial values of 0 and 1.
• For each subsequent term, take the previous term, multiply it by 2, add it to the term
before the previous, and append the result as the next term in the sequence.
The program should be able to take an input of the number of terms in the sequence and
produce the sequence up to that number. For example, if the user inputs 10, the program should
output the first 10 numbers in the NotFibonacci sequence: 0, 1, 2, 7, 20, 61, 182, 547, 1640,
4921.
Hint: Use Long or BigInteger instead of int or Integer

 */

public class notFibonacciSequence {

    private static void makefibseq(int n) {

        BigInteger[] fibstring = new BigInteger[n];
        fibstring[0] = BigInteger.ZERO;
        fibstring[1] = BigInteger.ONE;

        System.out.print(fibstring[0] + ", " + fibstring[1]);

        //using stack overflow for rules of BigInteger
        for(int i =2; i < n; i++){
            fibstring[i] = (fibstring[i - 1].multiply(BigInteger.valueOf(2)).add((fibstring[i - 2].multiply(BigInteger.valueOf(3)))));

            //(

            System.out.print(", " + fibstring[i]);
        }
        }


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Enter the number of terms in the sequence: ");
        int n = scanner.nextInt();

        System.out.println("Not Fibonacci Sequence: ");
        makefibseq(n);
    }
}
