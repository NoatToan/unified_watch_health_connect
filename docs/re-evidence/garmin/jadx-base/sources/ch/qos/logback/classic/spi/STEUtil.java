package ch.qos.logback.classic.spi;

/* JADX INFO: loaded from: classes7.dex */
public class STEUtil {
    public static int findNumberOfCommonFrames(StackTraceElement[] stackTraceElementArr, StackTraceElementProxy[] stackTraceElementProxyArr) {
        int i14 = 0;
        if (stackTraceElementProxyArr == null) {
            return 0;
        }
        int length = stackTraceElementArr.length - 1;
        for (int length2 = stackTraceElementProxyArr.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementProxyArr[length2].ste); length2--) {
            i14++;
            length--;
        }
        return i14;
    }
}
