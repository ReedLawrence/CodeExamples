/*
 * Created by Reed Lawrence
 * Data Structures Fall 2014
 * Program is an implementation of a stack
 */

//package arraydriver;
import java.lang.*;
import java.io.*;

class MyStack {
	//Using Array as the base to construct the stack
	//Assignment defines max stack size as 20
	int dataStorage[] = new int[20];
    int headIndex = 0;
	//Method will check if the stack is empty
	public boolean empty() {
	if(dataStorage[headIndex] == 0)
            return true;
        else
            return false;
	}

	// Push: add item to the top of the stack and return the item pushed for comfirmation
	public Integer push(Integer item) {
            //Special Case, the stack is empty. Add item at the head index
            if(empty() == true){
                dataStorage[headIndex] = item;
                //return what is actually in the array for a useful confirmation
                return dataStorage[headIndex];
            }
            //Else increase the head index and put the new item in there.
            dataStorage[headIndex + 1] = item;
            headIndex++;
            //return what is actually in the array for a useful confirmation
            return dataStorage[headIndex];
            /*for(int i=19; i>0; i--){
                dataStorage[i] = dataStorage[i-1];
            }
            dataStorage[0]=item;
            return dataStorage[0];*/
	}

	//Return the top of the stack without destroying it, return null if empty
	public Integer peek() {
            if(empty() == true)
                return null;
            return dataStorage[headIndex];
	}

	//Return the top of the stack and destroy it, return null if empty
	public Integer pop() {
			//special case: stack is empty, return null
            if(empty() == true){
                return null;
            }
            //special case: stack only has one item
            if(headIndex == 0){
                int tmp = dataStorage[0];
                dataStorage[0] = 0;
                return tmp;
            }
            //Return the item and destroy the imformation
            int tmp = dataStorage[headIndex];
            dataStorage[headIndex] = 0;
            headIndex--;
            return tmp;
	}
}


//Class provided by the professor to test my stack
public class ArrayDriver {
	public static void main(String[] args) {
		MyStack stack0;

		stack0=new MyStack();
		System.out.println(stack0.empty());
		System.out.println(stack0.peek());
		System.out.println("Pop top item");
		System.out.println(stack0.pop());
		System.out.println("Push 5");
		stack0.push(5);
		System.out.println(stack0.empty());
		System.out.println(stack0.peek());
		System.out.println("Pop top item");
		System.out.println(stack0.pop());
		System.out.println(stack0.empty());
		System.out.println(stack0.peek());
		System.out.println("Pop top item");
		System.out.println(stack0.pop());
		System.out.println("Push 10");
		stack0.push(10);
		System.out.println("Push 15");
		stack0.push(15);
		System.out.println("Push 20");
		stack0.push(20);
		System.out.println(stack0.empty());
		System.out.println(stack0.peek());
		System.out.println("Pop top item");
		System.out.println(stack0.pop());
		System.out.println(stack0.empty());
		System.out.println(stack0.peek());
		System.out.println("Pop top item");
		System.out.println(stack0.pop());
		System.out.println(stack0.empty());
		System.out.println(stack0.peek());
		System.out.println("Pop top item");
		System.out.println(stack0.pop());
		System.out.println(stack0.empty());
		System.out.println(stack0.peek());
		System.out.println("Pop top item");
		System.out.println(stack0.pop());
		return;
	}
}
