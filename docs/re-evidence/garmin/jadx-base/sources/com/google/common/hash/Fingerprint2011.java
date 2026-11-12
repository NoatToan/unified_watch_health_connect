package com.google.common.hash;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
final class Fingerprint2011 extends AbstractNonStreamingHashFunction {
    static final HashFunction FINGERPRINT_2011 = new Fingerprint2011();
    private static final long K0 = -6505348102511208375L;
    private static final long K1 = -8261664234251669945L;
    private static final long K2 = -4288712594273399085L;
    private static final long K3 = -4132994306676758123L;

    @VisibleForTesting
    public static long fingerprint(byte[] bArr, int i14, int i15) {
        long jHashLength33To64;
        if (i15 <= 32) {
            jHashLength33To64 = murmurHash64WithSeed(bArr, i14, i15, -1397348546323613475L);
        } else {
            jHashLength33To64 = i15 <= 64 ? hashLength33To64(bArr, i14, i15) : fullFingerprint(bArr, i14, i15);
        }
        long jLoad64 = K0;
        long jLoad65 = i15 >= 8 ? LittleEndianByteArray.load64(bArr, i14) : -6505348102511208375L;
        if (i15 >= 9) {
            jLoad64 = LittleEndianByteArray.load64(bArr, (i14 + i15) - 8);
        }
        long jHash128to64 = hash128to64(jHashLength33To64 + jLoad64, jLoad65);
        return (jHash128to64 == 0 || jHash128to64 == 1) ? jHash128to64 - 2 : jHash128to64;
    }

    private static long fullFingerprint(byte[] bArr, int i14, int i15) {
        byte[] bArr2 = bArr;
        long jLoad64 = LittleEndianByteArray.load64(bArr, i14);
        int i16 = i14 + i15;
        long jLoad65 = LittleEndianByteArray.load64(bArr2, i16 - 16) ^ K1;
        long jLoad66 = K0 ^ LittleEndianByteArray.load64(bArr2, i16 - 56);
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j8 = i15;
        weakHashLength32WithSeeds(bArr2, i16 - 64, j8, jLoad65, jArr);
        weakHashLength32WithSeeds(bArr2, i16 - 32, j8 * K1, K0, jArr2);
        long[] jArr3 = jArr2;
        long jShiftMix = (shiftMix(jArr[1]) * K1) + jLoad66;
        long jRotateRight = Long.rotateRight(jLoad64 + jShiftMix, 39) * K1;
        int i17 = (i15 - 1) & (-64);
        long jRotateRight2 = Long.rotateRight(jLoad65, 33) * K1;
        long j14 = jRotateRight;
        long j15 = jShiftMix;
        int i18 = i14;
        while (true) {
            long jRotateRight3 = Long.rotateRight(j14 + jRotateRight2 + jArr[0] + LittleEndianByteArray.load64(bArr2, i18 + 16), 37) * K1;
            long jRotateRight4 = Long.rotateRight(jRotateRight2 + jArr[1] + LittleEndianByteArray.load64(bArr2, i18 + 48), 42) * K1;
            long j16 = jArr3[1] ^ jRotateRight3;
            long j17 = jRotateRight4 ^ jArr[0];
            long jRotateRight5 = Long.rotateRight(j15 ^ jArr3[0], 33);
            weakHashLength32WithSeeds(bArr2, i18, jArr[1] * K1, jArr3[0] + j16, jArr);
            int i19 = i18;
            long[] jArr4 = jArr3;
            weakHashLength32WithSeeds(bArr, i19 + 32, jRotateRight5 + jArr3[1], j17, jArr4);
            i18 = i19 + 64;
            i17 -= 64;
            if (i17 == 0) {
                return hash128to64((shiftMix(j17) * K1) + hash128to64(jArr[0], jArr4[0]) + j16, hash128to64(jArr[1], jArr4[1]) + jRotateRight5);
            }
            bArr2 = bArr;
            jArr3 = jArr4;
            j15 = j16;
            jRotateRight2 = j17;
            j14 = jRotateRight5;
        }
    }

    @VisibleForTesting
    public static long hash128to64(long j8, long j14) {
        long j15 = (j14 ^ j8) * K3;
        long j16 = (j8 ^ (j15 ^ (j15 >>> 47))) * K3;
        return (j16 ^ (j16 >>> 47)) * K3;
    }

    private static long hashLength33To64(byte[] bArr, int i14, int i15) {
        long jLoad64 = LittleEndianByteArray.load64(bArr, i14 + 24);
        int i16 = i14 + i15;
        int i17 = i16 - 16;
        long jLoad65 = ((((long) i15) + LittleEndianByteArray.load64(bArr, i17)) * K0) + LittleEndianByteArray.load64(bArr, i14);
        long jRotateRight = Long.rotateRight(jLoad65 + jLoad64, 52);
        long jRotateRight2 = Long.rotateRight(jLoad65, 37);
        long jLoad66 = jLoad65 + LittleEndianByteArray.load64(bArr, i14 + 8);
        long jRotateRight3 = Long.rotateRight(jLoad66, 7) + jRotateRight2;
        int i18 = i14 + 16;
        long jLoad67 = jLoad66 + LittleEndianByteArray.load64(bArr, i18);
        long j8 = jLoad64 + jLoad67;
        long jRotateRight4 = Long.rotateRight(jLoad67, 31) + jRotateRight + jRotateRight3;
        long jLoad68 = LittleEndianByteArray.load64(bArr, i18) + LittleEndianByteArray.load64(bArr, i16 - 32);
        long jLoad69 = LittleEndianByteArray.load64(bArr, i16 - 8);
        long jRotateRight5 = Long.rotateRight(jLoad68 + jLoad69, 52);
        long jRotateRight6 = Long.rotateRight(jLoad68, 37);
        long jLoad610 = jLoad68 + LittleEndianByteArray.load64(bArr, i16 - 24);
        long jRotateRight7 = Long.rotateRight(jLoad610, 7) + jRotateRight6;
        long jLoad611 = jLoad610 + LittleEndianByteArray.load64(bArr, i17);
        return shiftMix((shiftMix(((jLoad611 + jLoad69 + jRotateRight4) * K0) + ((Long.rotateRight(jLoad611, 31) + jRotateRight5 + jRotateRight7 + j8) * K2)) * K0) + jRotateRight4) * K2;
    }

    @VisibleForTesting
    public static long murmurHash64WithSeed(byte[] bArr, int i14, int i15, long j8) {
        int i16 = i15 & (-8);
        int i17 = i15 & 7;
        long jLoad64Safely = j8 ^ (((long) i15) * K3);
        for (int i18 = 0; i18 < i16; i18 += 8) {
            jLoad64Safely = (jLoad64Safely ^ (shiftMix(LittleEndianByteArray.load64(bArr, i14 + i18) * K3) * K3)) * K3;
        }
        if (i17 != 0) {
            jLoad64Safely = (LittleEndianByteArray.load64Safely(bArr, i14 + i16, i17) ^ jLoad64Safely) * K3;
        }
        return shiftMix(shiftMix(jLoad64Safely) * K3);
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
        long jRotateRight = Long.rotateRight(j16, 23) + Long.rotateRight(j14 + j15 + jLoad67, 51);
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
        return "Hashing.fingerprint2011()";
    }
}
