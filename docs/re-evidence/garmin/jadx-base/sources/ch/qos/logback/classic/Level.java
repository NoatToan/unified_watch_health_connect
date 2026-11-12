package ch.qos.logback.classic;

import androidx.core.view.j;
import c22.t;
import com.google.firebase.perf.FirebasePerformance;
import java.io.Serializable;
import org.apache.commons.codec.language.bm.Rule;
import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public final class Level implements Serializable {
    public static final int ALL_INT = Integer.MIN_VALUE;
    public static final int DEBUG_INT = 10000;
    public static final int ERROR_INT = 40000;
    public static final int INFO_INT = 20000;
    public static final int OFF_INT = Integer.MAX_VALUE;
    public static final int TRACE_INT = 5000;
    public static final int WARN_INT = 30000;
    private static final long serialVersionUID = -814092767334282137L;
    public final int levelInt;
    public final String levelStr;
    public static final Integer OFF_INTEGER = Integer.MAX_VALUE;
    public static final Integer ERROR_INTEGER = 40000;
    public static final Integer WARN_INTEGER = 30000;
    public static final Integer INFO_INTEGER = 20000;
    public static final Integer DEBUG_INTEGER = 10000;
    public static final Integer TRACE_INTEGER = 5000;
    public static final Integer ALL_INTEGER = Integer.MIN_VALUE;
    public static final Level OFF = new Level(Integer.MAX_VALUE, "OFF");
    public static final Level ERROR = new Level(40000, "ERROR");
    public static final Level WARN = new Level(30000, "WARN");
    public static final Level INFO = new Level(20000, "INFO");
    public static final Level DEBUG = new Level(10000, "DEBUG");
    public static final Level TRACE = new Level(5000, FirebasePerformance.HttpMethod.TRACE);
    public static final Level ALL = new Level(Integer.MIN_VALUE, Rule.ALL);

    private Level(int i14, String str) {
        this.levelInt = i14;
        this.levelStr = str;
    }

    public static Level fromLocationAwareLoggerInteger(int i14) {
        if (i14 == 0) {
            return TRACE;
        }
        if (i14 == 10) {
            return DEBUG;
        }
        if (i14 == 20) {
            return INFO;
        }
        if (i14 == 30) {
            return WARN;
        }
        if (i14 == 40) {
            return ERROR;
        }
        h.s(j.f(i14, " not a valid level value"));
        return null;
    }

    private Object readResolve() {
        return toLevel(this.levelInt);
    }

    public static Level toLevel(String str, Level level) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.equalsIgnoreCase(Rule.ALL)) {
                return ALL;
            }
            if (strTrim.equalsIgnoreCase(FirebasePerformance.HttpMethod.TRACE)) {
                return TRACE;
            }
            if (strTrim.equalsIgnoreCase("DEBUG")) {
                return DEBUG;
            }
            if (strTrim.equalsIgnoreCase("INFO")) {
                return INFO;
            }
            if (strTrim.equalsIgnoreCase("WARN")) {
                return WARN;
            }
            if (strTrim.equalsIgnoreCase("ERROR")) {
                return ERROR;
            }
            if (strTrim.equalsIgnoreCase("OFF")) {
                return OFF;
            }
        }
        return level;
    }

    public static int toLocationAwareLoggerInteger(Level level) {
        if (level == null) {
            h.s("null level parameter is not admitted");
            return 0;
        }
        int i14 = level.toInt();
        if (i14 == 5000) {
            return 0;
        }
        if (i14 == 10000) {
            return 10;
        }
        if (i14 == 20000) {
            return 20;
        }
        if (i14 == 30000) {
            return 30;
        }
        if (i14 == 40000) {
            return 40;
        }
        t.h(level, " not a valid level value");
        return 0;
    }

    public static Level valueOf(String str) {
        return toLevel(str, DEBUG);
    }

    public boolean isGreaterOrEqual(Level level) {
        return this.levelInt >= level.levelInt;
    }

    public int toInt() {
        return this.levelInt;
    }

    public Integer toInteger() {
        int i14 = this.levelInt;
        if (i14 == Integer.MIN_VALUE) {
            return ALL_INTEGER;
        }
        if (i14 == 5000) {
            return TRACE_INTEGER;
        }
        if (i14 == 10000) {
            return DEBUG_INTEGER;
        }
        if (i14 == 20000) {
            return INFO_INTEGER;
        }
        if (i14 == 30000) {
            return WARN_INTEGER;
        }
        if (i14 == 40000) {
            return ERROR_INTEGER;
        }
        if (i14 == Integer.MAX_VALUE) {
            return OFF_INTEGER;
        }
        StringBuilder sb3 = new StringBuilder("Level ");
        sb3.append(this.levelStr);
        sb3.append(", ");
        h.z(am.j.q(sb3, this.levelInt, " is unknown."));
        return null;
    }

    public String toString() {
        return this.levelStr;
    }

    public static Level toLevel(int i14, Level level) {
        if (i14 == Integer.MIN_VALUE) {
            return ALL;
        }
        if (i14 == 5000) {
            return TRACE;
        }
        if (i14 == 10000) {
            return DEBUG;
        }
        if (i14 == 20000) {
            return INFO;
        }
        if (i14 == 30000) {
            return WARN;
        }
        if (i14 != 40000) {
            return i14 != Integer.MAX_VALUE ? level : OFF;
        }
        return ERROR;
    }

    public static Level toLevel(String str) {
        return toLevel(str, DEBUG);
    }

    public static Level toLevel(int i14) {
        return toLevel(i14, DEBUG);
    }
}
