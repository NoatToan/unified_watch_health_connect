package com.google.crypto.tink.subtle;

import com.google.android.gms.internal.measurement.a;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class Bytes {
    public static int byteArrayToInt(byte[] bArr, int i14, int i15) {
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            i16 += (bArr[i17 + i14] & 255) << (i17 * 8);
        }
        return i16;
    }

    public static byte[] concat(byte[]... bArr) throws GeneralSecurityException {
        int length = 0;
        for (byte[] bArr2 : bArr) {
            if (length > Integer.MAX_VALUE - bArr2.length) {
                a.t("exceeded size limit");
                return null;
            }
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

    public static final boolean equal(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i14 = 0;
        for (int i15 = 0; i15 < bArr.length; i15++) {
            i14 |= bArr[i15] ^ bArr2[i15];
        }
        return i14 == 0;
    }

    public static byte[] intToByteArray(int i14, int i15) {
        byte[] bArr = new byte[i14];
        for (int i16 = 0; i16 < i14; i16++) {
            bArr[i16] = (byte) ((i15 >> (i16 * 8)) & 255);
        }
        return bArr;
    }

    public static final void xor(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i14) {
        if (i14 < 0 || byteBuffer2.remaining() < i14 || byteBuffer3.remaining() < i14 || byteBuffer.remaining() < i14) {
            h.s("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
            return;
        }
        for (int i15 = 0; i15 < i14; i15++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static final byte[] xorEnd(byte[] bArr, byte[] bArr2) {
        if (bArr.length < bArr2.length) {
            h.s("xorEnd requires a.length >= b.length");
            return null;
        }
        int length = bArr.length - bArr2.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        for (int i14 = 0; i14 < bArr2.length; i14++) {
            int i15 = length + i14;
            bArrCopyOf[i15] = (byte) (bArrCopyOf[i15] ^ bArr2[i14]);
        }
        return bArrCopyOf;
    }

    public static int byteArrayToInt(byte[] bArr, int i14) {
        return byteArrayToInt(bArr, 0, i14);
    }

    public static int byteArrayToInt(byte[] bArr) {
        return byteArrayToInt(bArr, bArr.length);
    }

    public static final byte[] xor(byte[] bArr, int i14, byte[] bArr2, int i15, int i16) {
        if (i16 >= 0 && bArr.length - i16 >= i14 && bArr2.length - i16 >= i15) {
            byte[] bArr3 = new byte[i16];
            for (int i17 = 0; i17 < i16; i17++) {
                bArr3[i17] = (byte) (bArr[i17 + i14] ^ bArr2[i17 + i15]);
            }
            return bArr3;
        }
        h.s("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        return null;
    }

    public static final byte[] xor(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return xor(bArr, 0, bArr2, 0, bArr.length);
        }
        h.s("The lengths of x and y should match.");
        return null;
    }
}
