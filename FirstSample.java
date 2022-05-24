/**
 * Il mio primo programma java.
 * @version 1.30 2022-02-10
 * @author Antonio Esposito
 */
public class FirstSample 
{
    public static void main(String[] args)
    {
        String greeting = "Welcome to Core Java!";
        System.out.println(greeting);
        for (int i = 0; i < greeting.length(); i++)
           System.out.print("=");
        System.out.println();

        int i;
        short x;
        long y;
        byte c;
        System.out.println("Noi non useremo 'Hello World'");
        y = 3000000000L;
        i = 0b1001;
        System.out.println(y);
        System.out.println(i);

        //SUBSTRING
        String s = greeting.substring(0, 3);
        System.out.println(s);

        //CONCATENATION
        String s1 = "uno";
        String s2 = "due";
        String s3 = s1 + s2;
        System.out.println(s3);
        int age = 13;
        String rating = "PG" + age;
        System.out.println(rating);
        String all = String.join(" / ", "S", "M", "L", "XL");
        System.out.println(all);



    }
    
}
