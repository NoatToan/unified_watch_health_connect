package health.compact.a;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class HEXUtils {
    private HEXUtils() {
    }

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

    public static String b(long j) {
        return b((int) ((j >> 56) & 255)) + b((int) ((j >> 48) & 255)) + b((int) ((j >> 40) & 255)) + b((int) ((j >> 32) & 255)) + b((int) ((j >> 24) & 255)) + b((int) ((j >> 16) & 255)) + b((int) ((j >> 8) & 255)) + b((int) (j & 255));
    }

    public static String d(long j) {
        return b((int) ((j >> 24) & 255)) + b((int) ((j >> 16) & 255)) + b((int) ((j >> 8) & 255)) + b((int) (j & 255));
    }

    public static String a(int i) {
        return b((i >> 8) & 255) + b(i & 255);
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
                com.huawei.hwlogsmodel.LogUtil.e("HEXUtils", "hexToBytes NumberFormatException");
            }
        }
        return bArr;
    }

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return c(bArr, bArr.length);
    }

    public static String c(byte[] bArr, int i) {
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

    public static String b(String str) {
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
            com.huawei.hwlogsmodel.LogUtil.e("HEXUtils", "hexToString UnsupportedEncodingException");
            return null;
        }
    }

    public static String c(String str) {
        if (str == null) {
            com.huawei.hwlogsmodel.LogUtil.j("HEXUtils", "stringToHex string is null");
            return "";
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder("");
        byte[] bytes = new byte[0];
        try {
            bytes = str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            com.huawei.hwlogsmodel.LogUtil.e("HEXUtils", "stringToHex UnsupportedEncodingException");
        }
        for (int i = 0; i < bytes.length; i++) {
            sb.append(charArray[(bytes[i] & 240) >> 4]);
            sb.append(charArray[bytes[i] & 15]);
        }
        return sb.toString().trim();
    }

    public static String c(int i) {
        if (i <= 127) {
            return b(i);
        }
        int i2 = i & 127;
        int i3 = i >> 7;
        if (i3 > 127) {
            return b((i >> 14) + 128) + b((i3 & 127) + 128) + b(i2);
        }
        return b(i3 + 128) + b(i2);
    }

    public static String d(double d) {
        return a(c(d));
    }

    private static byte[] c(double d) {
        byte[] bArr = new byte[8];
        long jDoubleToLongBits = Double.doubleToLongBits(d);
        for (int i = 0; i < 8; i++) {
            bArr[i] = Long.valueOf(jDoubleToLongBits).byteValue();
            jDoubleToLongBits >>= 8;
        }
        return bArr;
    }

    public static byte[] e(String str) {
        if (TextUtils.isEmpty(str)) {
            com.huawei.hwlogsmodel.LogUtil.j("HEXUtils", "parseHexStr2Byte hexString is empty");
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

    public static String b(float f) {
        return d(Float.floatToIntBits(f));
    }
}
