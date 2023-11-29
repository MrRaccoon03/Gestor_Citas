package MenuAdmin;

import java.awt.EventQueue;
import ToolsMethods.Ventana;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class JMenuAdmin implements Ventana {

	private static JMenuAdmin instanciaUnica = null;
	
	private JFrame frame;
	JPanel PanelDespliegue;
	JPanel contenedor;
	
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenuAdmin window = new JMenuAdmin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	private JMenuAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setResizable(false);
		frame.setBounds(100, 100, 700, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(10, 59, 129));
		panel.setBounds(0, 0, 203, 452);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		contenedor = new JPanel(new BorderLayout());
		contenedor.setBounds(203, 0, 481, 452);
		frame.getContentPane().add(contenedor);
		
		
		JLabel lblNewLabel_1_2_1_1 = new JLabel("");
		lblNewLabel_1_2_1_1.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\setting.png"));
		lblNewLabel_1_2_1_1.setBounds(133, 408, 24, 30);
		panel.add(lblNewLabel_1_2_1_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("");
		lblNewLabel_1_2_1.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\setting.png"));
		lblNewLabel_1_2_1.setBounds(46, 408, 24, 30);
		panel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\patient.png"));
		lblNewLabel_1_1.setBounds(17, 212, 24, 30);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\edit.png"));
		lblNewLabel_1_2.setBounds(17, 267, 24, 30);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\calendar.png"));
		lblNewLabel_1.setBounds(18, 156, 24, 30);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jeanc\\OneDrive\\Documentos\\ITLA CLASES\\[3] TERCER CUATRIMESTRE\\PROGRAMACION 1\\PROYECTOS\\Gestor_Citas\\imagenes\\home.png"));
		lblNewLabel.setBounds(17, 102, 24, 30);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(10, 59, 129));
		panel_1.setBounds(33, 15, 135, 41);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblOdomtotech = new JLabel("ODONTODOM\r\n");
		lblOdomtotech.setForeground(Color.WHITE);
		lblOdomtotech.setFont(new Font("Segoe UI Black", Font.BOLD, 17));
		lblOdomtotech.setBounds(3, -11, 193, 65);
		panel_1.add(lblOdomtotech);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(20, 60, 162, 3);
		panel.add(separator);
		
		JButton BtnPrincipal = new JButton("                Home\r\n\r\n");
		BtnPrincipal.setOpaque(false);
		BtnPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowHome(); 
			}
		});
		BtnPrincipal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BtnPrincipal.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				BtnPrincipal.setBackground(new Color(18, 88, 167));
			}
		});
		BtnPrincipal.setFocusPainted(false);
		BtnPrincipal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnPrincipal.setFont(new Font("Segoe UI", Font.BOLD, 11));
		BtnPrincipal.setHorizontalAlignment(SwingConstants.LEADING);
		BtnPrincipal.setForeground(new Color(255, 255, 255));
		BtnPrincipal.setBackground(new Color(18, 88, 167));
		BtnPrincipal.setBorder(null);
		BtnPrincipal.setFocusable(false);
		BtnPrincipal.setFocusTraversalKeysEnabled(false);
		BtnPrincipal.setBounds(0, 88, 203, 59);
		panel.add(BtnPrincipal);
		
		JButton BtnCitas = new JButton("                Appointment\r\n");
		BtnCitas.setOpaque(false);
		BtnCitas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowAppointment(); 
			}
		});
		BtnCitas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BtnCitas.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				BtnCitas.setBackground(new Color(18, 88, 167));
			}
		});
		BtnCitas.setFocusPainted(false);
		BtnCitas.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnCitas.setFont(new Font("Segoe UI", Font.BOLD, 11));
		BtnCitas.setHorizontalAlignment(SwingConstants.LEADING);
		BtnCitas.setForeground(new Color(255, 255, 255));
		BtnCitas.setBackground(new Color(18, 88, 167));
		BtnCitas.setBorder(null);
		BtnCitas.setFocusable(false);
		BtnCitas.setFocusTraversalKeysEnabled(false);
		BtnCitas.setBounds(0, 142, 203, 59);
		panel.add(BtnCitas);
		
		JButton BtnPacientes = new JButton("                Patient registration\r\n");
		BtnPacientes.setOpaque(false);
		BtnPacientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 ShowPatients();
			}
		});
		BtnPacientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BtnPacientes.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				BtnPacientes.setBackground(new Color(18, 88, 167));
			}
		});
		BtnPacientes.setFocusPainted(false);
		BtnPacientes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnPacientes.setFont(new Font("Segoe UI", Font.BOLD, 11));
		BtnPacientes.setHorizontalAlignment(SwingConstants.LEADING);
		BtnPacientes.setForeground(new Color(255, 255, 255));
		BtnPacientes.setBackground(new Color(18, 88, 167));
		BtnPacientes.setBorder(null);
		BtnPacientes.setFocusable(false);
		BtnPacientes.setFocusTraversalKeysEnabled(false);
		BtnPacientes.setBounds(0, 197, 203, 59);
		panel.add(BtnPacientes);
		
		JButton BtnRegistro = new JButton("                Registration appointment");
		BtnRegistro.setOpaque(false);
		BtnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowRegisterAppointment();
			}
		});
		BtnRegistro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BtnRegistro.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				BtnRegistro.setBackground(new Color(18, 88, 167));
			}
		});
		BtnRegistro.setFocusPainted(false);
		BtnRegistro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnRegistro.setFont(new Font("Segoe UI", Font.BOLD, 11));
		BtnRegistro.setHorizontalAlignment(SwingConstants.LEADING);
		BtnRegistro.setForeground(new Color(255, 255, 255));
		BtnRegistro.setBackground(new Color(18, 88, 167));
		BtnRegistro.setBorder(null);
		BtnRegistro.setFocusable(false);
		BtnRegistro.setFocusTraversalKeysEnabled(false);
		BtnRegistro.setBounds(0, 253, 203, 59);
		panel.add(BtnRegistro);
		
		JButton BtnConfig = new JButton("Settings\r\n");
		BtnConfig.setOpaque(false);
		BtnConfig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShowSettings();
			}
		});
		BtnConfig.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				BtnConfig.setBackground(new Color(11, 58, 111));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				BtnConfig.setBackground(new Color(18, 88, 167));
			}
		});
		BtnConfig.setFocusPainted(false);
		BtnConfig.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		BtnConfig.setHorizontalTextPosition(SwingConstants.CENTER);
		BtnConfig.setFont(new Font("Segoe UI", Font.BOLD, 11));
		BtnConfig.setForeground(new Color(255, 255, 255));
		BtnConfig.setBackground(new Color(18, 88, 167));
		BtnConfig.setBorder(null);
		BtnConfig.setFocusable(false);
		BtnConfig.setFocusTraversalKeysEnabled(false);
		BtnConfig.setBounds(0, 393, 203, 59);
		panel.add(BtnConfig);
		
		
			
	}
	
	public void EliminarVentanas() {
		contenedor.removeAll();
		
	}

	@Override
	public void ShowVentana() {
		// TODO Auto-generated method stub
		frame.setVisible(true);
	}
	
	public JFrame getframe() {
		return frame;
	}
	
	 public static  JMenuAdmin obtenerInstancia() {
	        if (instanciaUnica == null) {
	            instanciaUnica = new  JMenuAdmin();
	        }
	        return instanciaUnica;
	    }
	 
	public void ShowPatients() {
		EliminarVentanas();
		Pacientes p = new Pacientes(this);
		p.setBounds(203, 0, 481, 452);
		contenedor.add(p, BorderLayout.CENTER);
		contenedor.revalidate();
		contenedor.repaint();
	}
	
	public void ShowHome() {
		EliminarVentanas();
		Home h = new Home();
		h.setBounds(203, 0, 481, 452);
		contenedor.add(h,  BorderLayout.CENTER);
		contenedor.revalidate();
		contenedor.repaint();
	}
	
	public void ShowAppointment() {
		EliminarVentanas();
		Citas c = new Citas();
		c.setBounds(203, 0, 481, 452);
		contenedor.add(c, BorderLayout.CENTER);
		contenedor.revalidate();
		contenedor.repaint();
	}
	
	public void ShowRegisterAppointment() {
		EliminarVentanas();
		RegistrarCitas rg = new RegistrarCitas();
		rg.setBounds(0, 0, 481, 452);
		contenedor.add(rg, BorderLayout.CENTER);
		contenedor.revalidate();
		contenedor.repaint();
	}
	
	public void ShowSettings() {
		EliminarVentanas();
		Config co = new Config();
		co.setBounds(0, 0, 481, 452);
		contenedor.add(co, BorderLayout.CENTER);
		contenedor.revalidate();
		contenedor.repaint();
	}
}
