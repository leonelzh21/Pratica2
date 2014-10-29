package Ventana;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.Graphics2D;

import javax.swing.JButton;

public class Dibujo extends Canvas  {
	
	public Dibujo(){
		setBackground(Color.darkGray);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g){
		Graphics 2D = (Graphics2D)g:
		g.setColor(Color.red);
		g.fillRect(400,150, 50, 50);
		g.setColor(Color.RED);
		g.fillRect(440, 175, 25, 25);
	}
	
	
	
}
