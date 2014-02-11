import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.DropMode;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
public class Examen extends JFrame {

	private JPanel contentPane;
	private JTextField Puntos;
	private JTextField Resultadomediapuntos;
	private int [] puntospartida=new int[10];
	private int numeropartidos;
	private int puntosmaximos;
	private int totalpuntos;
	private int media;
	
	private JTextField tpuntos;
		
	String puntuacion;
	int num1;
	private JTextField manotacion;
	private JTextField npartidas;

	// Create the frame.

	public Examen() {
		numeropartidos=0;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// texto de introducir numero de puntos
		JLabel texto1 = new JLabel("Introducir puntos por partido");
		texto1.setBounds(10, 11, 162, 14);
		contentPane.add(texto1);

		// cuadro donde insertar puntos
		Puntos = new JTextField();
		Puntos.setBounds(181, 8, 139, 20);
		contentPane.add(Puntos);
		Puntos.setColumns(10);

		// Boton guardar puntos
		JButton guardarpuntuacion = new JButton("Guardar puntos");
		guardarpuntuacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int i;				

				//obtener valor introducido
				puntuacion = Puntos.getText();
				num1 = Integer.parseInt(puntuacion);
				
				//si hay menos de 10 añadir al final del array
				if(numeropartidos<10){
					puntospartida[numeropartidos]=num1;
					numeropartidos++;
				}
				
				//calcular total de puntos en el array
				totalpuntos=0;
				for(i=0;i<numeropartidos;i++){
					totalpuntos=totalpuntos+puntospartida[i];
				}				
				tpuntos.setText(Integer.toString(totalpuntos));
				
				//maxima anotacion del array
				puntosmaximos=0;
				for(i=0;i<numeropartidos;i++){
					if(puntospartida[i]>puntosmaximos){
						puntosmaximos=puntospartida[i];
					}
				}					
				manotacion.setText(Integer.toString(puntosmaximos));
				
				//numero de partidos
				npartidas.setText(Integer.toString(numeropartidos));
			}
		});
		guardarpuntuacion.setBounds(330, 7, 130, 23);
		contentPane.add(guardarpuntuacion);

		JLabel texto2 = new JLabel("Total puntos");
		texto2.setBounds(10, 55, 83, 14);
		contentPane.add(texto2);

		JLabel texto3 = new JLabel("Maxima anotacion");
		texto3.setBounds(182, 55, 121, 14);
		contentPane.add(texto3);

		JButton Button2 = new JButton("Calcular Media Puntos por Partida");
		Button2.setBounds(10, 144, 450, 23);
		contentPane.add(Button2);
		Button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i;
				
				//calcular puntuacion media
				media=0;
				for(i=0;i<numeropartidos;i++){
					media=media+puntospartida[i];
				}	
				media=media/numeropartidos;
					
				Resultadomediapuntos.setText(String.valueOf(media));
			}
		});

		Resultadomediapuntos = new JTextField();
		Resultadomediapuntos.setBounds(7, 193, 453, 20);
		contentPane.add(Resultadomediapuntos);
		Resultadomediapuntos.setColumns(10);

		JLabel texto4 = new JLabel("Numero de partidos ");
		texto4.setBounds(10, 95, 124, 14);
		contentPane.add(texto4);
		
		tpuntos = new JTextField();
		tpuntos.setHorizontalAlignment(SwingConstants.RIGHT);
		tpuntos.setBackground(SystemColor.control);
		tpuntos.setText("0");
		tpuntos.setBounds(103, 52, 66, 20);
		contentPane.add(tpuntos);
		tpuntos.setColumns(10);
		
		manotacion = new JTextField();
		manotacion.setHorizontalAlignment(SwingConstants.RIGHT);
		manotacion.setBackground(SystemColor.control);
		manotacion.setText("0");
		manotacion.setBounds(299, 52, 86, 20);
		contentPane.add(manotacion);
		manotacion.setColumns(10);
		
		npartidas = new JTextField();
		npartidas.setText("0");
		npartidas.setHorizontalAlignment(SwingConstants.RIGHT);
		npartidas.setColumns(10);
		npartidas.setBackground(SystemColor.menu);
		npartidas.setBounds(113, 92, 66, 20);
		contentPane.add(npartidas);
	}
	
	public int[] devolverPuntos(){
		return  puntospartida;
	}
	
	public void reset(){
		int i;
		for(i=0;i<10;i++){
			puntospartida[i]=0;
		}
		numeropartidos=0;
		puntosmaximos=0;
		totalpuntos=0;
		media=0;
	}
}
