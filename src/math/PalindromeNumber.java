package math;

/*
LeetCode: 9. Palindrome Number
Difficulty: Easy
Topic: Math
Time: O(n)
Space: O(1)
*/
public class PalindromeNumber {
	    public boolean isPalindrome(int x) {
	        if (x < 0) return false;

	        int original = x;
	        int reverse = 0;

	        while (x != 0) {
	            int digit = x % 10;
	            reverse = reverse * 10 + digit;
	            x /= 10;
	        }
	        return original == reverse;
	    }
	}


