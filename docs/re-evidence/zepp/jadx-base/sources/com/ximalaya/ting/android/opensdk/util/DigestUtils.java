package com.ximalaya.ting.android.opensdk.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes22.dex */
public class DigestUtils {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String encodeHex(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length << 1];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(bArr[i2] & 240) >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[bArr[i2] & 15];
        }
        return new String(cArr);
    }

    public static MessageDigest getDigest(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public static byte[] md5(byte[] bArr) {
        return getDigest("MD5").digest(bArr);
    }

    public static String md5Hex(String str) {
        return encodeHex(md5(utf8Bytes(str)));
    }

    public static byte[] sha1(String str) {
        return sha1(utf8Bytes(str));
    }

    public static String sha1Hex(String str) {
        return new String(encodeHex(sha1(str)));
    }

    private static byte[] utf8Bytes(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String md5Hex(byte[] bArr) {
        return encodeHex(md5(bArr));
    }

    public static byte[] sha1(byte[] bArr) {
        return getDigest("SHA-1").digest(bArr);
    }
}
