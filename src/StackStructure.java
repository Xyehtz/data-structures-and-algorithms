import java.util.Stack;

public class StackStructure {
    public static void main(String[] args) {
        /* Stack: Is a LIFO data structure, this means that it is:
            - First in, last out
        It stores the values in a vertical tower, each value added goes to the top
        The methods to add and remove values are:
            - .push() to add
            - .pop() to remove
         */

        // Declaration of the stack
        Stack<String> gamesStack = new Stack<>();

        // .empty() method will return true if the method is empty, false otherwise
        System.out.println("Is the Stack empty: " + gamesStack.empty());

        // Add elements into the stack, Fallout will be at the bottom, and Grand Theft Auto V will be at the top
        gamesStack.push("Fallout");
        gamesStack.push("Overwatch");
        gamesStack.push("Borderlands");
        gamesStack.push("Civilization VI");
        gamesStack.push("Grand Theft Auto V");

        // This will print the whole stack: ["Fallout", "Overwatch", "Borderlands", "Civilization VI", "Grand Theft Auto V"]
        System.out.println("Stack: " + gamesStack);

        // The .pop() method will remove the item at the top of the stack, in this case, Grand Theft Auto V
        // .pop() will also return the value of the item at the top, so we can assign it another variable
        String gameAtTop = gamesStack.pop();
        System.out.println("Item removed from the stack: " + gameAtTop);

        // If we want just to know which is the item at the top of the stack, without deleting it, we can use the .peek() method
        gamesStack.peek(); // Will return Civilization VI
        System.out.println("Item at the top of the stack: " + gamesStack.peek());

        // When we want to search for an item in the stack, we use the .search() method, it will return the position of the item starting at 1 on the top of the stack, Civilization VI = 1
        System.out.println("Position of Civilization VI on the stack: " + gamesStack.search("Civilization VI")); // If the item is not on the stack, it will return -1

        //! We can run out of memory by adding elements into the stack, this is a OutOfMemoryError, it could happen after millions of items
    }
}
