package ui;

import java.awt.EventQueue;
import java.awt.Insets;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.Toolkit;
import javax.swing.border.LineBorder;
public class JanelaPrincipalRecepcionista {

	private JFrame frmClinicsystem;
	private JLabel menuLbl;
	private JLabel mensagemJanelaPrincipalLbl;
	private JLabel barraAzul;
	private JLabel logoMenu;
	private JLabel titulodapaginaLbl;
	private JButton menuCadastrarBtn;
	private JButton menuVisualizarPacientesBtn;
	private JButton menuAgendarConsultaBtn;
	private JLabel textoConsultasLbl;
	private JLabel numeroConsultasLbl;
	private JLabel iconeConsultasLbl;
	private JLabel recepcionistasBoxLbl;
	private JLabel numeroRecepcionistasLbl;
	private JLabel textoRecepcionistasLbl;
	private JLabel iconeMedicosLbl;
	private JLabel iconePacientesLbl;
	private JLabel iconeRecepcionistasLbl;
	private JButton menuVisualizarConsultasBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JanelaPrincipalRecepcionista window = new JanelaPrincipalRecepcionista();
					window.frmClinicsystem.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JanelaPrincipalRecepcionista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClinicsystem = new JFrame();
		frmClinicsystem.setIconImage(Toolkit.getDefaultToolkit().getImage(JanelaPrincipalRecepcionista.class.getResource("/midia/icone.png")));
		frmClinicsystem.setTitle("ClinicSystem");
		frmClinicsystem.getContentPane().setBackground(new Color(255, 255, 255));
		frmClinicsystem.getContentPane().setLayout(null);
		
		iconeRecepcionistasLbl = new JLabel("");
		iconeRecepcionistasLbl.setIcon(new ImageIcon(JanelaPrincipalRecepcionista.class.getResource("/midia/recepcionistas.png")));
		iconeRecepcionistasLbl.setHorizontalAlignment(SwingConstants.CENTER);
		iconeRecepcionistasLbl.setBounds(630, 267, 62, 62);
		frmClinicsystem.getContentPane().add(iconeRecepcionistasLbl);
		
		JLabel numeroPacientesLbl = new JLabel("20000");
		numeroPacientesLbl.setHorizontalAlignment(SwingConstants.CENTER);
		numeroPacientesLbl.setForeground(Color.WHITE);
		numeroPacientesLbl.setFont(new Font("Arial", Font.BOLD, 22));
		numeroPacientesLbl.setBounds(725, 145, 130, 59);
		frmClinicsystem.getContentPane().add(numeroPacientesLbl);
		
		iconePacientesLbl = new JLabel("");
		iconePacientesLbl.setIcon(new ImageIcon(JanelaPrincipalRecepcionista.class.getResource("/midia/pacientes.png")));
		iconePacientesLbl.setHorizontalAlignment(SwingConstants.CENTER);
		iconePacientesLbl.setBounds(630, 132, 62, 62);
		frmClinicsystem.getContentPane().add(iconePacientesLbl);
		
		iconeMedicosLbl = new JLabel("");
		iconeMedicosLbl.setIcon(new ImageIcon(JanelaPrincipalRecepcionista.class.getResource("/midia/medicos.png")));
		iconeMedicosLbl.setHorizontalAlignment(SwingConstants.CENTER);
		iconeMedicosLbl.setBounds(314, 267, 62, 62);
		frmClinicsystem.getContentPane().add(iconeMedicosLbl);
		
		titulodapaginaLbl = new JLabel("Bem-vindo(a)!");
		titulodapaginaLbl.setHorizontalAlignment(SwingConstants.LEFT);
		titulodapaginaLbl.setForeground(Color.WHITE);
		titulodapaginaLbl.setFont(new Font("Arial", Font.PLAIN, 16));
		titulodapaginaLbl.setBackground(Color.WHITE);
		titulodapaginaLbl.setBounds(22, -1, 380, 55);
		frmClinicsystem.getContentPane().add(titulodapaginaLbl);
		
		logoMenu = new JLabel("");
		logoMenu.setIcon(new ImageIcon(JanelaPrincipalRecepcionista.class.getResource("/midia/logo_menu.png")));
		logoMenu.setBounds(919, -1, 160, 55);
		frmClinicsystem.getContentPane().add(logoMenu);
		
		menuLbl = new JLabel("Menu");
		menuLbl.setHorizontalAlignment(SwingConstants.LEFT);
		menuLbl.setBackground(Color.WHITE);
		menuLbl.setForeground(Color.GRAY);
		menuLbl.setFont(new Font("Arial", Font.PLAIN, 16));
		menuLbl.setBounds(22, 65, 170, 24);
		frmClinicsystem.getContentPane().add(menuLbl);
		
		barraAzul = new JLabel("");
		barraAzul.setBackground(new Color(0, 102, 255));
		barraAzul.setBounds(-1, -1, 1131, 55);
		barraAzul.setOpaque(true);
		frmClinicsystem.getContentPane().add(barraAzul);
		
		mensagemJanelaPrincipalLbl = new JLabel("Você está logado como recepcionista.");
		mensagemJanelaPrincipalLbl.setHorizontalAlignment(SwingConstants.LEFT);
		mensagemJanelaPrincipalLbl.setForeground(new Color(0, 102, 255));
		mensagemJanelaPrincipalLbl.setFont(new Font("Arial", Font.PLAIN, 14));
		mensagemJanelaPrincipalLbl.setBackground(Color.WHITE);
		mensagemJanelaPrincipalLbl.setBounds(300, 65, 586, 24);
		frmClinicsystem.getContentPane().add(mensagemJanelaPrincipalLbl);
		
		//Botão
		menuCadastrarBtn = new JButton("  Cadastrar paciente");
		menuCadastrarBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuCadastrarBtn.setHorizontalAlignment(SwingConstants.LEFT);
		menuCadastrarBtn.setForeground(new Color(0, 102, 255));
		menuCadastrarBtn.setFont(new Font("Arial", Font.PLAIN, 16));
		menuCadastrarBtn.setContentAreaFilled(false);
		menuCadastrarBtn.setBorderPainted(false);
		menuCadastrarBtn.setBackground(Color.WHITE);
		menuCadastrarBtn.setBounds(-1, 100, 276, 34);
		frmClinicsystem.getContentPane().add(menuCadastrarBtn);
		
		//Botão
		menuVisualizarPacientesBtn = new JButton("  Visualizar pacientes");
		menuVisualizarPacientesBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuVisualizarPacientesBtn.setHorizontalAlignment(SwingConstants.LEFT);
		menuVisualizarPacientesBtn.setForeground(new Color(0, 102, 255));
		menuVisualizarPacientesBtn.setFont(new Font("Arial", Font.PLAIN, 16));
		menuVisualizarPacientesBtn.setContentAreaFilled(false);
		menuVisualizarPacientesBtn.setBorderPainted(false);
		menuVisualizarPacientesBtn.setBackground(Color.WHITE);
		menuVisualizarPacientesBtn.setBounds(-1, 145, 276, 34);
		frmClinicsystem.getContentPane().add(menuVisualizarPacientesBtn);
		
		//Botão
		menuAgendarConsultaBtn = new JButton("  Agendar consulta");
		menuAgendarConsultaBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuAgendarConsultaBtn.setHorizontalAlignment(SwingConstants.LEFT);
		menuAgendarConsultaBtn.setForeground(new Color(0, 102, 255));
		menuAgendarConsultaBtn.setFont(new Font("Arial", Font.PLAIN, 16));
		menuAgendarConsultaBtn.setContentAreaFilled(false);
		menuAgendarConsultaBtn.setBorderPainted(false);
		menuAgendarConsultaBtn.setBackground(Color.WHITE);
		menuAgendarConsultaBtn.setBounds(-1, 190, 276, 34);
		frmClinicsystem.getContentPane().add(menuAgendarConsultaBtn);
		
		textoConsultasLbl = new JLabel("Número de consultas\r\n do dia");
		textoConsultasLbl.setHorizontalAlignment(SwingConstants.CENTER);
		textoConsultasLbl.setFont(new Font("Arial", Font.PLAIN, 12));
		textoConsultasLbl.setForeground(new Color(255, 255, 255));
		textoConsultasLbl.setBounds(385, 100, 191, 59);
		frmClinicsystem.getContentPane().add(textoConsultasLbl);
		
		numeroConsultasLbl = new JLabel("20000");
		numeroConsultasLbl.setHorizontalAlignment(SwingConstants.CENTER);
		numeroConsultasLbl.setForeground(Color.WHITE);
		numeroConsultasLbl.setFont(new Font("Arial", Font.BOLD, 22));
		numeroConsultasLbl.setBounds(415, 145, 130, 59);
		frmClinicsystem.getContentPane().add(numeroConsultasLbl);
		
		iconeConsultasLbl = new JLabel("");
		iconeConsultasLbl.setHorizontalAlignment(SwingConstants.CENTER);
		iconeConsultasLbl.setIcon(new ImageIcon(JanelaPrincipalRecepcionista.class.getResource("/midia/consultas.png")));
		iconeConsultasLbl.setBounds(314, 128, 62, 62);
		frmClinicsystem.getContentPane().add(iconeConsultasLbl);
		
		JLabel consultasBoxLbl = new JLabel("");
		consultasBoxLbl.setBorder(null);
		consultasBoxLbl.setBackground(new Color(0, 102, 204));
		consultasBoxLbl.setForeground(Color.WHITE);
		consultasBoxLbl.setBounds(300, 100, 276, 124);
		consultasBoxLbl.setOpaque(true);
		frmClinicsystem.getContentPane().add(consultasBoxLbl);
		
		JLabel textoPacientesLbl = new JLabel("Total de pacientes");
		textoPacientesLbl.setHorizontalAlignment(SwingConstants.CENTER);
		textoPacientesLbl.setForeground(Color.WHITE);
		textoPacientesLbl.setFont(new Font("Arial", Font.PLAIN, 12));
		textoPacientesLbl.setBounds(725, 100, 130, 59);
		frmClinicsystem.getContentPane().add(textoPacientesLbl);
		
		JLabel numeroMedicosLbl = new JLabel("20000");
		numeroMedicosLbl.setHorizontalAlignment(SwingConstants.CENTER);
		numeroMedicosLbl.setForeground(Color.WHITE);
		numeroMedicosLbl.setFont(new Font("Arial", Font.BOLD, 22));
		numeroMedicosLbl.setBounds(415, 280, 130, 59);
		frmClinicsystem.getContentPane().add(numeroMedicosLbl);
		
		JLabel pacientesBoxLbl = new JLabel("");
		pacientesBoxLbl.setOpaque(true);
		pacientesBoxLbl.setForeground(Color.WHITE);
		pacientesBoxLbl.setBorder(null);
		pacientesBoxLbl.setBackground(new Color(0, 102, 204));
		pacientesBoxLbl.setBounds(610, 100, 276, 124);
		frmClinicsystem.getContentPane().add(pacientesBoxLbl);
		
		JLabel textoMedicosLbl = new JLabel("Total de médicos");
		textoMedicosLbl.setHorizontalAlignment(SwingConstants.CENTER);
		textoMedicosLbl.setForeground(Color.WHITE);
		textoMedicosLbl.setFont(new Font("Arial", Font.PLAIN, 12));
		textoMedicosLbl.setBounds(415, 235, 130, 59);
		frmClinicsystem.getContentPane().add(textoMedicosLbl);
		
		numeroRecepcionistasLbl = new JLabel("20000");
		numeroRecepcionistasLbl.setHorizontalAlignment(SwingConstants.CENTER);
		numeroRecepcionistasLbl.setForeground(Color.WHITE);
		numeroRecepcionistasLbl.setFont(new Font("Arial", Font.BOLD, 22));
		numeroRecepcionistasLbl.setBounds(725, 280, 130, 59);
		frmClinicsystem.getContentPane().add(numeroRecepcionistasLbl);
		
		textoRecepcionistasLbl = new JLabel("Total de recepcionistas");
		textoRecepcionistasLbl.setHorizontalAlignment(SwingConstants.CENTER);
		textoRecepcionistasLbl.setForeground(Color.WHITE);
		textoRecepcionistasLbl.setFont(new Font("Arial", Font.PLAIN, 12));
		textoRecepcionistasLbl.setBounds(725, 235, 130, 59);
		frmClinicsystem.getContentPane().add(textoRecepcionistasLbl);
		
		recepcionistasBoxLbl = new JLabel("");
		recepcionistasBoxLbl.setOpaque(true);
		recepcionistasBoxLbl.setForeground(Color.WHITE);
		recepcionistasBoxLbl.setBorder(null);
		recepcionistasBoxLbl.setBackground(new Color(0, 102, 204));
		recepcionistasBoxLbl.setBounds(610, 235, 276, 124);
		frmClinicsystem.getContentPane().add(recepcionistasBoxLbl);
		
		JLabel medicosBoxLbl = new JLabel("");
		medicosBoxLbl.setOpaque(true);
		medicosBoxLbl.setForeground(Color.WHITE);
		medicosBoxLbl.setBorder(null);
		medicosBoxLbl.setBackground(new Color(0, 102, 204));
		medicosBoxLbl.setBounds(300, 235, 276, 124);
		frmClinicsystem.getContentPane().add(medicosBoxLbl);
		
		//Botão
		JButton menuSairBtn = new JButton("  Sair");
		menuSairBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menuSairBtn.setHorizontalAlignment(SwingConstants.LEFT);
		menuSairBtn.setForeground(new Color(255, 0, 51));
		menuSairBtn.setFont(new Font("Arial", Font.PLAIN, 16));
		menuSairBtn.setContentAreaFilled(false);
		menuSairBtn.setBorderPainted(false);
		menuSairBtn.setBackground(Color.WHITE);
		menuSairBtn.setBounds(-1, 280, 276, 34);
		frmClinicsystem.getContentPane().add(menuSairBtn);
		
		//Botão
		menuVisualizarConsultasBtn = new JButton("  Visualizar consultas");
		menuVisualizarConsultasBtn.setHorizontalAlignment(SwingConstants.LEFT);
		menuVisualizarConsultasBtn.setForeground(new Color(0, 102, 255));
		menuVisualizarConsultasBtn.setFont(new Font("Arial", Font.PLAIN, 16));
		menuVisualizarConsultasBtn.setContentAreaFilled(false);
		menuVisualizarConsultasBtn.setBorderPainted(false);
		menuVisualizarConsultasBtn.setBackground(Color.WHITE);
		menuVisualizarConsultasBtn.setBounds(-1, 235, 276, 34);
		frmClinicsystem.getContentPane().add(menuVisualizarConsultasBtn);
		
		frmClinicsystem.setBackground(new Color(255, 255, 255));
		frmClinicsystem.setResizable(false);
		frmClinicsystem.setBounds(100, 100, 1120, 680);
		frmClinicsystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}