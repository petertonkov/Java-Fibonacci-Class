package com.company;
import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                int i=0;
                while (i<2)
                //I created free input as an addition to the main expected program functionality.
                {
                        System.out.print("Enter the next Fibonacci numeral for calculation: ");
                        Scanner sc = new Scanner(System.in);
                    int n = sc.nextInt();
                    var F = new Fibonacci(n);
                    if(n!=0){
                                F.iteration();
                                System.out.println(F);
                        }
                        else{
                                System.out.println("Input 0 is not possible.");
                        }
                        i++;
                }
                var f_1 = new Fibonacci(100);
                var f_2= new Fibonacci(102);
                var f_3= new Fibonacci(109);
                System.out.println(f_1);
                System.out.println(f_2);
                System.out.println(f_3);
                f_1.iteration();
                System.out.println(f_1);
                System.out.println(f_2);
                System.out.println(f_3);
                f_3.iteration();
                System.out.println(f_1);
                System.out.println(f_2);
                System.out.println(f_3);
        }
}

