package queue;

public class ArrayQueue {
    //队列数组
    private final Object[] items;


    public ArrayQueue(int capacity) {
        items=new Object[capacity];
    }
    //头 出
    private int head;
    //尾 入
    private int end;

    //队列满用  head ==（end+1）%items.length 判断
    //队列为空用  head == end 判断

    public boolean isFull(){
        if(head==(end+1)%items.length){
            return true;
        }else {
            return false;
        }
    }

    public boolean isEmpty(){
        if(head==end){
            return true;
        }else {
            return false;
        }
    }


    public boolean put(Object o){
        if(isFull()){
            return false;
        }
        items[end]=o;
        end=(end+1)%items.length;
        return true;
    }

    public Object peek(){
        if(isEmpty()){
            return null;
        }
        return items[head];
    }

    public Object poll(){
        if(isEmpty()){
            return null;
        }
        Object o=items[head];
        items[head]=null;
        head=(head+1)%items.length;
        return o;
    }

    public  int getSize(){
        if(head<end){
            return end-head;
        }else {
            return end+items.length-head;
        }
    }

}
