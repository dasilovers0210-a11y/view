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

public class LaporanFrame extends JFrame {
    public LaporanFrame(double totalHutang, double totalPiutang) {
        setTitle("Laporan Keuangan");
        setSize(400, 200);
        setLayout(new GridLayout(3, 1));
        setLocationRelativeTo(null);

        double saldo = totalPiutang - totalHutang;

        add(new JLabel("Total Hutang: Rp " + totalHutang, JLabel.CENTER));
        add(new JLabel("Total Piutang: Rp " + totalPiutang, JLabel.CENTER));
        add(new JLabel("Saldo Bersih: Rp " + saldo, JLabel.CENTER));
    }
}
