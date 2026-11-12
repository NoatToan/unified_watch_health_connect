package defpackage;

import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

/* JADX INFO: loaded from: classes13.dex */
public class oqn {
    public static String e(int i) {
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

    public static String a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("");
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
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
        if (i <= 127) {
            return e(i);
        }
        int i2 = i & 127;
        int i3 = i >> 7;
        if (i3 > 127) {
            return e((i >> 14) + 128) + e(i3 & 255) + e(i2);
        }
        return e(i3 + 128) + e(i2);
    }

    public static byte[] a(String str) {
        if (str == null) {
            return new byte[0];
        }
        String strReplace = str.replace(" ", "");
        int length = strReplace.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            try {
                bArr[i] = (byte) Integer.parseInt(strReplace.substring(i2, i2 + 2), 16);
            } catch (NumberFormatException unused) {
                Log.e("HexUtil", "hexToBytes NumberFormatException");
            }
        }
        return bArr;
    }

    public static String c(String str) {
        if (str == null) {
            Log.d("HexUtil", "stringToHex string is null");
            return "";
        }
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder(16);
        byte[] bytes = new byte[0];
        try {
            bytes = str.getBytes("utf-8");
        } catch (UnsupportedEncodingException unused) {
            Log.e("HexUtil", "stringToHex UnsupportedEncodingException");
        }
        for (int i = 0; i < bytes.length; i++) {
            sb.append(charArray[(bytes[i] & 240) >> 4]);
            sb.append(charArray[bytes[i] & 15]);
        }
        return sb.toString().trim();
    }
}
