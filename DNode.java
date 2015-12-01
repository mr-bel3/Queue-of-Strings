public class DNode 
{
	public String data; 
	public DNode next; 
	public DNode prev;

	public DNode(String data) 
	{
		this.data = data; 
		this.next = null; 
		this.prev = null;
	} 
	// another DNode constructor if we want to
	// specify the DNode to point to.
	public DNode(String _data, DNode _next, DNode _prev)
	{
		next = _next;
		data = _data;
		prev = _prev;
	}

	// these methods should be self-explanatory
	public String getData()
	{
		return data;
	}

	public void setData(String _data)
	{
		data = _data;
	}

	public DNode getNext()
	{
		return next;
	}

	public void setNext(DNode _next)
	{
		next = _next;
	}

	public DNode getPrev()
	{
		return prev;
	}

	public void setPrev(DNode _prev)
	{
		prev = _prev;
	}
}