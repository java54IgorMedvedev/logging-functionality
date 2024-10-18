import java.io.IOException;
import java.util.logging.*;
public class LoggerAppl {
	static Logger logger = Logger.getLogger("LoggerAppl");
	public static void main(String[] args) throws Exception {
		LogManager.getLogManager().reset();
		logger.setLevel(Level.FINE);
		Handler handler = new ConsoleHandler();
		Handler handlerFile = new FileHandler("logs");
		handlerFile.setLevel(Level.FINEST);
		handlerFile.setFormatter(new SimpleFormatter());
		handler.setLevel(Level.FINEST);
		
		logger.addHandler(handler);
		
		//logger.addHandler(handlerFile);
		logger.severe("Severe Log");
		logger.warning("Warning Log");
		logger.info("info Log");
		logger.config("config Log");
		logger.fine("Fine Log");
		logger.finer("Finer Log");
		logger.finest("Finest Log");
		

	}

}