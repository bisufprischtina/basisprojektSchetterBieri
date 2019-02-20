package testgui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;



public class second extends JPanel implements ActionListener{
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int screenHeight = screenSize.height;
	int screenWidth = screenSize.width;Timer t = new Timer(5, this);
	double x = 0, y = 0, velX = 10, velY = 10;
	GradientPaint redtowhite = new GradientPaint(0,0,Color.BLACK,screenWidth, 0,Color.MAGENTA);

	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D rectangle = new Rectangle.Double(x, y, 100, 100);
		g2.setPaint(redtowhite);
		g2.fill(rectangle);
		t.start();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(x < 0 || x > screenWidth - 160) {
			velX = -velX;
		}
		if(y < 0 || y > screenHeight - 120) {
			velY = -velY;
		}

		x += velX;
		y += velY;
		repaint();
		
		
	}
	
}
