package com.xiaomi.smarthome.core.server.internal.plugin.util;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes10.dex */
public class ByteUtils {
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String byteBufferToString(ByteBuffer byteBuffer) {
        try {
            CharBuffer charBufferDecode = Charset.forName("UTF-8").newDecoder().decode(byteBuffer);
            byteBuffer.flip();
            return charBufferDecode.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String byteToString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (!isEmpty(bArr)) {
            for (byte b2 : bArr) {
                sb.append(String.format("%02X", Byte.valueOf(b2)));
            }
        }
        return sb.toString();
    }

    public static byte[] hex2Bytes(String str) {
        if (str == null || str.trim().equals("")) {
            return new byte[0];
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < str.length() / 2; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    public static boolean isEmpty(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    public static String toHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b2 : bArr) {
            char[] cArr = HEX_DIGITS;
            sb.append(cArr[(b2 & 240) >>> 4]);
            sb.append(cArr[b2 & 15]);
        }
        return sb.toString();
    }
}
