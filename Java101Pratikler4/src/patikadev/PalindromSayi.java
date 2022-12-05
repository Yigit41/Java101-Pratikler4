package patikadev;

import java.util.Scanner;

public class PalindromSayi {

	public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);

	        System.out.print("Please Enter A Number : ");
	        int sayi = input.nextInt();
	        if (isPalindrom(sayi) == true) {
	            System.out.println(sayi + " is a palindrome number.");
	        } else {
	            System.out.println(sayi + " is not a palindrome numberr.");
	            
	        }
	        input.close();
	    }

	
	static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, last;
        while (temp != 0) {
            last = temp % 10;
            reverseNumber = (reverseNumber * 10) + last;
            temp /= 10;
        }
        if (reverseNumber == number)
            return true;
        else
            return false;
    }
}
