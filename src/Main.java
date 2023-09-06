/*
Check if given strings are rotations of each other or not
__________________________________________________________________________
nput: S1 = ABCD, S2 = CDAB
Output: Strings are rotations of each other

Input: S1 = ABCD, S2 = ACBD
Output: Strings are not rotations of each other
 */


import java.util.Scanner;

public class Main {
    static boolean SequenceChecker(String correctWord , String CheckerWord){
        if (correctWord.length() == CheckerWord.length() && (correctWord + correctWord).contains(CheckerWord)){
            return true;
        }else
            return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first word :");
        String word = input.nextLine();
        System.out.println("Enter the word you want to check :");
        String SequenceWord = input.nextLine();
        System.out.println("Printing the result :");
        System.out.println(SequenceChecker(word , SequenceWord));
    }
}