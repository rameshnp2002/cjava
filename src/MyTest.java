/**
 * Created by Ramesh on 15-12-2016
 *
 
 *
 1*2 => 1
 1*3 => 1
 z = x*2 = y*3
 1 	    2		3		6
 2  	8		4		64
 3 	    27 		9		729
 4 	    64		16		4096
 5 	    125		25		15,625


 */
public class MyTest {

    public static void main(String arg[]) {
       int c=0;
        for(double i=2; i<=5; i++){
            c++;
            double x = Math.pow(i,3);
            double y =  Math.pow(i,3);
            double z =  Math.pow(i,6);
            System.out.println("x:"+Math.pow(i,3) +"   y:"+x/i +"    z:"+z+  "   c:"+c);
        }
    }
}
