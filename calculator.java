import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
public class calculator implements ActionListener
{

    JLabel displayLabel;
    boolean operationPressed;
    double result=0;
    String operator;
    boolean prvOperator=false;

   
    public calculator()
    {

       

        JFrame jf=new JFrame("calculator");
        jf.setLayout(null);
        jf.setSize(335,370);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // jf.getContentPane().setBackground(Color.blue);
        jf.getContentPane().setBackground(new Color(90, 92, 106)); 


        displayLabel=new JLabel();
        displayLabel.setBounds(30,60,200,40);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        displayLabel.setForeground(Color.WHITE);

        jf.add(displayLabel);

        // JButton delButton = new JButton("del");
        // delButton.setBounds(235, 60, 50, 40);
        // delButton.setFont(new Font("Arial", Font.BOLD, 24));
        // // sevenqButton.addActionListener(this);
        // jf.add(delButton);

        JButton clearButton = new JButton("clr");
        clearButton.setBounds(235, 60, 50, 40);
        clearButton.setFont(new Font("Arial", Font.BOLD, 12));
        clearButton.setBackground(new Color(255,219,114));
        // sevenqButton.addActionListener(this);
        jf.add(clearButton);

        JButton sevenqButton = new JButton("7");
        sevenqButton.setBounds(30, 130, 60, 40);
        sevenqButton.setFont(new Font("Arial", Font.BOLD, 24));
        sevenqButton.setBackground(new Color(220, 237, 200));
        jf.add(sevenqButton);
        
        JButton eightqButton = new JButton("8");
        eightqButton.setBounds(95, 130, 60, 40);
        eightqButton.setFont(new Font("Arial", Font.BOLD, 24));
        eightqButton.setBackground(new Color(220, 237, 200));
        jf.add(eightqButton);
        
        JButton nineqButton = new JButton("9");
        nineqButton.setBounds(160, 130, 60, 40);
        nineqButton.setFont(new Font("Arial", Font.BOLD, 24));
        nineqButton.setBackground(new Color(220, 237, 200));
        jf.add(nineqButton);
        
        JButton fourbButton = new JButton("4");
        fourbButton.setBounds(30, 175, 60, 40);
        fourbButton.setFont(new Font("Arial", Font.BOLD, 24));
        fourbButton.setBackground(new Color(220, 237, 200));
        jf.add(fourbButton);
        
        JButton fiveButton = new JButton("5");
        fiveButton.setBounds(95, 175, 60, 40);
        fiveButton.setFont(new Font("Arial", Font.BOLD, 24));
        fiveButton.setBackground(new Color(220, 237, 200));
        jf.add(fiveButton);
        
        JButton sixButton = new JButton("6");
        sixButton.setBounds(160, 175, 60, 40);
        sixButton.setFont(new Font("Arial", Font.BOLD, 24));
        sixButton.setBackground(new Color(220, 237, 200));
        jf.add(sixButton);
        
        JButton oneButton = new JButton("1");
        oneButton.setBounds(30, 220, 60, 40);
        oneButton.setFont(new Font("Arial", Font.BOLD, 24));
        oneButton.setBackground(new Color(220, 237, 200));
        jf.add(oneButton);
        
        JButton twoButton = new JButton("2");
        twoButton.setBounds(95, 220, 60, 40);
        twoButton.setFont(new Font("Arial", Font.BOLD, 24));
        twoButton.setBackground(new Color(220, 237, 200));
        jf.add(twoButton);
        
        JButton threeButton = new JButton("3");
        threeButton.setBounds(160, 220, 60, 40);
        threeButton.setFont(new Font("Arial", Font.BOLD, 24));
        threeButton.setBackground(new Color(220, 237, 200));
        jf.add(threeButton);
        
        JButton zerButton = new JButton("0");
        zerButton.setBounds(30, 265, 60, 40);
        zerButton.setFont(new Font("Arial", Font.BOLD, 24));
        zerButton.setBackground(new Color(220, 237, 200));
        jf.add(zerButton);
        
        JButton dotButton = new JButton(".");
        dotButton.setBounds(95, 265, 60, 40);
        dotButton.setFont(new Font("Arial", Font.BOLD, 24));
        dotButton.setBackground(new Color(220, 237, 200));
        jf.add(dotButton);
        
        JButton equalsButton = new JButton("=");
        equalsButton.setBounds(160, 265, 60, 40);
        equalsButton.setFont(new Font("Arial", Font.BOLD, 24));
        equalsButton.setBackground(new Color(220, 237, 200));
        jf.add(equalsButton);

        JButton divideButton = new JButton("/");
        divideButton.setBounds(225, 130, 60, 40);
        divideButton.setFont(new Font("Arial", Font.BOLD, 24));
        divideButton.setBackground(new Color(220, 237, 200));
        jf.add(divideButton);

        JButton mulButton = new JButton("*");
        mulButton.setBounds(225, 175, 60, 40);
        mulButton.setFont(new Font("Arial", Font.BOLD, 24));
        mulButton.setBackground(new Color(220, 237, 200));
        jf.add(mulButton);

        JButton subbButton = new JButton("-");
        subbButton.setBounds(225, 220, 60, 40);
        subbButton.setFont(new Font("Arial", Font.BOLD, 24));
        subbButton.setBackground(new Color(220, 237, 200));
        jf.add(subbButton);
        
        JButton plusButton = new JButton("+");
        plusButton.setBounds(225, 265, 60, 40);
        plusButton.setFont(new Font("Arial", Font.BOLD, 24));
        plusButton.setBackground(new Color(220, 237, 200));
        jf.add(plusButton);

        

        // Add ActionListener to all buttons
        sevenqButton.addActionListener(this);
        eightqButton.addActionListener(this);
        nineqButton.addActionListener(this);
        fourbButton.addActionListener(this);
        fiveButton.addActionListener(this);
        sixButton.addActionListener(this);
        oneButton.addActionListener(this);
        twoButton.addActionListener(this);
        threeButton.addActionListener(this);
        zerButton.addActionListener(this);
        dotButton.addActionListener(this);
        equalsButton.addActionListener(this);
        divideButton.addActionListener(this);
        mulButton.addActionListener(this);
        subbButton.addActionListener(this);
        plusButton.addActionListener(this);
        clearButton.addActionListener(this);

       


    }
    public static void main(String[] args)
    {
        new calculator();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        switch (command) {
            case "7":
                if (operationPressed) {
                    displayLabel.setText("");
                    operationPressed = false;
                }
                displayLabel.setText(displayLabel.getText()+"7");
                break;
            case "8":
                if (operationPressed) {
                    displayLabel.setText("");
                    operationPressed = false;
                }
                displayLabel.setText(displayLabel.getText()+"8");
                break;
            case "9":
                if (operationPressed) {
                    displayLabel.setText("");
                    operationPressed = false;
                }
                displayLabel.setText(displayLabel.getText()+"9");
                break;
            case "4":
                if (operationPressed) {
                    displayLabel.setText("");
                    operationPressed = false;
                }
                displayLabel.setText(displayLabel.getText()+"4");
                break;
            case "5":
                if (operationPressed) {
                    displayLabel.setText("");
                    operationPressed = false;
                }
                displayLabel.setText(displayLabel.getText()+"5");
                break;
            case "6":
                if (operationPressed) {
                    displayLabel.setText("");
                    operationPressed = false;
                }
                displayLabel.setText(displayLabel.getText()+"6");
                break;
            case "1":
                if (operationPressed) {
                    displayLabel.setText("");
                    operationPressed = false;
                }
                displayLabel.setText(displayLabel.getText()+"1");
                break;
            case "2":
                if (operationPressed) {
                    displayLabel.setText("");
                    operationPressed = false;
                }
                displayLabel.setText(displayLabel.getText()+"2");
                break;
            case "3":
                if (operationPressed) {
                    displayLabel.setText("");
                    operationPressed = false;
                }
                displayLabel.setText(displayLabel.getText()+"3");
                break;
            case "0":
                if (operationPressed) {
                    displayLabel.setText("");
                    operationPressed = false;
                }
                displayLabel.setText(displayLabel.getText()+"0");
                break;
            case ".":
                if (operationPressed) {
                    displayLabel.setText("");
                    operationPressed = false;
                }
                if (!displayLabel.getText().contains("."))
                {
                    displayLabel.setText(displayLabel.getText()+".");
                }
                break;
            case "=":
            if (!operator.isEmpty()) {
                double currentValue = Double.parseDouble(displayLabel.getText());
                switch (operator) {
                    case "+":
                        result += currentValue;
                        break;
                    case "-":
                        result -= currentValue;
                        break;
                    case "*":
                        result *= currentValue;
                        break;
                    case "/":
                        result /= currentValue;
                        break;
                }
                displayLabel.setText(String.valueOf(result));
                prvOperator = false;
            }
            operationPressed = true;
            break;
            
            case "+": case "-": case "*": case "/":
            
            if (!prvOperator) {
                result = Double.parseDouble(displayLabel.getText());
            } else {
                double currentValue = Double.parseDouble(displayLabel.getText());
                switch (operator) {
                    case "+":
                        result += currentValue;
                        break;
                    case "-":
                        result -= currentValue;
                        break;
                    case "*":
                        result *= currentValue;
                        break;
                    case "/":
                        result /= currentValue;
                        break;
                }
            }
            displayLabel.setText(String.valueOf(result));
            operationPressed = true;
            operator = command;
            prvOperator = true;
            break;
            default:
                displayLabel.setText("error");
                break;
            case "clr":
            operationPressed = false;
            prvOperator = false;
            result=0;
            displayLabel.setText("");
        }
    }
    
} 