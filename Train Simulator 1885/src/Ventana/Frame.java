package Ventana;



import java.awt.BorderLayout;
import java.awt.Color;






import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Frame extends JFrame implements ActionListener{

	JButton retroceder = new JButton ("<<< Retroceder");
	JButton avanzar = new JButton("Avanzar >>>");
	 private JMenuBar barra1;
	 private JMenu menu1;
	 JMenuItem item1;
	 private Container Contenedor;
	    
	public static void main(String[] args) {
		
		Frame f = new Frame ();
		f.definirInicio();
	
	}
	
	public Frame (){
		super ("Train Simulator 1885");
		setSize(500,500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	
		setVisible(true);
		
		agregarMenu();
		
		
		
	}
	
	public void agregarMenu(){
		
		barra1 = new JMenuBar();
		menu1 = new JMenu("File");
		item1 = new JMenuItem("Cargar");
		barra1.add(menu1);
		
		menu1.add(item1);
		setJMenuBar(barra1);
		setLocationRelativeTo(null);
		
		cargar();
		setVisible(true);
	}
	
	public void definirInicio(){
		Contenedor = this.getContentPane();
		Contenedor.setSize(100, 100);
		Contenedor.setLayout(new BorderLayout(5,5));
		Contenedor.add(retroceder,BorderLayout.SOUTH);
		retroceder.addActionListener(this);
		Contenedor.add(avanzar,BorderLayout.NORTH);
		avanzar.addActionListener(this);
		Contenedor.add(new Dibujo());
		setVisible(true);
		
	}
	
	public void cargar(){
		
		ActionListener escuchador = new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				boolean bandera =true;
				String dato ;
				Archivo archivo = new Archivo("C:\\Users\\Alejandro\\workspace\\Train Simulator1885.txt");
				try {
					
					do{
						
					 dato = archivo.leerLinea();
					 
					 
					 if(dato != null){
					 recibimiento(dato);
					 System.out.println(dato);
					 }
					 else 
						 bandera = false;
					 
					}while(bandera == true);
					
					} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					}
				
				
			}
			
		};
		
		this.item1.addActionListener(escuchador);
		
	}
	
	public String recibimiento(String dato){
		
		return dato;
	}
	
	public void actionPerformed (ActionEvent evento){
		
			
		}
		
		
	}
	

	
	

