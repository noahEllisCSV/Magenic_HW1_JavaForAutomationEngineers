/**
 * TODO HOMEWORK CHECKLIST:
 *      [X] Pull down Homework 1's starting branch
 *      [ ] Finish the sub method
 *      [ ] Fix the bug in the mul method
 *      [ ] Run the main method to see what happens
 *      [ ] Run the TestNG tests and make sure they all pass
 *      [ ] Comment below what the difference between TestNG and the main method is
 *          // ANSWER HERE:
 *      [ ] Submit your homework!
 * A basic class for a Calculator that can add, subtract and multiple
 */
public class Calculator {

    /**
     * Adds two floating point numbers together
     * @param numOne The first number being added
     * @param numTwo The second number being added
     * @return The sum of the two numbers
     */
    public static double add(double numOne, double numTwo) {
        return numOne + numTwo;
    }

    /**
     * TODO FOR HOMEWORK: Write the code to subtract two numbers. You can use the add method above for an example
     *
     * Subtracts the floating point numbers together
     * @param numOne The number being subtracted from
     * @param numTwo The number being used for subtraction
     * @return The result of numTwo subtracted from numOne
     */
    public static double sub(double numOne, double numTwo) {
        // Write the correct method here
        return 0; // Delete this line when done will all of the above
    }

    /**
     * TODO FOR HOMEWORK: The bellow program has a BUG! Find the bug and fix it. HINT: Read the comments
     *
     * Multiplies two floating point numbers together
     * @param numOne The first number being multiplied
     * @param numTwo The first number being multiplied
     * @return The product of two numbers
     */
    public static int mul(int numOne, int numTwo) {
        return numOne * numTwo;
    }

    /**
     * The main method of the Calculator class
     * @param args The arguments passed into the main method
     */
    public static void main(String[] args) {
        int firstNum = 6;
        int secondNum = 3;
        System.out.println(firstNum + " + " + secondNum + " = " + add(firstNum, secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " + sub(firstNum, secondNum));
        System.out.println(firstNum + " * " + secondNum + " = " + mul(firstNum, secondNum));

        // TODO: The following won't work as intended till all homework is done, uncomment when finished
        // double firstDouble = 6;
        // double secondDouble = 3;
        // System.out.println(firstDouble + " + " + secondDouble + " = " + add(firstDouble, secondDouble));
        // System.out.println(firstDouble + " - " + secondDouble + " = " + sub(firstDouble, secondDouble));
        // System.out.println(firstDouble + " * " + secondDouble + " = " + mul(firstDouble, secondDouble));
    }
}