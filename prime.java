import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scan=new Scanner(System.in);
      int n= scan.nextInt();
    int  flag=1;
     for(int i=2;i<n;i++)
     {
      if(n%i==0)
      {
        flag=0;
      }
     }
      if(flag==0)
      {
System.out.println(n);

      }
      else{
        System.out.println("not prime number");
      }
     }
}
