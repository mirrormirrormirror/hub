package compound;

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

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import java.awt.Color;

public class MainInterface1 extends JFrame {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox comboBox;
	private JButton button_1;
	double i;	//利率
	double p;	//期初金额
	double F;	//未来值
	static double  n;	//期数
	private JLabel label_4;
	private JLabel lblNewLabel;
    jisuan rule = new jisuan();
	/**
	 * Launch the application.
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainInterface1 frame = new MainInterface1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainInterface1() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 326, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		
		JLabel label = new JLabel("复利终值");
		label.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		JLabel label_1 = new JLabel("复利期数");
		label_1.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		JLabel label_2 = new JLabel("存入本金");
		label_2.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		JLabel label_3 = new JLabel("年利率");
		label_3.setFont(new Font("微软雅黑", Font.PLAIN, 17));
		
		textField = new JTextField("");
		textField.setColumns(10);
		
		textField_1 = new JTextField("");
		textField_1.setColumns(10);
		
		textField_2 = new JTextField("");
		textField_2.setColumns(10);
		
		textField_3 = new JTextField("");
		textField_3.setColumns(10);
		textField.setEditable(false);
		
		button_1 = new JButton("确定");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				String str = (String) comboBox.getSelectedItem();
				String str1 = new String("复利计算");
				String str2 = new String("单利计算");
				String str3 = new String("利率计算");
				String str4 = new String("时间计算");
				String str5 = new String("本金计算");
				boolean boo = str1.equals(str);
				boolean boo1 = str2.equals(str);
				boolean boo2= str3.equals(str);
				boolean boo3= str4.equals(str);
				boolean boo4= str5.equals(str);
				
				if(boo){
					
					rule.fulijisuan(textField ,textField_1 ,textField_2, textField_3);
				}else if(boo1){
					rule.danlijisuan(textField ,textField_1 ,textField_2, textField_3);
				}else if(boo2){
					rule.lilujisuan(textField ,textField_1 ,textField_2, textField_3);
				}else if(boo3){
					rule.time(textField ,textField_1 ,textField_2, textField_3);
				}else if(boo4){
					rule.benjin(textField ,textField_1 ,textField_2, textField_3);
				}
				
			}
		});
		
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				String str = (String)comboBox.getSelectedItem();
				
				String str1 = new String("复利计算");
				String str2 = new String("单利计算");
				String str3 = new String("利率计算");
				String str4 = new String("时间计算");
				String str5 = new String("本金计算");
				boolean boo = str1.equals(str);
				boolean boo1 = str2.equals(str);
				boolean boo2= str3.equals(str);
				boolean boo3 = str4.equals(str);
				boolean boo4 = str5.equals(str);
				
				if(boo){
					textField_3.setEditable(true);
					textField.setEditable(false);
					textField_2.setEditable(true);
					textField_1.setEditable(true);
					label_4.setText("请输入本金、利率、期数!");
					
				}else if(boo1){
					textField.setEditable(false);
					textField_3.setEditable(true);
					textField_2.setEditable(true);
					label_4.setText("请输入本金、利率、期数!");
					textField_1.setEditable(true);
				}else if(boo2){
					textField_2.setEditable(false);
					textField.setEditable(true);
					label_4.setText("请输入本金、期数、未来值!");
					textField_1.setEditable(true);
					textField_3.setEditable(true);
					
				}else if(boo3){
					textField_2.setEditable(true);
					textField.setEditable(true);
					textField_1.setEditable(false);
					textField_3.setEditable(true);
					label_4.setText("请输入本金、利率、未来值!");
					
				}else if(boo4){
					textField_2.setEditable(true);
					textField.setEditable(true);
					textField_1.setEditable(true);
					textField_3.setEditable(false);
					
					label_4.setText("请输入本金、利率、未来值!");
					
				}
				
			}
		});
		
	
	
		
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"复利计算", "单利计算", "利率计算", "时间计算", "本金计算"}));
		
		label_4 = new JLabel("请输入本金、利率、期数！");
		label_4.setForeground(Color.BLACK);
		label_4.setBackground(Color.BLACK);
		label_4.setFont(new Font("黑体", Font.PLAIN, 18));
		
		lblNewLabel = new JLabel("请选择计算类型：");
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 14));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(17)
									.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 57, Short.MAX_VALUE)
										.addComponent(label_3, GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
										.addComponent(label_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.RELATED, 5, Short.MAX_VALUE))
								.addGroup(gl_panel.createSequentialGroup()
									.addComponent(label)
									.addGap(7)))
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)))
					.addGap(24))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(28)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 237, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(35, Short.MAX_VALUE))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(14)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)))
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 21, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGap(18)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(11, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
	}
}
