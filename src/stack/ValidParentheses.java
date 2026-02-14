package stack;

/*
LeetCode: 20. Valid Parentheses
Difficulty: Easy
Topic: Stack
Time: O(n)
Space: O(1)
*/
import java.util.Stack;
public class ValidParentheses {
	
	 public boolean isValid(String s) {
	        Stack<Character> stack = new Stack<>();
	        
	        for (char ch : s.toCharArray()) {
	            
	            if (ch == '(' || ch == '{' || ch == '[') {
	                stack.push(ch);
	            } 
	            else {
	             
	                if (stack.isEmpty()) {
	                    return false;
	                }
	                
	                char top = stack.pop();
	                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
	                    return false;
	                }
	            }
	        }
	        
	        return stack.isEmpty();
	    }
}
