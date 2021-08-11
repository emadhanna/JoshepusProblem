import java.util.Scanner;

public class Josephus {

	public static void main(String[] args) {

		Scanner scanItems = new Scanner(System.in);
		System.out.println("Enter Number of People (N)");
		
		int numberOfPeople = scanItems.nextInt();
		System.out.println("Enter Person to Eliminate (M)");
		int numberToEliminate = scanItems.nextInt();

		CircularQueue circle = new CircularQueue();

		// initialize the circle
		for (int i = 0; i < numberOfPeople; i++) {
			circle.enqueue(i);
		}

		// eliminating from the circle
		System.out.println("Order Eliminated:");
		while (circle.size() + 1 >= numberToEliminate) {
			// push the skipped man to the end of queue
			for (int counter = 0; counter < numberToEliminate - 1; counter++) {
				circle.enqueue(circle.dequeue());
			}
			// eliminate every man
			int elementEliminated = circle.dequeue();
			System.out.print(" " + elementEliminated);
		}
	}
}
