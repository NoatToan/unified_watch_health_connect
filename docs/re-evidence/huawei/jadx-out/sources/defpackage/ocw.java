package defpackage;

import android.text.TextUtils;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes12.dex */
public class ocw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f44163a = 7;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f44164c = Charset.forName("UTF-8");
    private static int d = 4;

    public static String e(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        return a(d(a(b(str, d), str3), f44163a), str2);
    }

    private static String b(String str, int i) {
        if (TextUtils.isEmpty(str) || str.length() < i) {
            return null;
        }
        char[] charArray = str.toCharArray();
        char[] charArray2 = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            int i3 = i2 - i;
            if (i3 < 0) {
                charArray2[(charArray.length - i) + i2] = charArray[i2];
            } else {
                charArray2[i3] = charArray[i2];
            }
        }
        return new String(charArray2);
    }

    private static String d(String str, int i) {
        if (TextUtils.isEmpty(str) || str.length() < i) {
            return null;
        }
        char[] charArray = str.toCharArray();
        char[] charArray2 = str.toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            int i3 = i2 + i;
            if (i3 >= charArray.length) {
                charArray2[i3 - charArray.length] = charArray[i2];
            } else {
                charArray2[i3] = charArray[i2];
            }
        }
        return String.valueOf(charArray2);
    }

    private static String a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        Charset charset = f44164c;
        byte[] bytes = str2.getBytes(charset);
        byte[] bytes2 = str.getBytes(charset);
        int length = bytes2.length;
        for (int i = 0; i < length; i++) {
            for (byte b2 : bytes) {
                bytes2[i] = (byte) (b2 ^ bytes2[i]);
            }
        }
        return new String(bytes2, f44164c);
    }
}
