package SectionA;

public class myOption2_StringReverse {

    /**
     * a recursive function that reverses a string
     * @param inputStr
     * @return String
     */
    public void strReverse(String inputStr)
        {
            /**
             * Base Case for Null or a single character input
             */
            if ((inputStr==null)||(inputStr.length() <= 1))
                System.out.println(inputStr);
            else
            {
                System.out.print(inputStr.charAt(inputStr.length()-1));
                strReverse(inputStr.substring(0,inputStr.length()-1));
            }
        }

    /**
     * a recursive function that, given a number n, prints out the first
     * n Fibonacci numbers
     * @param n
     * @return int
     */
    public int fib(int n) {
            if(n==0 || n==1)
                return n;
            else
                return fib(n-2)+fib(n-1);
        }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        String str = "!haaaaaaawiA yb desrever gnirts ym saw sihT";
        myOption2_StringReverse obj = new myOption2_StringReverse();
        obj.strReverse(str);

        int fibParamNumber = 14;
        for (int i = 0; i < fibParamNumber; i++) {
            System.out.println(obj.fib(i));
        }
    }
}
