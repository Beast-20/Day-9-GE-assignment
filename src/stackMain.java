public class stackMain {
    
    public static void main(String[] args) {
        stackImp<Integer> integerstack = new stackImp<>();

    
    System.out.println("Is stack empty? " + integerstack.isEmpty());
    integerstack.push(5);
    integerstack.push(10);
    integerstack.push(15);
    integerstack.push(20);

    System.out.println("Size of stack is:- " + integerstack.size() );
    System.out.println("Top element of stack is:- " + integerstack.peek());
    integerstack.pop();
    System.out.println("Size of stack is:- " + integerstack.size() );
    System.out.println("Top element of stack is:- " + integerstack.peek());
    System.out.println("Is stack empty? " + integerstack.isEmpty());
    }
}
