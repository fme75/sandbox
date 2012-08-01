package net.evest;

import junit.framework.Assert;
import net.evest.util.Props;

import org.junit.Test;

public class PropsTest {

	@Test
	public void test() {
		Props props = new Props();
		
		Assert.assertEquals("test prop", props.getProp());
	}

}
