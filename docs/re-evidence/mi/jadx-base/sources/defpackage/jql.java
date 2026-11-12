package defpackage;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class jql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static HashMap<String, String> f23028a = new HashMap<>();

    public static String a(String str) {
        if ((bpe.k() && bpe.g()) || TextUtils.isEmpty(str)) {
            return str;
        }
        if (f23028a.containsKey(str)) {
            return f23028a.get(str);
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str2 = '#' + b(str, String.valueOf(jCurrentTimeMillis)) + "#tag=" + ((jCurrentTimeMillis << 2) - 10016) + '#';
            f23028a.put(str, str2);
            return str2;
        } catch (Exception unused) {
            return "";
        }
    }

    public static String b(String str, String str2) {
        byte[] bytes = str.getBytes();
        byte[] bytes2 = str2.getBytes();
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            int length = (bytes2.length - (i % bytes2.length)) - 1;
            sb.append("0a1b2c34567d8e9f".charAt(((bytes[i] + bytes2[length]) & 240) >> 4));
            sb.append("0a1b2c34567d8e9f".charAt((bytes[i] + bytes2[length]) & 15));
        }
        return sb.toString();
    }
}
