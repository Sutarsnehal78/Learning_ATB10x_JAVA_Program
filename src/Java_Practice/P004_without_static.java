package Java_Practice;

public class P004_without_static {
    void show()
    {
        System.out.println("Show world1");
    }

    public static void main(String[] args) {
        P004_without_static ref = new P004_without_static();
        ref.show();
        System.out.println("Hello World");
    }
}
