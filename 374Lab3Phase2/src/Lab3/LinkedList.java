package Lab3;

public class LinkedList {
	private static ListElement head;
	private static ListElement tail;
	
	public LinkedList()
	{
		head=null;
		tail=null;
	}
	
	public void addElement(ListElement le)
	{
		if (LinkedList.head==null) // if the head of the list is null
		{
			head = le;
		}
		
		ListElement node = head;
		while (node.getNext() != null) // while the next node in the list is not null
		{
			node=node.getNext();
		}
		le.PreviousElement(node);
		node.NextElement(le); // 'setting' the next node
		tail = le;
	}
	
	public ListElement getElement (int index)
	{
		ListElement node = head;
		int counter = 0;
		while (node != null)
		{
			if (counter == index)
			{
				return node;
			}
			counter ++;
			node = node.getNext();
		}
		return new ListElement();
	}
	
	public void deleteElement(int index)
	{
		int counter = 0;
		ListElement node = head;
		if (node == null) // if the list is empty
		{
			return;
		}
		while (counter<index) // while the node has not been found
		{
			if (node.getNext() != null) // if we are not at the end
			{
				counter++; // increment the node
				if (counter == index) // if we reached the node to delete
				{
					node.NextElement(node.getNext().getNext()); // set the previous node to aim at the next node
					node.getNext().PreviousElement(node);// setting the previous node
					return;
				}
				node = node.getNext(); // advance to the next node
			}
		}
		
	}
	
	public void printLinkedListHead()
	{
		ListElement node = head;
		if (node == null) // if list is empty
		{
			System.out.println("List is Empty");
			return;
		}
		do{ //other wise print out node data until empty
			System.out.println(node.getData());
			node = node.getNext();
			
		} while (node.getNext() != null);
		
		
	}
	
	public void printLinkedListTail()
	{
		ListElement node = tail;
		if (node == null) // if list is empty
		{
			System.out.println("List is Empty");
			return;
		}
		do{ //other wise print out node data until empty
			System.out.println(node.getData());
			node = node.getPrevious();
			
		} while (node.getPrevious() != null);
		
		
	}
	
	public static void main (String [] args){
		LinkedList mylist = new LinkedList();
		for (int i=0; i<10; i++)
		{
			ListElement le = new ListElement();
			le.setData(i);
			mylist.addElement(le);
		}
		//mylist.printLinkedListHead();
		mylist.printLinkedListTail();
		mylist.deleteElement(9);
		mylist.getElement(6).getData();
	}

}
