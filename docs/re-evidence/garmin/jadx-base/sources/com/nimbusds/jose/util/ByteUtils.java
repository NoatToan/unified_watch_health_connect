package com.nimbusds.jose.util;

import com.airbnb.lottie.animation.keyframe.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ByteUtils {
    public static int bitLength(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return bitLength(bArr.length);
    }

    public static int byteLength(int i14) {
        return i14 / 8;
    }

    public static byte[] concat(byte[]... bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    byteArrayOutputStream.write(bArr2);
                }
            }
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e4) {
            a.x(e4.getMessage(), e4);
            return null;
        }
    }

    public static boolean isZeroFilled(byte[] bArr) {
        for (byte b14 : bArr) {
            if (b14 != 0) {
                return false;
            }
        }
        return true;
    }

    public static int safeBitLength(int i14) throws IntegerOverflowException {
        long j8 = ((long) i14) * 8;
        int i15 = (int) j8;
        if (i15 == j8) {
            return i15;
        }
        throw new IntegerOverflowException();
    }

    public static byte[] subArray(byte[] bArr, int i14, int i15) {
        byte[] bArr2 = new byte[i15];
        System.arraycopy(bArr, i14, bArr2, 0, i15);
        return bArr2;
    }

    public static int bitLength(int i14) {
        return i14 * 8;
    }

    public static int safeBitLength(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        return safeBitLength(bArr.length);
    }
}
