import java.util.Stack;
public class Stacks {
    public static  void main(String[] args ) {

        // STACK === LIFO  DATASTRUCTURE
        // LIFO === Last in First out
        // this allow us to store objects in stack like vertical tower
        // in vertical tower we can store and sort the books
        // push and  pop method are used here
         // push() is use to add something to the top
        // pop() is use to remove something from the top



        // the item that we push in first that should stay in there which means LAST IN
        /* ------------------------------------------------------------------------------------------------------------*/
        // last in first out means in order to do some customization wit h it we have to take one from the top which means FIRST OUT

        // STACK has 5 different METHODS to deal with dataset
        // push  the new item into the stack
        // pop the item out  from the stack
        // peek at the item STORED in stack
        // SEARCH for item STORED in stack
        // To check the stack is EMPTY or not talking like boolean




        Stack<String> stack = new Stack<String>();
        System.out.println(stack.empty());
        // currently it is empty


        // pushing some games (items to top of stack)

        stack.push("Minecraft");
        stack.push("Call of duty");
        stack.push("Black ops 6 ");

        // now rerun the stack.empty to check again
        System.out.println(stack.empty());
        // no longer empty


        // print the items from the stack
        System.out.println(stack);
        // it printed in the form of list  or array
        //printing does not mean the items are removed from the stack



        // remove something from stack
        stack.pop();// minecraft removed
        stack.pop(); // bo6 removed
        stack.pop(); // cod removed
        System.out.println(stack);

        // stack assigning to the strings

        String favgame= stack.pop()




        // it removes item from the end

    }
 }
