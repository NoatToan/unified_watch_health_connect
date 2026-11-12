package com.huawei.hms.findnetwork.comm.util;

import android.text.TextUtils;
import com.huawei.hms.findnetwork.comm.log.HmsFindLog;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

/* JADX INFO: loaded from: classes33.dex */
public class ByteUtil {
    private static final int BRIEF_LIMIT = 6;
    private static final int BYTE_LEN = 8;
    private static final int HEX_CHAR_BYTES = 2;
    private static final int MAC_BYTES_LEN = 6;
    private static final int MAC_LEN = 12;
    private static final int RADIX_16 = 16;
    private static final String SHA256 = "SHA-256";
    private static final int SHIFT_4BITS = 4;
    private static final String TAG = "ByteUtil";

    public static int getBit(byte b2, int i) {
        return (b2 >> i) & 1;
    }

    public static int getBit(int i, int i2) {
        return (i >> i2) & 1;
    }

    public static byte toSignedByte(byte b2) {
        if (b2 > 0) {
            return b2;
        }
        String binaryString = Integer.toBinaryString(Math.abs((int) b2));
        StringBuilder sb = new StringBuilder("1");
        for (int i = 0; i < 7 - binaryString.length(); i++) {
            sb.append(0);
        }
        sb.append(binaryString);
        return new BigInteger(sb.toString(), 2).byteValue();
    }

    public static byte[] shortTobyteArray(short s) {
        return ByteBuffer.allocate(2).putShort(s).array();
    }

    public static byte[] shortToBytesLittle(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    public static byte[] shortToBytesBig(short s) {
        return new byte[]{(byte) ((s >> 8) & 255), (byte) (s & 255)};
    }

    public static void reverseBytes(byte[] bArr) {
        int length = bArr.length - 1;
        for (int i = 0; length > i; i++) {
            byte b2 = bArr[length];
            bArr[length] = bArr[i];
            bArr[i] = b2;
            length--;
        }
    }

    public static byte[] longTobyteArray(long j) {
        return ByteBuffer.allocate(8).putLong(j).array();
    }

    public static byte[] longToBytesLittleEndian(long j) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putLong(j);
        return byteBufferAllocate.array();
    }

    public static byte[] intTobyteSubArray(int i) {
        byte[] bArr = new byte[2];
        System.arraycopy(ByteBuffer.allocate(4).putInt(i).array(), 2, bArr, 0, 2);
        return bArr;
    }

    public static byte[] intTobyteArray(int i) {
        return ByteBuffer.allocate(4).putInt(i).array();
    }

    public static byte[] intToBytesLittle(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static byte[] intToBytesBig(int i) {
        return new byte[]{(byte) ((i >> 24) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 8) & 255), (byte) (i & 255)};
    }

    public static byte[] hexStringToBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((Character.digit(str.charAt(i2), 16) << 4) + Character.digit(str.charAt(i2 + 1), 16));
        }
        return bArr;
    }

    public static String hexBrief(byte[] bArr) {
        boolean z = bArr.length > 6;
        int length = z ? 6 : bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        String strByte2hex = byte2hex(bArr2);
        if (!z) {
            return strByte2hex;
        }
        return strByte2hex + "****";
    }

    public static String getSHA256Str(byte[] bArr) {
        try {
            return byte2hex(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException unused) {
            HmsFindLog.e(TAG, "sha256 error.");
            return null;
        }
    }

    public static String getMacByPublicKey(byte[] bArr) {
        if (CollectionUtil.isEmpty(bArr) || bArr.length < 6) {
            return "";
        }
        byte[] bArr2 = new byte[6];
        System.arraycopy(bArr, 0, bArr2, 0, 6);
        return bytesToHexMac(bArr2);
    }

    public static String getMacByFirst6Byte(String str) {
        if (str == null || str.length() != 12) {
            return "";
        }
        byte[] bArrHexStringToBytes = hexStringToBytes(str);
        bArrHexStringToBytes[0] = (byte) (bArrHexStringToBytes[0] | 192);
        return bytesToHexMac(bArrHexStringToBytes);
    }

    public static String getHashUid(String str) {
        return TextUtils.isEmpty(str) ? "" : getSHA256Str(str.getBytes(StandardCharsets.UTF_8));
    }

    public static byte[] getBytes(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[str.length()];
        for (int i = 0; i < charArray.length; i++) {
            bArr[i] = Byte.valueOf(String.valueOf(charArray[i]), 16).byteValue();
        }
        return bArr;
    }

    public static byte[] combineBytes(byte[]... bArr) {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (bArr2 != null) {
                length += bArr2.length;
            }
        }
        byte[] bArr3 = new byte[length];
        int length2 = 0;
        for (byte[] bArr4 : bArr) {
            if (bArr4 != null) {
                System.arraycopy(bArr4, 0, bArr3, length2, bArr4.length);
                length2 += bArr4.length;
            }
        }
        return bArr3;
    }

    public static short bytesToShortLittle(byte[] bArr) {
        if (bArr.length != 2) {
            return (short) 0;
        }
        return (short) ((bArr[0] & 255) | ((bArr[1] & 255) << 8));
    }

    public static short bytesToShortBig(byte[] bArr) {
        if (bArr.length != 2) {
            return (short) 0;
        }
        return (short) ((bArr[1] & 255) | ((bArr[0] & 255) << 8));
    }

    public static long bytesToLong(byte[] bArr, int i, boolean z) {
        long j = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            j |= (((long) bArr[i + i2]) & 255) << ((z ? i2 : 7 - i2) << 3);
        }
        return j;
    }

    public static int bytesToIntLittle(byte[] bArr) {
        if (bArr.length != 4) {
            return 0;
        }
        return (bArr[0] & 255) | ((bArr[3] & 255) << 24) | ((bArr[2] & 255) << 16) | ((bArr[1] & 255) << 8);
    }

    public static int bytesToIntBig(byte[] bArr) {
        if (bArr.length != 4) {
            return 0;
        }
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static String bytesToHexString(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString.toUpperCase(Locale.getDefault()));
        }
        return sb.toString();
    }

    public static String bytesToHexMac(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString.toUpperCase(Locale.getDefault()));
            if (i < bArr.length - 1) {
                sb.append(":");
            }
        }
        return sb.toString();
    }

    public static long byteToLong(byte[] bArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.put(bArr, 0, bArr.length);
        byteBufferAllocate.flip();
        return byteBufferAllocate.getLong();
    }

    public static float byteToFloat(byte[] bArr) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.put(bArr, 0, bArr.length);
        byteBufferAllocate.flip();
        return byteBufferAllocate.getFloat();
    }

    public static short byteArrayToShort(byte[] bArr) {
        if (bArr == null) {
            return (short) 0;
        }
        return ByteBuffer.wrap(bArr).asReadOnlyBuffer().getShort();
    }

    public static long byteArrayToLong(byte[] bArr) {
        if (bArr == null) {
            return 0L;
        }
        return ByteBuffer.wrap(bArr).asReadOnlyBuffer().getLong();
    }

    public static int byteArrayToInt(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return ByteBuffer.wrap(bArr).asReadOnlyBuffer().getInt();
    }

    public static String byte2hex(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            HmsFindLog.e(TAG, "Illegal Argument in bytes to hex.");
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString().toUpperCase(Locale.ENGLISH);
    }
}
