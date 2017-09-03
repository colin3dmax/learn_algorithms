public class Test {
    public static void main(String[] args){
        LinkedStackOfStrings stack = new LinkedStackOfStrings();
        stack.push("Hello");
        stack.push("ABC");
        stack.push("AAA");

        while (!stack.isEmpty()){
            System.out.println( stack.pop() );
        }
    }
}
