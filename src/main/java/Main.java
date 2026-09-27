
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      int d;
      
      d = scanner.nextInt();
      
      if(d <= 800){
          System.out.println("1");
      }else{
          if(d > 800 && d <= 1400){
              System.out.println("2");
          }else{
              if(d > 1400 && d <= 2000){
                  System.out.println("3");
              }
          }
      }
        
        
        
        
        
    }
}
