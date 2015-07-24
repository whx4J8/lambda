package stream;

import java.util.Arrays;

import org.junit.Test;

public class DemoStream {

	@Test
	public void testStream(){
		
		Arrays.asList(1,3,5,6,2).stream()
			.filter(x->x%2==0)
			.forEach(System.out::println);
		
	}
}
