package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class CallerData {
    public static final String CALLER_DATA_NA = "?#?:?" + CoreConstants.LINE_SEPARATOR;
    public static final StackTraceElement[] EMPTY_CALLER_DATA_ARRAY = new StackTraceElement[0];
    public static final int LINE_NA = -1;
    private static final String LOG4J_CATEGORY = "org.apache.log4j.Category";
    public static final String NA = "?";
    private static final String SLF4J_BOUNDARY = "org.slf4j.Logger";

    public static StackTraceElement[] extract(Throwable th3, String str, int i14, List<String> list) {
        if (th3 == null) {
            return null;
        }
        StackTraceElement[] stackTrace = th3.getStackTrace();
        int i15 = -1;
        for (int i16 = 0; i16 < stackTrace.length; i16++) {
            if (!isInFrameworkSpace(stackTrace[i16].getClassName(), str, list)) {
                if (i15 != -1) {
                    break;
                }
            } else {
                i15 = i16 + 1;
            }
        }
        if (i15 == -1) {
            return EMPTY_CALLER_DATA_ARRAY;
        }
        int length = stackTrace.length - i15;
        if (i14 >= length) {
            i14 = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i14];
        for (int i17 = 0; i17 < i14; i17++) {
            stackTraceElementArr[i17] = stackTrace[i15 + i17];
        }
        return stackTraceElementArr;
    }

    public static boolean isInFrameworkSpace(String str, String str2, List<String> list) {
        return str.equals(str2) || str.equals(LOG4J_CATEGORY) || str.startsWith(SLF4J_BOUNDARY) || isInFrameworkSpaceList(str, list);
    }

    private static boolean isInFrameworkSpaceList(String str, List<String> list) {
        if (list == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static StackTraceElement naInstance() {
        return new StackTraceElement(NA, NA, NA, -1);
    }
}
