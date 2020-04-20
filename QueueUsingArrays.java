class QueueUsingArrays{

	int[] arr;

	int head=0,tail=0;

	QueueUsingArrays(){
		arr = new int[1000];
	}


	void enqueue(int data){
		arr[tail++] = data;
	}

	int dequeue(){
		int temp = arr[head++];
		return temp;
	}

	boolean isEmpty(){
		return head == tail && head == 0;
	}

}