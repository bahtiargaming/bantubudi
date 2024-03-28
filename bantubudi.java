package yussemester2;

import javax.swing.JOptionPane;

public class bantubudi {
    
    public static double luasPersegiPanjang(double panjang, double lebar) {
        return panjang * lebar;
    }
    public static double luasSegitiga(double alas, double tinggi) {
        return 
        
    0.5 * alas * tinggi;
    }
    public static double luaslingkaran(double jarijari) {
        return Math.PI * Math.pow(jarijari, 2);
        
    }
    public static void main(String[] args) {
        double panjangPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan Panjang persegi Panjang:"));
        double lebarPersegiPanjang = Double.parseDouble(JOptionPane.showInputDialog("Masukkan lebar persegi Panjang:"));
        double luasPersegiPanjang = luasPersegiPanjang( panjangPersegiPanjang,lebarPersegiPanjang );
        String luasPergesiPanjang = null;
        JOptionPane.showMessageDialog(null,"luas persegi Panjang: " + luasPergesiPanjang);
        System.out.println("luas persegi panjang: " + luasPersegiPanjang);
        
        double alasSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan alas segitiga :"));
        double tinggiSegitiga = Double.parseDouble(JOptionPane.showInputDialog("Masukkan tinggi seegitiga :"));
        double luasSegitiga = luasSegitiga (alasSegitiga , tinggiSegitiga);
        JOptionPane.showMessageDialog(null,"luasSegitiga: " + luasSegitiga);
        System.out.println("luasSegitiga: " + luasSegitiga);
        
        double jariJariLingkaran = Double.parseDouble(JOptionPane.showInputDialog("Masukkan jari jari lingkaran :"));
        double luasLingkaran  = luasLingkaran(jariJariLingkaran);
        JOptionPane.showMessageDialog(null,"luas lingkaran: " + luasLingkaran);
        System.out.println("luas lingkaran: " + luasLingkaran);
        
        
    }

    private static double luasLingkaran(double jariJariLingkaran) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

       
}   
    
      
    
    

