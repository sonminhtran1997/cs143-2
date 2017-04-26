package cs143;

import java.util.LinkedList;

/**
 * This data-management class models a queue of generic objects by
 * implementing the PureQueue interface.
 *
 * @param <E> the type of element to be saved in the queue
 * @author Linda Zuvich
 */
public class Queue<E> implements PureQueue<E> {
    
    //fields
    private final LinkedList<E> list;
    
    /**
     * Constructor.
     */
    public Queue() {
        list = new LinkedList<>();
    }
    
    /**
     * Adds the given element to the back of the queue.
     * 
     * @param e the element to add.
     */
    @Override
    public void enqueue(E e) {
        list.addLast(e);
    }
    
    /**
     * Removes the first element in the queue and returns it. 
     * 
     * @return the first element, or null if no elements exist in the queue 
     */
    @Override
    public E dequeue() {
        return list.pollFirst();
    }
    
    /**
     * Reports if the queue is empty.
     * 
     * @return true if there are no elements in the queue, false if not 
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
    
    /**
     * Reports the first element in the queue without removing it. 
     * 
     * @return the first element, or null if no elements exist in the queue
     */
    @Override
    public E front() {
        return list.peek();
    }
    
    /**
     * Reports the current number of elements in the queue.
     * 
     * @return the number of elements in the queue 
     */
    @Override
    public int size() {
        return list.size();
    }
    
}
