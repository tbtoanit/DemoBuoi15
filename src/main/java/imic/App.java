package imic;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap so bi chia");
        int x = sc.nextInt();
        System.out.println("Vui long nhap so chia");
        int y = sc.nextInt();
        Integer[] i = new Integer[2];
        i[0] = 1;
        i[1] = 2;

        try{
            double ketQua = x/y;
            System.out.println("Ket qua = " + ketQua);
            System.out.println("Gia tri phan tu thu 3 la: " + i[2]);

        }catch (ArithmeticException e){
            System.out.println("Loi vi chia cho khong");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Ban dang truy cap phan tu khong co trong danh sach");
        } finally {
            System.out.println("Chay du co chuyen gi xay ra!!!");
        }
        //System.out.println("Successfully!");

    }
}
