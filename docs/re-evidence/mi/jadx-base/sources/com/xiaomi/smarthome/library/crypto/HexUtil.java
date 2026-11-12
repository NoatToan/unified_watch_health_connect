package com.xiaomi.smarthome.library.crypto;

/* JADX INFO: loaded from: classes2.dex */
public class HexUtil {
    public static String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static long hexToDecimal(String str) {
        String upperCase = str.toUpperCase();
        long jIndexOf = 0;
        for (int i = 0; i < upperCase.length(); i++) {
            jIndexOf = (jIndexOf * 16) + ((long) "0123456789ABCDEF".indexOf(upperCase.charAt(i)));
        }
        return jIndexOf;
    }
}
