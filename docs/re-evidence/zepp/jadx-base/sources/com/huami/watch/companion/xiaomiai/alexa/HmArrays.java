package com.huami.watch.companion.xiaomiai.alexa;

/* JADX INFO: loaded from: classes16.dex */
public class HmArrays {
    public static String toHexString(byte[] bArr) {
        return bArr == null ? "" : toHexString(bArr, 0, bArr.length, false);
    }

    public static String toHexString(byte[] bArr, int i, int i2) {
        return bArr == null ? "" : toHexString(bArr, i, i2, false);
    }

    public static String toHexString(byte[] bArr, boolean z) {
        return bArr == null ? "" : toHexString(bArr, 0, bArr.length, z);
    }

    public static String toHexString(byte[] bArr, int i, int i2, boolean z) {
        if (bArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < bArr.length && i3 < i2; i3++) {
            String hexString = Integer.toHexString(bArr[i3 + i] & 255);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            if (z) {
                sb.append("0x");
            }
            sb.append(hexString.toUpperCase());
            if (z) {
                sb.append(",");
            }
        }
        if (z) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
