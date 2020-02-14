import edu.princeton.cs.algs4.*;
public class TestBlackBox{
    public static boolean checkInternal(ComparableInt[] a){
        for(int i = 0; i<a.length; i+=2){
            if(a[i].internal > a[i+1].internal) return false;
        }
        return true;
    }
    public static void sort(String s, ComparableInt[] ar){
        if(s.equals("sort1")) BlackBoxSort.sort1(ar);
        if(s.equals("sort2")) BlackBoxSort.sort2(ar);
        if(s.equals("sort3")) BlackBoxSort.sort3(ar);
        if(s.equals("sort4")) BlackBoxSort.sort4(ar);
        if(s.equals("sort5")) BlackBoxSort.sort5(ar);
        if(s.equals("sort6")) BlackBoxSort.sort6(ar);
        return;
    }
    public static void main(String[] args){
        String a = args[0];
        System.out.println(a);
        for(int n = 3200; n<12800000; n *= 2){
            ComparableInt[] ar = MakeArrays.makeRandom(n);
            Stopwatch timer = new Stopwatch();
            sort(a, ar);
            double time = timer.elapsedTime();
            System.out.println(time);
        }
    }
}