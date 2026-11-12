package com.xiaomi.hm.health.baseutil;

import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes11.dex */
public class MD5Util {
    private static final String TAG = "MD5Util";
    private static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static MessageDigest messagedigest;

    static {
        try {
            messagedigest = MessageDigest.getInstance(Coder.KEY_MD5);
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    private static void appendHexPair(byte b2, StringBuffer stringBuffer) {
        char[] cArr = hexDigits;
        char c = cArr[(b2 & 240) >> 4];
        char c2 = cArr[b2 & 15];
        stringBuffer.append(c);
        stringBuffer.append(c2);
    }

    private static String bufferToHex(byte[] bArr) {
        return bufferToHex(bArr, 0, bArr.length);
    }

    public static String getMD5String(String str) {
        return getMD5String(str.getBytes());
    }

    private static String bufferToHex(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            appendHexPair(bArr[i], stringBuffer);
            i++;
        }
        return stringBuffer.toString();
    }

    private static String getMD5String(byte[] bArr) {
        messagedigest.update(bArr);
        return bufferToHex(messagedigest.digest());
    }
}
