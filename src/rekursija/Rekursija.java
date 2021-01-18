/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rekursija;


public class Rekursija {
    
    public static int fakt(int sk) {
        if (sk < 0) {
            return -1;
        }
        if (sk == 0) {
            return 1;
        }
        return sk * fakt(sk - 1);
    }
    
    public static void fib(int sk1, int sk2, int max) {
        for(int i = 0; i < max; i++) {
            int sum = sk1 + sk2;
            System.out.println(sum);
            sk1 = sk2;
            sk2 = sum;
            if((sk1 + sk2) > max) {
               break;
            }
        }
    }

    public static void main(String[] args) {
        int sk = 4;
        int f = 1;
        for (int i = sk; i >= 1; i--) {
            f *= i;
        }
        System.out.println("Faktorial:");
        System.out.println(f);
        System.out.println("-------------");
        /*
        4! = 4 * 3 *2 * 1; faktorialas
        
        0! = 1;
        
        */
        
         fib(1, 1, 20);
        /*
        1
        1
        3
        5
        8
        13
        */
    }
    
}
