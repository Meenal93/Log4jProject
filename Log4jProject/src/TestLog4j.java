import org.apache.log4j.Logger;

public class TestLog4j {
	
	
	static Logger Log = Logger.getLogger(TestLog4j.class);

	public static void main(String[] args) {
		
	Log.debug("This is the debug log...........");
	Log.info("This is the info log..........");
	Log.error("Error explained");

	}

}
