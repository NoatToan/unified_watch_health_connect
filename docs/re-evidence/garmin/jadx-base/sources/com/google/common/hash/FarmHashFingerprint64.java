package com.google.common.hash;

import androidx.core.view.j;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
final class FarmHashFingerprint64 extends AbstractNonStreamingHashFunction {
    static final HashFunction FARMHASH_FINGERPRINT_64 = new FarmHashFingerprint64();
    private static final long K0 = -4348849565147123417L;
    private static final long K1 = -5435081209227447693L;
    private static final long K2 = -7286425919675154353L;

    @VisibleForTesting
    public static long fingerprint(byte[] bArr, int i14, int i15) {
        if (i15 <= 32) {
            return i15 <= 16 ? hashLength0to16(bArr, i14, i15) : hashLength17to32(bArr, i14, i15);
        }
        return i15 <= 64 ? hashLength33To64(bArr, i14, i15) : hashLength65Plus(bArr, i14, i15);
    }

    private static long hashLength0to16(byte[] bArr, int i14, int i15) {
        if (i15 >= 8) {
            long j8 = (((long) i15) * 2) + K2;
            long jLoad64 = LittleEndianByteArray.load64(bArr, i14) + K2;
            long jLoad65 = LittleEndianByteArray.load64(bArr, (i14 + i15) - 8);
            return hashLength16((Long.rotateRight(jLoad65, 37) * j8) + jLoad64, (Long.rotateRight(jLoad64, 25) + jLoad65) * j8, j8);
        }
        if (i15 >= 4) {
            return hashLength16(((long) i15) + ((((long) LittleEndianByteArray.load32(bArr, i14)) & 4294967295L) << 3), ((long) LittleEndianByteArray.load32(bArr, (i14 + i15) - 4)) & 4294967295L, ((long) (i15 * 2)) + K2);
        }
        if (i15 <= 0) {
            return K2;
        }
        return shiftMix((((long) ((bArr[i14] & UnsignedBytes.MAX_VALUE) + ((bArr[(i15 >> 1) + i14] & UnsignedBytes.MAX_VALUE) << 8))) * K2) ^ (((long) (i15 + ((bArr[(i15 - 1) + i14] & 255) << 2))) * K0)) * K2;
    }

    private static long hashLength16(long j8, long j14, long j15) {
        long j16 = (j8 ^ j14) * j15;
        long j17 = ((j16 ^ (j16 >>> 47)) ^ j14) * j15;
        return (j17 ^ (j17 >>> 47)) * j15;
    }

    private static long hashLength17to32(byte[] bArr, int i14, int i15) {
        long j8 = (((long) i15) * 2) + K2;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i14) * K1;
        long jLoad65 = LittleEndianByteArray.load64(bArr, i14 + 8);
        int i16 = i14 + i15;
        long jLoad66 = LittleEndianByteArray.load64(bArr, i16 - 8) * j8;
        return hashLength16(Long.rotateRight(jLoad66, 30) + Long.rotateRight(jLoad64 + jLoad65, 43) + (LittleEndianByteArray.load64(bArr, i16 - 16) * K2), jLoad66 + Long.rotateRight(jLoad65 + K2, 18) + jLoad64, j8);
    }

    private static long hashLength33To64(byte[] bArr, int i14, int i15) {
        long j8 = (((long) i15) * 2) + K2;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i14) * K2;
        long jLoad65 = LittleEndianByteArray.load64(bArr, i14 + 8);
        int i16 = i14 + i15;
        long jLoad66 = LittleEndianByteArray.load64(bArr, i16 - 8) * j8;
        long jRotateRight = Long.rotateRight(jLoad66, 30) + Long.rotateRight(jLoad64 + jLoad65, 43) + (LittleEndianByteArray.load64(bArr, i16 - 16) * K2);
        long jHashLength16 = hashLength16(jRotateRight, jLoad66 + Long.rotateRight(jLoad65 + K2, 18) + jLoad64, j8);
        long jLoad67 = LittleEndianByteArray.load64(bArr, i14 + 16) * j8;
        long jLoad68 = LittleEndianByteArray.load64(bArr, i14 + 24);
        long jLoad69 = (jRotateRight + LittleEndianByteArray.load64(bArr, i16 - 32)) * j8;
        return hashLength16(Long.rotateRight(jLoad69, 30) + Long.rotateRight(jLoad67 + jLoad68, 43) + ((jHashLength16 + LittleEndianByteArray.load64(bArr, i16 - 24)) * j8), Long.rotateRight(jLoad68 + jLoad64, 18) + jLoad67 + jLoad69, j8);
    }

    private static long hashLength65Plus(byte[] bArr, int i14, int i15) {
        long j8 = 81;
        long j14 = K1;
        long j15 = (j8 * K1) + 113;
        long jShiftMix = shiftMix((j15 * K2) + 113) * K2;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long jLoad64 = (j8 * K2) + LittleEndianByteArray.load64(bArr, i14);
        char c14 = 1;
        int i16 = i15 - 1;
        char c15 = '@';
        int iV = j.v(i16, 64, 64, i14);
        int i17 = i16 & 63;
        int i18 = iV + i17;
        int i19 = i18 - 63;
        long j16 = jShiftMix;
        long jLoad65 = j15;
        long j17 = jLoad64;
        int i24 = i14;
        while (true) {
            long jRotateRight = Long.rotateRight(j17 + jLoad65 + jArr[0] + LittleEndianByteArray.load64(bArr, i24 + 8), 37) * j14;
            long jRotateRight2 = Long.rotateRight(jLoad65 + jArr[c14] + LittleEndianByteArray.load64(bArr, i24 + 48), 42) * j14;
            long j18 = jRotateRight ^ jArr2[c14];
            jLoad65 = jRotateRight2 + jArr[0] + LittleEndianByteArray.load64(bArr, i24 + 40);
            long jRotateRight3 = Long.rotateRight(j16 + jArr2[0], 33) * j14;
            long j19 = j14;
            char c16 = c15;
            int i25 = i17;
            char c17 = c14;
            weakHashLength32WithSeeds(bArr, i24, jArr[c14] * j14, j18 + jArr2[0], jArr);
            int i26 = i24;
            long[] jArr3 = jArr;
            weakHashLength32WithSeeds(bArr, i26 + 32, jRotateRight3 + jArr2[c17], LittleEndianByteArray.load64(bArr, i26 + 16) + jLoad65, jArr2);
            i24 = i26 + 64;
            if (i24 == iV) {
                long j24 = ((j18 & 255) << c17) + j19;
                long j25 = jArr2[0] + ((long) i25);
                jArr2[0] = j25;
                long j26 = jArr3[0] + j25;
                jArr3[0] = j26;
                jArr2[0] = jArr2[0] + j26;
                long jRotateRight4 = Long.rotateRight(jRotateRight3 + jLoad65 + jArr3[0] + LittleEndianByteArray.load64(bArr, i18 - 55), 37) * j24;
                long jRotateRight5 = Long.rotateRight(jLoad65 + jArr3[c17] + LittleEndianByteArray.load64(bArr, i18 - 15), 42) * j24;
                long j27 = jRotateRight4 ^ (jArr2[c17] * 9);
                long jLoad66 = (jArr3[0] * 9) + LittleEndianByteArray.load64(bArr, i18 - 23) + jRotateRight5;
                long jRotateRight6 = Long.rotateRight(j18 + jArr2[0], 33) * j24;
                weakHashLength32WithSeeds(bArr, i19, jArr3[c17] * j24, jArr2[0] + j27, jArr3);
                weakHashLength32WithSeeds(bArr, i18 - 31, jArr2[c17] + jRotateRight6, LittleEndianByteArray.load64(bArr, i18 - 47) + jLoad66, jArr2);
                return hashLength16((shiftMix(jLoad66) * K0) + hashLength16(jArr3[0], jArr2[0], j24) + j27, hashLength16(jArr3[c17], jArr2[c17], j24) + jRotateRight6, j24);
            }
            c15 = c16;
            i17 = i25;
            j17 = jRotateRight3;
            j16 = j18;
            c14 = c17;
            jArr = jArr3;
            j14 = j19;
        }
    }

    private static long shiftMix(long j8) {
        return j8 ^ (j8 >>> 47);
    }

    private static void weakHashLength32WithSeeds(byte[] bArr, int i14, long j8, long j14, long[] jArr) {
        long jLoad64 = LittleEndianByteArray.load64(bArr, i14);
        long jLoad65 = LittleEndianByteArray.load64(bArr, i14 + 8);
        long jLoad66 = LittleEndianByteArray.load64(bArr, i14 + 16);
        long jLoad67 = LittleEndianByteArray.load64(bArr, i14 + 24);
        long j15 = j8 + jLoad64;
        long j16 = jLoad65 + j15 + jLoad66;
        long jRotateRight = Long.rotateRight(j16, 44) + Long.rotateRight(j14 + j15 + jLoad67, 21);
        jArr[0] = j16 + jLoad67;
        jArr[1] = jRotateRight + j15;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    @Override // com.google.common.hash.AbstractNonStreamingHashFunction, com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i14, int i15) {
        Preconditions.checkPositionIndexes(i14, i14 + i15, bArr.length);
        return HashCode.fromLong(fingerprint(bArr, i14, i15));
    }

    public String toString() {
        return "Hashing.farmHashFingerprint64()";
    }
}
