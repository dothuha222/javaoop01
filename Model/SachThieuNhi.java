/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author DELL
 */
public class SachThieuNhi extends Sach{
    private int doTuoi;

    public SachThieuNhi() {
    }

    public SachThieuNhi(int doTuoi) {
        this.doTuoi = doTuoi;
    }

    public SachThieuNhi(int doTuoi, String NSX, String id, String tacgia, float gia, int soTrang) {
        super(NSX, id, tacgia, gia, soTrang);
        this.doTuoi = doTuoi;
    }

    

    public int getDoTuoi() {
        return doTuoi;
    }

    public void setDoTuoi(int doTuoi) {
        this.doTuoi = doTuoi;
    }
    
}
