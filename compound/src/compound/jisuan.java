package compound;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Color;


public class jisuan {
	
	static double i;	//利率
	static double p;	//期初金额
	static double F;	//未来值
	static double  n;	//期数
	

	/**
	 * Launch the application.
	 * 
	 * 
	 * 
	 */
public static void time(JTextField textField,JTextField textField_1,
JTextField textField_2,JTextField textField_3){
		
		try {
			p = Double.parseDouble(textField_3.getText());
			i = Double.parseDouble(textField_2.getText());
			F = Double.parseDouble(textField.getText());
			double m =Math.log(F/p)/Math.log(1+i);
			int w = (int) m;
			if( m / w > 0 ){
			 n = w+1;
			}

			if(p<=0||i<=0||F<=0){
				n = 0;
				JOptionPane.showMessageDialog(null,"请正确输入！" , "输入错误", JOptionPane.ERROR_MESSAGE);
			}
			
			String s = String.valueOf(n); 
			textField_1.setText(s);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"请正确输入！" , "输入错误", JOptionPane.ERROR_MESSAGE); 
		}
		
	}
	
public static void benjin(JTextField textField,JTextField textField_1,
JTextField textField_2,JTextField textField_3){
		
		try {
			F = Double.parseDouble(textField.getText());
			i = Double.parseDouble(textField_2.getText());
			n = Double.parseDouble(textField_1.getText());
			p = F/Math.pow((1+i),n);
			if(n<=0||i<=0||F<=0){
				p = 0;
				JOptionPane.showMessageDialog(null,"请正确输入！" , "输入错误", JOptionPane.ERROR_MESSAGE);
			}
			
			String s = String.valueOf(p); 
			textField_3.setText(s);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"请正确输入！" , "输入错误", JOptionPane.ERROR_MESSAGE); 
		}
		
	}


	public static void fulijisuan(JTextField textField,JTextField textField_1,
JTextField textField_2,JTextField textField_3) {
		try {
			p = Double.parseDouble(textField_3.getText());
			i = Double.parseDouble(textField_2.getText());
			n = Double.parseDouble(textField_1.getText());
			F=p*Math.pow((1+i),n);
			if(p<=0||i<=0||n<=0){
				F = 0;
				JOptionPane.showMessageDialog(null,"请正确输入！" , "输入错误", JOptionPane.ERROR_MESSAGE);
			}
			
			String s = String.valueOf(F); 
			textField.setText(s);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null,"请正确输入！" , "输入错误", JOptionPane.ERROR_MESSAGE); 
		}
		
		
		

	}

	public static void danlijisuan(JTextField textField,JTextField textField_1,
JTextField textField_2,JTextField textField_3) {
		
		try {
			p = (float) Double.parseDouble(textField_3.getText());
			i = (float) Double.parseDouble(textField_2.getText());
			n = (float) Double.parseDouble(textField_1.getText());
			F=(float)p*i*n;
			if(p<=0||i<=0||n<=0){
				F=0;
				JOptionPane.showMessageDialog(null,"请正确输入！" , "输入错误", JOptionPane.ERROR_MESSAGE);
			}
			F = p +F;
		} catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null,"请正确输入！" , "输入错误", JOptionPane.ERROR_MESSAGE); 
		}
		
		
		textField.setText(String.valueOf(F));
	


		
	}

	public static void lilujisuan(JTextField textField,JTextField textField_1,JTextField textField_2,JTextField textField_3) {
		try {
			p = Double.parseDouble(textField_3.getText());
			F = Double.parseDouble(textField.getText());
			n =  Double.parseDouble(textField_1.getText());
			i = (Math.pow(F/p,1/(n))-1);
			if(p<=0||n<=0||F<=0){
				i = 0;
				JOptionPane.showMessageDialog(null,"请正确输入！" , "输入错误", JOptionPane.ERROR_MESSAGE);
			}
			i = (Math.pow(F/p,1/(n))-1);
			textField_2.setText(String.valueOf(i));
		} catch (Exception e) {
			// TODO: handle exception
			
			JOptionPane.showMessageDialog(null,"请正确输入！" , "输入错误", JOptionPane.ERROR_MESSAGE); 
		}
		

	}


}
