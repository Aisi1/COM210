//Alex Isiofia Lab 2: Delimiter Matching Using Restricted Structures

package testdelimiter;

import java.util.*;

class DelimiterMatching
{
    String expr; //expects a string to be input
   
    public boolean isDelimiterMatching(String expr)
    {
        
        Deque<Character> stk = new ArrayDeque<>(); //create new stack
        
        for (int i = 0; i < expr.length(); i++) 
        {
            char x = expr.charAt(i);
            if (x == '(' || x == '[' || x == '{') //opening symbols
            {
                stk.push(x); //push them
                continue;
            }
            if(x != ')' && x != ']' && x != '}') //closing symbols
            {
                continue;
            }
            if (stk.isEmpty()) //check if empty
                return false;
            char check;
            switch (x) 
            {
            case ')':
                check = stk.pop(); //pop and check
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stk.pop(); //pop and check
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stk.pop(); //pop and check
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }

        return (stk.isEmpty()); //end check if stack is empty
    }
}

class TestDelimiter
{
    public static void main(String args[])
    {
        DelimiterMatching D = new DelimiterMatching();
        if(D.isDelimiterMatching("x*(y+z)+[z/(z-y)]"))
            System.out.print("Matched");
        else System.out.print("Not Matched");
    }
}