package ch.qos.logback.core.util;

/* JADX INFO: loaded from: classes7.dex */
public class ContentTypeUtil {
    public static String getSubType(String str) {
        int iIndexOf;
        int i14;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1 || (i14 = iIndexOf + 1) >= str.length()) {
            return null;
        }
        return str.substring(i14);
    }

    public static boolean isTextual(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("text");
    }
}
