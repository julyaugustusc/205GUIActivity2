import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class createPanel2 extends JPanel {
	
	private String toppings;
	
	public createPanel2() {
	      
	      setLayout(new GridLayout(3, 1));
	      setBounds(300, 50, 200, 130);
	      
	      JCheckBox extraCheese = new JCheckBox("Extra Cheese");
	      JCheckBox bacon = new JCheckBox("Bacon");
	      JCheckBox mushroom = new JCheckBox("Mushroom");
	      add(extraCheese);
	      add(bacon);
	      add(mushroom);
	      setBorder((Border) new TitledBorder(new EtchedBorder(),"Toppings"));
	      
	      if (extraCheese.isSelected()) {
	    	  toppings = "Extra Cheese,";
	      }
	      if (bacon.isSelected()) {
	    	  toppings = toppings + " Bacon,";
	      }
	      if (mushroom.isSelected()) {
	    	  toppings = toppings + " Mushroom";
	      }
	   }

}
