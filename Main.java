/**
 * @author Cesar Marquez
 * @since January 13, 2026
 * @version 2.0
 */

public class Main {

    /**
     * this is the main method of the program
     * @param args command line arguments
     */
    public static void main(String[] args) {

        int argument = 10;
        int answer;

        answer = fiboSequence(argument);

        System.out.println("The "+argument+ "nt term of the Fibonacci sequence is: " + answer);
    }

    /**
     *
     * @param n is the numeric term that the use want to know.
     * @return the term of the fibonacci sequence.
     */
    public static int fiboSequence(int n){
        if(n <=1) {
            return n;
        }
        else{
            return fiboSequence(n-1) + fiboSequence( n-2);
        }
    }
}