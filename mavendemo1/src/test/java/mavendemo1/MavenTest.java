package mavendemo1;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import mavendemo1.Calculator;

public class MavenTest {
	@Test
	public void testIfAddIsAddingOrNot(){
		
		Calculator c=new Calculator();
		int result=c.add(10, 20);
		int e=30;
		
		assertEquals(e,result);
	 
		
	}
	@Test
public void testIfsubIsAddingOrNot(){
		
		Calculator d=new Calculator();
		int result=d.sub(10, 20);
		int e=-10;
		
		assertEquals(e,result);
		
	}

}
