
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;


public class CreateFrame extends JFrame
{
	private static final int FRAME_WIDTH = 600;
	private static final int FRAME_HEIGHT = 300;

	private JLabel display;
	private JRadioButton cheeseButton;
	private JRadioButton pepperoniButton;
	private JRadioButton veggieButton;
	private JCheckBox extraCheese;
	private JCheckBox bacon;
	private JCheckBox mushroom;
	private double pizzaPrice;
	DefaultListModel listModel;
	private JList list;
	private ActionListener listener;
	private JButton calculateTotal;
	
   public CreateFrame() {
	   
      setSize(FRAME_WIDTH, FRAME_HEIGHT);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      listener = new ChoiceListener();
      
      display = new JLabel("Joe's Pizza");  
      add(display, BorderLayout.NORTH);
      calculateTotal = new JButton("Calculate Total");
      add(calculateTotal, BorderLayout.SOUTH);
      calculateTotal.addActionListener(listener);
     
      createControlPanel();
      determinePrice();
      
   }
   
   class ChoiceListener implements ActionListener{
	   
	   public void actionPerformed(ActionEvent event) {
		   determinePrice();
	   }
	}
   
   public void createControlPanel() {
	   
	   JPanel pizzaTypePanel = createTypeRadioButtons();
	   JPanel pizzaToppingsPanel = createToppingsCheckBoxes();
	   JPanel pizzaPricePanel = createPriceList();
	   
	   JPanel controlPanel = new JPanel();
	   controlPanel.setLayout(new GridLayout(1,3));
	   controlPanel.add(pizzaTypePanel);
	   controlPanel.add(pizzaToppingsPanel);
	   controlPanel.add(pizzaPricePanel);
	   
	   add(controlPanel,BorderLayout.CENTER);
	   
   }

   public JPanel createTypeRadioButtons() {
      
      cheeseButton = new JRadioButton("Cheese");
      cheeseButton.setSelected(true);
      pepperoniButton = new JRadioButton("Pepperoni");
      veggieButton = new JRadioButton("Veggie");
      
      ButtonGroup group = new ButtonGroup();
      group.add(cheeseButton);
      group.add(pepperoniButton);
      group.add(veggieButton);
      
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(3,1));
      panel.add(cheeseButton);
      panel.add(pepperoniButton);
      panel.add(veggieButton);
      panel.setBorder((Border) new TitledBorder(new EtchedBorder(),"Pizza Type"));
      
      return panel;
   }
   
   public JPanel createToppingsCheckBoxes() {
      
      extraCheese = new JCheckBox("Extra Cheese");
      bacon = new JCheckBox("Bacon");
      mushroom = new JCheckBox("Mushroom");
      
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(3, 1));
      panel.add(extraCheese);
      panel.add(bacon);
      panel.add(mushroom);
      panel.setBorder((Border) new TitledBorder(new EtchedBorder(),"Toppings"));
      
      return panel;
   }
   
   public JPanel createPriceList() {
	   
	   listModel = new DefaultListModel();
	   list = new JList(listModel);
	   
	   JPanel panel = new JPanel();
	   panel.add(list);
	   
	   return panel;
   }
   
   public void determinePrice() {
	   
	  if (cheeseButton.isSelected()) {
 	  pizzaPrice = 10.00;
 	  } else if (pepperoniButton.isSelected()) {
 	  pizzaPrice = 12.00;
 	  } else if (veggieButton.isSelected()) {
 	  pizzaPrice = 15.00;
 	  }
	  
	  if (extraCheese.isSelected()) {
	  pizzaPrice = pizzaPrice + 1.50;
	  }
	  if (bacon.isSelected()) {
	  pizzaPrice = pizzaPrice + 1.50;
	  }
	  if (mushroom.isSelected()) {
	  pizzaPrice = pizzaPrice + 1.50;
	  }
	  
	  String numberAsString = String.format("%.2f", pizzaPrice);
	  
	  listModel.clear();
	  listModel.addElement("$" + numberAsString);
	  
   }
      

      

      
      
      
   

}