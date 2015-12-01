
public class QueueOfStrings 
{
	private DLList queue;
	private int currentSize;
	
	public QueueOfStrings()
	{
		queue = new DLList();
		currentSize = 0;
	}
	
	public void enqueue(String data)
	{
		queue.add(data);
		currentSize++;
	}
	
	public boolean empty()
	{
		return currentSize == 0;
	}
	
	public String dequeue()
	{
		String dequeued = queue.get(1);
		queue.remove(1);
		currentSize--;
		return dequeued;
	}
}
