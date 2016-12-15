import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

public class MyTest3 {

    static boolean isRunning(String name) throws IOException {
        Runtime rt = Runtime.getRuntime();
        Process pr = rt.exec("jps -l");
        BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line=null;
        int running  = 0;
        while((line=input.readLine()) != null) {
            if(line.contains(name)) {
                running++;
            }
        }
        if(running>1) {
            return true;
        }else {
            return  false;
        }
    }

    public static void main(String arg[]) throws IOException {
        //For Class Name we can use System.getProperty("sun.java.command")
        if(!isRunning("MyTest3")){
            for (int i = 0; i < 1000; i++) {
                System.out.println("Date:" + new Date() + ":" + i);
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }else{
            System.out.println("Same process is already running");
        }


    }
}
