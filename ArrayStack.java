public class ArrayStack {
    private static int newEntry;
    private Integer[] store;
    private int capacity;
    private int top;


    ArrayStack(int size)    //Constructor for the stack
    {
        store = new Integer[size];
        capacity = size;
        top = -1;
    }
    public void push(int newEntry) {
        if(is_full()){
            System.out.println("Doubling the size of the Array");
            double_array();
        }
        System.out.println("Inserting " + newEntry + " into the stack");
        store[++top] = newEntry;
    }
    public Boolean is_full() {
        return capacity - 1 == top;
    }
    public void double_array() {
        Integer[] temp = new Integer[store.length * 2];
        for (int i = 0; i < store.length; i++){
            temp[i] = store[i];
        }
        store = temp;
        capacity = capacity*2;
    }
    public int pop(){
        if (isEmpty())
            throw new EmptyStackException();
        else {
            return store[top--];
        }

    }
    public int peek(){
        if (!isEmpty())
            return store[top];
        else
        throw new EmptyStackException();
    }
    public boolean isEmpty() {
        return top == -1;
    }
    public void clear(){
        for (int i = 0; i < store.length; i++) {
            store[i] = null;
        }
        top = -1;
    }
}