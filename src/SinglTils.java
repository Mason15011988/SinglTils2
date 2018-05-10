public class SinglTils {
    public static void main(String[] args) {

     Node tail = generate(8);


        System.out.println(toStringIter(tail));
        System.out.println("lenght = "+ Lenght(tail));
        System.out.println("Summa = "+ Sum(tail));
        System.out.println("Max = "+ Max(tail));



    }
    public static Node generate(int max){
        Node tail = null;
        for (int k = 0; k < max; k++) {
            tail = new Node(k, tail);
        }
        return tail;
    }

    public static String toStringIter(Node ref) {
        String result = "";
        while (ref != null) {
            result += "(" + ref.value + ")->";
            ref = ref.next;
        }
        result += "null";
        return result;
    }

    public static int Lenght(Node tail) {
        Node ref = tail;
        int k = 0;// вывод
        while (ref != null) {
            k++;
            ref = ref.next;
        }
        return k;
    }


    public static int Sum(Node tail) {
        Node ref = tail;
        int summa = 0;// вывод
        while (ref != null) {
            summa=summa+ref.value;
            ref = ref.next;
        }
        return summa;
    }

    public static int Max(Node tail) {
        Node ref = tail;
        int max = 0;// вывод
        while (ref != null) {
           if (max<ref.value){
               max=ref.value;
           }
            ref = ref.next;
        }
        return max;
    }
}


