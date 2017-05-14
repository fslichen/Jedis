package evolution;

import redis.clients.jedis.Jedis;

public class Application {
	// Don't forget to start redis on system boot.
	public static void main(String[] args) {
		Jedis jedis = new Jedis();
		jedis.set("anyKey", "Goodbye Past");
		String value = jedis.get("anyKey");
		System.out.println(value);
		jedis.close();
	}
}
