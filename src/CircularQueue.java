public class CircularQueue {

	private final int CAPACITY = 3000;
	private int front, rear, count;
	private Integer[] queue;

	public CircularQueue() {
		front = rear = count = 0;
		queue = new Integer[CAPACITY];
	}

	/* Adds the specified element to the rear of this queue */
	public void enqueue(int element) {
		queue[rear] = element;
		rear++;
		count++;
	}

	// Removes the element at the front of this queue and returns a reference to it.
	public int dequeue() {
		int result = queue[front];
		queue[front] = null;
		front = front + 1;
		count--;
		return result;
	}

	// Returns the number of elements currently in this queue.
	public int size() {
		return count;
	}
}
