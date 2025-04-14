import javax.swing.*;
import java.awt.*;

public class Home {
    public static void main(String args[]){
    JFrame home = new JFrame("Welcome to SMM Store");
    ImageIcon logo = new ImageIcon("logo.png");
  
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setSize(500,500);
        home.setLayout(new BorderLayout());
        home.setIconImage(logo.getImage());
        home.getContentPane().setBackground(new Color(197, 239, 203));
        JPanel header = new JPanel();
        JLabel headInfo = new JLabel();

        header.setPreferredSize(new Dimension(100, 50));
        header.setBackground(new Color(31, 36, 31, 80));

        headInfo.setText("<html><h1 style='text-decoration:underline;'>SSM Stores</h1></html>");
        headInfo.setIcon(logo);
        headInfo.setForeground(new Color(197, 239,  203));
        headInfo.setHorizontalAlignment(JLabel.CENTER);

        header.add(headInfo);
        home.add(header);
        home.setVisible(true);
    }
}
