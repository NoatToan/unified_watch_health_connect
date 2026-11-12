package com.xiaomi.hm.health.baseutil;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes11.dex */
public class String2XUtil {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final String TAG = "String2xUtil";

    public static String addComma(String str) {
        return new DecimalFormat(",###").format(Double.parseDouble(str));
    }

    public static char[] bytes2Chars(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        char[] cArr = new char[length];
        for (int i = 0; i < length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static String bytes2HexString(byte[] bArr) {
        int length;
        if (bArr == null || (length = bArr.length) <= 0) {
            return null;
        }
        char[] cArr = new char[length << 1];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i] = cArr2[(b2 >>> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static byte[] chars2Bytes(char[] cArr) {
        if (cArr == null || cArr.length <= 0) {
            return null;
        }
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public static String getStringFromBytes(byte[] bArr) {
        if (bArr != null) {
            try {
                return new String(bArr);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    private static int hex2Dec(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c < 'A' || c > 'F') {
            throw new IllegalArgumentException();
        }
        return c - '7';
    }

    public static byte[] hexString2Bytes(String str) {
        if (isSpace(str)) {
            return null;
        }
        int length = str.length();
        if (length % 2 != 0) {
            str = "0" + str;
            length++;
        }
        char[] charArray = str.toUpperCase().toCharArray();
        byte[] bArr = new byte[length >> 1];
        for (int i = 0; i < length; i += 2) {
            bArr[i >> 1] = (byte) ((hex2Dec(charArray[i]) << 4) | hex2Dec(charArray[i + 1]));
        }
        return bArr;
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
