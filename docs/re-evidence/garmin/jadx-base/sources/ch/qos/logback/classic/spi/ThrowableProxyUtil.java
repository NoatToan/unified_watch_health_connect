package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;

/* JADX INFO: loaded from: classes7.dex */
public class ThrowableProxyUtil {
    private static final int BUILDER_CAPACITY = 2048;
    public static final int REGULAR_EXCEPTION_INDENT = 1;
    public static final int SUPPRESSED_EXCEPTION_INDENT = 1;

    public static String asString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb3 = new StringBuilder(2048);
        recursiveAppend(sb3, null, 1, iThrowableProxy);
        return sb3.toString();
    }

    public static void build(ThrowableProxy throwableProxy, Throwable th3, ThrowableProxy throwableProxy2) {
        StackTraceElement[] stackTrace = th3.getStackTrace();
        throwableProxy.commonFrames = throwableProxy2 != null ? findNumberOfCommonFrames(stackTrace, throwableProxy2.getStackTraceElementProxyArray()) : -1;
        throwableProxy.stackTraceElementProxyArray = steArrayToStepArray(stackTrace);
    }

    public static int findNumberOfCommonFrames(StackTraceElement[] stackTraceElementArr, StackTraceElementProxy[] stackTraceElementProxyArr) {
        int i14 = 0;
        if (stackTraceElementProxyArr != null && stackTraceElementArr != null) {
            int length = stackTraceElementArr.length - 1;
            for (int length2 = stackTraceElementProxyArr.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementProxyArr[length2].ste); length2--) {
                i14++;
                length--;
            }
        }
        return i14;
    }

    public static void indent(StringBuilder sb3, int i14) {
        for (int i15 = 0; i15 < i14; i15++) {
            sb3.append('\t');
        }
    }

    private static void recursiveAppend(StringBuilder sb3, String str, int i14, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy == null) {
            return;
        }
        subjoinFirstLine(sb3, str, i14, iThrowableProxy);
        sb3.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb3, i14, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                recursiveAppend(sb3, CoreConstants.SUPPRESSED, i14 + 1, iThrowableProxy2);
            }
        }
        recursiveAppend(sb3, CoreConstants.CAUSED_BY, i14, iThrowableProxy.getCause());
    }

    public static StackTraceElementProxy[] steArrayToStepArray(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new StackTraceElementProxy[0];
        }
        int length = stackTraceElementArr.length;
        StackTraceElementProxy[] stackTraceElementProxyArr = new StackTraceElementProxy[length];
        for (int i14 = 0; i14 < length; i14++) {
            stackTraceElementProxyArr[i14] = new StackTraceElementProxy(stackTraceElementArr[i14]);
        }
        return stackTraceElementProxyArr;
    }

    private static void subjoinExceptionMessage(StringBuilder sb3, IThrowableProxy iThrowableProxy) {
        sb3.append(iThrowableProxy.getClassName());
        sb3.append(": ");
        sb3.append(iThrowableProxy.getMessage());
    }

    public static void subjoinFirstLine(StringBuilder sb3, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCommonFrames() > 0) {
            sb3.append(CoreConstants.CAUSED_BY);
        }
        subjoinExceptionMessage(sb3, iThrowableProxy);
    }

    public static void subjoinFirstLineRootCauseFirst(StringBuilder sb3, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCause() != null) {
            sb3.append(CoreConstants.WRAPPED_BY);
        }
        subjoinExceptionMessage(sb3, iThrowableProxy);
    }

    public static void subjoinPackagingData(StringBuilder sb3, StackTraceElementProxy stackTraceElementProxy) {
        ClassPackagingData classPackagingData;
        if (stackTraceElementProxy == null || (classPackagingData = stackTraceElementProxy.getClassPackagingData()) == null) {
            return;
        }
        sb3.append(!classPackagingData.isExact() ? " ~[" : " [");
        sb3.append(classPackagingData.getCodeLocation());
        sb3.append(CoreConstants.COLON_CHAR);
        sb3.append(classPackagingData.getVersion());
        sb3.append(']');
    }

    public static void subjoinSTEP(StringBuilder sb3, StackTraceElementProxy stackTraceElementProxy) {
        sb3.append(stackTraceElementProxy.toString());
        subjoinPackagingData(sb3, stackTraceElementProxy);
    }

    public static void subjoinSTEPArray(StringBuilder sb3, int i14, IThrowableProxy iThrowableProxy) {
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        int commonFrames = iThrowableProxy.getCommonFrames();
        for (int i15 = 0; i15 < stackTraceElementProxyArray.length - commonFrames; i15++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArray[i15];
            indent(sb3, i14);
            subjoinSTEP(sb3, stackTraceElementProxy);
            sb3.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames > 0) {
            indent(sb3, i14);
            sb3.append("... ");
            sb3.append(commonFrames);
            sb3.append(" common frames omitted");
            sb3.append(CoreConstants.LINE_SEPARATOR);
        }
    }

    private static void subjoinFirstLine(StringBuilder sb3, String str, int i14, IThrowableProxy iThrowableProxy) {
        indent(sb3, i14 - 1);
        if (str != null) {
            sb3.append(str);
        }
        subjoinExceptionMessage(sb3, iThrowableProxy);
    }

    public static void subjoinSTEPArray(StringBuilder sb3, IThrowableProxy iThrowableProxy) {
        subjoinSTEPArray(sb3, 1, iThrowableProxy);
    }
}
