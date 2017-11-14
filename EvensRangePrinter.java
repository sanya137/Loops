public class EvensRangePrinter {

    public static void main(String[] args) {

        int first = 17;
        int last = 9;

        if (first<last){
            for (int i = first; i<=last; i++){
                if (i%2==0){
                    System.out.println(i);
                }else if (first>last){
                    System.out.println(" ");
                }
            }
        }
    }
}
