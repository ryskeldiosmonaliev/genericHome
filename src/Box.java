public class Box<T> {
    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                '}';
    }

    public Box(T t) {
        this.t = t;
    }

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static <T> T generic(T t){

        return t;
    }
}
