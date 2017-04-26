package cs143;

/**
 * This interface models a queue ADT.
 * 
 * @param <E> the type of element to be saved in the queue
 * @author Linda Zuvich
 */
public interface PureQueue<E> {
    
    /**
     * Adds the given element to the back of the queue.
     * 
     * @param e the element to add.
     */
    void enqueue(E e);
    
    /**
     * Removes the first element in the queue and returns it. 
     * 
     * @return the first element, or null if no elements exist in the queue 
     */
    public E dequeue();
    
    /**
     * Reports if the queue is empty.
     * 
     * @return true if there are no elements in the queue, false if not 
     */
    public boolean isEmpty();
    
    /**
     * Reports the first element in the queue without removing it. 
     * 
     * @return the first element, or null if no elements exist in the queue
     */
    public E front();
    
    /**
     * Reports the current number of elements in the queue.
     * 
     * @return the number of elements in the queue 
     */
    public int size();
    
}
