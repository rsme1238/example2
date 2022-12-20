
package example2;

import java.util.Scanner;


public class Example2 {

    public static void main(String[] args) {
       
        
         Scanner input = new Scanner(System.in);
          System.out.println("lutfen bir eleman sayisi giriniz: ");
          int n = input.nextInt();
          
          int []a = new int [n];
         
        for(int i=0 ; i< a.length; i++){
        
          System.out.println("a dizisi icin" +(i+1)+"inci sayi");
          a[i]= input.nextInt();
          
        }
        
        double t=0;
        double c=1;
        double harmonikToplam=0;
        double karelerToplami=0;
        
          for(int i=0 ; i< a.length; i++){
          
              t+= a[i];
              c*=a[i];
              harmonikToplam=1/a[i];
              karelerToplami+=Math.pow(a[i], 2);
          }
          
           double ao=t/n;
           double go=Math.pow(c, (1/n));
           double ho=n /harmonikToplam;
           double kho=karelerToplami/t;
           
           System.out.println( "Aritmetik ortalama:  "+ ao );
          System.out.println( "Geometrik ortalama:  "+ go );
          System.out.println( "Harmonik ortalama: "+ ho );
          System.out.println( "Kontraharmontik ortalama: "+ kho);
    }
    
}
