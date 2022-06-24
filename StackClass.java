//stack
import java.util.*;
public class StackClass {
	static class Stack{
		static ArrayList<Integer> list=new ArrayList<>();
		
		public static void push(int val) {
		list.add(val);//inorder to push use add
		}
		public static int pop() {
			if(list.isEmpty()) {
				return -1;
			}
			int top=list.get(list.size()-1);
			list.remove(list.size()-1);
			return top;
		}
		public static int peek() {
			int top=list.get(list.size()-1);
			return top;
		}
	
	}
	public static void main(String[] args) {
		Stack s=new Stack();
		s.push(1);
		s.push(2);
		System.out.print(s.peek());
	}

}
