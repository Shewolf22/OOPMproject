import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class delayp
{
	
public static void delayedPrint(int delay, String s) {
    try {
        for (char c : s.toCharArray()) {
            System.out.print(c);  
            Thread.sleep(delay);  
        }
    } catch (InterruptedException e) {
    }
    System.out.println(); 
}
public static void main(String[] args) throws Exception 
{
	String k;
	k="any string here...";
    delayedPrint(500,k);

   }
   }