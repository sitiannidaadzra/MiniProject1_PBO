/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import model.RuangKelas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RuangKelasService ruangKelasService = new RuangKelasService();
        try (Scanner scanner = new Scanner(System.in)) {
            int pilihan;
            
            do {
                // Menu utama CRUD
                System.out.println("Menu:");
                System.out.println("1. Tambah Ruang Kelas");
                System.out.println("2. Tampilkan Ruang Kelas");
                System.out.println("3. Update Ruang Kelas");
                System.out.println("4. Hapus Ruang Kelas");
                System.out.println("5. Keluar");
                System.out.print("Pilih opsi: ");
                pilihan = scanner.nextInt();
                scanner.nextLine();  // Membersihkan buffer
                
                switch (pilihan) {
                    case 1 -> {
                        System.out.print("Masukkan nomor ruang: ");
                        String nomorRuang = scanner.nextLine();
                        System.out.print("Masukkan kapasitas: ");
                        int kapasitas = scanner.nextInt();
                        ruangKelasService.tambahRuangKelas(new RuangKelas(nomorRuang, kapasitas));
                        System.out.println("Kelas baru berhasil ditambahkan.");
                    }
                    case 2 -> ruangKelasService.tampilkanRuangKelas();
                    case 3 -> {
                        System.out.print("Masukkan nomor ruang yang akan di-update: ");
                        String nomorRuang = scanner.nextLine();
                        System.out.print("Masukkan kapasitas baru: ");
                        int kapasitasBaru = scanner.nextInt();
                        ruangKelasService.updateRuangKelas(nomorRuang, kapasitasBaru);
                        System.out.println("Ruang kelas berhasil di-update.");
                    }
                    case 4 -> {
                        System.out.print("Masukkan nomor ruang yang akan dihapus: ");
                        String nomorUntukDihapus = scanner.nextLine();
                        ruangKelasService.hapusRuangKelas(nomorUntukDihapus);
                        System.out.println("Ruang kelas berhasil dihapus.");
                    }
                    case 5 -> System.out.println("Keluar dari program.");
                    default -> System.out.println("Pilihan tidak valid.");
                }
            } while (pilihan != 5);
        }
    }
}
