import javax.swing.*;
import java.awt.*;


public class Signup {
    JFrame signup = new JFrame("SMM Store Signup");
    ImageIcon logo = new ImageIcon("logo.png");
    Signup(){
       

        signup.setSize(500, 500);
        signup.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signup.getContentPane().setBackground(new Color(197, 239, 203));
        signup.setLayout(new BorderLayout());
        signup.setIconImage(logo.getImage());

        JPanel header = new JPanel();
        JLabel headInfo = new JLabel();
        header.setPreferredSize(new Dimension(100, 50));
        header.setBackground(new Color(31, 36, 31, 80));

        headInfo.setText("<html><h1 style='text-decoration:underline;'>SSM Stores</h1></html>");
        headInfo.setIcon(logo);
        headInfo.setForeground(new Color(197, 239, 203));
        header.add(headInfo);
        signup.add(header, BorderLayout.NORTH);

        JPanel side1 = new JPanel();
        side1.setBackground(new Color(31, 36, 31, 80));
        JPanel side2 = new JPanel();
        side2.setBackground(new Color(31, 36, 31, 80));
        JPanel side3 = new JPanel();
        side3.setBackground(new Color(31, 36, 31, 80));
        
        JPanel signupPanel = new JPanel();
        signupPanel.setLayout(new GridLayout(6,4));
        JLabel userLabel = new JLabel("Username: ");
        userLabel.setForeground(new Color(197, 239, 203));
        JTextField userText = new JTextField(20);
        userText.setPreferredSize(new Dimension(100, 10));
        userText.setBackground(new Color(197, 239, 203));
        JLabel passLabel = new JLabel("Password: ");
        passLabel.setForeground(new Color(197, 239, 203));
        JPasswordField passText = new JPasswordField(20);
        passText.setPreferredSize(new Dimension(100, 10));
        passText.setBackground(new Color(197, 239, 203));
        JLabel emailLabel = new JLabel("Email: ");
        emailLabel.setForeground(new Color(197, 239, 203));
        JTextField emailText = new JTextField(20);
        emailText.setPreferredSize(new Dimension(100, 10));
        emailText.setBackground(new Color(197, 239, 203));
        JLabel phoneLabel = new JLabel("Phone: ");
        phoneLabel.setForeground(new Color(197, 239, 203));
        JTextField phoneText = new JTextField(20);
        phoneText.setPreferredSize(new Dimension(100, 10));
        phoneText.setBackground(new Color(197, 239, 203));
        JButton signupButton = new JButton("Signup");
        signupButton.setBackground(new Color(197, 239, 203));
   
        
        signupPanel.add(userLabel);
        signupPanel.add(userText);
        signupPanel.add(passLabel);
        signupPanel.add(passText);
        signupPanel.add(emailLabel);
        signupPanel.add(emailText);
        signupPanel.add(phoneLabel);
        signupPanel.add(phoneText);
       
        
        signupPanel.add(signupButton);
        signup.add(side1, BorderLayout.WEST);
        signup.add(side2, BorderLayout.EAST);
        signup.add(side3, BorderLayout.SOUTH);
        signup.add(signupPanel, BorderLayout.CENTER);
        
     
        signupPanel.setBackground(new Color(100, 122, 103));
        signup.setVisible(true);
    }
}
