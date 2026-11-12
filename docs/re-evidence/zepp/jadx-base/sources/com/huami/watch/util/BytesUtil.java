package com.huami.watch.util;

import com.unionpay.tsmservice.data.Constant;
import java.text.DecimalFormat;
import kotlin.text.Typography;
import org.cybergarage.http.HTTP;
import org.koin.core.instance.InstanceFactory;

/* JADX INFO: loaded from: classes11.dex */
public class BytesUtil {
    private static final char[] a = "0123456789ABCDEF".toCharArray();
    private static final byte b = 24;
    private static final byte c = 12;

    public static int fromBytes(byte[] bArr) {
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static byte[] fromHex(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("HexBinary needs to be even-length: " + str);
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            int iDigit = Character.digit(str.charAt(i), 16);
            int iDigit2 = Character.digit(str.charAt(i + 1), 16);
            if (iDigit == -1 || iDigit2 == -1) {
                throw new IllegalArgumentException("Contains illegal character for hexBinary: " + str);
            }
            bArr[i / 2] = (byte) ((iDigit << 4) + iDigit2);
        }
        return bArr;
    }

    public static String log(byte[] bArr, boolean z) {
        if (bArr == null) {
            return "null";
        }
        int length = bArr.length - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance();
        decimalFormat.applyPattern("0000");
        DecimalFormat decimalFormat2 = (DecimalFormat) DecimalFormat.getInstance();
        decimalFormat2.applyPattern(Constant.DEFAULT_CVN2);
        sb.append("<L : ");
        sb.append(bArr.length);
        sb.append(", ");
        sb.append(bArr.toString());
        int i = 0;
        while (true) {
            if (i % 24 == 0) {
                sb.append(InstanceFactory.ERROR_SEPARATOR);
                sb.append(decimalFormat.format(((i + 1) / 24) + 1));
                sb.append(HTTP.TAB);
            } else {
                sb.append(io.netty.util.internal.StringUtil.SPACE);
                if (i % 12 == 0) {
                    sb.append('\t');
                }
            }
            if (z) {
                String hexString = Integer.toHexString(bArr[i] & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            } else {
                sb.append(decimalFormat2.format(bArr[i] & 255));
            }
            if (i == length) {
                sb.append(Typography.greater);
                return sb.toString();
            }
            i++;
        }
    }

    public static byte[] toBytes(int i) {
        return new byte[]{(byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i};
    }

    public static String toHex(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = new char[bArr.length * 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = bArr[i] & 255;
            int i3 = i * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[i2 >>> 4];
            cArr[i3 + 1] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static String toHex(long j) {
        return Long.toHexString(j);
    }

    public static String log(byte[] bArr) {
        return log(bArr, true);
    }
}
