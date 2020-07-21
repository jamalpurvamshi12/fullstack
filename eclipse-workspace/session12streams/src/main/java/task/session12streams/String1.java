package task.session12streams;

import java.util.*;
import java.util.function.Predicate;

public class String1 
{
   public static void main(String args[])
{
	List<String> list=Arrays.asList("vamshi","batman","spiderman","gameofthrones","wolf","dany","motherofdragons","jonsnow","kinginthenorth");
	List<String> validate=function(list,(String str)->(str.charAt(0)=='g' && str.length()==13));
	System.out.println(validate);
}
public  static List<String> function(List<String> list,Predicate<String> predicate) 
{
	List<String> m=new ArrayList<>();
	for(String str:list) 
	{
		if(predicate.test(str))
		{
			m.add(str);
		}
	}
	return m;
 }

}