package Lab3;

public class ListElement {
	private ListElement next; // only need a next as its single linked list
	private int data;
	
	public ListElement() {
		this.data = 0;
		this.next = null;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public int getData() {
		return this.data;
	}
	
	public ListElement getNext() {
		return next;
	}
	
	public void NextElement(ListElement x) {
		next = x;
	}
}
