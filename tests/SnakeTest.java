import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SnakeTest {

	//Location of chromedriver file
	
    final String CHROMEDRIVER_LOCATION = "/Users/satwinderbhullar/Downloads/chromedriver";
    
   

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void isHealthy() {
		//Tc1
		String healthy="hey healthy";
		String notHealthy="hey not healthy";
	if(healthy==notHealthy)
	{
		
		System.out.println("correct");
		
	}
	else
	{
		System.out.println("notcorrect");
	}

}
	@Test
	public void fitsInCage()
	{
		//TC2 
		int cagelength=10;
		int snakelength=20;
		if(cagelength==snakelength)
		{
			System.out.println("Both equal in length");
		}
		else if(cagelength<snakelength)
		{
			System.out.println("snake is bigger than cage");
			
		}
		else if(cagelength>snakelength)
		{
			System.out.println("snake is not healthy");
		}
		
	}
}
