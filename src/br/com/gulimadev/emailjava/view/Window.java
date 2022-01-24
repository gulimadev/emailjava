package br.com.gulimadev.emailjava.view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JDesktopPane;

public class Window extends JPanel {

	/**
	 * Create the panel.
	 */
	public Window() {
		setLayout(null);
		setVisible(true);
		
		JPanel panel = new JPanel();
		panel.setBounds(290, 5, 10, 10);
		add(panel);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(10, 5, 1, 1);
		add(desktopPane);

	}
}
