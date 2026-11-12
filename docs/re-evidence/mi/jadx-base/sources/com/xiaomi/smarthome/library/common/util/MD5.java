package com.xiaomi.smarthome.library.common.util;

import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class MD5 {
    public static String MD5_16(String str) {
        return MD5_32(str).subSequence(8, 24).toString();
    }

    public static String MD5_32(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            StringBuilder sb = new StringBuilder();
            messageDigest.update(str.getBytes(), 0, str.length());
            for (byte b2 : messageDigest.digest()) {
                sb.append(byte2Hex(b2));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static byte[] MD5_4_bytes(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(Coder.KEY_MD5);
            messageDigest.update(str.getBytes(), 0, str.length());
            return Arrays.copyOfRange(messageDigest.digest(), 6, 10);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private static String byte2Hex(byte b2) {
        int i = (b2 & 127) + (b2 < 0 ? 128 : 0);
        StringBuilder sb = new StringBuilder();
        sb.append(i < 16 ? "0" : "");
        sb.append(Integer.toHexString(i).toLowerCase());
        return sb.toString();
    }
}
