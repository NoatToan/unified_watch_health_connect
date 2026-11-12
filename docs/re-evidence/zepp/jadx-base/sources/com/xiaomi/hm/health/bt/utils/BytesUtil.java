package com.xiaomi.hm.health.bt.utils;

import com.unionpay.tsmservice.data.Constant;
import io.netty.util.internal.StringUtil;
import java.text.DecimalFormat;
import kotlin.text.Typography;
import org.cybergarage.http.HTTP;
import org.koin.core.instance.InstanceFactory;

/* JADX INFO: loaded from: classes20.dex */
public class BytesUtil {
    private static final char[] a = "0123456789ABCDEF".toCharArray();
    private static final byte b = 24;
    private static final byte c = 12;

    public static int byteArrayToInt(byte[] value, int offset) {
        return ((value[offset + 3] & 255) << 24) | (value[offset] & 255) | ((value[offset + 1] & 255) << 8) | ((value[offset + 2] & 255) << 16);
    }

    public static long byteArrayToLong(byte[] bytes, int offset, boolean littleEndian) {
        long j = 0;
        for (int i = 0; i < 8; i++) {
            int i2 = (littleEndian ? i : 7 - i) << 3;
            j |= (255 << i2) & (((long) bytes[offset + i]) << i2);
        }
        return j;
    }

    public static byte[] fromHex(String hex) {
        if (hex == null) {
            return null;
        }
        int length = hex.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("HexBinary needs to be even-length: " + hex);
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            int iDigit = Character.digit(hex.charAt(i), 16);
            int iDigit2 = Character.digit(hex.charAt(i + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("Contains illegal character for hexBinary: " + hex);
            }
            bArr[i / 2] = (byte) ((iDigit << 4) + iDigit2);
        }
        return bArr;
    }

    public static String log(byte[] bytes, boolean hex) {
        if (bytes == null) {
            return "null";
        }
        int length = bytes.length - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance();
        decimalFormat.applyPattern("0000");
        DecimalFormat decimalFormat2 = (DecimalFormat) DecimalFormat.getInstance();
        decimalFormat2.applyPattern(Constant.DEFAULT_CVN2);
        sb.append("<L : ");
        sb.append(bytes.length);
        sb.append(", ");
        sb.append(bytes.toString());
        int i = 0;
        while (true) {
            if (i % 24 == 0) {
                sb.append(InstanceFactory.ERROR_SEPARATOR);
                sb.append(decimalFormat.format(((i + 1) / 24) + 1));
                sb.append(HTTP.TAB);
            } else {
                sb.append(StringUtil.SPACE);
                if (i % 12 == 0) {
                    sb.append('\t');
                }
            }
            if (hex) {
                String hexString = Integer.toHexString(bytes[i] & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            } else {
                sb.append(decimalFormat2.format(bytes[i] & 255));
            }
            if (i == length) {
                sb.append(Typography.greater);
                return sb.toString();
            }
            i++;
        }
    }

    public static String toHex(byte[] bytes) {
        if (bytes == null) {
            return null;
        }
        char[] cArr = new char[bytes.length * 2];
        for (int i = 0; i < bytes.length; i++) {
            int i2 = bytes[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static String toHex(long value) {
        return Long.toHexString(value);
    }

    public static String log(byte[] bytes) {
        return log(bytes, true);
    }
}
