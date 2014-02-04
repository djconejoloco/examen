import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class Examen extends JFrame {

	private JPanel contentPane;
	private JTextField Puntos;
	private JTextField Resultadomediapuntos;



	/**
	 * Create the frame.
	 */
	public Examen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel texto1 = new JLabel("Introducir puntos por partido");
		texto1.setBounds(10, 11, 162, 14);
		contentPane.add(texto1);
		
		Puntos = new JTextField();
		Puntos.setBounds(181, 8, 139, 20);
		contentPane.add(Puntos);
		Puntos.setColumns(10);
		
		JButton button1 = new JButton("Guardar puntos");
		button1.setBounds(330, 7, 130, 23);
		contentPane.add(button1);
		
		JLabel texto2 = new JLabel("Total puntos");
		texto2.setBounds(10, 55, 83, 14);
		contentPane.add(texto2);
		
		JLabel texto3 = new JLabel("Maxima anotacion");
		texto3.setBounds(182, 55, 121, 14);
		contentPane.add(texto3);
		
		JButton Button2 = new JButton("Calcular Media Puntos por Partida");
		Button2.setBounds(10, 144, 450, 23);
		contentPane.add(Button2);
		
		Resultadomediapuntos = new JTextField();
		Resultadomediapuntos.setBounds(7, 193, 453, 20);
		contentPane.add(Resultadomediapuntos);
		Resultadomediapuntos.setColumns(10);
		
		JLabel texto4 = new JLabel("Numero de partidos ");
		texto4.setBounds(10, 95, 124, 14);
		contentPane.add(texto4);
		
		JLabel label = new JLabel("0");
		label.setBounds(144, 55, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("0");
		label_1.setBounds(144, 95, 46, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("0");
		label_2.setBounds(313, 55, 46, 14);
		contentPane.add(label_2);
	}
}
