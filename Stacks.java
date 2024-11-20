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
//        stack.pop(); // bo6 removed
//        stack.pop(); // cod removed
        System.out.println(stack);
        // it removes item from the end

        // stack assigning to the strings
        String favgame= stack.pop();
        System.out.println(favgame);
        System.out.println(stack);
        // this showed error in the code as Stack is empty nooww

        /*==================================================================================================================================================================================================================================================
    exception in thread "main" java.util.EmptyStackException
	at java.base/java.util.Stack.peek(Stack.java:103)
	at java.base/java.util.Stack.pop(Stack.java:85)
	at Stacks.main(Stacks.java:60)
	==========================================================================================================================

         */

// now we dont do pop for the all items

//        stack.push("Minecraft");
//        stack.push("Call of duty");
//        stack.push("Black ops 6 ");
//
//        String fav2game= stack.pop();
//        System.out.println(fav2game);
//        System.out.println(stack);

        //this time the output will be
        // [ Maybe one of the games ]

        // if i run this now then it will throw exception and error as i am repeating something which is already done
        //I have tested and it works

        /*    Black ops 6
[Minecraft, Call of duty]
here is the expected output where the black ops 6 are considered as the facvgame
and the rest of the elements in the [] are in the stack So it just poped out the codbo6 pop()
and others are printed as System.out.println(stack);
          */





        // peek at the stack after adding something new to it
        stack.push("STEAM");
        stack.push("Epic games");
        stack.push("Activison");
        System.out.println(stack.peek());
        System.out.println(stack);
        // it started peeking from the last right now it peeked and printed the Activison
        // next time it will Epic games
        // and then the last one
        // it also not remove the items from it jst display them


        // using search in stack


        System.out.println(stack.search("STEAM"));
        System.out.println(stack.search("MINECRAFT"));
        System.out.println(stack.search("Activison"));
        System.out.println(stack.search("Epic games"));



    }
 }