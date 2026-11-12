package defpackage;

import android.text.TextUtils;
import health.compact.a.LogUtil;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class cph {
    public static String b(int i) {
        if (i < 0) {
            String hexString = Integer.toHexString(i);
            return hexString.substring(hexString.length() - 2, hexString.length());
        }
        if (i >= 16) {
            String hexString2 = Integer.toHexString(i);
            if (hexString2.length() % 2 == 0) {
                return hexString2;
            }
            return "0" + hexString2;
        }
        return "0" + Integer.toHexString(i);
    }

    public static String a(long j) {
        return b((int) ((j >> 56) & 255)) + b((int) ((j >> 48) & 255)) + b((int) ((j >> 40) & 255)) + b((int) ((j >> 32) & 255)) + b((int) ((j >> 24) & 255)) + b((int) ((j >> 16) & 255)) + b((int) ((j >> 8) & 255)) + b((int) (j & 255));
    }

    public static byte[] d(long j) {
        return new byte[]{(byte) ((j >> 56) & 255), (byte) ((j >> 48) & 255), (byte) ((j >> 40) & 255), (byte) ((j >> 32) & 255), (byte) ((j >> 24) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 8) & 255), (byte) (j & 255)};
    }

    public static String b(long j) {
        return b((int) ((j >> 24) & 255)) + b((int) ((j >> 16) & 255)) + b((int) ((j >> 8) & 255)) + b((int) (j & 255));
    }

    public static String d(int i) {
        return b((i >> 8) & 255) + b(i & 255);
    }

    public static byte[] a(int i) {
        return new byte[]{(byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] d(String str) {
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
                LogUtil.d("HEXUtils", "hexToBytes NumberFormatException");
            }
        }
        return bArr;
    }

    public static String d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return b(bArr, bArr.length);
    }

    public static String b(byte[] bArr, int i) {
        if (bArr == null || bArr.length < i) {
            return null;
        }
        StringBuilder sb = new StringBuilder("");
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

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toCharArray();
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((("0123456789ABCDEF".indexOf(charArray[i2]) * 16) + "0123456789ABCDEF".indexOf(charArray[i2 + 1])) & 255);
        }
        try {
            return new String(bArr, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.d("HEXUtils", "hexToString UnsupportedEncodingException");
            return null;
        }
    }

    public static String b(String str) {
        if (str == null) {
            LogUtil.e("HEXUtils", "stringToHex string is null");
            return "";
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder("");
        byte[] bytes = new byte[0];
        try {
            bytes = str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            LogUtil.d("HEXUtils", "stringToHex UnsupportedEncodingException");
        }
        for (int i = 0; i < bytes.length; i++) {
            sb.append(charArray[(bytes[i] & 240) >> 4]);
            sb.append(charArray[bytes[i] & 15]);
        }
        return sb.toString().trim();
    }

    public static String c(int i) {
        return d(e(i));
    }

    public static byte[] e(int i) {
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

    public static byte[] g(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] e(long j) {
        return new byte[]{(byte) ((j >> 24) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 8) & 255), (byte) (j & 255)};
    }

    public static int e(byte[] bArr, int i) {
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

    public static byte[] c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("HEXUtils", "parseHexStr2Byte hexString is empty");
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            try {
                bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
            } catch (NumberFormatException unused) {
                bArr[i] = 0;
            }
        }
        return bArr;
    }

    public static byte[] e(String str) {
        if (str == null) {
            return new byte[0];
        }
        try {
            return str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            return new byte[0];
        }
    }

    public static byte[] f(int i) {
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

    public static double c(byte[] bArr, double d) {
        return (bArr == null || bArr.length == 0 || bArr.length > 8) ? d : Double.longBitsToDouble(a(bArr, 0L));
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

    public static double a(byte[] bArr, boolean z) {
        int i = 0;
        long j = 0;
        if (z) {
            while (i < 8) {
                j |= (((long) bArr[i]) & 255) << ((7 - i) * 8);
                i++;
            }
        } else {
            while (i < 8) {
                j |= (((long) bArr[i]) & 255) << (i * 8);
                i++;
            }
        }
        return Double.longBitsToDouble(j);
    }

    public static short b(byte[] bArr, short s) {
        if (bArr == null || bArr.length != 2) {
            return s;
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        return byteBufferWrap.getShort();
    }
}
