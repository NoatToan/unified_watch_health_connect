package com.huawei.haf.common.utils;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class HexUtils {
    private HexUtils() {
    }

    public static String c(byte[] bArr) {
        return e(bArr, true);
    }

    public static String e(byte[] bArr, boolean z) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length + bArr.length);
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
                sb.append(hexString);
            } else {
                sb.append(hexString);
            }
        }
        String string = sb.toString();
        return z ? string.toUpperCase(Locale.ENGLISH) : string;
    }
}
