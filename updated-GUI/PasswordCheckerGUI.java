import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PasswordCheckerGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Password Strength Checker");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter Password:");
        JPasswordField passwordField = new JPasswordField(20);

        JButton checkBtn = new JButton("Check Strength");

        JLabel resultLabel = new JLabel("Strength: ");
        JLabel scoreLabel = new JLabel("Score: ");

        frame.add(label);
        frame.add(passwordField);
        frame.add(checkBtn);
        frame.add(resultLabel);
        frame.add(scoreLabel);

        checkBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String password = new String(passwordField.getPassword());

                int score = 0;

                if (password.length() >= 8) score++;

                boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

                for (char c : password.toCharArray()) {
                    if (Character.isUpperCase(c)) hasUpper = true;
                    else if (Character.isLowerCase(c)) hasLower = true;
                    else if (Character.isDigit(c)) hasDigit = true;
                    else hasSpecial = true;
                }

                if (hasUpper) score++;
                if (hasLower) score++;
                if (hasDigit) score++;
                if (hasSpecial) score++;

                String strength;
                if (score <= 2) strength = "Weak";
                else if (score <= 4) strength = "Medium";
                else strength = "Strong";

                resultLabel.setText("Strength: " + strength);
                scoreLabel.setText("Score: " + score + "/5");
            }
        });

        frame.setVisible(true);
    }
}
