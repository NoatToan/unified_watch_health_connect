package com.tsmclient.smartcard;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.material.timepicker.TimeModel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.threeten.bp.Year;

/* JADX INFO: loaded from: classes6.dex */
public class Coder {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final int[] sizeTable = {9, 99, 999, 9999, 99999, 999999, 9999999, 99999999, Year.MAX_VALUE, Integer.MAX_VALUE};

    public static String bytesToHexString(byte b2) {
        return bytesToHexString(new byte[]{b2}, 0, 1);
    }

    public static int bytesToInt(byte[] bArr, int i, int i2) {
        if (bArr == null || i < 0 || i2 > bArr.length) {
            throw new IllegalArgumentException("argument is null");
        }
        int i3 = i2 + i;
        int i4 = 0;
        while (i < i3) {
            i4 = (i4 << 8) | (bArr[i] & 255);
            i++;
        }
        return i4;
    }

    public static String decodeBase64Coder(String str) {
        return !TextUtils.isEmpty(str) ? new String(Base64.decode(str, 8)) : str;
    }

    public static byte[] decodeBase64ToByteArray(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Base64.decode(str, 8);
    }

    public static String encodeBase64Coder(byte[] bArr) {
        if (bArr != null) {
            return Base64.encodeToString(bArr, 8);
        }
        return null;
    }

    public static String encodeMD5(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(com.xiaomi.smarthome.library.crypto.rc4coder.Coder.KEY_MD5);
            messageDigest.update(str.getBytes());
            return bytesToHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String hashDeviceInfo(String str) {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA1").digest(str.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalStateException("failed to init SHA1 digest");
        }
    }

    public static byte[] hexStringToBytes(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((toByte(str.charAt(i)) << 4) | toByte(str.charAt(i + 1)));
        }
        return bArr;
    }

    public static int hexStringToInt(String str) {
        return bytesToInt(hexStringToBytes(str));
    }

    public static byte[] intArrayToByteArray(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        byte[] bArr = new byte[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            bArr[i] = (byte) iArr[i];
        }
        return bArr;
    }

    public static byte[] shortToByte(short s) {
        return new byte[]{(byte) ((s >>> 8) & 255), (byte) (s & 255)};
    }

    public static int sizeOfInt(int i) {
        if (i < 0) {
            i = -i;
        }
        int i2 = 0;
        while (i > sizeTable[i2]) {
            i2++;
        }
        return i2 + 1;
    }

    public static byte[] str2Bcd(String str) {
        if (str == null) {
            throw new IllegalArgumentException("argument is null");
        }
        int length = str.length();
        if (length % 2 != 0) {
            str = "0" + str;
            length = str.length();
        }
        if (length >= 2) {
            length /= 2;
        }
        byte[] bArr = new byte[length];
        byte[] bytes = str.getBytes();
        for (int i = 0; i < str.length() / 2; i++) {
            int i2 = i * 2;
            byte b2 = bytes[i2];
            int i3 = (b2 < 48 || b2 > 57) ? (b2 < 97 || b2 > 122) ? b2 - 55 : b2 - 87 : b2 - 48;
            byte b3 = bytes[i2 + 1];
            bArr[i] = (byte) ((i3 << 4) + ((b3 < 48 || b3 > 57) ? (b3 < 97 || b3 > 122) ? b3 - 55 : b3 - 87 : b3 - 48));
        }
        return bArr;
    }

    public static String to10Bytes(int i) {
        return String.format("%010d", Integer.valueOf(i));
    }

    public static String to2Bytes(int i) {
        return String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i));
    }

    public static String to4Bytes(int i) {
        return String.format("%04d", Integer.valueOf(i));
    }

    public static String to4HexBytes(int i) {
        return String.format("%04X", Integer.valueOf(i & 65535));
    }

    private static int toByte(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        throw new RuntimeException("Invalid hex char '" + c + "'");
    }

    public static byte toBytesLow(int i) {
        return (byte) (i & 255);
    }

    public static String bytesToHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return bytesToHexString(bArr, 0, bArr.length);
    }

    private static String bytesToHexString(byte[] bArr, int i, int i2) {
        char[] cArr = new char[i2 * 2];
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            byte b2 = bArr[i4];
            int i5 = i3 + 1;
            char[] cArr2 = HEX_DIGITS;
            cArr[i3] = cArr2[(b2 >>> 4) & 15];
            i3 += 2;
            cArr[i5] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static int bytesToInt(byte... bArr) {
        if (bArr != null) {
            int i = 0;
            for (byte b2 : bArr) {
                i = (i << 8) | (b2 & 255);
            }
            return i;
        }
        throw new IllegalArgumentException("argument is null");
    }

    public static String encodeMD5(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(com.xiaomi.smarthome.library.crypto.rc4coder.Coder.KEY_MD5);
            messageDigest.update(bArr);
            return bytesToHexString(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
