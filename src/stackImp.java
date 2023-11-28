public class stackImp<T> implements stack<T>{
    Node<T> top;

    public stackImp(){
        this.top = null;
    }

    @Override
    public boolean isEmpty(){
        return top == null;
    }

    @Override
    public void push(T data){
        Node<T> newNode = new Node<>(data);
        if(top == null){
            top = newNode;
        }
        else{
            newNode.next = top;
            top = newNode;

        }
    }

    @Override
    public int size() {
        int cnt = 0;
       Node<T> temp = top;
       while(temp!=null){
            cnt+=1;
            temp = temp.next;
       }
       return cnt;
    }

    @Override
    public T peek(){
        if(top!=null){
            return top.data;
        }
        return null;

    }

    @Override
    public void pop(){
        if(top!=null){
            if(top.next!=null){
                top = top.next;
            }
            else{
                top = null;
            }
        }
        else{
            System.out.println("Stack is empty already");
        }
    }

}
