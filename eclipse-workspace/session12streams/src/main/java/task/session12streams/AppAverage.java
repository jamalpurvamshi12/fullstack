package task.session12streams;

import java.util.*;
import java.util.Arrays;
import java.util.function.ToIntFunction;

/**
 * Hello world!
 *
 */
public class AppAverage 
{
    public static void main( String[] args )
    {
    	List<Integer> dou=Arrays.asList(34,25,37,48,57);
		double avg=dou.stream().
		mapToInt(new ToIntFunction<Integer>()
		{
			@Override
			public int applyAsInt(Integer i) {
				return i;
			}
		}).
		average().orElse(-1);
		System.out.println("Average: "+avg);
    }
}
