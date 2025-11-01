/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hutangpiutang.view;

/**
 *
 * @author ASUS
 */
import javax.swing.*;
import java.awt.*;

public class TransaksiFrame extends JFrame {
    public TransaksiFrame() {
        setTitle("Input Transaksi Hutang / Piutang");
        setSize(450, 350);
        setLayout(new GridLayout(6, 2, 5, 5));
        setLocationRelativeTo(null);

        add(new JLabel("Tanggal Transaksi:"));
        JTextField tfTanggal = new JTextField();
        add(tfTanggal);

        add(new JLabel("Jumlah Uang:"));
        JTextField tfJumlah = new JTextField();
        add(tfJumlah);

        add(new JLabel("Tenggat Waktu:"));
        JTextField tfTenggat = new JTextField();
        add(tfTenggat);

        add(new JLabel("Status Pembayaran:"));
        JComboBox<String> cbStatus = new JComboBox<>(new String[]{"Belum Lunas", "Lunas"});
        add(cbStatus);

        add(new JLabel("Jenis:"));
        JComboBox<String> cbJenis = new JComboBox<>(new String[]{"Hutang", "Piutang"});
        add(cbJenis);

        JButton btnSimpan = new JButton("Simpan");
        add(new JLabel(""));
        add(btnSimpan);
    }
}
