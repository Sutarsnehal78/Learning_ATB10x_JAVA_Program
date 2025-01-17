package Java_Practice;

public class P005_without_static2 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        P005_without_static2 ref = new P005_without_static2();
                ref.show();

    }
    void show()
    {
        System.out.println("This is Practice for Java code");
    }
}
