package com.airoha.android.lib.util;

import com.google.common.primitives.Bytes;
import io.netty.util.internal.StringUtil;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class Converter {
    private static final char[] a = "0123456789ABCDEF".toCharArray();

    public static int BytesToInt(byte b, byte b2) {
        return ((b & 255) << 8) + (b2 & 255);
    }

    public static short BytesToShort(byte b, byte b2) {
        return (short) (((b & 255) << 8) | (b2 & 255));
    }

    public static int BytesToU16(byte b, byte b2) {
        return ((b & 255) << 8) + (b2 & 255);
    }

    public static byte[] ShortToBytes(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    public static String byte2HerStrReverse(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int length = bArr.length - 1; length >= 0; length--) {
            char[] cArr = a;
            sb.append(cArr[(bArr[length] & 255) >> 4]);
            sb.append(cArr[bArr[length] & 15]);
            sb.append(StringUtil.SPACE);
        }
        return sb.toString().trim().toUpperCase(Locale.US);
    }

    public static String byte2HexStr(byte[] bArr, int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            char[] cArr = a;
            sb.append(cArr[(bArr[i2] & 255) >> 4]);
            sb.append(cArr[bArr[i2] & 15]);
            sb.append(StringUtil.SPACE);
        }
        return sb.toString().trim().toUpperCase(Locale.US);
    }

    public static String byte2HexStrWithoutSeperator(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            char[] cArr = a;
            sb.append(cArr[(bArr[i] & 255) >> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString().trim().toUpperCase(Locale.US);
    }

    public static String byteArrayToHexString(byte[] bArr) {
        String str = "";
        for (byte b : bArr) {
            str = str + String.format("%02x", Byte.valueOf(b));
        }
        return str;
    }

    public static int bytesToInt32(byte[] bArr) {
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    public static String hexToAsciiString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] >= 32) {
                sb.append((char) bArr[i]);
            }
        }
        return sb.toString();
    }

    public static byte intToByte(int i) {
        return (byte) i;
    }

    public static byte[] intToByteArray(int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i);
        return byteBufferAllocate.array();
    }

    public static byte[] intToBytes(int i) {
        return new byte[]{(byte) (i & 255), (byte) ((i >> 8) & 255), (byte) ((i >> 16) & 255), (byte) ((i >> 24) & 255)};
    }

    public static byte[] listBytesToBytes(List<Byte> list) {
        return Bytes.toArray(list);
    }

    public static String short2Str(Short[] shArr) {
        StringBuilder sb = new StringBuilder();
        for (Short sh : shArr) {
            sb.append(sh);
            sb.append(StringUtil.SPACE);
        }
        return sb.toString().trim().toUpperCase(Locale.US);
    }

    public static byte[] shortArrToBytes(short[] sArr) {
        byte[] bArr = new byte[sArr.length * 2];
        for (int i = 0; i < sArr.length; i++) {
            System.arraycopy(shortToBytes(sArr[i]), 0, bArr, i * 2, 2);
        }
        return bArr;
    }

    public static String shortArrToString(short[] sArr) {
        StringBuilder sb = new StringBuilder();
        for (short s : sArr) {
            sb.append((int) s);
            sb.append(',');
        }
        return sb.toString().trim();
    }

    public static byte[] shortToBytes(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    public static byte[] stringtoascii(String str) {
        byte[] bArr = new byte[0];
        try {
            return str.getBytes("US-ASCII");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return bArr;
        }
    }

    public static String byte2HexStr(byte b) {
        StringBuilder sb = new StringBuilder();
        char[] cArr = a;
        sb.append(cArr[(b & 255) >> 4]);
        sb.append(cArr[b & 15]);
        return sb.toString().trim().toUpperCase(Locale.US);
    }

    public static String byte2HexStr(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            char[] cArr = a;
            sb.append(cArr[(bArr[i] & 255) >> 4]);
            sb.append(cArr[bArr[i] & 15]);
            sb.append(StringUtil.SPACE);
        }
        return sb.toString().trim().toUpperCase(Locale.US);
    }
}
