package dao;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SimplePass {
	final static String password = "1111";
	static JTextField jtf ;
	static JButton jbt ;
	public static void mainn() {
		jbt = new JButton("OK");
		jtf = new JTextField("password");
		JFrame	jf = new JFrame();
		jf.setSize(500,100);
		jf.setLayout(new FlowLayout());
		jtf.setSize(50, 50);
		jf.add(jtf);
		jf.add(jbt);
		jf.setVisible(true);
		jf.setLocationRelativeTo(null);
		jbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String temp = jtf.getText();
				if(temp.equals(password)) {
					jtf.setText("APROVE");
				}else {
					jtf.setText("DENIED");
				}
				
			}
		});
		
		
	}

}
