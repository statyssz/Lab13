import java.awt.Frame;

public class TooSimpleFrame extends Frame {
    public TooSimpleFrame() {
        // Устанавливаем заголовок окна
        super("Простое окно");

        // Устанавливаем размер окна
        setSize(400, 150);

        // Делаем окно видимым
        setVisible(true);
    }

    public static void main(String[] args) {
        new TooSimpleFrame();
    }
}
