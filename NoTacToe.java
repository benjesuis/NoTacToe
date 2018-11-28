import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class NoTacToe extends JPanel
{
    JButton buttons[] = new JButton[9]; 
    
    public NoTacToe()
    {
      setLayout(new GridLayout(3,3));
      
      getButtons();  
    }
    
    public void getButtons()
    {
        for(int i=0; i<=8; i++)
        {
            buttons[i] = new JButton();
            buttons[i].addActionListener(new buttonListener());
            
            buttons[i].setText(" ");
            add(buttons[i]);        
        }
    }
    public void playAgain()
    {
        for(int i = 0; i <= 8; i++)
        {
            buttons[i].setText(" ");
        }
    }
    private class buttonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event) 
        {
            
            JButton clicked = (JButton)event.getSource();
            
            clicked.setText("X");  
        }
    }
    
    public static void main(String[] args) 
    {
        JFrame window = new JFrame("NoTacToe");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().add(new NoTacToe());
        window.setBounds(300,200,300,300);
        window.setVisible(true);
    }
}
