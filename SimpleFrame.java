import java.awt.*;
import java.awt.event.*;

public class SimpleFrame extends Frame {
    public SimpleFrame(String title) {
        // Устанавливаем заголовок окна
        super(title);

        // Устанавливаем размер окна
        setSize(400, 150);

        // Делаем окно видимым
        setVisible(true);

        // Добавляем обработчик событий для завершения приложения
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new SimpleFrame("Простое окно с заголовком");
    }
}
