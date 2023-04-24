public class App {
    public static void main(String[] args) throws Exception {
       int a = 85,i=1, k=100;
       int b[] = new int[k];
       while(a != 0){
        b[i++] = a%8;
        a = a/8;
       }
       for(int j=i-1;j>0;j--)
       {
        System.out.print(b[j]);
       }
       System.out.println();
    }
}
