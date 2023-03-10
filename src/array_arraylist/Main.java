package array_arraylist;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // Main main = new Main();
        // main.run();
        new Main().run();
    }

    private void run() throws IOException {
        int[] mas = new int[100];
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        mas = readFromFileToArray("list1.txt");
        list1 = readFromFileToList("list1.txt");
        list2 = readFromFileToList("list2.txt");
        list2.add(list1.get(0));
        list2.add(0, list1.get(list1.size() - 1));
        List<Integer> list3 = new ArrayList<>(list2);
        list3.addAll(list1);
    //    System.out.println(Arrays.toString(mas));
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);
       // list.add(3, 555.0);
       // list.get(5);
       // list.addAll(list);
      //  list.remove(1);
       // list.clear();
      //  list.contains(2.0);
      //  list.indexOf(2.0);
      //  list.lastIndexOf(2.0);
        //list.sort();
    }

    private List<Integer> readFromFileToList(String filename) throws IOException {
        BufferedReader bf = new BufferedReader(
                new FileReader((filename))
        );
        String[] split = bf.readLine().split(" ");
        List<Integer> tmp = new ArrayList<>();
        for (String s : split) {
           tmp.add(Integer.valueOf(s));
        }
        return tmp;
    }

    private int[] readFromFileToArray(String filename) throws IOException {
        BufferedReader bf = new BufferedReader(
                new FileReader((filename))
        );
        String[] split = bf.readLine().split(" ");
        int[] tmp = new int[split.length];
        // System.out.println("Length " + tmp.length);
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = Integer.parseInt(split[i]);
        }
        return tmp;
    }
}
