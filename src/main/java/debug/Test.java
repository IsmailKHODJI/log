package debug;

import org.apache.log4j.Logger;

/**
 * Created by khodji on 18/03/2017.
 */
public class Test {

    final static Logger logger = Logger.getLogger(Test.class);

    public static void main(String[] args){

        logger.info("This is info message "+ args[0]);
        //logs a debug message
        if(logger.isDebugEnabled()){
            logger.debug("This is debug");
        }

        int parameter = 5;
        //logs an error message with parameter
        logger.error("This is error : " + parameter);

        Exception e = new Exception("exception1");
        //logs an exception thrown from somewhere
        logger.error("This is error", e);


        logger.info("This is info message");

        Tools.test(2);
        Tools.test(23);

    }

}
