public class Example
{
    public static void message()
    {
        System.out.println("I am learning how to create void function in Java.");
    }

    public static void sum(int a, int b)
    {
        int c;
        c=a+b;
        System.out.println("Sum of " + a + " and " + b + " is " + c);
    }

    public static void main(String args[])
    {
        message();
        sum(10,20);
    }
}
