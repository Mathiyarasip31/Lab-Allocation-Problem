import java.util.Scanner;

public class SequenceProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        System.out.print(number+" ");
        while(number!=1)
        {
            if(number%2==0)
            {
                number/=2;
            }
            else
            {
                number=3*number+1;
            }
            System.out.print(number+" ");
        }

    }
}
