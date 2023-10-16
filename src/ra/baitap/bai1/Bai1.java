package ra.baitap.bai1;

public class Bai1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + " - Number: " + i + " - HashCode: " + this.hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
    }
}
