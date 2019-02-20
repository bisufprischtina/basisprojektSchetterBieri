package testgui;

import javax.swing.JFrame;

public class Macheads {
public static void main(String args[]) {
	second s = new second();
	second ss = new second();
	JFrame f = new JFrame();
	f.add(s);
	f.add(ss);
	f.setVisible(true);
	f.setSize(600, 400);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setTitle("Moving Rctangle");
}
}
