import java.util.Arrays;

public class arrayInitialize {

    public static void main(String[] args){
       /* int a[]= new int[] {1,2};
        for(int i=0;i<a.length;i++)
        System.out.println("a["+i+"]:"+a[i]);
       int a[]=new int[3];
        Arrays.fill(a,3);
        for(int i=0;i<a.length;i++)
            System.out.println("a["+i+"]:"+a[i]);*/
       int a[]=new int[3];
       for (int i=0;i< a.length;i++) {
           a[i] = i + 1;
           System.out.println("a[" + i + "]:" + a[i]);
           //a[i]=i+1;
       }
    }
}
