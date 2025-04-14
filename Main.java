import javax.swing.*;
import java.awt.*;

public class Main{
    public static void main(String args[]){
        JFrame login = new JFrame("SMM Store");
        ImageIcon logo = new ImageIcon("logo.png");


        login.setSize(500,500);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        login.getContentPane().setBackground(new Color(197, 239, 203));
        login.setLayout(new BorderLayout());
        login.setIconImage(logo.getImage());
        login.setResizable(true);`  
        JPanel header = new JPanel();
    
        header.setPreferredSize(new Dimension(100,100));
        header.setBackground(new Color(31, 36, 31,80));


        JLabel headInfo = new JLabel();
        headInfo.setText("<html><h1 style='text-decoration:underline;'>SSM Stores<h2>Login/Signup</h2></h1><br></html>");
        headInfo.setIcon(logo);
        headInfo.setHorizontalAlignment(JLabel.CENTER);
        headInfo.setHorizontalTextPosition(JLabel.RIGHT);

        headInfo.setForeground(new Color(197, 239, 203));
        header.add(headInfo);


        JPanel side1 = new JPanel();
        side1.setBackground(new Color(31, 36, 31,80));
        JPanel side2 = new JPanel();
        side2.setBackground(new Color(31, 36, 31,80));
        JPanel side3 = new JPanel();
        side3.setBackground(new Color(31, 36, 31,80));
        JPanel loginPanel = new JPanel();

        loginPanel.setLayout(new GridLayout(3,4));
        loginPanel.setBackground(new Color(100, 122, 103));

        JLabel userLabel = new JLabel("Username: ");
        JTextField userText = new JTextField(20);
        userText.setPreferredSize(new Dimension(100,10));
        userText.setBackground(new Color(197, 239, 203));
        JLabel passLabel = new JLabel("Password: ");
        JPasswordField passText = new JPasswordField(20);
        passText.setPreferredSize(new Dimension(100,10));
        passText.setBackground(new Color(197, 239, 203));
        JButton loginButton = new JButton("Login");
        JButton signupButton = new JButton("Signup"); 
        loginButton.setBackground(new Color(197, 239, 203));
        signupButton.setBackground(new Color(197, 239, 203));
        
        loginButton.addActionListener(e -> {
            String username = userText.getText();
            String password = new String(passText.getPassword());
                    
            if(username.equals("Sheeraz") && password.equals("1234")){
                login.dispose();
               Home home = new Home();

          
        }else{
            JOptionPane.showMessageDialog(login, "Invalid username or password", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    });
    signupButton.addActionListener(e -> {
        login.dispose();
        Signup signup = new Signup();
    });

        loginPanel.add(userLabel);
        loginPanel.add(userText);
        loginPanel.add(passLabel);
        loginPanel.add(passText);
        loginPanel.add(loginButton);
        loginPanel.add(signupButton);        

        login.add(loginPanel,BorderLayout.CENTER);
        login.add(header,BorderLayout.NORTH);
        login.add(side1,BorderLayout.WEST);
        login.add(side2,BorderLayout.EAST);
        login.add(side3,BorderLayout.SOUTH);
        

    

        login.setVisible(true);
    }
}