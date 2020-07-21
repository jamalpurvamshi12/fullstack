package Col.Collections;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Custom<Integer>c=new Custom<Integer>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.remove(0);
        c.add(50);
        c.remove(0);
        c.remove(0);
        c.add(50);
        c.add(30);
        c.add(90);
        System.out.println(c);
    }
}
