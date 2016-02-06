package org.MasterSamurai.Applications;

import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class MainJFrame extends JFrame{
	public static void main(String[] argv) throws Exception {
		//Make a TextField, set up KeyListener
		JTextField component = new JTextField();
		component.addKeyListener(new MyKeyListener());
		
		//Define and set up the JFrame
		JFrame f = new JFrame();
		f.add(component);
		f.setSize(300, 300);
		f.setVisible(true);
	}
}
