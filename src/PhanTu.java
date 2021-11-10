import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Tc implements Comparable {
    int x;

    public Tc() {
        
    }

    /**
     * Construction.
     * @param x Integer
     */
    public Tc(int x) {
        this.x = x;
    }

    public int Getx() {
        return x;
    }

    public boolean isGreaterThan(Tc a) {
        return x > a.Getx();
    }

    public boolean isSmallerThan(Tc a) {
        return x < a.Getx();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Tc) {
            if(isGreaterThan((Tc) o)) {
                return 1;
            } else if(isSmallerThan((Tc) o)) {
                return -1;
            }
            return 0;
        }
        return 0;
    }
}

public class PhanTu implements java.lang.Comparable<T>{

    public ArrayList<T> arr;

    public void add(T x) {
        arr.add(x);
    }

    public void sort() {
        Collections.sort(arr);
    }

    public void print() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
        for(int i = 0; i < arr.size(); ++i) {
            writer.print(arr.get(i) + " ");
        }
        writer.close();
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        File file = new File("input.txt");
        
        Scanner in = new Scanner(file);
        PhanTu sol = new PhanTu();
        while(in.hasNext()) {
            int x = in.nextInt();
            Tc neww = new Tc(x);
            sol.add(x);
        }
        sol.sort();
        sol.print();
        in.close();
    }

    @Override
    public int compareTo(T o) {
        // TODO Auto-generated method stub
        return 0;
    }
}