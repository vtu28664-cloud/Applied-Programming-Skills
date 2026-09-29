class MyCircularDeque {
    private int[] deque;
    private int front;
    private int rear;
    private int count;
    private int capacity;
    public MyCircularDeque(int k) {
        this.capacity = k;
        this.deque = new int[k];
        this.front = 0;
        this.rear = 0;
        this.count = 0;
    }
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        front = (front - 1 + capacity) % capacity;
        deque[front] = value;
        count++;
        return true;
    }
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        deque[rear] = value;
        rear = (rear + 1) % capacity;
        count++;
        return true;
    }
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        count--;
        return true;
    }
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        rear = (rear - 1 + capacity) % capacity;
        count--;
        return true;
    }
    public int getFront() {
        if (isEmpty()) {
            return -1;
        }
        return deque[front];
    }
    public int getRear() {
        if (isEmpty()) {
            return -1;
        }
        return deque[(rear - 1 + capacity) % capacity];
    }
    public boolean isEmpty() {
        return count == 0;
    }
    public boolean isFull() {
        return count == capacity;
    }
}