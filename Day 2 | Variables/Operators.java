class Operators {
    public static void main(String[] args) {

        int a = 5;
        int b = 10;
        int c = a + b; // ? + --> Operator

        // a + b = c ;
        // Opreand operator Opreand operator Result

        System.out.println(c);

        // ! Types Of Operators:

        // ? 1. Airthmetic operators

        System.out.println(5 + 5);
        System.out.println(5 - 5);
        System.out.println(5 * 5);
        System.out.println(5 / 5);
        System.out.println(5 % 5);

        // ? 2. Comparision Operators
        System.out.println(44 > 4);
        System.out.println(4 < 4);
        System.out.println(4 >= 4);
        System.out.println(4 <= 4);
        System.out.println(4 == 4);
        System.out.println(4 != 4);

        // ? 3. Assignment Operators:

        int x = 4;
        x += 5; // x = x + 5
        x -= 5;
        x *= 5;
        x /= 5;
        x %= 5;

        // ? 4. Logical Operators
        System.out.println("-------------");
        System.out.println(5 > 2 && 5 > 3);
        System.out.println(5 > 2 || 5 > 4);
        System.out.println(!(5 > 4));


        //? ++,--

        int m = 4;
        m+=3;
        m--;
        System.out.println(m);

        m++;



    }

}
