import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> letters = new ArrayList<String>();

        letters.add("A");
        letters.add("B");
        letters.add("C");
        System.out.println(letters);
        System.out.println(letters.size());
        letters.add(0, "D");
        System.out.println(letters);
        System.out.println(letters.size());
        letters.add(3, "E");
        System.out.println(letters);
        System.out.println(letters.size());
        letters.add(1, "F");
        letters.add(1, "G");
        letters.add(1, "H");
        System.out.println(letters);
        System.out.println(letters.size());
        System.out.println("-------------");
        letters.remove(2);
        System.out.println(letters);
        System.out.println(letters.size());
        letters.remove(3);
        System.out.println(letters);
        System.out.println(letters.size());
        letters.remove(0);
        letters.remove(1);
        System.out.println(letters);
        System.out.println(letters.size());
        System.out.println("-------------");

        ArrayList<Integer> numList = new ArrayList<Integer>();
        // numList empty: []

        numList.add(3);      //numList: [3]

        numList.add(0, 6);  //numList: [6, 3]

        numList.add(numList.size(), 7);
//numList: [6, 3, 7]
        numList.add(2, 8);
//numList: [6, 3, 8, 7]
        numList.set(3, 9);
//numList: [6, 3, 8, 9]
        numList.add(1, 2);
//numList: [6, 2, 3, 8, 9]
        numList.add(1, numList.size());
//numList: [6, 5, 2, 3, 8, 9]
        numList.remove(4);
//numList: [6, 5, 2, 3, 9]
        numList.set(numList.size() - 1, 0);
//numList: [6, 5, 2, 3, 0]
        System.out.println(numList);


    }
}
