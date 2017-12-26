package stack;

public class StackTest {
    public static void main(String[] args){
        Stack stack=new Stack(2);
        System.out.println(stack.isFull());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.size());
    }
}
