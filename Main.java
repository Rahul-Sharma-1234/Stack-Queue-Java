public class Main {
    public static void main(String[] args) {
        ArrayQueue arr_que = new ArrayQueue(10);
        for (int i = 0; i < 20; i++){
            System.out.println("Pushing " + i + " to the queue");
            arr_que.enqueue(i);
        }
        System.out.println("The element in the front is: " + arr_que.getFront());
        System.out.println("The Queue is " + arr_que);
        for (int i = 0; i < 19; i++){
            System.out.println("The element being dequeued is: " + arr_que.dequeue());
        }
        arr_que.clear();
        System.out.println("The Queue has been emptied");
        int a=1;

        ArrayStack arr_stk = new ArrayStack(10);
        for (int i = 0; i < 20; i++){
            System.out.println("Pushing " + i + " to the stack");
            arr_stk.push(i);
        }
        System.out.println("The stack is: " + arr_stk);
        System.out.println("Is the Stack Empty? " + arr_stk.isEmpty());
        System.out.println("The peek is: " + arr_stk.peek());
        System.out.println("Element being poped is: " + arr_stk.pop());
        System.out.println("The peek is: " + arr_stk.peek());
        arr_stk.clear();
        System.out.println("The Stack has been cleared");
    }
}
