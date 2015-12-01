
public class TestDLList 
{

	public static void main(String[] args) 
	{
		QueueOfStrings queue = new QueueOfStrings();
		queue.enqueue("A");
		queue.enqueue("n");
		queue.enqueue("d");
		queue.enqueue("r");
		queue.enqueue("e");
		queue.enqueue("s");
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		if(queue.empty()== true)
		{
			System.out.println("empty");

		}
		else
		{
			System.out.println("it is not empty");
		}

	}

}
