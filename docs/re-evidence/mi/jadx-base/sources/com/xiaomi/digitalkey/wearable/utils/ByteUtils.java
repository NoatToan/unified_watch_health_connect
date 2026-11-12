package com.xiaomi.digitalkey.wearable.utils;

import defpackage.m12;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class ByteUtils {
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    private ByteUtils() {
    }

    public static Long BytesToLong(byte[] bArr) {
        long j;
        if (bArr == null || bArr.length > 8) {
            j = 0;
        } else {
            byte[] bArr2 = new byte[8];
            System.arraycopy(bArr, 0, bArr2, 8 - bArr.length, bArr.length);
            j = ByteBuffer.wrap(bArr2).getLong();
        }
        return Long.valueOf(j);
    }

    public static short BytesToShort(byte[] bArr) {
        if (bArr == null || bArr.length > 2) {
            return (short) 0;
        }
        if (bArr.length == 1) {
            bArr = new byte[]{0, bArr[0]};
        }
        return ByteBuffer.wrap(bArr).getShort();
    }

    public static String ConvertToBTAddress(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            sb.append(String.format("%02X:", Byte.valueOf(b2)));
        }
        String string = sb.toString();
        return string.substring(0, string.length() - 1);
    }

    public static byte[] ShortToBytes(Short sh) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort(0, sh.shortValue());
        return byteBufferAllocate.array();
    }

    public static String byteArrytoXPSString(byte[] bArr, String str) {
        HashMap map = new HashMap();
        map.put("type", str);
        map.put("data", m12.d(bArr));
        new JSONObject(map).toString();
        return new JSONObject(map).toString();
    }

    public static boolean checkRSPSWexpected(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length < 2) {
            return false;
        }
        return equals(clone(bArr, bArr.length - 2, 2), bArr2);
    }

    public static byte[] clone(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[] concat(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            length += bArr2.length;
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
            length2 += bArr4.length;
        }
        return bArr3;
    }

    public static byte[] concatenate(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static byte[] concatenateTLV(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        if (bArr2 == null) {
            return concatenate(bArr, new byte[]{0});
        }
        if (bArr2.length <= 127) {
            bArr3 = new byte[]{(byte) bArr2.length};
        } else {
            bArr3 = bArr2.length <= 255 ? new byte[]{-127, (byte) bArr2.length} : new byte[]{-126, (byte) ((bArr2.length & 65280) >> 8), (byte) (255 & bArr2.length)};
        }
        return concatenate(concatenate(bArr, bArr3), bArr2);
    }

    public static int deepHashCode(byte[] bArr) {
        int i = 1;
        for (byte b2 : bArr) {
            i = (i * 31) + b2;
        }
        return i;
    }

    public static boolean equals(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null;
        }
        if (bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            z &= bArr[length] == bArr2[length];
        }
        return z;
    }

    public static byte[] expandByteArray(byte[] bArr, int i) {
        if (bArr == null || bArr.length >= i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        int length = bArr.length;
        System.arraycopy(bArr, 0, bArr2, i - length, length);
        return bArr2;
    }

    public static byte[] fromBTAddress(String str) {
        byte[] bArrConcatenate = null;
        for (String str2 : str.split(":")) {
            byte[] bArrFromHexString = fromHexString(str2);
            bArrConcatenate = bArrConcatenate == null ? bArrFromHexString : concatenate(bArrConcatenate, bArrFromHexString);
        }
        return bArrConcatenate;
    }

    public static byte[] fromHexString(String str) {
        char[] charArray = str.toUpperCase().toCharArray();
        int i = 0;
        for (char c : charArray) {
            if ((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F')) {
                i++;
            }
        }
        byte[] bArr = new byte[(i + 1) >> 1];
        int i2 = i & 1;
        for (char c2 : charArray) {
            if (c2 < '0' || c2 > '9') {
                if (c2 >= 'A' && c2 <= 'F') {
                    int i3 = i2 >> 1;
                    byte b2 = (byte) (bArr[i3] << 4);
                    bArr[i3] = b2;
                    bArr[i3] = (byte) ((c2 - '7') | b2);
                }
            } else {
                int i4 = i2 >> 1;
                byte b3 = (byte) (bArr[i4] << 4);
                bArr[i4] = b3;
                bArr[i4] = (byte) ((c2 - '0') | b3);
            }
            i2++;
        }
        return bArr;
    }

    public static String generateBase64EncodedSecret(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return m12.d(bArr);
    }

    public static byte[] getByteArray(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(i);
        return byteBufferAllocate.array();
    }

    public static String getLimitValidUTF8String(String str, int i) {
        if (str == null) {
            return null;
        }
        return str.getBytes().length <= i ? str : getLimitValidUTF8String(str.substring(0, str.length() - 1), i);
    }

    public static byte[] intToBytes(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt(0, i);
        return byteBufferAllocate.array();
    }

    public static boolean isValidHexString(String str) {
        if (str == null) {
            return false;
        }
        for (char c : str.toUpperCase().toCharArray()) {
            if (c < '0' || ((c > '9' && c < 'A') || c > 'F')) {
                return false;
            }
        }
        return true;
    }

    public static byte[] longToBytes(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putLong(0, j);
        return byteBufferAllocate.array();
    }

    public static byte[] randomByteArry(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }

    public static String randomString(int i) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".charAt(random.nextInt(36)));
        }
        return sb.toString();
    }

    public static byte[] revertCopy(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = bArr[(bArr.length - 1) - i];
        }
        return bArr2;
    }

    public static byte[][] split(byte[] bArr, int i) throws ArrayIndexOutOfBoundsException {
        if (i > bArr.length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        byte[][] bArr2 = {new byte[i], new byte[bArr.length - i]};
        System.arraycopy(bArr, 0, bArr2[0], 0, i);
        System.arraycopy(bArr, i, bArr2[1], 0, bArr.length - i);
        return bArr2;
    }

    public static int stream2len(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        if (bArr.length == 4) {
            return byteBufferWrap.getInt();
        }
        if (bArr.length == 2) {
            return byteBufferWrap.getShort();
        }
        if (bArr.length == 1) {
            return bArr[0];
        }
        return 0;
    }

    public static byte[] subArray(byte[] bArr, int i) {
        return subArray(bArr, i, bArr.length);
    }

    public static String toBinaryString(byte[] bArr) {
        String str = "";
        for (int i = 0; i < bArr.length; i++) {
            byte b2 = bArr[i];
            for (int i2 = 0; i2 < 8; i2++) {
                str = str + ((b2 >>> i2) & 1);
            }
            if (i != bArr.length - 1) {
                str = str + " ";
            }
        }
        return str;
    }

    public static char[] toCharArray(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            cArr[i] = (char) bArr[i];
        }
        return cArr;
    }

    public static String toHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        String str = "";
        for (int i = 0; i < bArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            char[] cArr = HEX_CHARS;
            sb.append(cArr[(bArr[i] >>> 4) & 15]);
            str = sb.toString() + cArr[bArr[i] & 15];
        }
        return str;
    }

    public static byte[] xor(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int length = bArr.length - 1; length >= 0; length--) {
            bArr3[length] = (byte) (bArr[length] ^ bArr2[length]);
        }
        return bArr3;
    }

    public static byte[] clone(byte[] bArr, int i) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length - i];
        System.arraycopy(bArr, i, bArr2, 0, bArr.length - i);
        return bArr2;
    }

    public static byte[] concatenate(byte[][] bArr) {
        int length = bArr[0].length;
        byte[] bArr2 = new byte[bArr.length * length];
        int i = 0;
        for (byte[] bArr3 : bArr) {
            System.arraycopy(bArr3, 0, bArr2, i, length);
            i += length;
        }
        return bArr2;
    }

    public static int deepHashCode(byte[][] bArr) {
        int iDeepHashCode = 1;
        for (byte[] bArr2 : bArr) {
            iDeepHashCode = (iDeepHashCode * 31) + deepHashCode(bArr2);
        }
        return iDeepHashCode;
    }

    public static boolean equals(byte[][] bArr, byte[][] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        boolean zEquals = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            zEquals &= equals(bArr[length], bArr2[length]);
        }
        return zEquals;
    }

    public static byte[] getByteArray(short s) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort(s);
        return byteBufferAllocate.array();
    }

    public static byte[] subArray(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return bArr2;
    }

    public static String toHexString(byte[] bArr, String str, String str2) {
        String str3 = new String(str);
        for (int i = 0; i < bArr.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3);
            char[] cArr = HEX_CHARS;
            sb.append(cArr[(bArr[i] >>> 4) & 15]);
            str3 = sb.toString() + cArr[bArr[i] & 15];
            if (i < bArr.length - 1) {
                str3 = str3 + str2;
            }
        }
        return str3;
    }

    public static byte[] clone(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public static int deepHashCode(byte[][][] bArr) {
        int iDeepHashCode = 1;
        for (byte[][] bArr2 : bArr) {
            iDeepHashCode = (iDeepHashCode * 31) + deepHashCode(bArr2);
        }
        return iDeepHashCode;
    }

    public static boolean equals(byte[][][] bArr, byte[][][] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        boolean zEquals = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte[][] bArr3 = bArr[length];
            if (bArr3.length != bArr2[length].length) {
                return false;
            }
            for (int length2 = bArr3.length - 1; length2 >= 0; length2--) {
                zEquals &= equals(bArr[length][length2], bArr2[length][length2]);
            }
        }
        return zEquals;
    }
}
