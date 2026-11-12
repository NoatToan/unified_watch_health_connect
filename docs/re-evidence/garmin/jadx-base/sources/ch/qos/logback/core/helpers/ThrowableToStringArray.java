package ch.qos.logback.core.helpers;

import ch.qos.logback.core.CoreConstants;
import java.util.LinkedList;
import java.util.List;
import sn.a;

/* JADX INFO: loaded from: classes7.dex */
public class ThrowableToStringArray {
    public static String[] convert(Throwable th3) {
        LinkedList linkedList = new LinkedList();
        extract(linkedList, th3, null);
        return (String[]) linkedList.toArray(new String[0]);
    }

    private static void extract(List<String> list, Throwable th3, StackTraceElement[] stackTraceElementArr) {
        StackTraceElement[] stackTrace = th3.getStackTrace();
        int iFindNumberOfCommonFrames = findNumberOfCommonFrames(stackTrace, stackTraceElementArr);
        list.add(formatFirstLine(th3, stackTraceElementArr));
        for (int i14 = 0; i14 < stackTrace.length - iFindNumberOfCommonFrames; i14++) {
            list.add("\tat " + stackTrace[i14].toString());
        }
        if (iFindNumberOfCommonFrames != 0) {
            list.add("\t... " + iFindNumberOfCommonFrames + " common frames omitted");
        }
        Throwable cause = th3.getCause();
        if (cause != null) {
            extract(list, cause, stackTrace);
        }
    }

    private static int findNumberOfCommonFrames(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int i14 = 0;
        if (stackTraceElementArr2 == null) {
            return 0;
        }
        int length = stackTraceElementArr.length - 1;
        for (int length2 = stackTraceElementArr2.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementArr2[length2]); length2--) {
            i14++;
            length--;
        }
        return i14;
    }

    private static String formatFirstLine(Throwable th3, StackTraceElement[] stackTraceElementArr) {
        String strConcat = (stackTraceElementArr != null ? CoreConstants.CAUSED_BY : "").concat(th3.getClass().getName());
        if (th3.getMessage() == null) {
            return strConcat;
        }
        StringBuilder sbI = a.i(strConcat, ": ");
        sbI.append(th3.getMessage());
        return sbI.toString();
    }
}
