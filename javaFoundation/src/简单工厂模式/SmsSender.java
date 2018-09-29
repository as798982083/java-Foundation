package 简单工厂模式;

public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("Sender function");
    }
}
