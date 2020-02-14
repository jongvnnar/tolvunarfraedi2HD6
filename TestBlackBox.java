import edu.princeton.cs.algs4.*;
public class TestBlackBox{
    public static class ComparableInt implements Comparable<ComparableInt>{
        public int i;
        public int internal;
        public ComparableInt(int i){
            this.i = i;
        }
        public ComparableInt(int i, int internal){
            this.i = i;
            this.internal = internal;
        }
        @Override
        public int compareTo(ComparableInt that){
            return this.i-that.i;
        }
    }
    public static ComparableInt[] makeRandom(int n){
        ComparableInt[] ar = new ComparableInt[n];
        for(int i = 0; i<n; i++){
            ComparableInt a = new ComparableInt((int)Math.random()*n);
            ar[i] = a;
        }  
        return ar;
    }
    public static ComparableInt[] makeSorted(int n){
        ComparableInt[] ar = new ComparableInt[n];
        for(int i = 0; i<n; i++){
            ar[i] = new ComparableInt(i);
        }
        return ar;
    }
    public static ComparableInt[] makeInternal(int n){
        ComparableInt[] ar = new ComparableInt[2*n];
        for(int i = 0; i<2*n; i+=2){
            ar[i] = new ComparableInt(i/2, i%2);
            };
        return ar;
    }
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
            ComparableInt[] ar = makeRandom(n);
            Stopwatch timer = new Stopwatch();
            sort(a, ar);
            double time = timer.elapsedTime();
            System.out.println(time);
        }
    }
}