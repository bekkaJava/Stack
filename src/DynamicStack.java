public class DynamicStack<T> extends Stack<T>{

    public DynamicStack() {
        super();
    }
    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(T element) {
        if (isFull()) {
            resize();
        }

        return super.push(element);
    }

    private void resize() {

        int newSize = elements.length * 2;
        Object[] temp = new Object[newSize];

        for (int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];
        }

        elements = (T[]) temp;
    }




}
