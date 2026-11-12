package com.huawei.maps.offlinedata.service.device.tlvtools;

import java.nio.charset.StandardCharsets;
import java.util.Locale;

/* JADX INFO: loaded from: classes12.dex */
public abstract class a {
    public static byte[] a(long j) {
        return new byte[]{(byte) ((j >> 56) & 255), (byte) ((j >> 48) & 255), (byte) ((j >> 40) & 255), (byte) ((j >> 32) & 255), (byte) ((j >> 24) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 8) & 255), (byte) (j & 255)};
    }

    public static String b(String str) {
        if (str == null) {
            com.huawei.maps.offlinedata.utils.g.d("HEXUtils", "stringToHex string is null");
            return "";
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder();
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        for (int i = 0; i < bytes.length; i++) {
            sb.append(charArray[(bytes[i] & 240) >> 4]);
            sb.append(charArray[bytes[i] & 15]);
        }
        return sb.toString().trim();
    }

    public static byte[] c(int i) {
        return new byte[]{(byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static String d(int i) {
        if (i < 0) {
            String hexString = Integer.toHexString(i);
            return hexString.substring(hexString.length() - 2);
        }
        if (i < 16) {
            return "0" + Integer.toHexString(i);
        }
        String hexString2 = Integer.toHexString(i);
        if (hexString2.length() % 2 == 0) {
            return hexString2;
        }
        return "0" + hexString2;
    }

    public static byte[] f(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace(" ", "");
        int length = strReplace.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            try {
                bArr[i] = (byte) Integer.parseInt(strReplace.substring(i2, i2 + 2), 16);
            } catch (NumberFormatException unused) {
                com.huawei.maps.offlinedata.utils.g.b("HEXUtils", "hexToBytes NumberFormatException");
            }
        }
        return bArr;
    }

    public static byte[] c(String str) {
        return str == null ? new byte[0] : str.getBytes(StandardCharsets.UTF_8);
    }

    public static byte[] e(int i) {
        byte b2 = (byte) ((i >> 24) & 255);
        byte b3 = (byte) ((i >> 16) & 255);
        byte b4 = (byte) ((i >> 8) & 255);
        byte b5 = (byte) (i & 255);
        if (b2 != 0) {
            return new byte[]{b2, b3, b4, b5};
        }
        if (b3 != 0) {
            return new byte[]{b3, b4, b5};
        }
        if (b4 != 0) {
            return new byte[]{b4, b5};
        }
        return new byte[]{b5};
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return a(bArr, bArr.length);
    }

    public static String a(byte[] bArr, int i) {
        if (bArr == null || bArr.length < i) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            String hexString = Integer.toHexString(bArr[i2] & 255);
            if (hexString.length() == 1) {
                sb.append("0");
                sb.append(hexString);
            } else {
                sb.append(hexString);
            }
        }
        return sb.toString().toUpperCase(Locale.US).trim();
    }

    public static String b(int i) {
        return a(a(i));
    }

    public static int b(byte[] bArr, int i) {
        if (bArr == null || bArr.length == 0 || bArr.length > 4) {
            return i;
        }
        int length = bArr.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i2 |= (bArr[i3] & 255) << (((length - i3) - 1) * 8);
        }
        return i2;
    }

    public static String b(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    public static byte[] a(int i) {
        if (i < 128 && i >= 0) {
            return new byte[]{(byte) (i & 127)};
        }
        if (i < 16384) {
            return new byte[]{(byte) (((i >>> 7) & 127) | 128), (byte) (i & 127)};
        }
        if (i < 2097152) {
            return new byte[]{(byte) (((i >>> 14) & 127) | 128), (byte) (((i >>> 7) & 127) | 128), (byte) (i & 127)};
        }
        throw new RuntimeException("length overflow, input : " + i + " bigger than 2097152 or smaller than 0");
    }

    public static long a(byte[] bArr, long j) {
        if (bArr == null || bArr.length == 0 || bArr.length > 8) {
            return j;
        }
        int length = bArr.length;
        long j2 = 0;
        for (int i = 0; i < length; i++) {
            j2 |= (((long) bArr[i]) & 255) << (((length - i) - 1) * 8);
        }
        return j2;
    }

    public static double a(byte[] bArr, double d) {
        return (bArr == null || bArr.length == 0 || bArr.length > 8) ? d : Double.longBitsToDouble(a(bArr, 0L));
    }
}
