package Userform;

import javax.swing.*;
import java.awt.FlowLayout;

public class Demo {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("Form");
		jf.setVisible(true);
		jf.setSize(800,400);
		
		jf.setLayout(new FlowLayout());
		
		JLabel jl1 = new JLabel("Username");
		jf.add(jl1);
		JTextField jt1 = new JTextField(20);
		jf.add(jt1);
		
		JLabel jl2 = new JLabel("Password");
		jf.add(jl2);
		JTextField jt2 = new JTextField(20);
		jf.add(jt2);
		
		JButton jb = new JButton("Submit");
		jf.add(jb);

	}

}
