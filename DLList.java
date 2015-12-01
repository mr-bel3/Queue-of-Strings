
public class DLList 
{
	// reference to the head DNode.
	private DNode head;
	private int listCount;

	// LinkedList constructor
	public DLList()
	{
		// this is an empty list, so the reference to the head DNode
		// is set to a new DNode with no data
		head = new DNode(null);
		listCount = 0;
	}

	public void add(String data)
	// post: appends the specified element to the end of this list.
	{
		DNode temp = new DNode(data);
		DNode current = head;
		// starting at the head DNode, crawl to the end of the list
		while(current.getNext() != null)
		{
			current = current.getNext();
		}
		// the last DNode's "next" reference set to our new DNode
		current.setNext(temp);
		current.next.setPrev(current);
		listCount++;// increment the number of elements variable
	}

	public void add(String data, int index)
	// post: inserts the specified element at the specified position in this list.
	{
		DNode temp = new DNode(data);
		DNode current = head;
		// crawl to the requested index or the last element in the list,
		// whichever comes first
		for(int i = 1; i < index && current.getNext() != null; i++)
		{
			current = current.getNext();
		}
		// set the new DNode's next-DNode reference to this DNode's next-DNode reference
		temp.setNext(current.getNext());
		// now set this DNode's next-DNode reference to the new DNode
		current.setNext(temp);
		current.next.setPrev(current);
		listCount++;// increment the number of elements variable
	}

	public String get(int index)
	// post: returns the element at the specified position in this list.
	{
		// index must be 1 or higher
		if(index <= 0)
			return null;

		DNode current = head.getNext();
		for(int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
				return null;

			current = current.getNext();
		}
		return current.getData();
	}

	public boolean remove(int index)
	// post: removes the element at the specified position in this list.
	{
		// if the index is out of range, exit
		if(index < 1 || index > size())
			return false;

		DNode current = head;
		for(int i = 1; i < index; i++)
		{
			if(current.getNext() == null)
				return false;

			current = current.getNext();
		}
		current.setNext(current.getNext().getNext());
		current.next.setPrev(current);
		listCount--; // decrement the number of elements variable
		return true;
	}

	/*
	 * This method will clear your linked list. Meaning that your linked list will have no elements in it.
	 */
	public void clear()
	{
		head = null;
	}

	public int size()
	// post: returns the number of elements in this list.
	{
		return listCount;
	}

	public String toString()
	{
		if (head != null)
		{
			DNode current = head.getNext();
			String output = "";
			while(current != null)
			{
				output += "[" + current.getData().toString() + "]";
				current = current.getNext();
			}
			return output;
		}
		else
		{
			return "The Linked list is empty";
		}
	}
}
