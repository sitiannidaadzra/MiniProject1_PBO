/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.RuangKelas;
import java.util.ArrayList;

public class RuangKelasService {
    private static final ArrayList<RuangKelas> daftarRuangKelas = new ArrayList<>();

    // Constructor untuk menginisialisasi daftar ruang kelas
    public RuangKelasService() {
        // Menambahkan beberapa ruang kelas awal
        daftarRuangKelas.add(new RuangKelas("C302", 30));
        daftarRuangKelas.add(new RuangKelas("C303", 30));
        daftarRuangKelas.add(new RuangKelas("C304", 30));
        daftarRuangKelas.add(new RuangKelas("C305", 30));
        daftarRuangKelas.add(new RuangKelas("C402", 40));
        daftarRuangKelas.add(new RuangKelas("C403", 40));
        daftarRuangKelas.add(new RuangKelas("C404", 40));
        daftarRuangKelas.add(new RuangKelas("C405", 40));
    }

    // Metode untuk menambahkan ruang kelas
    public void tambahRuangKelas(RuangKelas ruangKelas) {
        daftarRuangKelas.add(ruangKelas);
        System.out.println("Ruang kelas ditambahkan: " + ruangKelas.getNomorRuang());
    }

    // Metode untuk menampilkan semua nomor ruang kelas dan kapasitasnya dengan nomor urut
    public void tampilkanRuangKelas() {
        System.out.println("Daftar Ruang Kelas:");
        int i = 1;
        for (RuangKelas ruang : daftarRuangKelas) {
            System.out.println(i + ". Ruang: " + ruang.getNomorRuang() + ", Kapasitas: " + ruang.getKapasitas());
            i++;
        }
    }

    // Metode untuk menghapus ruang kelas berdasarkan nomor ruang
    public void hapusRuangKelas(String nomorRuang) {
        for (RuangKelas ruang : daftarRuangKelas) {
            if (ruang.getNomorRuang().equals(nomorRuang)) {
                daftarRuangKelas.remove(ruang);
                System.out.println("Ruang kelas dihapus: " + ruang.getNomorRuang());
                return;
            }
        }
        System.out.println("Ruang kelas tidak ditemukan!");
    }

    // Metode untuk meng-update ruang kelas berdasarkan nomor ruang
    public void updateRuangKelas(String nomorRuang, int kapasitasBaru) {
        for (RuangKelas ruang : daftarRuangKelas) {
            if (ruang.getNomorRuang().equals(nomorRuang)) {
                ruang.setKapasitas(kapasitasBaru);
                System.out.println("Kapasitas ruang " + nomorRuang + " telah diperbarui menjadi: " + kapasitasBaru);
                return;
            }
        }
        System.out.println("Ruang kelas tidak ditemukan!");
    }
}
