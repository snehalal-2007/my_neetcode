class Solution {
    public boolean isValid(String s) {

        char c; // char to peek
        Stack<Character> stack = new Stack<>(); // stack initialization

        if (s.length()%2 != 0)
        {
            return false;
        }

        // loop to run through the elements
        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(' ) // checks open brackets
            {
                stack.push(s.charAt(i)); // pushes open brackets
            }

            else // means its a closing group
            {
                if (stack.isEmpty()) // checks if its starting with a closing brackets
                {
                    return false;
                }

                c = stack.peek(); // looks at the top of the stack
                if ((c == '(' && s.charAt(i) == ')') || (c == '[' && s.charAt(i) == ']') || (c == '{' && s.charAt(i) == '}')) 
                {
                    stack.pop(); //both opening an clsoing has been found
                }
                else
                {
                    return false;
                }
            }
        }
        if (stack.size()!=0)
            {
                return false;
            }
        
        else
        {
            return true;
        }
    }
}
