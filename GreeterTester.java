public class GreeterTester
{
    public static void main(String[] args)
    {
        /**
         * This is an example of constructing an object using the new operator
         */
        Greeter worldGreeter = new Greeter("World");
        /**
         * This is an example of invoking the sayHello method
         */
        String greeting = worldGreeter.sayHello();
        System.out.println(greeting);
    }
}
