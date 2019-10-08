package com.example.test;

import java.util.Stack;

public class EvaluatePostFix {

    static int evaluatePostfix(String exp)
    {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            char c=exp.charAt(i);
            if(Character.isDigit(c))
                stack.push(c - '0');
            else
            {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch(c)
                {
                    case '+':
                        stack.push(val2+val1);
                        break;

                    case '-':
                        stack.push(val2- val1);
                        break;

                    case '/':
                        stack.push(val2/val1);
                        break;

                    case '*':
                        stack.push(val2*val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static String getValue(String exp)
    {
        return String.valueOf(evaluatePostfix(exp));
    }
}
