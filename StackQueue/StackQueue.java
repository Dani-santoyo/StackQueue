package StackQueue;
import java.util.Stack;
/**Class: Intermediate Programming
 * @author Daniel Santoyo
 * @version 1.0
 * Course: ITEC 2150 Spring 2024
 * Written: 4/19, 2024
 * StackQueue - a class designed to test the splitStack(), which splits a stack into
 * negatives on the bottom of the stack and positive integers on the top.
 */
public class StackQueue {

    public static void splitStack(Stack<Integer> stack) {

        Stack<Integer> positives = new Stack<>();
        Stack<Integer> negatives = new Stack<>();
        Stack<Integer> newStack = new Stack<>();

        while (!stack.isEmpty()) {
            int num = stack.pop();
            if (num < 0) {
                negatives.push(num);
            } else {
                positives.push(num);
            }
        }

        while (!negatives.isEmpty()) {
            int num = negatives.pop();
            newStack.push(num);
        }

        while (!positives.isEmpty()) {
            int num = positives.pop();
            newStack.push(num);
        }

        System.out.println(newStack);
    }


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(-5);
        stack.push(67);
        stack.push(-45);
        stack.push(67);
        stack.push(9);
        stack.push(0);
        stack.push(-42);
        stack.push(56);
        stack.push(-7);

        splitStack(stack);
    }
}



