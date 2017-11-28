import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private JLabel jlbip = new JLabel("Server IP:");
    private JLabel jlbipp = new JLabel("10.51.3.69");
    private JLabel jlbport = new JLabel("Port:");
    private JTextField jtf1 = new JTextField();
    private JTextField jtf2 = new JTextField();
    private JButton jbtnstart = new JButton("Start");
    private JButton jbtnstop = new JButton("Stop");
    private JButton jbtnexit = new JButton("Exit");
    private JButton jbtnsend = new JButton("Send");
    private JButton jbtn[] = new JButton[9];
    private JTextArea jta = new JTextArea();
    private JPanel jpnlE = new JPanel(new GridLayout(7,1,3,3));
    private JPanel jpnlS = new JPanel(new GridLayout(1,2,3,3));
    private JPanel jpnlC = new JPanel(new GridLayout(1,2,3,3));
    private JScrollPane jsp = new JScrollPane();

    private Container cp;

    public MainFrame(){
        init();
    }
    private void init(){
    this.setBounds(100,100,400,500);
    this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    cp=this.getContentPane();
    cp.setLayout(new BorderLayout(5,5));
    cp.add(jpnlE,BorderLayout.EAST);
    cp.add(jpnlS,BorderLayout.SOUTH);
    cp.add(jpnlC,BorderLayout.CENTER);

    jpnlE.add(jlbip);
    jpnlE.add(jlbipp);
    jpnlE.add(jlbport);
    jpnlE.add(jtf1);
    jpnlE.add(jbtnstart);
    jpnlE.add(jbtnstop);
    jpnlE.add(jbtnexit);

    jpnlS.add(jtf2);
    jpnlS.add(jbtnsend);

    jpnlC.add(jta);

    cp.add(jsp,BorderLayout.CENTER);
    jsp.setPreferredSize(new Dimension(70,this.getHeight()));

    jpnlS.add(jtf2,BorderLayout.CENTER);
    jpnlS.add(jbtnsend,BorderLayout.EAST);
    }
}
