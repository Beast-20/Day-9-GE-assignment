public interface stack<T> {
    boolean isEmpty();
    void push(T data);

    int size();
    T peek();

    void pop();
}
