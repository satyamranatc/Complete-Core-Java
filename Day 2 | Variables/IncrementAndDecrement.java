class IncrementAndDecrement 
{

    public static void main(String[] args) {
        
        int x = 5;
        // System.out.println(x++);
        // System.out.println(x);

        //   5  + 6 + 7
        x = x++ + x + ++x;
        System.out.println(x);


        int y = 10;

        //      5   + 11 + 10
        y = y++ / 2 + y  + --y;
        System.out.println(y);

        y = 10;

        int z = (y++ / 2) / 2 + (--y) * 2 + --y - y;
        System.out.println(z);










    }
    
}
