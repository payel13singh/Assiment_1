package Assiment1;

import java.util.Scanner;

public class Find_gretest3_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println( "enter three number");
         int a, b,c;

               a=sc.nextInt();
                  b=sc.nextInt();
                 c=sc.nextInt();
                 if(a>b) {
                     System.out.print("large number:" + a);
                 }
                 else if(b>c){
                         System.out.print( "large number" +b);
                     }
                 else{
                      System.out.print( "large number:" +c);
                     }
           }
    }


