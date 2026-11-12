package com.xiaomi.hm.health.baseutil;

import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes19.dex */
public class MD5Util {
    private static final String a = "MD5Util";
    private static char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static MessageDigest c;

    static {
        c = null;
        try {
            c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
            Log.i(a, "MD5Util messagedigest初始化失败");
        }
    }

    private static void a(byte b2, StringBuffer stringBuffer) {
        char[] cArr = b;
        char c2 = cArr[(b2 & 240) >> 4];
        char c3 = cArr[b2 & 15];
        stringBuffer.append(c2);
        stringBuffer.append(c3);
    }

    private static String b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    private static String c(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            a(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    private static String d(byte[] bArr) {
        c.update(bArr);
        return b(c.digest());
    }

    public static String getMD5String(String str) {
        return d(str.getBytes());
    }
}
