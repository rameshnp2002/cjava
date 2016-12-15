/**
 * Created by Ramesh on 15-12-2016
 *
 *
 *
 1*2 => 1
 1*3 => 1
 z = x*2 = y*3
 1000 = 10

 z:64   y:4   x:8 c:115981
 z:729   y:9   x:27 c:1421693

 */
public class MyTest2 {
    public static void main(String arg[]) {
        int c=0;
        for(int z =2; z<=20000; z++){
            c++;
            int i = 2;
            int x =0;
            for (i=2; i<=20000; i++){
                c++;
                x = i * i;
                if(x==z) break;
            }
            int j= 0;
            int y =0;
            for (j=2; j<=20000; j++){
                c++;
                y = j * j * j;
                if(y==z) break;
            }
            if(z == x && y==z){
                System.out.println("z:"+z +"   y:"+j + "   x:"+i + " c:"+c);

            }
        }
    }
}
