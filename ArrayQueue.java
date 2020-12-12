public class ArrayQueue {
    private static int newEntry;
    private Integer[] store;
    private int capacity;
    private int count;
    private int front;
    private int back;

    ArrayQueue(int size) {
        store = new Integer[size];
        capacity = size;
        front = 0;
        back = -1;
        count = 0;
    }
    public Boolean is_full() {
        return capacity == count;
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public void double_array() {
        Integer[] temp = new Integer[store.length * 2];
        for (int i = 0; i < store.length; i++) {
            temp[i] = store[i];
        }
        store = temp;
        capacity = capacity * 2;
    }
    public void enqueue(int newEntry) {
        if(is_full()){
            System.out.println("Doubling the size of the Array");
            double_array();
        }
        System.out.println("Inserting " + newEntry + " into the Queue");
        back = (back + 1) % capacity;
        store[back] = newEntry;
        count++;
    }
    public int dequeue()  {
        if (isEmpty())
            throw new EmptyQueueException();
        else {
            front = (front + 1) % capacity;
            count--;
            return getFront();
        }
    }
    public int getFront() {
        if (isEmpty())
            throw new EmptyQueueException();
        else {
            return store[front];
        }
    }
    public void clear(){
        for (int i = 0; i < store.length; i++) {
            store[i] = null;
        }
        front = 0;
        back = -1;
        count = 0;
    }

}