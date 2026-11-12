package ch.qos.logback.classic.jul;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.lang3.e;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
public class JULHelper {
    public static Level asJULLevel(ch.qos.logback.classic.Level level) {
        if (level == null) {
            h.s("Unexpected level [null]");
            return null;
        }
        int i14 = level.levelInt;
        if (i14 == Integer.MIN_VALUE) {
            return Level.ALL;
        }
        if (i14 == 5000) {
            return Level.FINEST;
        }
        if (i14 == 10000) {
            return Level.FINE;
        }
        if (i14 == 20000) {
            return Level.INFO;
        }
        if (i14 == 30000) {
            return Level.WARNING;
        }
        if (i14 == 40000) {
            return Level.SEVERE;
        }
        if (i14 == Integer.MAX_VALUE) {
            return Level.OFF;
        }
        e.l("Unexpected level [", level, "]");
        return null;
    }

    public static Logger asJULLogger(ch.qos.logback.classic.Logger logger) {
        return asJULLogger(logger.getName());
    }

    public static String asJULLoggerName(String str) {
        return org.slf4j.Logger.ROOT_LOGGER_NAME.equals(str) ? "" : str;
    }

    public static final boolean isRegularNonRootLogger(Logger logger) {
        if (logger == null) {
            return false;
        }
        return !logger.getName().equals("");
    }

    public static final boolean isRoot(Logger logger) {
        if (logger == null) {
            return false;
        }
        return logger.getName().equals("");
    }

    public static Logger asJULLogger(String str) {
        return Logger.getLogger(asJULLoggerName(str));
    }
}
