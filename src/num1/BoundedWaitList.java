package num1;

import java.util.ArrayDeque;
import java.util.Collection;

public class BoundedWaitList<E> extends WaitList<E>{

    int capacity;
    public BoundedWaitList(Collection c) {
        super(c);
    }
    public void BoundedWaitList(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }
    public void add(E element){
        if (deque.size() <= capacity)
            deque.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" + "capacity=" + capacity + '}';
    }
}
