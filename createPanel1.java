import java.awt.GridLayout;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class createPanel1 extends JPanel{
	
	private String pizzaType;
	
	public createPanel1() {
		   
	      setLayout(new GridLayout(3,1));
	      setBounds(150, 50, 150, 130);
	      
	      JRadioButton cheeseButton = new JRadioButton("Cheese");
	      JRadioButton pepperoniButton = new JRadioButton("Pepperoni");
	      JRadioButton veggieButton = new JRadioButton("Veggie");
	      ButtonGroup group = new ButtonGroup();
	      group.add(cheeseButton);
	      group.add(pepperoniButton);
	      group.add(veggieButton);
	      
	      add(cheeseButton);
	      add(pepperoniButton);
	      add(veggieButton);
	      setBorder((Border) new TitledBorder(new EtchedBorder(),"Pizza Type"));
	      cheeseButton.setSelected(true);
	   
	      if (cheeseButton.isSelected()) {
	    	  pizzaType = "Cheese";
	      }
	      if (pepperoniButton.isSelected()) {
	    	  pizzaType = "Pepperoni";
	      }
	      if (veggieButton.isSelected()) {
	    	  pizzaType = "Veggie";
	      }
	   }

}
