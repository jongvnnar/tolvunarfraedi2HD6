public class ComparableInt implements Comparable<ComparableInt>{
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