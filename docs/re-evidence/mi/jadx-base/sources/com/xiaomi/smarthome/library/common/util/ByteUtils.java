package com.xiaomi.smarthome.library.common.util;

import android.text.TextUtils;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class ByteUtils {
    public static final int BYTE_MAX = 255;
    public static final byte[] EMPTY_BYTES = new byte[0];
    public static final int INTEGER_LENGTH = 4;

    public static short byteArrayToShort(byte[] bArr, int i, boolean z) {
        int i2;
        int i3;
        if (z) {
            i2 = (bArr[i] & 255) << 8;
            i3 = bArr[i + 1] & 255;
        } else {
            i2 = bArr[i] & 255;
            i3 = (bArr[i + 1] & 255) << 8;
        }
        return (short) (i3 | i2);
    }

    public static boolean byteEquals(byte[] bArr, byte[] bArr2) {
        int length;
        if (bArr == null && bArr2 == null) {
            return true;
        }
        if (bArr == null || bArr2 == null || (length = bArr.length) != bArr2.length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static String byteToString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (!isEmpty(bArr)) {
            for (byte b2 : bArr) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
        }
        return sb.toString();
    }

    public static String byteToStringLittleEndian(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (!isEmpty(bArr)) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                sb.append(String.format("%02x", Byte.valueOf(bArr[length])));
            }
        }
        return sb.toString();
    }

    public static void copy(byte[] bArr, byte[] bArr2, int i, int i2) {
        if (bArr == null || bArr2 == null || i < 0) {
            return;
        }
        while (i2 < bArr2.length && i < bArr.length) {
            bArr[i] = bArr2[i2];
            i++;
            i2++;
        }
    }

    public static byte[] cutAfterBytes(byte[] bArr, byte b2) {
        if (isEmpty(bArr)) {
            return bArr;
        }
        for (int length = bArr.length - 1; length >= 0; length--) {
            if (bArr[length] != b2) {
                return Arrays.copyOfRange(bArr, 0, length + 1);
            }
        }
        return EMPTY_BYTES;
    }

    public static byte[] cutBeforeBytes(byte[] bArr, byte b2) {
        if (isEmpty(bArr)) {
            return bArr;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != b2) {
                return Arrays.copyOfRange(bArr, i, bArr.length);
            }
        }
        return EMPTY_BYTES;
    }

    public static String decodeBase36(String str) {
        String string = new BigInteger(new StringBuilder(str).toString(), 36).toString(16);
        return (TextUtils.isEmpty(string) || string.length() >= 32) ? string : String.format("%32s", string).replace(' ', '0');
    }

    public static String encodeBase36(byte[] bArr) {
        String strByteToString = byteToString(Arrays.copyOf(bArr, 16));
        StringBuilder sb = new StringBuilder();
        sb.append("hexString1 : ");
        sb.append(strByteToString);
        BigInteger bigInteger = new BigInteger(strByteToString, 16);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("base 36 : ");
        sb2.append(bigInteger.toString(36));
        return bigInteger.toString(36).toUpperCase(Locale.ENGLISH);
    }

    public static boolean equals(byte[] bArr, byte[] bArr2) {
        return equals(bArr, bArr2, Math.min(bArr.length, bArr2.length));
    }

    public static byte[] fillBeforeBytes(byte[] bArr, int i, byte b2) {
        int length = bArr != null ? bArr.length : 0;
        if (length >= i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        int i2 = i - 1;
        int i3 = length - 1;
        while (i2 >= 0) {
            if (i3 >= 0) {
                bArr2[i2] = bArr[i3];
            } else {
                bArr2[i2] = b2;
            }
            i2--;
            i3--;
        }
        return bArr2;
    }

    public static byte[] fromInt(int i) {
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) (i >>> (i2 * 8));
        }
        return bArr;
    }

    public static byte[] fromLong(long j) {
        byte[] bArr = new byte[8];
        for (int i = 0; i < 8; i++) {
            bArr[i] = (byte) (j >>> (i * 8));
        }
        return bArr;
    }

    public static byte[] fromShort(short s) {
        return new byte[]{(byte) s, (byte) (s >>> 8)};
    }

    public static byte[] get(byte[] bArr, int i) {
        return get(bArr, i, bArr.length - i);
    }

    public static boolean getBit(byte b2, int i, boolean z) {
        if (z) {
            return (b2 & (1 << i)) != 0;
        }
        return (b2 & (1 << (7 - i))) != 0;
    }

    public static byte[] getBytes(byte[] bArr, int i, int i2) {
        byte[] bArr2 = null;
        if (bArr == null) {
            return null;
        }
        if (i >= 0 && i < bArr.length && i2 >= 0 && i2 < bArr.length) {
            if (i > i2) {
                return null;
            }
            bArr2 = new byte[(i2 - i) + 1];
            for (int i3 = i; i3 <= i2; i3++) {
                bArr2[i3 - i] = bArr[i3];
            }
        }
        return bArr2;
    }

    public static byte[] getNonEmptyByte(byte[] bArr) {
        return bArr != null ? bArr : EMPTY_BYTES;
    }

    public static String getText(byte[] bArr) {
        return new String(bArr);
    }

    public static boolean isAllFF(byte[] bArr) {
        int length = bArr != null ? bArr.length : 0;
        for (int i = 0; i < length; i++) {
            if (ubyteToInt(bArr[i]) != 255) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static boolean isNormalBytes(byte[] bArr) {
        return (isEmpty(bArr) || isAllFF(bArr)) ? false : true;
    }

    public static boolean isSameElement(byte[] bArr, byte b2) {
        if (bArr == null) {
            return false;
        }
        for (byte b3 : bArr) {
            if (b3 != b2) {
                return false;
            }
        }
        return true;
    }

    public static byte[] parseDevInfoFeature(byte[] bArr) {
        byte[] bArrFromShort = fromShort(ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort());
        byte b2 = bArrFromShort[0];
        byte b3 = bArrFromShort[1];
        byte[] bArr2 = new byte[16];
        for (int i = 0; i <= 7; i++) {
            bArr2[i] = (byte) (b2 & 1);
            b2 = (byte) (b2 >> 1);
        }
        for (int i2 = 8; i2 <= 15; i2++) {
            bArr2[i2] = (byte) (b3 & 1);
            b3 = (byte) (b3 >> 1);
        }
        return bArr2;
    }

    public static byte[] stringToBytes(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length + 1) / 2];
        for (int i = 0; i < length; i += 2) {
            try {
                bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, Math.min(2, length - i) + i), 16);
            } catch (Exception e) {
                e.printStackTrace();
                return EMPTY_BYTES;
            }
        }
        return bArr;
    }

    public static byte[] stringToBytesLittleEndian(String str) {
        int length = str.length();
        int i = (length + 1) / 2;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < length; i2 += 2) {
            try {
                bArr[(i - (i2 / 2)) - 1] = (byte) Integer.parseInt(str.substring(i2, Math.min(2, length - i2) + i2), 16);
            } catch (Exception e) {
                e.printStackTrace();
                return EMPTY_BYTES;
            }
        }
        return bArr;
    }

    public static int toInt(byte[] bArr) {
        int i = 0;
        if (bArr.length != 4) {
            return 0;
        }
        int i2 = 0;
        while (i < 4) {
            int i3 = i + 1;
            i2 = (int) (((long) i2) + (((long) (bArr[i] << (i * 8))) & ((1 << (i3 * 8)) - 1)));
            i = i3;
        }
        return i2;
    }

    public static int ubyteToInt(byte b2) {
        return b2 & 255;
    }

    public static byte[] unitByteArray(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null) {
            return bArr;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static boolean equals(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length < i || bArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public static byte[] get(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static boolean getBit(byte b2, int i) {
        return getBit(b2, i, true);
    }

    public static boolean byteEquals(byte[] bArr, int i, byte[] bArr2) {
        int length;
        if (bArr == null && bArr2 == null) {
            return true;
        }
        if (bArr == null || bArr2 == null || i < 0 || i >= bArr.length || (length = (bArr2.length + i) - 1) < 0 || length >= bArr.length) {
            return false;
        }
        for (int i2 = i; i2 <= length; i2++) {
            if (bArr[i2] != bArr2[i2 - i]) {
                return false;
            }
        }
        return true;
    }
}
