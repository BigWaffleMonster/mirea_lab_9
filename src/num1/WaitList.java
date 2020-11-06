package num1;

import java.util.ArrayDeque;
import java.util.Collection;

class WaitList<E> implements IWaitList<E>{
    ArrayDeque<E> deque = new ArrayDeque<E>();

    public WaitList(Collection<E> c) {
        deque.addAll(c);
    }

    @Override
    public void add(E element) {
        deque.add(element);
    }

    @Override
    public E remove() {
        return deque.remove();
    }

    @Override
    public boolean contains(E element) {
        return deque.contains(element);
    }

    @Override
    public boolean containsAll(Collection <E> c) {
        boolean b = deque.containsAll(c);
        return b;
    }

    @Override
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    @Override
    public String toString() {
        return "WaitList{" + "deque=" + deque + '}';
    }
}
