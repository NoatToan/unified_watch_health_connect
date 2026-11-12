package com.xiaomi.smarthome.library.bluetooth.utils;

import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes2.dex */
public class DecryptUtil {
    public static long VerifyCRC32(byte[] bArr) {
        CRC32 crc32 = new CRC32();
        crc32.update(bArr);
        return crc32.getValue();
    }

    public static int byteToDecimal(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(String.format("%02X", Byte.valueOf(b2)));
        }
        return Integer.parseInt(sb.toString(), 16);
    }

    public static byte[] hexToBytes(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length + 1) / 2];
        for (int i = 0; i < length; i += 2) {
            try {
                bArr[i / 2] = (byte) Integer.parseInt(str.substring(i, Math.min(2, length - i) + i), 16);
            } catch (Exception e) {
                e.printStackTrace();
                return new byte[0];
            }
        }
        return bArr;
    }
}
