public class dowhile
{
    
    int a =5;
    int b = 2;
    int c = 1;
    int d =-8;
    
    public void run () {
        int i = 0;
        do {
            System.out.println("i is " + i + "  is less than 10");
            i++;
        } while (i < 15);
         int k = 10;
        do {
            System.out.println("i is " + i + " is greater than 5");
            k -= 1;
        } while (k >5);
        do {
                System.out.println("a is " + a + " is less than 10 , and b is " + b + " but is less than 20");
                b++;

        } while (a < 10 && b < 20);
    }
        public static void main(String[] args)
    {        
        dowhile hw = new dowhile();
        hw.run();
    }

}
