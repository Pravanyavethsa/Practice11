package ass11;

public class Fibonacci {
    public static void main(String[] args) {
        int firstnum=0,secnum=1,n=10;
        System.out.println("fibonacci series");
        for(int i=1;i<n;i++){
            System.out.println(firstnum + " ");
            int nextnum=firstnum+secnum;
            firstnum=secnum;
            secnum=nextnum;
        }
    }
}
