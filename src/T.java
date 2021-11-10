public class T {
    int x;

    public T() {
        
    }

    /**
     * Construction.
     * @param x Integer
     */
    public T(int x) {
        this.x = x;
    }

    public int Getx() {
        return x;
    }

    public boolean isGreaterThan(T a) {
        return x > a.Getx();
    }
}
