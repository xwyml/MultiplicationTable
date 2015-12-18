import static org.junit.Assert.*;

import org.junit.Test;


public class MultiTableTest {

	@Test
	public void testCheckPosInt() {
		MultiTable m=new MultiTable();
		assertFalse(m.checkPosInt("0"));
	    assertFalse(m.checkPosInt("-2"));
	    assertFalse(m.checkPosInt("+1"));
	    assertFalse(m.checkPosInt("3.5"));
	    assertFalse(m.checkPosInt("6.0"));
	    assertFalse(m.checkPosInt("a"));
	    assertFalse(m.checkPosInt("tokyo"));
	    assertFalse(m.checkPosInt("..."));
	    assertTrue(m.checkPosInt("9"));
	    assertTrue(m.checkPosInt("12"));
	    
	   }
    }
