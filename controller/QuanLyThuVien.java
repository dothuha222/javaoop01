/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Model.Sach;
import Model.SachThieuNhi;
import Model.Truyen;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class QuanLyThuVien implements ChucNang{
    List<Sach> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Sach nhapSach(){
        Sach s = new Sach();
        String nsx = sc.nextLine();
        s.setNSX(nsx);
        String id = sc.nextLine();
        s.setId(id);
        int sotrang = Integer.parseInt(sc.nextLine());
        s.setSoTrang(sotrang);
        String tacgia = sc.nextLine();
        s.setTacgia(tacgia);
        float gia = Float.parseFloat(sc.nextLine());
        s.setGia(gia);
        return s;
    }
    @Override
    public void nhapSachThieuNhi() {
        Sach s = nhapSach();
        int doTuoi = Integer.parseInt(sc.nextLine());
        SachThieuNhi stn = new SachThieuNhi(doTuoi, s.getNSX(), s.getId(), s.getTacgia(), s.getGia(), s.getSoTrang());
        list.add(stn);
    }

    @Override
    public void nhapTruyen() {
        Sach s = nhapSach();
        String type = sc.nextLine();
        Truyen truyen = new Truyen(type, s.getNSX(), s.getId(), s.getTacgia(),s.getGia(), s.getSoTrang());
        list.add(truyen);
    }

    @Override
    public void inDanhSach() {
        System.out.println("Toàn bộ Sách Thiếu Nhi:");
        for(Sach i: list){
            if(i instanceof SachThieuNhi){
                System.out.println(i.toString());
            }
            else{
                System.out.println(i.toString());
            }
        }
    }

//    @Override
//    public float tongGiaTien() {
//    }
//
//    @Override
//    public void sapxepSachTheoDoTuoi() {
//    }

    
}
