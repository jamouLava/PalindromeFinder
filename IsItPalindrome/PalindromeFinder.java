import java.util.Scanner;


public class PalindromeFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("            Find the Palindrome          ");
		System.out.println();
		System.out.print("Please enter a word to see if it's a palindrome:  ");
		String word = keyboard.nextLine();
		char[] parray = word.toCharArray();
		
		//use palindrome method on the word entered
		System.out.println(palindromeCheck(parray));
		
		
		}
	
	public static boolean palindromeCheck(char[] word) { //method to compare chars from opposite ends
		int i1 = 0; //whatever letter is at index 0 
		int i2 = word.length - 1; //whatever letter is last
		while (i2 > i1) {
			if(word[i1] != word[i2]) {
				return false; //if word isn't a palindrome
				
			}
			++i1; //move up one char in the word
			--i2; //move down one char in the word
		}
		return true; //if it is a palindrome
		
	}

}
