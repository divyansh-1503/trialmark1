import java.awt.EventQueue;
import java.awt.Desktop;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseScreen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CourseScreen frame = new CourseScreen();
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
	public CourseScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 614);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
				
		JLabel lblNewLabel = new JLabel("JAVA PROGRAMMING");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(39, 146, 190, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPythonProgramming = new JLabel("PYTHON PROGRAMMING");
		lblPythonProgramming.setHorizontalAlignment(SwingConstants.CENTER);
		lblPythonProgramming.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPythonProgramming.setBounds(39, 184, 190, 14);
		contentPane.add(lblPythonProgramming);
		
		JLabel lblArtificialIntellgence = new JLabel("ARTIFICIAL INTELLGENCE");
		lblArtificialIntellgence.setHorizontalAlignment(SwingConstants.CENTER);
		lblArtificialIntellgence.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblArtificialIntellgence.setBounds(41, 221, 190, 14);
		contentPane.add(lblArtificialIntellgence);
		
		JLabel lblMachineLearning = new JLabel("MACHINE LEARNING");
		lblMachineLearning.setHorizontalAlignment(SwingConstants.CENTER);
		lblMachineLearning.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMachineLearning.setBounds(41, 260, 190, 14);
		contentPane.add(lblMachineLearning);
		
		JLabel lblDataScience = new JLabel("DATA SCIENCE");
		lblDataScience.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataScience.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDataScience.setBounds(41, 303, 190, 14);
		contentPane.add(lblDataScience);
		
		JLabel lblWebDevelopment = new JLabel("WEB DEVELOPMENT");
		lblWebDevelopment.setHorizontalAlignment(SwingConstants.CENTER);
		lblWebDevelopment.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblWebDevelopment.setBounds(41, 343, 190, 14);
		contentPane.add(lblWebDevelopment);
		
		JLabel lblCProgramming = new JLabel("C++ PROGRAMMING");
		lblCProgramming.setHorizontalAlignment(SwingConstants.CENTER);
		lblCProgramming.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCProgramming.setBounds(41, 379, 190, 14);
		contentPane.add(lblCProgramming);
		
		JButton btnNewButton = new JButton("JAVA");
		btnNewButton.setBounds(284, 144, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new java.net.URI("https://youtu.be/ntLJmHOJ0ME?si=ZgWU7J9T0J7mRZIA"));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			});
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Python");
		btnNewButton_1.setBounds(284, 182, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new java.net.URI("https://youtu.be/v9bOWjwdTlg?si=rA1xrkSBAFutXopR"));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			});
		contentPane.add(btnNewButton_1);
		JButton btnNewButton_2 = new JButton("AI");
		btnNewButton_2.setBounds(284, 221, 89, 23);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new java.net.URI("https://youtu.be/JMUxmLyrhSk?si=ebp_IfatLArCCxpz"));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			});

		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("ML");
		btnNewButton_3.setBounds(284, 260, 89, 23);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new java.net.URI("https://youtu.be/LvC68w9JS4Y?si=Z-2aGgh1-tY8DxEA"));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			});
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("DS");
		btnNewButton_4.setBounds(284, 303, 89, 23);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new java.net.URI("https://youtu.be/-ETQ97mXXF0?si=In-IHe3ydV9VysGZ"));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			});
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("WEB DEV");
		btnNewButton_5.setBounds(284, 343, 89, 23);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new java.net.URI("https://youtu.be/Q33KBiDriJY?si=6nZptJFFI6MDjV5y"));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			});
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("C++");
		btnNewButton_6.setBounds(284, 379, 89, 23);
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Desktop.getDesktop().browse(new java.net.URI("https://youtu.be/-TkoO8Z07hI?si=b3cYGwaJ7TgXOrDK"));
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			});
		contentPane.add(btnNewButton_6);
		
		JLabel lblNewLabel_1 = new JLabel("Here are Some of the Best Handpicked Courses for the skills you want. ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(0, 37, 494, 48);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("HAPPY LEARNING");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(156, 87, 182, 23);
		contentPane.add(lblNewLabel_2);
	}
}