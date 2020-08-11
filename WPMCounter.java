package wpmcounter;

import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author SamyB
 */

public class WPMCounter {

    static String[] words = {"envelope", "cantelope", "the", "hello", "microphone", "elephant", "biscuit", "hammer", "went", "cap"};

    public static void main(String[] args) throws InterruptedException {

        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.print(words[r.nextInt(9)] + " ");
        }

        System.out.println();

        double beginning = LocalTime.now().toNanoOfDay();

        Scanner sc = new Scanner(System.in);
        String words = sc.nextLine();

        double ending = LocalTime.now().toNanoOfDay();
        double timeElapsed = ending - beginning;
        double secs = timeElapsed / 1000000000.0;
        System.out.println(secs + " seconds");
        int totalChars = words.length();

        // (x characters / 5) / 1min = y WPM --> Formula for WPM
        
        int wpm = (int) ((((double) totalChars / 5) / secs) * 60);

        System.out.println("WPM: " + wpm);

    }

}
