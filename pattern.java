public class Star {

static void print_rectangle(int n, int m)
{
    int i, j;
    for (i = 1; i <= n; i++)
    {
    	for (j = 1; j <= m; j++)
        {
    		if(i==1 || i==n-4 ||i==n ||i==n-1 || j==1 ||j==2|| j==m || j==m-1 ) {
            	System.out.print("*");
            	}
    		else {
        	System.out.print(" ");
    		}
       }
        System.out.println();
    }
  
}
  
// Driver program for above function
public static void main(String args[])
{
    int rows = 6, columns = 6;
    print_rectangle(rows, columns);
}
}
