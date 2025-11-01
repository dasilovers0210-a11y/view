package hutangpiutang.view;

import hutangpiutang.model.User;
import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame(User user) {
        setTitle("Aplikasi Hutang Piutang - Dashboard");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10, 10));

        JLabel lblWelcome = new JLabel("Selamat datang, " + user.getUsername() + "!", JLabel.CENTER);
        lblWelcome.setFont(new Font("Arial", Font.BOLD, 16));
        lblWelcome.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
        add(lblWelcome, BorderLayout.NORTH);

        JPanel panelButton = new JPanel();
        panelButton.setLayout(new GridLayout(4, 1, 15, 15));
        panelButton.setBorder(BorderFactory.createEmptyBorder(40, 150, 40, 150));

        JButton btnPihak = new JButton("Data Pihak");
        JButton btnTransaksi = new JButton("Input Transaksi");
        JButton btnLaporan = new JButton("Laporan Keuangan");
        JButton btnKeluar = new JButton("Keluar");

        panelButton.add(btnPihak);
        panelButton.add(btnTransaksi);
        panelButton.add(btnLaporan);
        panelButton.add(btnKeluar);

        add(panelButton, BorderLayout.CENTER);

        btnPihak.addActionListener(e -> new PihakFrame().setVisible(true));
        btnTransaksi.addActionListener(e -> new TransaksiFrame().setVisible(true));
        btnLaporan.addActionListener(e -> new LaporanFrame(500000, 350000).setVisible(true));
        btnKeluar.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            User dummyUser = new User(1, "admin", "1234");
            new MainFrame(dummyUser).setVisible(true);
        });
    }
}
