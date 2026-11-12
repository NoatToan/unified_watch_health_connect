package defpackage;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class mtz {
    public static String c(String str) {
        return str.replace("\\", "\\\\").replace(";", "\\;");
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b2 : bytes) {
            sb.append("0123456789ABCDEF".charAt((b2 & 240) >> 4));
            sb.append("0123456789ABCDEF".charAt(b2 & 15));
        }
        return sb.toString();
    }

    public static String a(List<String> list, String str, String str2) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder(256);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(a(list.get(i), str2));
            if (i < size - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String e(String[] strArr, String str, String str2) {
        if (strArr == null || strArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(256);
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(a(strArr[i], str2));
            if (i < length - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String e(String[] strArr, String str) {
        if (strArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(256);
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (i != length - 1) {
                sb.append("'");
                sb.append(strArr[i]);
                sb.append("'");
                sb.append(str);
            } else {
                sb.append("'");
                sb.append(strArr[i]);
                sb.append("'");
            }
        }
        return sb.toString();
    }

    public static boolean a(String... strArr) {
        if (strArr == null) {
            return false;
        }
        for (String str : strArr) {
            if (!b(str)) {
                return true;
            }
        }
        return false;
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str2 + str + str2;
    }
}
