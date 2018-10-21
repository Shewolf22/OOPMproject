import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class DisplayText {
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
    public static void clearScreen(){
        System.out.print("/f");
    }
    public static void glitch(){

        String k;
        clearScreen();
        k="any string here...";
        delayedPrint(500,k);
    }
    public static void glitch(String glitchText){
        String k;
        k="any string here...";
        clearScreen();
        delayedPrint(100,glitchText);
        clearScreen();
        delayedPrint(100,k);

    }

    public static void main(String[] args) throws Exception
    {
        String k;
        k="any string here...";
        delayedPrint(500,k);
        glitch();
        glitch("Screen clear kar do God");

    }
}
