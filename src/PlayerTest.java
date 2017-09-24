import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

	@Test
	public void testConstructor() {
		Player a = new Player(4,8);
		Player b = new Player(2,7);
//		assertTrue("player a height is 4", a.height==4);
//		assertTrue("player a width is 8", a.weight==8);
		assertTrue("player a Xcoord is 2", a.Xcoord==2);
		assertTrue("player a Ycoord is 8", a.Ycoord==8);
		assertTrue("player a time is" + System.currentTimeMillis(), a.time==System.currentTimeMillis());
		assertTrue("player a score is 0", a.score==0);
		assertTrue("player b height is 4", a.height==4);
		assertTrue("player b width is 8", a.weight==8);
		assertTrue("player b Xcoord is 2", a.Xcoord==2);
		assertTrue("player b Ycoord is 8", a.Ycoord==8);
		assertTrue("player b time is" + System.currentTimeMillis(), a.time==System.currentTimeMillis());
		assertTrue("player b score is 0", a.score==0);
	}


}