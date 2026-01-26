import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ManHinhTinhToan frame = new ManHinhTinhToan();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public ManHinhTinhToan() {
		setFont(new Font("Times New Roman", Font.PLAIN, 16));
		setTitle("Chương trình tính toán");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 396);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất(a):");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNewLabel.setBounds(44, 56, 140, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ nhất(b):");
		lblNhpSTh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblNhpSTh.setBounds(44, 109, 140, 24);
		contentPane.add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtA.setBounds(194, 52, 240, 32);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(194, 105, 240, 32);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnCong.setBounds(41, 223, 86, 24);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnTru.setBounds(137, 223, 86, 24);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnNhan.setBounds(246, 223, 86, 24);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnChia.setBounds(348, 223, 86, 24);
		contentPane.add(btnChia);
		
		JLabel lblKtQuTnh = new JLabel("Kết quả tính toán:");
		lblKtQuTnh.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lblKtQuTnh.setBounds(44, 268, 140, 24);
		contentPane.add(lblKtQuTnh);
		
		txtKetQua = new JTextField();
		txtKetQua.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(194, 264, 240, 32);
		contentPane.add(txtKetQua);

	}
}
