public class MakeArrays{
    public static ComparableInt[] makeRandom(int n){
        ComparableInt[] ar = new ComparableInt[n];
        for(int i = 0; i<n; i++){
            ComparableInt a = new ComparableInt((int)(Math.random()*n));
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
    //Býr til array af öfugt röðuðum tvenndum sem eru raðaðar innbyrðis.
    public static ComparableInt[] makeInternal(int n){
        ComparableInt[] ar = new ComparableInt[2*n];
        for(int i = 0; i<2*n; i++){
            ar[i] = new ComparableInt((2*n-1-i)/2, i%2);
            };
        return ar;
    }
}