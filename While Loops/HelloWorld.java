public class HelloWorld
{
    
    int a =5;
    int b = 2;
    int c = 1;
    int d =-8;
    
    public void run () {
        int i = 0;
        while (i < 15) {
            System.out.println("i is " + i + "  is less than 10");
            i++;
        }
         int k = 10;
        while (k > 5) {
            System.out.println("i is " + i + " is greater than 5");
            k -= 1;
        }
        while (a < 10 && b < 20) {
                System.out.println("a is " + a + " is less than 10 , and b is " + b + " but is less than 20");
                b++;

        }
    }
        public static void main(String[] args)
    {        
        HelloWorld hw = new HelloWorld();
        hw.run();
    }

}
