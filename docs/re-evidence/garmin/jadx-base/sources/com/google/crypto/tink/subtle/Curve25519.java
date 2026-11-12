package com.google.crypto.tink.subtle;

import androidx.room.a0;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import com.google.crypto.tink.annotations.Alpha;
import java.security.InvalidKeyException;
import java.util.Arrays;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes2.dex */
@Alpha
final class Curve25519 {
    static final byte[][] BANNED_PUBLIC_KEYS = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, Ascii.SYN, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, Ascii.SYN, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, Ascii.FS, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.DEL}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.DEL}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.DEL}};

    public static void copyConditional(long[] jArr, long[] jArr2, int i14) {
        int i15 = -i14;
        for (int i16 = 0; i16 < 10; i16++) {
            long j8 = jArr[i16];
            jArr[i16] = ((int) j8) ^ ((((int) j8) ^ ((int) jArr2[i16])) & i15);
        }
    }

    public static void curveMult(long[] jArr, byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        validatePubKeyAndClearMsb(bArr2);
        long[] jArrExpand = Field25519.expand(bArr2);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        System.arraycopy(jArrExpand, 0, jArr2, 0, 10);
        int i14 = 0;
        while (i14 < 32) {
            int i15 = bArr[31 - i14] & UnsignedBytes.MAX_VALUE;
            long[] jArr10 = jArr6;
            long[] jArr11 = jArr3;
            long[] jArr12 = jArr10;
            long[] jArr13 = jArr4;
            long[] jArr14 = jArr5;
            long[] jArr15 = jArr7;
            long[] jArr16 = jArr2;
            int i16 = 0;
            long[] jArr17 = jArr9;
            long[] jArr18 = jArr8;
            while (i16 < 8) {
                int i17 = (i15 >> (7 - i16)) & 1;
                swapConditional(jArr13, jArr16, i17);
                swapConditional(jArr14, jArr11, i17);
                monty(jArr18, jArr17, jArr12, jArr15, jArr13, jArr14, jArr16, jArr11, jArrExpand);
                swapConditional(jArr18, jArr12, i17);
                swapConditional(jArr17, jArr15, i17);
                i16++;
                long[] jArr19 = jArr13;
                jArr13 = jArr18;
                jArr18 = jArr19;
                long[] jArr20 = jArr14;
                jArr14 = jArr17;
                jArr17 = jArr20;
                long[] jArr21 = jArr16;
                jArr16 = jArr12;
                jArr12 = jArr21;
                long[] jArr22 = jArr11;
                jArr11 = jArr15;
                jArr15 = jArr22;
            }
            i14++;
            long[] jArr23 = jArr11;
            jArr6 = jArr12;
            jArr3 = jArr23;
            jArr8 = jArr18;
            jArr9 = jArr17;
            jArr7 = jArr15;
            jArr2 = jArr16;
            jArr5 = jArr14;
            jArr4 = jArr13;
        }
        long[] jArr24 = new long[10];
        Field25519.inverse(jArr24, jArr5);
        Field25519.mult(jArr, jArr4, jArr24);
        if (isCollinear(jArrExpand, jArr, jArr2, jArr3)) {
            return;
        }
        a0.s(Hex.encode(bArr2), "Arithmetic error in curve multiplication with the public key: ");
    }

    private static boolean isCollinear(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4) {
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[11];
        long[] jArr8 = new long[11];
        long[] jArr9 = new long[11];
        Field25519.mult(jArr5, jArr, jArr2);
        Field25519.sum(jArr6, jArr, jArr2);
        long[] jArr10 = new long[10];
        jArr10[0] = 486662;
        Field25519.sum(jArr8, jArr6, jArr10);
        Field25519.mult(jArr8, jArr8, jArr4);
        Field25519.sum(jArr8, jArr3);
        Field25519.mult(jArr8, jArr8, jArr5);
        Field25519.mult(jArr8, jArr8, jArr3);
        Field25519.scalarProduct(jArr7, jArr8, 4L);
        Field25519.reduceCoefficients(jArr7);
        Field25519.mult(jArr8, jArr5, jArr4);
        Field25519.sub(jArr8, jArr8, jArr4);
        Field25519.mult(jArr9, jArr6, jArr3);
        Field25519.sum(jArr8, jArr8, jArr9);
        Field25519.square(jArr8, jArr8);
        return Bytes.equal(Field25519.contract(jArr7), Field25519.contract(jArr8));
    }

    private static void monty(long[] jArr, long[] jArr2, long[] jArr3, long[] jArr4, long[] jArr5, long[] jArr6, long[] jArr7, long[] jArr8, long[] jArr9) {
        long[] jArrCopyOf = Arrays.copyOf(jArr5, 10);
        long[] jArr10 = new long[19];
        long[] jArr11 = new long[19];
        long[] jArr12 = new long[19];
        long[] jArr13 = new long[19];
        long[] jArr14 = new long[19];
        long[] jArr15 = new long[19];
        long[] jArr16 = new long[19];
        Field25519.sum(jArr5, jArr6);
        Field25519.sub(jArr6, jArrCopyOf);
        long[] jArrCopyOf2 = Arrays.copyOf(jArr7, 10);
        Field25519.sum(jArr7, jArr8);
        Field25519.sub(jArr8, jArrCopyOf2);
        Field25519.product(jArr13, jArr7, jArr6);
        Field25519.product(jArr14, jArr5, jArr8);
        Field25519.reduceSizeByModularReduction(jArr13);
        Field25519.reduceCoefficients(jArr13);
        Field25519.reduceSizeByModularReduction(jArr14);
        Field25519.reduceCoefficients(jArr14);
        System.arraycopy(jArr13, 0, jArrCopyOf2, 0, 10);
        Field25519.sum(jArr13, jArr14);
        Field25519.sub(jArr14, jArrCopyOf2);
        Field25519.square(jArr16, jArr13);
        Field25519.square(jArr15, jArr14);
        Field25519.product(jArr14, jArr15, jArr9);
        Field25519.reduceSizeByModularReduction(jArr14);
        Field25519.reduceCoefficients(jArr14);
        System.arraycopy(jArr16, 0, jArr3, 0, 10);
        System.arraycopy(jArr14, 0, jArr4, 0, 10);
        Field25519.square(jArr11, jArr5);
        Field25519.square(jArr12, jArr6);
        Field25519.product(jArr, jArr11, jArr12);
        Field25519.reduceSizeByModularReduction(jArr);
        Field25519.reduceCoefficients(jArr);
        Field25519.sub(jArr12, jArr11);
        Arrays.fill(jArr10, 10, 18, 0L);
        Field25519.scalarProduct(jArr10, jArr12, 121665L);
        Field25519.reduceCoefficients(jArr10);
        Field25519.sum(jArr10, jArr11);
        Field25519.product(jArr2, jArr12, jArr10);
        Field25519.reduceSizeByModularReduction(jArr2);
        Field25519.reduceCoefficients(jArr2);
    }

    public static void swapConditional(long[] jArr, long[] jArr2, int i14) {
        int i15 = -i14;
        for (int i16 = 0; i16 < 10; i16++) {
            long j8 = jArr[i16];
            int i17 = (((int) j8) ^ ((int) jArr2[i16])) & i15;
            jArr[i16] = ((int) j8) ^ i17;
            jArr2[i16] = ((int) jArr2[i16]) ^ i17;
        }
    }

    private static void validatePubKeyAndClearMsb(byte[] bArr) throws InvalidKeyException {
        if (bArr.length != 32) {
            e.q("Public key length is not 32-byte");
            return;
        }
        bArr[31] = (byte) (bArr[31] & Ascii.DEL);
        int i14 = 0;
        while (true) {
            byte[][] bArr2 = BANNED_PUBLIC_KEYS;
            if (i14 >= bArr2.length) {
                return;
            }
            if (Bytes.equal(bArr2[i14], bArr)) {
                throw new InvalidKeyException("Banned public key: " + Hex.encode(bArr2[i14]));
            }
            i14++;
        }
    }
}
