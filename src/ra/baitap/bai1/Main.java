package ra.baitap.bai1;

public class Main {
    public static void main(String[] args) {
        Bai1 bai1 = new Bai1();
        Bai1 bai11 = new Bai1();
        bai1.start();
        bai11.start();
        bai11.setPriority(10);
        bai1.setPriority(1);
        try {
            bai1.join();
            bai11.join();
        } catch (InterruptedException e) {
            System.out.println("Lỗi 1 tý");
        }
        System.out.println("Xong!!");
    }
}
