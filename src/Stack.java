public class Stack<T> {

    protected Object[] elements;
    private static final byte DEFAUL_SIZE = 10;
    private int pointer = 0;

    public Stack() {
        this(DEFAUL_SIZE);
    }

    public Stack(int size) {
        elements = new Object[size];

    }

    public boolean push(T element) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException("Stack is full");
        }

        elements[pointer] = element;
        pointer++;
        return true;

    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Can't pop from an empty stack");
        }

        T removed = (T) elements[--pointer];

        return removed;

    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Can't peek from an empty stack");

        }
        return (T) elements[pointer];
    }

    public boolean isEmpty() {
        return pointer == 0;

    }

    public boolean isFull() {
        return pointer == elements.length;
    }

    public int size() {
        return pointer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < pointer; i++) {
            sb.append(elements[i]);
            if (i < pointer - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}

