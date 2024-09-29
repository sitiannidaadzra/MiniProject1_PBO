/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class RuangKelas {
    private String nomorRuang;
    private int kapasitas;

    // Constructor
    public RuangKelas(String nomorRuang, int kapasitas) {
        this.nomorRuang = nomorRuang;
        this.kapasitas = kapasitas;
    }

    // Getter untuk nomorRuang
    public String getNomorRuang() {
        return nomorRuang;
    }

    // Setter untuk nomorRuang
    public void setNomorRuang(String nomorRuang) {
        this.nomorRuang = nomorRuang;
    }

    // Getter untuk kapasitas
    public int getKapasitas() {
        return kapasitas;
    }

    // Setter untuk kapasitas
    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    // Override toString
    @Override
    public String toString() {
        return "RuangKelas{" +
                "nomorRuang='" + nomorRuang + '\'' +
                ", kapasitas=" + kapasitas +
                '}';
    }
}
