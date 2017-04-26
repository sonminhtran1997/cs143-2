package cs143;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class tests the Queue class methods.
 * 
 * @author Linda Zuvich
 */
public class QueueTest {
    
    private Queue<Integer> intQueue;
    private Queue<String> strQueue;
    
    @Before
    public void setUp() {
        intQueue = new Queue<>();
        strQueue = new Queue<>();
    }

    /**
     * Test construction of class Queue.
     */
    @Test
    public void testConstruction() {
        assertTrue(intQueue.isEmpty());
        assertTrue(strQueue.isEmpty());
    }

    /**
     * Test of enqueue method, of class Queue.
     */
    @Test
    public void testEnqueue() {
        for (int i = 0; i < 100; i++) {
            intQueue.enqueue(i);
        }
        assertFalse(intQueue.isEmpty());
        assertTrue(intQueue.size() == 100);
    }

    /**
     * Test of dequeue method, of class Queue.
     */
    @Test
    public void testDequeue() {
        assertNull(strQueue.dequeue());
        strQueue.enqueue("Test");
        assertEquals(strQueue.dequeue(), "Test");
        assertTrue(strQueue.isEmpty());
    }

    /**
     * Test of isEmpty method, of class Queue.
     */
    @Test
    public void testIsEmpty() {
        assertTrue(intQueue.isEmpty());
        intQueue.enqueue(12);
        assertFalse(intQueue.isEmpty());
    }

    /**
     * Test of front method, of class Queue.
     */
    @Test
    public void testFront() {
        for (int i = 0; i < 75; i++) {
            intQueue.enqueue(i);
        }
        int size = intQueue.size();
        int value = intQueue.front();
        assertSame(value, 0);
        assertSame(size, 75);
    }

    /**
     * Test of size method, of class Queue.
     */
    @Test
    public void testSize() {
        for (int i = 0; i < 50; i++) {
            intQueue.enqueue(i);
        }
        assertSame(intQueue.size(), 50);
    }
    
}
