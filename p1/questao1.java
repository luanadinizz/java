import java.util.Scanner;
class exercicio1{
  private static Scanner teclado = new Scanner(System.in);
 
public static void main( String[] args){
      int t1, t2, t3;
      System.out.print("Informe o valor 1 =");
      t1 = teclado. nextInt();
      System.out.print("Informe o valor 2 =");
      t2 = teclado.nextInt();
      System.out.print("Informe o valor 3 =");
      t3= teclado.nextInt();
      float v1= (float)t1;
      float v2= (float) t2;
      float v3= (float) t3;
      float vm = 0;
      if (v2 > vm){
          vm=v2;
      }
      if (v3>vm){
          vm=v3;
      }
      System.out.println("valor="+vm);
  }
}
 
