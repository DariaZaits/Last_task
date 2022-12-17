package Number1;

public class Main {
    public static void main(String[] args) {

        Thread1 thread1 = new Thread1() ;

        for (int i=0; i<10; i++){
            new Thread1().start();
        }

        //thread1.start();
    }
}