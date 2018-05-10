public class SinglTils2 {

    public static void main(String[] args){
        String ch,ch2 = "";
        int p = 55;//число которое будем вставлять
        int index = 0;// индекс куда будем вставлять
        int index2 = 3;//индекс откуда будем удалять
        int index3 = 2;//индекс откуда будем удалять
        ch = " " + p+ " ";
        ch2 =" " + index+ " ";

        Node tail = generate(5);
        System.out.println("Исходный список: "+ toStringIter(tail));
        System.out.println( "Добавляем число"+ch+" в начало:  " + Add(tail, p));
        System.out.println( "Добавляем число"+ch+" на "+index+" место:  " +Add2(tail,p,index));
        System.out.println( "Удаляем с "+index2+" места:  " +Remov(tail,index2));
        System.out.println( "Заменяем  "+index3+" место на число "+p+":  " +Remov2(tail,p,index3));
    }

    public static Node generate(int max){ //создаем список
        Node tail = null;
        for (int k = 0; k < max; k++) {
            tail = new Node(k, tail);
        }
        return tail;
    }

    public static String Add(Node ref,int p) {
        String result = "";

        while (ref != null) {
            result += "(" + ref.value + ")->";
            ref = ref.next;
        }
        ref = new Node(p, ref);
        result += "(" + ref.value + ")->";
        result += "null";
        return result;

    }

    public static String Add2(Node ref,int p,int i) {
        String result = "";
        int r=0;
        while (ref != null) {
            if(r==i){
                ref = new Node(p, ref);
                result += "(" + ref.value + ")->";
                ref = ref.next;
            }

            result += "(" + ref.value + ")->";
            ref = ref.next;
            r++;
        }
        result += "null";
        return result;


    }

    public static String Remov(Node ref,int p) {
        String result = "";
        int r=0;
        while (ref != null) {
            if(r==p){
                ref = ref.next;
            }

            result += "(" + ref.value + ")->";
            ref = ref.next;
            r++;
        }

        result += "null";
        return result;
    }

    public static String Remov2(Node ref,int p,int i) {
        String result = "";
        int r=0;
        while (ref != null) {
            if(r==i){
                ref = ref.next;
                ref = new Node(p, ref);
                result += "(" + ref.value + ")->";
                ref = ref.next;
            }

            result += "(" + ref.value + ")->";
            ref = ref.next;
            r++;
        }

        result += "null";
        return result;
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
}
