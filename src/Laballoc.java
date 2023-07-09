import java.util.Arrays;
import java.util.Scanner;

public class Laballoc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z= sc.nextInt();
        int n= sc.nextInt();
        int arr[]={x,y,z};
        int res=0;
        Arrays.sort(arr
        );
        for(int i=0;i<arr.length;i++)
        {
            if(n<=arr[i]) {
                res = arr[i];
                break;
            }
        }
        if(res==x)
        {

            System.out.println("L1");
        }
        else if (res==y)
        {
            System.out.println("L2");
        }
        else if (res==z)
        {
            System.out.println("L3");
        }
    }
}
