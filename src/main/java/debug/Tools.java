package debug;

import org.apache.log4j.Logger;

/**
 * Created by khodji on 18/03/2017.
 */
public class Tools {

    final static Logger logger = Logger.getLogger(Tools.class);

    public static void test(int a){

        if (a < 5 ) logger.debug("a is low than 5");

        if (a > 20) {
            logger.error("a > 20");
        }
    }

}
