package gamePackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Monopoly {

	private JFrame frame;
	private JLayeredPane topLeft;
	private JLayeredPane bottomLeft;
	private JLayeredPane topRight;
	private JLayeredPane bottomRight;
	private JLayeredPane left_1;
	private JLayeredPane left_2;
	private JLayeredPane left_3;
	private JLayeredPane left_4;
	private JLayeredPane left_5;
	private JLayeredPane left_6;
	private JLayeredPane left_7;
	private JLayeredPane left_8;
	private JLayeredPane left_9;
	private JLayeredPane top_1;
	private JLayeredPane top_2;
	private JLayeredPane top_3;
	private JLayeredPane top_4;
	private JLayeredPane top_5;
	private JLayeredPane top_6;
	private JLayeredPane top_7;
	private JLayeredPane top_8;
	private JLayeredPane top_9;
	private JLayeredPane right_1;
	private JLayeredPane right_2;
	private JLayeredPane right_3;
	private JLayeredPane right_4;
	private JLayeredPane right_5;
	private JLayeredPane right_6;
	private JLayeredPane right_7;
	private JLayeredPane right_8;
	private JLayeredPane right_9;
	private JLayeredPane bottom_1;
	private JLayeredPane bottom_2;
	private JLayeredPane bottom_3;
	private JLayeredPane bottom_4;
	private JLayeredPane bottom_5;
	private JLayeredPane bottom_6;
	private JLayeredPane bottom_7;
	private JLayeredPane bottom_8;
	private JLayeredPane bottom_9;
	private JLayeredPane player_1;
	private JLayeredPane player_2;
	private JLayeredPane player_3;
	private JLayeredPane player_4;
	private JLayeredPane player_5;
	private JLayeredPane player_6;
	private int frameHeight;
	private JButton communityChest;
	private JButton chanceButton;
	private JLabel bottomRightLabel;
	private JLabel bottom1Label;
	private JLabel bottom2Label;
	private JLabel bottom3Label;
	private JLabel bottom4Label;
	private JLabel bottom5Label;
	private JLabel bottom6Label;
	private JLabel bottom7Label;
	private JLabel bottom8Label;
	private JLabel bottom9Label;
	private JLabel bottomLeftLabel;
	private JLabel left1Label;
	private JLabel left2Label;
	private JLabel left3Label;
	private JLabel left4Label;
	private JLabel left5Label;
	private JLabel left6Label;
	private JLabel left7Label;
	private JLabel left8Label;
	private JLabel left9Label;
	private JLabel topLeftLabel;
	private JLabel top1Label;
	private JLabel top2Label;
	private JLabel top3Label;
	private JLabel top4Label;
	private JLabel top5Label;
	private JLabel top6Label;
	private JLabel top7Label;
	private JLabel top8Label;
	private JLabel top9Label;
	private JLabel topRightLabel;
	private JLabel right1Label;
	private JLabel right2Label;
	private JLabel right3Label;
	private JLabel right4Label;
	private JLabel right5Label;
	private JLabel right6Label;
	private JLabel right7Label;
	private JLabel right8Label;
	private JLabel right9Label;
	private JButton addPlayer1;
	private JButton addPlayer2;
	private JButton addPlayer3;
	private JButton addPlayer4;
	private JButton addPlayer5;
	private JButton addPlayer6;
	private JButton startGame;
	private JTextField player1name;
	private JTextField player2name;
	private JTextField player3name;
	private JTextField player4name;
	private JTextField player5name;
	private JTextField player6name;
	private JButton addPlayer1Name;
	private JButton addPlayer2Name;
	private JButton addPlayer3Name;
	private JButton addPlayer4Name;
	private JButton addPlayer5Name;
	private JButton addPlayer6Name;
	private JLabel player1nameLabel;
	private JLabel player2nameLabel;
	private JLabel player3nameLabel;
	private JLabel player4nameLabel;
	private JLabel player5nameLabel;
	private JLabel player6nameLabel;
	
	private PropertyMarket market;
	private ArrayList<Player> players;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Monopoly window = new Monopoly();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Monopoly() {
		players = new ArrayList<Player>();
		market = new PropertyMarket();
		System.out.println(market.getProperties());
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		FlowLayout flow = new FlowLayout();
		flow.setHgap(0);
		flow.setVgap(0);
		frame = new JFrame("Monopoly");
		frame.setLayout(flow);
		frame.getContentPane().setBackground(new Color(173, 216, 230));
		frame.setForeground(new Color(173, 216, 230));
		frame.setBackground(new Color(173, 216, 230));
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setSize(screenSize);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		// frameWidth = frame.getWidth();
		frameHeight = frame.getHeight() - 40;
		topLeft = new JLayeredPane();
		topLeft.setBounds(0, 0, (int) (frameHeight / 6.5),
				(int) (frameHeight / 6.5));
		left_1 = new JLayeredPane();
		left_1.setBounds(0, (int) (frameHeight / 6.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_2 = new JLayeredPane();
		left_2.setBounds(0, (int) (frameHeight / 6.5 * 1.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_3 = new JLayeredPane();
		left_3.setBounds(0, (int) (frameHeight / 6.5 * 2),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_4 = new JLayeredPane();
		left_4.setBounds(0, (int) (frameHeight / 6.5 * 2.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_5 = new JLayeredPane();
		left_5.setBounds(0, (int) (frameHeight / 6.5 * 3),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_6 = new JLayeredPane();
		left_6.setBounds(0, (int) (frameHeight / 6.5 * 3.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_7 = new JLayeredPane();
		left_7.setBounds(0, (int) (frameHeight / 6.5 * 4),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_8 = new JLayeredPane();
		left_8.setBounds(0, (int) (frameHeight / 6.5 * 4.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		left_9 = new JLayeredPane();
		left_9.setBounds(0, (int) (frameHeight / 6.5 * 5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 13));
		bottomLeft = new JLayeredPane();
		bottomLeft.setBounds(0, (int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 6.5));
		top_1 = new JLayeredPane();
		top_1.setBounds((int) (frameHeight / 6.5), 0, (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		top_2 = new JLayeredPane();
		top_2.setBounds((int) (frameHeight / 6.5 * 1.5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_3 = new JLayeredPane();
		top_3.setBounds((int) (frameHeight / 6.5 * 2), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_4 = new JLayeredPane();
		top_4.setBounds((int) (frameHeight / 6.5 * 2.5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_5 = new JLayeredPane();
		top_5.setBounds((int) (frameHeight / 6.5 * 3), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_6 = new JLayeredPane();
		top_6.setBounds((int) (frameHeight / 6.5 * 3.5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_7 = new JLayeredPane();
		top_7.setBounds((int) (frameHeight / 6.5 * 4), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_8 = new JLayeredPane();
		top_8.setBounds((int) (frameHeight / 6.5 * 4.5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		top_9 = new JLayeredPane();
		top_9.setBounds((int) (frameHeight / 6.5 * 5), 0,
				(int) (frameHeight / 13), (int) (frameHeight / 6.5));
		topRight = new JLayeredPane();
		topRight.setBounds((int) (frameHeight / 6.5 * 5.5), 0,
				(int) (frameHeight / 6.5), (int) (frameHeight / 6.5));
		right_1 = new JLayeredPane();
		right_1.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_2 = new JLayeredPane();
		right_2.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 1.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_3 = new JLayeredPane();
		right_3.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 2), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_4 = new JLayeredPane();
		right_4.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 2.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_5 = new JLayeredPane();
		right_5.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 3), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_6 = new JLayeredPane();
		right_6.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 3.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_7 = new JLayeredPane();
		right_7.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 4), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_8 = new JLayeredPane();
		right_8.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 4.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		right_9 = new JLayeredPane();
		right_9.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 13));
		bottom_1 = new JLayeredPane();
		bottom_1.setBounds((int) (frameHeight / 6.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_2 = new JLayeredPane();
		bottom_2.setBounds((int) (frameHeight / 6.5 * 1.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_3 = new JLayeredPane();
		bottom_3.setBounds((int) (frameHeight / 6.5 * 2),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_4 = new JLayeredPane();
		bottom_4.setBounds((int) (frameHeight / 6.5 * 2.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_5 = new JLayeredPane();
		bottom_5.setBounds((int) (frameHeight / 6.5 * 3),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_6 = new JLayeredPane();
		bottom_6.setBounds((int) (frameHeight / 6.5 * 3.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_7 = new JLayeredPane();
		bottom_7.setBounds((int) (frameHeight / 6.5 * 4),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_8 = new JLayeredPane();
		bottom_8.setBounds((int) (frameHeight / 6.5 * 4.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13),
				(int) (frameHeight / 6.5));
		bottom_9 = new JLayeredPane();
		bottom_9.setBounds((int) (frameHeight / 6.5 * 5), (int) (frameHeight / 6.5 * 5.5) , 56,112 );//(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 13), 	(int) (frameHeight / 6.5));
		bottomRight = new JLayeredPane();
		bottomRight.setBounds((int) (frameHeight / 6.5 * 5.5),
				(int) (frameHeight / 6.5 * 5.5), (int) (frameHeight / 6.5),
				(int) (frameHeight / 6.5));
		communityChest = new JButton();
		communityChest = new JButton("?");
		frame.getContentPane().add(bottomLeft);
		frame.getContentPane().add(topLeft);
		frame.getContentPane().add(left_1);
		frame.getContentPane().add(left_2);
		frame.getContentPane().add(left_3);
		frame.getContentPane().add(left_4);
		frame.getContentPane().add(left_5);
		frame.getContentPane().add(left_6);
		frame.getContentPane().add(left_7);
		frame.getContentPane().add(left_8);
		frame.getContentPane().add(left_9);
		frame.getContentPane().add(top_1);
		frame.getContentPane().add(top_2);
		frame.getContentPane().add(top_3);
		frame.getContentPane().add(top_4);
		frame.getContentPane().add(top_5);
		frame.getContentPane().add(top_6);
		frame.getContentPane().add(top_7);
		frame.getContentPane().add(top_8);
		frame.getContentPane().add(top_9);
		frame.getContentPane().add(topRight);
		frame.getContentPane().add(right_1);
		frame.getContentPane().add(right_2);
		frame.getContentPane().add(right_3);
		frame.getContentPane().add(right_4);
		frame.getContentPane().add(right_5);
		frame.getContentPane().add(right_6);
		frame.getContentPane().add(right_7);
		frame.getContentPane().add(right_8);
		frame.getContentPane().add(right_9);
		frame.getContentPane().add(bottom_1);
		frame.getContentPane().add(bottom_2);
		frame.getContentPane().add(bottom_3);
		frame.getContentPane().add(bottom_4);
		frame.getContentPane().add(bottom_5);
		frame.getContentPane().add(bottom_6);
		frame.getContentPane().add(bottom_7);
		frame.getContentPane().add(bottom_8);
		frame.getContentPane().add(bottom_9);
		frame.getContentPane().add(bottomRight);
		
		bottomRightLabel = new JLabel();
		bottomLeftLabel = new JLabel();
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/start.jpg"));
			bottomRightLabel.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottomLeft.jpg"));
			bottomLeftLabel.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		bottom1Label = new JLabel();
		bottom2Label = new JLabel();
		bottom3Label = new JLabel();
		bottom4Label = new JLabel();
		bottom5Label = new JLabel();
		bottom6Label = new JLabel();
		bottom7Label = new JLabel();
		bottom8Label = new JLabel();
		bottom9Label = new JLabel();
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom1.jpg"));
			bottom1Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom2.jpg"));
			bottom2Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom3.jpg"));
			bottom3Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom4.jpg"));
			bottom4Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom5.jpg"));
			bottom5Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom6.jpg"));
			bottom6Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom7.jpg"));
			bottom7Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom8.jpg"));
			bottom8Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/bottom9.jpg"));
			bottom9Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		bottom_1.setLayout(flow);
		bottom_2.setLayout(flow);
		bottom_3.setLayout(flow);
		bottom_4.setLayout(flow);
		bottom_5.setLayout(flow);
		bottom_6.setLayout(flow);
		bottom_7.setLayout(flow);
		bottom_8.setLayout(flow);
		bottom_9.setLayout(flow);
		bottomRight.setLayout(flow);
		bottomLeft.setLayout(flow);
		bottomRight.add(bottomRightLabel);
		bottomLeft.add(bottomLeftLabel);
		
		bottom_1.add(bottom1Label);
		bottom_2.add(bottom2Label);
		bottom_3.add(bottom3Label);
		bottom_4.add(bottom4Label);
		bottom_5.add(bottom5Label);
		bottom_6.add(bottom6Label);
		bottom_7.add(bottom7Label);
		bottom_8.add(bottom8Label);
		bottom_9.add(bottom9Label);
		
		left1Label = new JLabel();
		left2Label = new JLabel();
		left3Label = new JLabel();
		left4Label = new JLabel();
		left5Label = new JLabel();
		left6Label = new JLabel();
		left7Label = new JLabel();
		left8Label = new JLabel();
		left9Label = new JLabel();
		
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left1.jpg"));
			left1Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left2.jpg"));
			left2Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left3.jpg"));
			left3Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left4.jpg"));
			left4Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left5.jpg"));
			left5Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left6.jpg"));
			left6Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left7.jpg"));
			left7Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left8.jpg"));
			left8Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/left9.jpg"));
			left9Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		
		left_1.setLayout(flow);
		left_2.setLayout(flow);
		left_3.setLayout(flow);
		left_4.setLayout(flow);
		left_5.setLayout(flow);
		left_6.setLayout(flow);
		left_7.setLayout(flow);
		left_8.setLayout(flow);
		left_9.setLayout(flow);
		left_1.add(left1Label);
		left_2.add(left2Label);
		left_3.add(left3Label);
		left_4.add(left4Label);
		left_5.add(left5Label);
		left_6.add(left6Label);
		left_7.add(left7Label);
		left_8.add(left8Label);
		left_9.add(left9Label);
		
		topLeftLabel = new JLabel();
		top1Label = new JLabel();
		top2Label = new JLabel();
		top3Label = new JLabel();
		top4Label = new JLabel();
		top5Label = new JLabel();
		top6Label = new JLabel();
		top7Label = new JLabel();
		top8Label = new JLabel();
		top9Label = new JLabel();
		
		topLeft.setLayout(flow);
		top_1.setLayout(flow);
		top_2.setLayout(flow);
		top_3.setLayout(flow);
		top_4.setLayout(flow);
		top_5.setLayout(flow);
		top_6.setLayout(flow);
		top_7.setLayout(flow);
		top_8.setLayout(flow);
		top_9.setLayout(flow);
		topLeft.add(topLeftLabel);
		top_1.add(top1Label);
		top_2.add(top2Label);
		top_3.add(top3Label);
		top_4.add(top4Label);
		top_5.add(top5Label);
		top_6.add(top6Label);
		top_7.add(top7Label);
		top_8.add(top8Label);
		top_9.add(top9Label);
		
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top1.jpg"));
			top1Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top2.jpg"));
			top2Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top3.jpg"));
			top3Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top4.jpg"));
			top4Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top5.jpg"));
			top5Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top6.jpg"));
			top6Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top7.jpg"));
			top7Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top8.jpg"));
			top8Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/top9.jpg"));
			top9Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/topLeft.jpg"));
			topLeftLabel.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		JPanel p1= new JPanel();
		JLayeredPane player1 = new JLayeredPane();
		player1.setBounds((int) (frameHeight / 6.5 * 5.5 + 60),
				(int) (frameHeight / 6.5) + 5, 20,
				20);
		
		p1.setSize(10,10);
		p1.setBackground(Color.magenta);
		player1.add(p1);
		topRightLabel = new JLabel();
		right1Label = new JLabel();
		right2Label = new JLabel();
		right3Label = new JLabel();
		right4Label = new JLabel();
		right5Label = new JLabel();
		right6Label = new JLabel();
		right7Label = new JLabel();
		right8Label = new JLabel();
		right9Label = new JLabel();
		
		topRight.setLayout(flow);
		right_1.setLayout(flow);
		right_2.setLayout(flow);
		right_3.setLayout(flow);
		right_4.setLayout(flow);
		right_5.setLayout(flow);
		right_6.setLayout(flow);
		right_7.setLayout(flow);
		right_8.setLayout(flow);
		right_9.setLayout(flow);
		topRight.add(topRightLabel);
		right_1.add(right1Label);
		right_2.add(right2Label);
		right_3.add(right3Label);
		right_4.add(right4Label);
		right_5.add(right5Label);
		right_6.add(right6Label);
		right_7.add(right7Label);
		right_8.add(right8Label);
		right_9.add(right9Label);
		
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right1.jpg"));
			right1Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right2.jpg"));
			right2Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right3.jpg"));
			right3Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right4.jpg"));
			right4Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right5.jpg"));
			right5Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right6.jpg"));
			right6Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right7.jpg"));
			right7Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right8.jpg"));
			right8Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/right9.jpg"));
			right9Label.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/topRight.jpg"));
			topRightLabel.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		communityChest = new JButton();
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/chest.jpg"));
			communityChest.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		communityChest.setBounds((int) (frameHeight / 6.5 * 1.125),
				(int) (frameHeight / 6.5 * 1.125), (int) (frameHeight / 3.33),
				(int) (frameHeight / 5));
		communityChest.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		communityChest.setBorderPainted(false);
		communityChest.setContentAreaFilled(false);
		communityChest.setEnabled(false);
		chanceButton = new JButton();
		chanceButton.setBounds((int) (frameHeight / 6.5 * 3.5),
				(int) (frameHeight / 6.5 * 4), (int) (frameHeight / 3.33),
				(int) (frameHeight / 5));
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/chance.jpg"));
			chanceButton.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		
		chanceButton.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		chanceButton.setBorderPainted(false);
		chanceButton.setContentAreaFilled(false);
		//chanceButton.setEnabled(false);
		player_1 = new JLayeredPane();
		player_1.setBounds(frameHeight + 40, 0, (int) (frameHeight / 4),
				(int) (frameHeight / 6.5));
		player_1.setBorder(BorderFactory.createLineBorder(Color.black));
		player1name = new JTextField();
		player1name.setBounds(20, 10, 140, 30);
		player1name.setFont(new Font("Arial", Font.ITALIC, 14));
		player1name.setHorizontalAlignment(SwingConstants.CENTER);
		player1name.setVisible(false);
		player_1.add(player1name);
		
		player_2 = new JLayeredPane();
		player_2.setBounds(frameHeight + 40 + (int) (frameHeight / 4), 0, (int) (frameHeight / 4),
				(int) (frameHeight / 6.5));
		player_2.setBorder(BorderFactory.createLineBorder(Color.black));
		player2name = new JTextField();
		player2name.setBounds(20, 10, 140, 30);
		player2name.setFont(new Font("Arial", Font.ITALIC, 14));
		player2name.setHorizontalAlignment(SwingConstants.CENTER);
		player2name.setVisible(false);
		player_2.add(player2name);
		
		player_3 = new JLayeredPane();
		player_3.setBounds(frameHeight + 40 + (int) (frameHeight / 2), 0, (int) (frameHeight / 4),
				(int) (frameHeight / 6.5));
		player_3.setBorder(BorderFactory.createLineBorder(Color.black));
		player3name = new JTextField();
		player3name.setBounds(20, 10, 140, 30);
		player3name.setFont(new Font("Arial", Font.ITALIC, 14));
		player3name.setHorizontalAlignment(SwingConstants.CENTER);
		player3name.setVisible(false);
		player_3.add(player3name);
		
		player_4 = new JLayeredPane();
		player_4.setBounds(frameHeight + 40, (int) (frameHeight / 6.5), (int) (frameHeight / 4),
				(int) (frameHeight / 6.5));
		player_4.setBorder(BorderFactory.createLineBorder(Color.black));
		player4name = new JTextField();
		player4name.setBounds(20, 10, 140, 30);
		player4name.setFont(new Font("Arial", Font.ITALIC, 14));
		player4name.setHorizontalAlignment(SwingConstants.CENTER);
		player4name.setVisible(false);
		player_4.add(player4name);
		
		player_5 = new JLayeredPane();
		player_5.setBounds(frameHeight + 40 + (int) (frameHeight / 4), (int) (frameHeight / 6.5), (int) (frameHeight / 4),
				(int) (frameHeight / 6.5));
		player_5.setBorder(BorderFactory.createLineBorder(Color.black));
		player5name = new JTextField();
		player5name.setBounds(20, 10, 140, 30);
		player5name.setFont(new Font("Arial", Font.ITALIC, 14));
		player5name.setHorizontalAlignment(SwingConstants.CENTER);
		player5name.setVisible(false);
		player_5.add(player5name);
		
		player_6 = new JLayeredPane();
		player_6.setBounds(frameHeight + 40 + (int) (frameHeight / 2), (int) (frameHeight / 6.5), (int) (frameHeight / 4),
				(int) (frameHeight / 6.5));
		player_6.setBorder(BorderFactory.createLineBorder(Color.black));
		player6name = new JTextField();
		player6name.setBounds(20, 10, 140, 30);
		player6name.setFont(new Font("Arial", Font.ITALIC, 14));
		player6name.setHorizontalAlignment(SwingConstants.CENTER);
		player6name.setVisible(false);
		player_6.add(player6name);
		
		addPlayer1Name = new JButton("Add player's name");
		addPlayer2Name = new JButton("Add player's name");
		addPlayer3Name = new JButton("Add player's name");
		addPlayer4Name = new JButton("Add player's name");
		addPlayer5Name = new JButton("Add player's name");
		addPlayer6Name = new JButton("Add player's name");
		addPlayer1Name.setBounds(frameHeight + 60, 45, 140,
				40);
		addPlayer2Name.setBounds(frameHeight + 60 + (int) (frameHeight / 4), 45, 140,
				40);
		addPlayer3Name.setBounds(frameHeight + 60 + (int) (frameHeight / 2), 45, 140,
				40);
		addPlayer4Name.setBounds(frameHeight + 60, (int) (frameHeight / 6.5) + 45, 140,
				40);
		addPlayer5Name.setBounds(frameHeight + 60 + (int) (frameHeight / 4), (int) (frameHeight / 6.5) + 45, 140,
				40);
		addPlayer6Name.setBounds(frameHeight + 60 + (int) (frameHeight / 2), (int) (frameHeight / 6.5) + 45, 140,
				40);
		addPlayer1Name.setVisible(false);
		addPlayer2Name.setVisible(false);
		addPlayer3Name.setVisible(false);
		addPlayer4Name.setVisible(false);
		addPlayer5Name.setVisible(false);
		addPlayer6Name.setVisible(false);
		
		addPlayer1 = new JButton();
		player1nameLabel = new JLabel();
		player1nameLabel.setBounds(frameHeight + 60, 5, 140,
				40);
		addPlayer1.setBounds(frameHeight + 60, 35, 140,
				40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/addplayer.jpg"));
			addPlayer1.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		addPlayer1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		addPlayer1.setBorderPainted(false);
		addPlayer1.setContentAreaFilled(false);
		addPlayer1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPlayer1.setVisible(false);
				player1name.setVisible(true);
				addPlayer1Name.setVisible(true);
				addPlayer1Name.setEnabled(false);
			}	
		});
		//length of the player1' name is to be between 3-15 characters 
		player1name.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				checkName();
			}

			public void checkName() {
				String name = player1name.getText();
				if (name.length() > 2 && name.length() < 15) {
					addPlayer1Name.setEnabled(true);
				} else {
					addPlayer1Name.setEnabled(false);
				}
			}
		});
		addPlayer1Name.addActionListener(new ActionListener(){
			//adds first player to the ArrayList of players
			@Override
			public void actionPerformed(ActionEvent arg0) {
				players.add(new Player(player1name.getText()));
				player1nameLabel.setText(player1name.getText());
				player1nameLabel.setForeground(Color.RED);
				player1nameLabel.setFont(new Font("Arial", Font.BOLD, 14)); // to be finished
				frame.getContentPane().add(player1nameLabel);
				System.out.println(players.get(0).getName());
				player1name.setVisible(false);
				addPlayer1Name.setVisible(false);
				addPlayer2.setEnabled(true);
			}
			
		});
		addPlayer2 = new JButton();
		addPlayer2.setBounds(frameHeight + 60 + (int) (frameHeight / 4), 35, 140,
				40);
		player2nameLabel = new JLabel();
		player2nameLabel.setBounds(frameHeight + 60 + (int) (frameHeight / 4), 5, 140,
				40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/addplayer.jpg"));
			addPlayer2.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		addPlayer2.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		addPlayer2.setBorderPainted(false);
		addPlayer2.setContentAreaFilled(false);
		addPlayer2.setEnabled(false);
		addPlayer2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPlayer2.setVisible(false);
				player2name.setVisible(true);
				addPlayer2Name.setVisible(true);
				addPlayer2Name.setEnabled(false);
			}	
		});

		player2name.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				checkName();
			}

			//names are to be unique
			public void checkName() {
				String name = player2name.getText();
				if (name.length() > 2 && name.length() < 15 && !name.equals(players.get(0).getName())) {
					addPlayer2Name.setEnabled(true);
				} else {
					addPlayer2Name.setEnabled(false);
				}
			}
		});
		addPlayer2Name.addActionListener(new ActionListener(){
			//adds second player to the ArrayList of players
			@Override
			public void actionPerformed(ActionEvent arg0) {
				players.add(new Player(player2name.getText()));
				player2nameLabel.setText(player2name.getText());
				frame.getContentPane().add(player2nameLabel);
				System.out.println(players.get(1).getName());
				player2name.setVisible(false);
				addPlayer2Name.setVisible(false);
				addPlayer3.setEnabled(true);
				startGame.setEnabled(true); // after creating two players, the game can be started
			}
			
		});
		
		
		addPlayer3 = new JButton();
		player3nameLabel = new JLabel();
		player3nameLabel.setBounds(frameHeight + 60 + (int) (frameHeight / 2), 5, 140,
				40);
		addPlayer3.setBounds(frameHeight + 60 + (int) (frameHeight / 2), 35, 140,
				40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/addplayer.jpg"));
			addPlayer3.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		addPlayer3.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		addPlayer3.setBorderPainted(false);
		addPlayer3.setContentAreaFilled(false);
		addPlayer3.setEnabled(false);
		addPlayer3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPlayer3.setVisible(false);
				player3name.setVisible(true);
				addPlayer3Name.setVisible(true);
				addPlayer3Name.setEnabled(false);
			}	
		});

		player3name.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				checkName();
			}

			//names are to be unique
			public void checkName() {
				String name = player3name.getText();
				if (name.length() > 2 && name.length() < 15 && !name.equals(players.get(0).getName())
						&& !name.equals(players.get(1).getName())) {
					addPlayer3Name.setEnabled(true);
				} else {
					addPlayer3Name.setEnabled(false);
				}
			}
		});

		addPlayer3Name.addActionListener(new ActionListener(){
			//adds third player to the ArrayList of players
			@Override
			public void actionPerformed(ActionEvent arg0) {
				players.add(new Player(player3name.getText()));
				player3nameLabel.setText(player3name.getText());
				frame.getContentPane().add(player3nameLabel);
				System.out.println(players.get(2).getName());
				player3name.setVisible(false);
				addPlayer3Name.setVisible(false);
				addPlayer4.setEnabled(true);
			}
			
		});
		
		addPlayer4 = new JButton();
		player4nameLabel = new JLabel();
		player4nameLabel.setBounds(frameHeight + 60, (int) (frameHeight / 6.5) + 5, 140,
				40);
		addPlayer4.setBounds(frameHeight + 60, (int) (frameHeight / 6.5) + 35, 140,
				40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/addplayer.jpg"));
			addPlayer4.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		addPlayer4.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		addPlayer4.setBorderPainted(false);
		addPlayer4.setContentAreaFilled(false);
		addPlayer4.setEnabled(false);
		addPlayer4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPlayer4.setVisible(false);
				player4name.setVisible(true);
				addPlayer4Name.setVisible(true);
				addPlayer4Name.setEnabled(false);
			}	
		});

		player4name.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				checkName();
			}

			//names are to be unique
			public void checkName() {
				String name = player4name.getText();
				if (name.length() > 2 && name.length() < 15 && !name.equals(players.get(0).getName())
						&& !name.equals(players.get(1).getName()) && !name.equals(players.get(2).getName())) {
					addPlayer4Name.setEnabled(true);
				} else {
					addPlayer4Name.setEnabled(false);
				}
			}
		});

		addPlayer4Name.addActionListener(new ActionListener(){
			//adds fourth player to the ArrayList of players
			@Override
			public void actionPerformed(ActionEvent arg0) {
				players.add(new Player(player4name.getText()));
				player4nameLabel.setText(player4name.getText());
				frame.getContentPane().add(player4nameLabel);
				System.out.println(players.get(3).getName());
				player4name.setVisible(false);
				addPlayer4Name.setVisible(false);
				addPlayer5.setEnabled(true);
			}
			
		});

		addPlayer5 = new JButton();
		player5nameLabel = new JLabel();
		player5nameLabel.setBounds(frameHeight + 60 + (int) (frameHeight / 4), (int) (frameHeight / 6.5) + 5, 140,
				40);
		addPlayer5.setBounds(frameHeight + 60 + (int) (frameHeight / 4), (int) (frameHeight / 6.5) + 35, 140,
				40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/addplayer.jpg"));
			addPlayer5.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		addPlayer5.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		addPlayer5.setBorderPainted(false);
		addPlayer5.setContentAreaFilled(false);
		addPlayer5.setEnabled(false);
		addPlayer5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPlayer5.setVisible(false);
				player5name.setVisible(true);
				addPlayer5Name.setVisible(true);
				addPlayer5Name.setEnabled(false);
			}	
		});

		player5name.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				checkName();
			}

			//names are to be unique
			public void checkName() {
				String name = player5name.getText();
				if (name.length() > 2 && name.length() < 15 && !name.equals(players.get(0).getName())
						&& !name.equals(players.get(1).getName()) && !name.equals(players.get(2).getName())
						&& !name.equals(players.get(3).getName())) {
					addPlayer5Name.setEnabled(true);
				} else {
					addPlayer5Name.setEnabled(false);
				}
			}
		});

		addPlayer5Name.addActionListener(new ActionListener(){
			//adds fifth player to the ArrayList of players
			@Override
			public void actionPerformed(ActionEvent arg0) {
				players.add(new Player(player5name.getText()));
				player5nameLabel.setText(player5name.getText());
				frame.getContentPane().add(player5nameLabel);
				System.out.println(players.get(4).getName());
				player5name.setVisible(false);
				addPlayer5Name.setVisible(false);
				addPlayer6.setEnabled(true);
			}
			
		});

		addPlayer6 = new JButton();
		player6nameLabel = new JLabel();
		player6nameLabel.setBounds(frameHeight + 60 + (int) (frameHeight / 2), (int) (frameHeight / 6.5) + 5, 140,
				40);
		addPlayer6.setBounds(frameHeight + 60 + (int) (frameHeight / 2), (int) (frameHeight / 6.5) + 35, 140,
				40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/addplayer.jpg"));
			addPlayer6.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		addPlayer6.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		addPlayer6.setBorderPainted(false);
		addPlayer6.setContentAreaFilled(false);
		addPlayer6.setEnabled(false);
		addPlayer6.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPlayer6.setVisible(false);
				player6name.setVisible(true);
				addPlayer6Name.setVisible(true);
				addPlayer6Name.setEnabled(false);
			}	
		});

		player6name.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void changedUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				checkName();
			}

			@Override
			public void removeUpdate(DocumentEvent e) {
				checkName();
			}

			//names are to be unique
			public void checkName() {
				String name = player6name.getText();
				if (name.length() > 2 && name.length() < 15 && !name.equals(players.get(0).getName())
						&& !name.equals(players.get(1).getName()) && !name.equals(players.get(2).getName())
						&& !name.equals(players.get(3).getName()) && !name.equals(players.get(4).getName())) {
					addPlayer6Name.setEnabled(true);
				} else {
					addPlayer6Name.setEnabled(false);
				}
			}
		});

		addPlayer6Name.addActionListener(new ActionListener(){
			//adds sixth player to the ArrayList of players
			@Override
			public void actionPerformed(ActionEvent arg0) {
				players.add(new Player(player6name.getText()));
				player6nameLabel.setText(player6name.getText());
				frame.getContentPane().add(player6nameLabel);
				System.out.println(players.get(5).getName());
				player6name.setVisible(false);
				addPlayer6Name.setVisible(false);
			}
			
		});
		
		startGame = new JButton();
		startGame.setBounds(frameHeight + 60 + (int) (frameHeight / 4), (int) (frameHeight / 3), 140,
				40);
		try {
			Image img = ImageIO.read(getClass().getResource(
					"../resources/startthegame.jpg"));
			startGame.setIcon(new ImageIcon(img));
		} catch (IOException ex) {
		}
		startGame.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
		startGame.setBorderPainted(false);
		startGame.setContentAreaFilled(false);
		startGame.setEnabled(false);
		startGame.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent arg0) {
				addPlayer3.setVisible(false);
				addPlayer4.setVisible(false);
				addPlayer5.setVisible(false);
				addPlayer6.setVisible(false);
			}	
		});
		frame.getContentPane().add(communityChest);
		frame.getContentPane().add(chanceButton);
		frame.getContentPane().add(player_1);
		frame.getContentPane().add(player_2);
		frame.getContentPane().add(player_3);
		frame.getContentPane().add(player_4);
		frame.getContentPane().add(player_5);
		frame.getContentPane().add(player_6);
		frame.getContentPane().add(addPlayer1);
		frame.getContentPane().add(addPlayer2);
		frame.getContentPane().add(addPlayer3);
		frame.getContentPane().add(addPlayer4);
		frame.getContentPane().add(addPlayer5);
		frame.getContentPane().add(addPlayer6);
		frame.getContentPane().add(addPlayer1Name);
		frame.getContentPane().add(addPlayer2Name);
		frame.getContentPane().add(addPlayer3Name);
		frame.getContentPane().add(addPlayer4Name);
		frame.getContentPane().add(addPlayer5Name);
		frame.getContentPane().add(addPlayer6Name);
		frame.getContentPane().add(startGame);
		
		//
		//frame.getContentPane().add(player3nameLabel);
		//frame.getContentPane().add(player4nameLabel);
		//frame.getContentPane().add(player5nameLabel);
		//frame.getContentPane().add(player6nameLabel);
		frame.getContentPane().add(player1, 2);

	}
}
