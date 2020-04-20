class QueueUsingLinkedList{

	// linked list approach to store data
	private class LinkedList{
		int data;
		LinkedList next;
	}

	// Linked List object
	LinkedList first,last;

	// insert at the end of linked list
	void enqueue(int data){
		LinkedList oldLast = last;
		last = new LinkedList();
		last.data = data;
		last.next = null;
		if(isEmpty()){
			first = last;
		} else{
			oldLast.next = last;
		}
	}

	// delete from beginning of the linked list
	int dequeue(){
		if(first == null){
			return 0;
		}
		int temp = first.data;
		first = first.next;
		if(isEmpty()){
			last = null;
		}
		return temp;
	}
	
	boolean isEmpty(){
		return first == null;
	}
}