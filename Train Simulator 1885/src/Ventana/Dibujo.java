package Ventana;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridBagConstraints;

import javax.swing.JButton;

public class Dibujo extends Canvas  {
	
	public Dibujo(){
		setBackground(Color.darkGray);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g){
		g.setColor(Color.red);
		
	}
	
	
	
}
