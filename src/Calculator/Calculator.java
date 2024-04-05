package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {

    String op1, oper, op2;

    public Calculator() {
        op1 = op2 = oper = "";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if(s.charAt(0) >= '0' && s.charAt(0) <= '9' || s.charAt(0) == '.'){
            if(op1.isEmpty()){
                op1 += s;
            }
            else{
                op2 += s;
            }
        }
        else if (s.charAt(0) == '=') {
            long res = 0;

            if (oper.equals("+")) {
                res = Long.parseLong(op1 + op2);
            } else if (oper.equals("-")) {
                res = (Long.parseLong(op1) - Long.parseLong(op2));
            } else if (oper.equals("*")) {
                res = Long.parseLong(op1) * Long.parseLong(op2);
            }else {
                res = Long.parseLong(op1) / Long.parseLong(op2);
            }
        }

    }



        public void main(String[] args) {

            JFrame jf = new JFrame("Calculator");

            try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            } catch (Exception e) {

                e.printStackTrace();
            }

            jf.setLayout(new FlowLayout());

            Calculator f = new Calculator();


            JTextField jtf = new JTextField(20);
            jtf.setEditable(false);



            JButton j1 = new JButton("1");
            JButton j2 = new JButton("2");
            JButton j3 = new JButton("3");
            JButton j4 = new JButton("4");
            JButton j5 = new JButton("5");
            JButton j6 = new JButton("6");
            JButton j7 = new JButton("7");
            JButton j8 = new JButton("8");
            JButton j9 = new JButton("9");
            JButton j0 = new JButton("0");


            JButton jadd = new JButton("+");
            JButton jsub = new JButton("-");
            JButton jmul = new JButton("*");
            JButton jdiv = new JButton("/");


            JButton jeq = new JButton("=");
            JButton jp = new JButton(".");
            JButton jcl = new JButton("Clear");

            j0.addActionListener(f);
            j1.addActionListener(f);
            j2.addActionListener(f);
            j3.addActionListener(f);
            j4.addActionListener(f);
            j5.addActionListener(f);
            j6.addActionListener(f);
            j7.addActionListener(f);
            j8.addActionListener(f);
            j9.addActionListener(f);


            jadd.addActionListener(f);
            jsub.addActionListener(f);
            jmul.addActionListener(f);
            jdiv.addActionListener(f);


            jcl.addActionListener(f);
            jeq.addActionListener(f);
            jp.addActionListener(f);

            JPanel panel = new JPanel();

            panel.add(jtf);

            panel.add(j0);
            panel.add(j1);
            panel.add(j2);
            panel.add(j3);
            panel.add(j4);
            panel.add(j5);
            panel.add(j6);
            panel.add(j7);
            panel.add(j8);
            panel.add(j9);

            panel.add(jadd);
            panel.add(jsub);
            panel.add(jmul);
            panel.add(jdiv);
            panel.add(jeq);
            panel.add(jp);
            panel.add(jcl);


            panel.setBackground(Color.darkGray);

            jf.add(panel );

            jf.setVisible(true);
            jf.setSize(200,200);
    }
}
