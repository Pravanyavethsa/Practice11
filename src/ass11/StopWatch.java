package ass11;

public class StopWatch {
    public void test(){
        int num=0;
        for(int i=0;i<=50;i++){
            num=num+i;
            System.out.println(num+ ", ");
        }
    }
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        new StopWatch().test();
        long end=System.currentTimeMillis();
        long time=end-start;
        System.out.println();
        System.out.println("Elapsed time: "+time+" milli seconds");
    }
}
