import javax.swing.*;

public class HelloWorldWithSwing extends JFrame {

    public HelloWorldWithSwing() {
        setSize(500,500);
        setTitle("Hello world");

        setVisible(true);
    }

    public static void main(String[] args) {
        HelloWorldWithSwing hello = new HelloWorldWithSwing();
    }
}
