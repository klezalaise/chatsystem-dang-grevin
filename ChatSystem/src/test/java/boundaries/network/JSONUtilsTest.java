package boundaries.network;

import org.json.JSONException;
import org.junit.Test;

public class JSONUtilsTest {

	@Test
	public void testConstructHello() {
		System.out.println(JSONUtils.constructHello("test"));
	}
	
	@Test
	public void testConstructHelloAck() {
		System.out.println(JSONUtils.constructHelloAck("test"));
	}
	
	@Test
	public void testConvertByteToJONObject() throws JSONException {
		byte[] s = "{type : abc}".getBytes();
		System.out.println(JSONUtils.byteToJson(s));
	}
}
