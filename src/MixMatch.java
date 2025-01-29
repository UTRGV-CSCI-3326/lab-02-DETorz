public class MixMatch
{
    public static void main(String[] args)
    {
        String str = "word";
        char c = 'a';
        short s = 16;
        int i = 32;
        float f = 32;
        long l = 64;
        double d = 64.00;
        boolean b = false;
        System.out.println(c + " <- is a char that can only store 16 bits");
        System.out.println(str + " <- is a char array that can store 16 bits per char in the array to form the string, so its size isn't fixed");
        System.out.println(s + " <- is a short that stores 16 bits");
        System.out.println(i + " <- is an integer that can only store 32 bits");
        System.out.println(f + " <- is a float value that can only store 32 bits with a 7 point percision after the decimal point");
        System.out.println(l + " <- is a long integer value can only store 64 bits");
        System.out.println(d + " <- is a double that can only store 64 bits wutg a 15-16 point percision after the decimal point");
        System.out.println(b + " <- is a simple 1 or 0 value that holds true or false values respectively");
    }
}