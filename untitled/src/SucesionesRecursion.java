import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SucesionesRecursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer elemento de la sucesión:");
        float a = scanner.nextFloat();
        System.out.println("Ingrese la posición que ocupará dentro de la sucesión:");
        int x1 = scanner.nextInt();
        System.out.println("Ingrese el segundo elemento de la sucesión:");
        float b = scanner.nextInt();
        System.out.println("Ingrese la posición que ocupará dentro de la sucesión:");
        int x2 = scanner.nextInt();
        System.out.println("Ingrese el número de términos de la sucesión que desea generar:");
        int t = scanner.nextInt();

        float d1=b-a;
        float d2=x2-x1;
        float d=d1/d2;
        float n=x1;
        float n1=a;
        float term;
        List<Float> sucesionDI=new ArrayList<>();
        List<Float> sucesionID=new ArrayList<>();
        funcionRecursiva(n,n1,d,t,sucesionID,sucesionDI);

    }

    public static void funcionRecursiva(float n, float n1, float d, int t, List<Float> sucesionID,List<Float> sucesionDI) {
        float term;
        float term2;
        n1=n1-d;
        n--;
        if (n > 1) {
            funcionRecursiva(n,n1,d,t,sucesionID,sucesionDI);

        }
        else{
            for (int i=1; i<t+1; i++){
                term=n1+(i-1)*d;
                //System.out.println(term);
                sucesionID.add(term);
            }
            System.out.println(sucesionID);
            for (int i2=t; i2>0; i2--){
                term2=n1+(i2-1)*d;
                //System.out.println(term2);
                sucesionDI.add(term2);
            }
            System.out.println(sucesionDI);
        }


    }


}
