//Blaire Lepore
//1.20.24
/*
A subsequence of a strong is a new string generated from the original string with some characters deleted without
changing the relative order of the remaining characters

ace = abcde

This algorithm will:

Given two strings text1 and text2, return the length of their longest common subsequence
If there is no common subsequence - return 0;


Input//Output Examples:
Input: text1 = "abc", text2 = "abc"
Output: 3
Explanation: The longest common subsequence is "abc" and its length is 3.
Input: text1 = "almanacs", text2 = "albatross"
Output: 3
Explanation: The longest common subsequence is "alas" and its length is 4.
Input: text1 = "almanac", text2 = "ferris"
Output: 0
Explanation: There is no such common subsequence, so the result is 0
 */

import java.util.Scanner;

public class commonSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text1: ");
        String text1 = scanner.nextLine();
        System.out.print("Enter text2: ");
        String text2 = scanner.nextLine();

        System.out.println("Input: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        int result = longestCommonSubsequence(text1, text2);
        System.out.println("Output: " + result);

        /*

        without user inout:


        String text1 = "almanacs";
        String text2 = "albatross";

        System.out.println("Input: text1 = \"" + text1 + "\", text2 = \"" + text2 + "\"");
        int result = longestCommonSubsequence(text1, text2);

        System.out.println("Output: " + result);*/
    }

    public static int longestCommonSubsequence(String text1, String text2) {
        char[] str1 = text1.toCharArray();
        char[] str2 = text2.toCharArray();

        int m = str1.length;
        int n = str2.length;

        //2d array using dynamic
        int[][] dp = new int[m+1][n+1];

        for (int i=1; i <= m; i++){
            for(int k =1; k <= n; k++){
                if (str1[i-1] == str2[k-1]) {

                    //if characters match, extend the commmon subseqeuence
                    dp[i][k] = dp[i-1][k-1] + 1;
                }
                else{
                    //if characters don't match, take max of the previous lengths
                    dp[i][k] = Math.max(dp[i-1][k], dp[i][k-1]);
            }
        }}


    //store in bottom-right cell of the dp array
        return dp[m][n];
    }}

        //inteliJ suggestion Math.max on line 54
        //private static int max(int a, int b){
           // return (a > b) ? a : b;
