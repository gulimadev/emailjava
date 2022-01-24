package br.com.gulimadev.emailjava.view;

import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;

public class Window extends JPanel {
	private JTextField email;
	private JPasswordField senha;

	/**
	 * Create the panel.
	 */
	public Window() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email Java");
		lblNewLabel.setFont(UIManager.getFont("ColorChooser.font"));
		lblNewLabel.setBounds(118, 11, 122, 14);
		add(lblNewLabel);
		
		email = new JTextField();
		email.setBounds(34, 46, 239, 20);
		add(email);
		email.setColumns(10);
		
		senha = new JPasswordField();
		senha.setBounds(34, 94, 239, 20);
		add(senha);
		
		JLabel lblNewLabel_1 = new JLabel("Email:");
		lblNewLabel_1.setBounds(36, 28, 63, 14);
		add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha:");
		lblNewLabel_1_1.setBounds(34, 77, 63, 14);
		add(lblNewLabel_1_1);
		
		JButton entrar = new JButton("Entrar");
		entrar.setBounds(103, 137, 89, 23);
		add(entrar);
		setVisible(true);
		

	}
}
