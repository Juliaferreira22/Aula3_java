import java.util.Scanner;

public class exe1 {

    static int  maior ( int x, int y) {
        if(x > y) {
            return x;
        }

        return y; 
    }

    public static void main(String[] args) {

        int a;
        int b; 

        Scanner comp = new Scanner (System.in);

        System.out.println("Digite um número");

        a = comp.nextInt(); 

        System.out.println("Digite um número:");

        b = comp.nextInt(); 

        System.out.println(maior(a,b));

        


        }

        

    

        
        
        

        
         



    }
    

