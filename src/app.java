import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class app {
    private JTabbedPane tabbedPane1;
    private JTextPane clasaTextPane;
    private JTextField textField1;
    private JButton adaugaButton;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel RootPanel;
    private JLabel clase;
    private JTextArea textArea1;
    private JLabel mesaj;
    private JTextField textField5;
    public int nrclase=0;
    ArrayList<Clasa> clasee = new ArrayList<Clasa>();


    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
        f.pack();f.setContentPane(new app().RootPanel);

    }
    public app() {
        adaugaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer nr=Integer.getInteger(textField4.getText());
                clasee.add(new Clasa(textField1.getText(),textField2.getText(),textField3.getText(),nr));
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
                String clasa= clasee.get(clasee.size()-1).getClasa();
                String litera= clasee.get(clasee.size()-1).getLitera();
                String specializare= clasee.get(clasee.size()-1).getSpecializare();
                String nrelevi= clasee.get(clasee.size()-1).getNrelevi();
                mesaj.setText("Clasa "+clasa+litera+" a fost adaugata cu succes.");
                System.out.println(clasa+litera);
                textArea1.setText(textArea1.getText()+"\r\n"+clasee.size()+". "+clasa+litera+" - Specializarea: "+specializare+", avand un numar de "+nrelevi+" elevi");
            }
        });
    }
}
