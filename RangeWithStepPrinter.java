public class RangeWithStepPrinter {

    public static void main(String[] args) {

        int first = 8;
        int last = 1;
        int step = -2;
        if (first < last && step < 0) {
            System.out.println("IllegalArgumentException");
        } else if (first > last && step > 0) {
            System.out.println("IllegalArgumentException");
        } else if (first < last && step > 0) {
            System.out.println(" " + step);
        }else
            for (int i = first; i>=last; i+=step){
                System.out.println(" " +i);
            }

    }
}
