class QueuesUsingResizableArray{
	private int head = 0, tail = 0, size =2;
	private int[] que;
	QueuesUsingResizableArray(){
		que = new int[size];
	}
	public void enqueue(int data){
		if(tail == size && tail - head <= size && head != 0) {
			resizeArray(size);
		}
		else if (tail - head == size){
			resizeArray(size * 2);
		}
		que[tail++] = data;
	}
	public int dequeue(){
		if (isEmpty()) {
			System.out.println("Empty Queue");
			return 0;
		}
		int temp = que[head++];
		if (tail - head == (size/4) && !isEmpty()){
			resizeArray(size/2);
		}
		return temp;
	}
	public boolean isEmpty(){
		return head == tail && head == 0;
	}
	public void resizeArray(int capacity){
		int[] temp = new int[capacity];
		int i = 0;
		for (i = head; i < tail; i++) {
			temp[i - head] = que[i];
		}
		tail = tail - head;
		head = 0;
		que = temp;
		size = capacity;
	}
	public static void main(String[] args) {
		QueuesUsingResizableArray qura = new QueuesUsingResizableArray();
		qura.enqueue(1);
		qura.enqueue(2);
		qura.enqueue(3);
		qura.enqueue(4);
		qura.enqueue(5);
		System.out.println(qura.dequeue());
		System.out.println(qura.dequeue());
		System.out.println(qura.dequeue());
		System.out.println(qura.dequeue());
		System.out.println(qura.dequeue());
		qura.enqueue(4);
		qura.enqueue(5);
		System.out.println(qura.dequeue());
		qura.enqueue(4);
		System.out.println(qura.dequeue());
		System.out.println(qura.dequeue());
		System.out.println(qura.dequeue());
	}
}