/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub1;
import java.util.*;

/**
 *
 * @author marti
 */
public class Practicagithub1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner (System.in);
        int x=11;
        x = Validacion(x, sc);
        int Numeros[]=new int[x];
        int y =0;
        for(int i=0;i<Numeros.length;i++){
            System.out.println("Pon un numero:");
            int num = sc.nextInt();
            for(y=1;y<Numeros.length-1;y++){
            do{
                if(num == Numeros[y]){
                    System.out.println("Esta mál");
                    num=sc.nextInt();
                    y=y-1;
                }
            }while(num==Numeros[y]);
           
            }
             Numeros[i]=num;
        }
        Arrays.sort(Numeros);
        for(int i=0;i<Numeros.length;i++){
            System.out.println(+Numeros[i]);
        }
    }

    public static int Validacion(int x, Scanner sc) {
        do{System.out.println("¿Cuántos numeros quieres?:");
        x=sc.nextInt();
        }
        while(x>10 || x<=0);
        return x;
    }
}
