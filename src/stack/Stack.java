package stack;

import java.util.Arrays;

public class Stack {

    private int size=0;

    private int[] array;

    public Stack(){
        this(10);
    }

    public Stack(int size) {
        if(size<=0){
            array=new int[10];
        }else {
            array=new int[size];
        }
    }

    /**
     * 入栈
     */

    public void push(int item){
        if(isFull()){
            array= Arrays.copyOf(array,size*2);
        }
        array[size++]=item;
    }

    /**
     * 获取栈顶元素
     */
    public int peek(){
        if(size<=0){
            throw new IndexOutOfBoundsException("栈内为空");
        }
        return array[size-1];
    }

    /**
     * 出栈
     */
    public int pop(){
        int tmp=peek();
        size--;
        return tmp;
    }

    /**
     * 获取大小
     */
    public int size(){
        return size;
    }

    /**
     * 栈是否已经满了
     */
    public boolean isFull(){
        return size==array.length;
    }
}
