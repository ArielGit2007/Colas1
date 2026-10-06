import javax.swing.*;

public class Ventana {
    private JPanel Principal;
    private JTabbedPane tabbedPane1;
    private JTextField txtNombre;
    private JSpinner spiAsiento;
    private JComboBox cboTipo;
    private JButton btnAgregar;
    private JTextArea txtListado;
    private JButton btnAtender;
    private JTextField txtPasajero;
    private JButton btnPasajeroActual;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Ventana");
        frame.setContentPane(new Ventana().Principal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
