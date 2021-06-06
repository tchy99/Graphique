package interfaceTTT;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

	@SuppressWarnings("serial")
	public class InterfaceTTT extends JPanel {
		
		char playerMark = 'x';
		JButton[] buttons = new JButton[9];
		
		public InterfaceTTT() {
			setLayout(new GridLayout(3,3));
			initializeButtons();	
		}
		public void initializeButtons()
	    {
	        for(int i = 0; i <= 8; i++)
	        {
	            buttons[i] = new JButton();
	            buttons[i].setText("--");
	            buttons[i].setBackground(Color.green);
	            add(buttons[i]);
	        }
	    }
	public static void main(String[] args) {
		JFrame fenetre = new JFrame(" T T T ");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.getContentPane().add(new InterfaceTTT()); 
		fenetre.setBounds(500,500,500,500); 
		fenetre.setVisible(true); 
		fenetre.setLocationRelativeTo(null);

	}
	}
