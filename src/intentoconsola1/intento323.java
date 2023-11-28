package intentoconsola1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class intento323 {
    private final JFrame frame;
    private JPanel contentPane;
    private JButton btnEnter;
    private JTextField txtEntrada;
    private JTextArea txtSalidaConsola;

    public intento323() {
        frame = new JFrame("<CARIOCA>");
        frame.setContentPane(contentPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        txtSalidaConsola.setBackground(Color.BLACK);
        txtSalidaConsola.setForeground(Color.WHITE);
        txtSalidaConsola.setEditable(false);

        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSalidaConsola.append(txtEntrada.getText() + "\n");
                procesarEntrada(txtEntrada.getText());
                txtEntrada.setText("");
            }
        });
    }

    public void mostrar() {
        frame.setVisible(true);
    }

    public void println(String texto) {
        txtSalidaConsola.append(texto + "\n");
    }


    private void procesarEntrada(String input) {
        input = input.trim();
        if (input.isEmpty())
            return;
    }

    public void mostrarMenuPrincipal() {
        mostrar();
        this.println("BIENVENIDO A 'CARIOCA'");
        this.println("Indique cuantos jugadores participaran del juego: ");
    }

    public static void main(String[] args) {
        intento323 vista = new intento323();
        vista.mostrarMenuPrincipal();
    }
}
