package Number1;

public class Thread1 extends Thread {
    @Override
    public void run(){
        int i=0;
        while (i<101){
            System.out.println(i++);
        }
    }
}
