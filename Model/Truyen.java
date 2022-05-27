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
public class Truyen extends Sach{
    private String type;

    public Truyen() {
    }

    public Truyen(String type) {
        this.type = type;
    }

    public Truyen(String type, String NSX, String id, String tacgia, float gia, int soTrang) {
        super(NSX, id, tacgia, gia, soTrang);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
