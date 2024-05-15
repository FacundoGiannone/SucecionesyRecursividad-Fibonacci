import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número de términos de la sucesión que desea generar:");
        int t = scanner.nextInt();
        List<Integer> sucesionDI=new ArrayList<>();
        funcion(t,sucesionDI);

        System.out.println(sucesionDI);



    }

    public static void funcion(int t,List<Integer> sucesionDI) {
        int x1=0;
        int x2=1;
        int x3=0;
        if (t==1){
            sucesionDI.add(0);
        } else if (t==2) {
            sucesionDI.add(0);
            sucesionDI.add(1);
        }else if (t>2) {
            sucesionDI.add(0);
            sucesionDI.add(1);
            funcionR(t,x1,x2,x3, sucesionDI);
            }
    }

    public static void funcionR(int t,int x1, int x2,int x3,List<Integer> sucesionDI) {

        if (t>2){
            x3=x1+x2;
            sucesionDI.add(x3);
            x1=x2;
            x2=x3;
            t=t-1;
            funcionR(t,x1,x2,x3, sucesionDI);
        }


    }
}

