package com.airoha.android.lib.util;

/* JADX INFO: loaded from: classes2.dex */
public class Crc16 {
    public static short INIT_VALUE = -1;

    public static short calculate(short s, byte b) {
        short s2 = (short) ((b ^ (s >>> 8)) & 255);
        short s3 = (short) (s2 ^ (s2 >>> 4));
        return (short) ((((s << 8) ^ (s3 << 12)) ^ (s3 << 5)) ^ s3);
    }

    public static short calculate(byte[] bArr, int i, int i2) {
        short sCalculate = INIT_VALUE;
        while (true) {
            int i3 = i2 - 1;
            if (i2 <= 0) {
                return sCalculate;
            }
            sCalculate = calculate(sCalculate, bArr[i]);
            i++;
            i2 = i3;
        }
    }

    public static byte[] get2BytesCRC(byte[] bArr) {
        return int16ToBytes(calculate(bArr));
    }

    public static byte[] int16ToBytes(short s) {
        return new byte[]{(byte) (s >>> 8), (byte) s};
    }

    public static short calculate(byte[] bArr) {
        return calculate(bArr, 0, bArr.length);
    }
}
