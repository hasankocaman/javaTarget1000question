package interview;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		/*
		  Soru 3 Write a Java Program to swap two numbers
		             
		         Swap (takas) islemini --> a=3, b=5 iken  a=5, b=3 degerlerini alması islemidir.
		         iki yoldan yaptiginiz java kodunu yaziniz.
		         1.Yol: 3. degisken kullanarak
		         2.Yol: 3. degisken kullanmadan
		    */
		//1.yol
		Scanner scan=new Scanner(System.in);
		System.out.println("iki sayi giriniz ilkini girince entera basiniz");
		int a=scan.nextInt();
		int b=scan.nextInt();
		System.out.println("baslangicta a : " + a + "\nb : " + b);
		int bos=a;
		a=b;
		b=bos;
		System.out.println("=============");
		System.out.println("1.yoldan sonra a : " + a + "\nb : " + b);
		//2.yol
		System.out.println("====2.yol ====");		
		System.out.println("iki sayi giriniz ilkini girince entera basiniz");
		int x=scan.nextInt();
		int y=scan.nextInt();
		System.out.println("baslangicta x : " + x + "\ny : " + y);
		
		System.out.println("x yeni degeri " +( x+y-x));
System.out.println("y yeni degeri " +( (x+y)+(x-y)-x));
	}

}
