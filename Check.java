import javax.swing.*;
import java.awt.*;

public class Check{
    public static void main(String args[]){
        JFrame login = new JFrame("SMM Store");
        ImageIcon logo = new ImageIcon("logo.png");


        login.setSize(500,500);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.getContentPane().setBackground(new Color(197, 239, 203));
        login.setLayout(new BorderLayout());
        login.setIconImage(logo.getImage());
    
        JPanel header = new JPanel();
        JLabel headInfo = new JLabel();
        header.setPreferredSize(new Dimension(100,50));
        header.setBackground(new Color(31, 36, 31,80));


        
        headInfo.setText("<html><h1 style='text-decoration:underline;'>SSM Stores</h1></html>");
        headInfo.setIcon(logo);
     

        headInfo.setForeground(new Color(197, 239, 203));
        header.add(headInfo);
        login.add(header,BorderLayout.NORTH);
        

    

        login.setVisible(true);
    }
}