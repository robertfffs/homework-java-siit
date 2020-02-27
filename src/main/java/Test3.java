public class Test3 {

    static void Digits(int n)
    {
        int largest = 0;

        while(n != 0)
        {
            int r = n % 10;

            largest = Math.max(r, largest);


            n = n / 10;
        }
        System.out.println(largest + " ");
    }


    public static void main (String[] args)
    {
        int n = 7986;


        Digits(n);

    }
}

