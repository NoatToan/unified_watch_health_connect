package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class yrs {
    public static String a(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : map.keySet()) {
            stringBuffer.append(str);
            stringBuffer.append(": ");
            stringBuffer.append(map.get(str));
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    public static boolean b(String str) {
        return str == null || str.length() == 0;
    }
}
