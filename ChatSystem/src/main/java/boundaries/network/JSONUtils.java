package boundaries.network;


import org.json.JSONException;
import org.json.JSONObject;
/**
 * Util class which creates JSON messages compliant
 * to defined formats of the TD group B
 * 
 * @author Arthur & Hai An
 *
 */
public class JSONUtils {
/**
 * Create Hello
 * @param nickname
 * 		
 * @return
 *		JSOn object Hello Message
 */
	public static JSONObject constructHello(String nickname) {
		JSONObject obj = new JSONObject();
		try {
			obj.put(MessageConstants.ATT_TYPE, MessageConstants.TYPE_HELLO);
			// TODO : get username from model
			obj.put(MessageConstants.ATT_USERNAME, nickname);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
/**
 * Create HelloAck
 * @param nickname
 * @return
 * 		JSOn object HelloAck Message
 */
	
	public static JSONObject constructHelloAck(String nickname) {
		JSONObject obj = new JSONObject();
		try {
			obj.put(MessageConstants.ATT_TYPE, MessageConstants.TYPE_HELLO_ACK);
			// TODO : get username from model
			obj.put(MessageConstants.ATT_USERNAME, nickname);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}
	/**
	 * Create Goodbye 
	 * @param nickname
	 * @return
	 * 		JSOn object Goodbye Message
	 */
	public static JSONObject constructGoodBye(String nickname){
		JSONObject obj = new JSONObject();
		try {
			obj.put(MessageConstants.ATT_TYPE, MessageConstants.TYPE_GOOD_BYE);
		
			obj.put(MessageConstants.ATT_USERNAME, nickname);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
		
	}
	/**
	 * Create Message
	 * @param message
	 * @return
	 * 		JSOn object, Message message
	 */
	public static JSONObject constructMessage (String message){
		JSONObject obj = new JSONObject();

		try {
			obj.put(MessageConstants.ATT_TYPE, MessageConstants.TYPE_MESSAGE);
			obj.put(MessageConstants.ATT_MESSAGE_DATA, message);
			obj.put(MessageConstants.ATT_MESSAGE_NUMBER, 1);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}
	/**
	 * Create MessageAck
	 * @param seq
	 * @return
	 * 		JSOn object, MessageAck message
	 */
	public static JSONObject constructMessageAck(int seq){
		JSONObject obj = new JSONObject();
		try {
			obj.put(MessageConstants.ATT_TYPE, MessageConstants.TYPE_MESSAGE_ACK);
			obj.put(MessageConstants.ATT_MESSAGE_NUMBER, seq);

		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return obj;
	}
		
	/**
	 * Use when we receive the byte from a Datagram Packet in order to rebuild the JsonObject
	 * 
	 * @param buffer
	 * @return
	 * 		JSOn Object
	 */
	public static JSONObject byteToJson(byte [] buffer){
		JSONObject obj = null;
		try {
			obj = new JSONObject(new String(buffer));
			
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return obj;
	}

	
}
