import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PhanTu <T extends java.lang.Comparable<T>>{

    private ArrayList<T> arr = new ArrayList<T>();
    private T x;

    public void add(T x) {
        arr.add(x);
    }

    public boolean isGreaterThan(T a) {
        return (x.compareTo(a) > 0);
    }

    public void sort() {
        Collections.sort(arr);
    }

    public void print() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("src/output.txt", "UTF-8");
        for(int i = 0; i < arr.size(); ++i) {
            writer.print(arr.get(i) + " ");
        }
        writer.close();
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        File file = new File("src/input.txt");
        Scanner in = new Scanner(file);
        PhanTu<Integer> sol = new PhanTu();
        while(in.hasNext()) {
            Integer x = in.nextInt();
            sol.add(x);
        }
        sol.sort();
        sol.print();
        in.close();
    }
}