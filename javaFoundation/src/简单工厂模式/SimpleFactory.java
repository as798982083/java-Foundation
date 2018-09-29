package 简单工厂模式;

public class SimpleFactory {
    public Sender pruduceMail(){
        return new MailSender();
    }

    public Sender produceSms(){
        return new SmsSender();
    }
}
