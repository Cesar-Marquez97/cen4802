//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        int argument = 10;
        int answer;

        answer = fiboSequence(argument);

        System.out.println("The "+argument+ "nt term of the Fibonacci sequence is: " + answer);
    }


    public static int fiboSequence(int n){
        if(n <=1) {
            return n;
        }
        else{
            return fiboSequence(n-1) + fiboSequence( n-2);
        }
    }
}