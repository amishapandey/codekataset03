import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[10];
	    int i;
	    for(i=0;i<10;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
System.out.println(arr[0]);

}
}
