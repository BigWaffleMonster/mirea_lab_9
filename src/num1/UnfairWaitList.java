package num1;

import java.util.ArrayDeque;
import java.util.Collection;

public class UnfairWaitList<E> extends WaitList<E>{
    public UnfairWaitList(Collection<E> c) {
        super(c);
    }

    public void UnfairWaitList(){}
    public void remove(E element){
        deque.remove(element);
    }
    public void moveToBack(E element){
        boolean t = false;
        if(deque.contains(element)) {
            deque.remove(element);
            deque.add(element);
        }
    }
}
