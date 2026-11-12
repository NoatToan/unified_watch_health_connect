package com.beaglebuddy.util;

import com.beaglebuddy.id3.enums.v24.Encoding;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes2.dex */
public class Utility {
    public static int bytesToInt(byte[] bArr) {
        return bytesToInt(bArr, 0);
    }

    public static short bytesToShort(byte[] bArr) {
        return bytesToShort(bArr, 0);
    }

    public static int bytesToSynchsafeInt(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 21) + ((bArr[i + 1] & 255) << 14) + ((bArr[i + 2] & 255) << 7) + (bArr[i + 3] & 255);
    }

    public static short bytesToSynchsafeShort(byte[] bArr, int i) {
        return (short) (((bArr[i] & 255) << 7) + (bArr[i + 1] & 255));
    }

    public static String formateDate(Date date) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        if (date == null) {
            date = new Date();
        }
        return simpleDateFormat.format(date);
    }

    public static String getUTF16String(String str) {
        Encoding encoding = Encoding.UTF_16;
        byte[] bytes = str.getBytes(encoding.getCharacterSet());
        if (bytes.length >= 2 && bytes[0] == -2 && bytes[1] == -1) {
            return str;
        }
        byte[] bArr = new byte[bytes.length + 2];
        bytes[0] = -2;
        bytes[1] = -1;
        System.arraycopy(bytes, 0, bArr, 2, bytes.length);
        return new String(bArr, encoding.getCharacterSet());
    }

    public static String getUTF8String(String str) {
        Encoding encoding = Encoding.UTF_8;
        byte[] bytes = str.getBytes(encoding.getCharacterSet());
        if (bytes.length >= 3 && bytes[0] == -17 && bytes[1] == -69 && bytes[2] == -65) {
            return str;
        }
        byte[] bArr = new byte[bytes.length + 2];
        bytes[0] = ByteSourceJsonBootstrapper.UTF8_BOM_1;
        bytes[1] = ByteSourceJsonBootstrapper.UTF8_BOM_2;
        bytes[1] = ByteSourceJsonBootstrapper.UTF8_BOM_3;
        System.arraycopy(bytes, 0, bArr, 3, bytes.length);
        return new String(bArr, encoding.getCharacterSet());
    }

    public static String hex(byte b) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        stringBuffer.append("0x");
        stringBuffer.append(cArr[(byte) ((b & 240) >> 4)]);
        stringBuffer.append(cArr[(byte) (b & 15)]);
        return stringBuffer.toString();
    }

    public static byte[] intToBytes(int i) {
        return new byte[]{(byte) (((-16777216) & i) >> 24), (byte) ((16711680 & i) >> 16), (byte) ((65280 & i) >> 8), (byte) (i & 255)};
    }

    public static int littleEndianBytesToInt(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static String pad(int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < i; i2++) {
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }

    public static byte[] shortToBytes(int i) {
        return new byte[]{(byte) ((65280 & i) >> 8), (byte) (i & 255)};
    }

    public static byte[] synchsafeIntToBytes(int i) {
        return new byte[]{(byte) ((266338304 & i) >> 21), (byte) ((2080768 & i) >> 14), (byte) ((i & 16256) >> 7), (byte) (i & 127)};
    }

    public static int bytesToInt(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static short bytesToShort(byte[] bArr, int i) {
        return (short) (((bArr[i] & 255) << 8) + (bArr[i + 1] & 255));
    }

    public static String hex(byte[] bArr) {
        return hex(bArr, 0);
    }

    public static String hex(byte[] bArr, int i) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (i2 != 0 && i2 % 16 == 0) {
                stringBuffer.append("\n");
                stringBuffer.append(pad(i));
            }
            stringBuffer.append(hex(bArr[i2]));
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }
}
