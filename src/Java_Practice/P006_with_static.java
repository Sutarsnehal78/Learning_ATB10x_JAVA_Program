package Java_Practice;

public class P006_with_static {
    static void show()
    {
        System.out.println("hii this is snehal");
    }

    public static void main(String[] args) {
        P006_with_static.show();
        // If there is static method then you can directly call the function as follow:
        //class_name.show();
        //If there is no static then you have to use
        //  class_name ref = new class_name
        //  ref.show();
        System.out.println("Hello world");
    }
}
