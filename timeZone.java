package timeZone;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class timeZone
{
	JFrame frame = new JFrame("Frame 1");
	JFrame second = new JFrame("Frame 2");
	JTextField text = new JTextField(20);
	
	int test = 0;
	
	public timeZone()
	{
		JRadioButton daylightSavings = new JRadioButton("Daylight Savings");
		daylightSavings.setSelected(true);
		daylightSavings.setBounds(150,150,150,50);
		JRadioButton noDaylightSavings = new JRadioButton("No Daylight Savings");
		noDaylightSavings.setBounds(150,200,150,50);
		ButtonGroup group = new ButtonGroup();
		group.add(daylightSavings);
		group.add(noDaylightSavings);
		
		frame.add(daylightSavings);
		frame.add(noDaylightSavings);
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,500);
		frame.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		frame.add(panel);
		
		panel.setLayout(null);
		
		JLabel time = new JLabel("Text Field");
		time.setBounds(10,20,80,25);
		panel.add(time);
		
		text.setBounds(100,20,165,25);
		panel.add(text);
		
		JButton button = new JButton("Next Window");
		button.setBounds(10,80,160,25);
		button.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				frame.setVisible(false);
				second.setVisible(true);
			}
		}
		);
		panel.add(button);
		
		frame.setVisible(true);

		second.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		second.setSize(500,500);
		second.setLocationRelativeTo(null);
		
		JPanel panel2 = new JPanel();
		second.add(panel2);
		panel2.setLayout(null);
		
		JButton button2 = new JButton("Return First Window");
		button2.setBounds(10,80,160,25);
		button2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				second.setVisible(false);
				text.setText(null);
				frame.setVisible(true);
			}
		});
		panel2.add(button2);
	}
	
	public static void main(String[] args) 
	{
		timeZone test = new timeZone();
	}
}

