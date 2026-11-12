package org.apache.commons.codec.digest;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.commons.lang3.e;

/* JADX INFO: loaded from: classes3.dex */
public final class MurmurHash3 {
    private static final long C1 = -8663945395140668459L;
    private static final int C1_32 = -862048943;
    private static final long C2 = 5545529020109919103L;
    private static final int C2_32 = 461845907;
    public static final int DEFAULT_SEED = 104729;
    private static final int M = 5;
    private static final int M_32 = 5;
    private static final int N1 = 1390208809;
    private static final int N2 = 944331445;

    @Deprecated
    public static final long NULL_HASHCODE = 2862933555777941757L;
    private static final int N_32 = -430675100;
    private static final int R1 = 31;
    private static final int R1_32 = 15;
    private static final int R2 = 27;
    private static final int R2_32 = 13;
    private static final int R3 = 33;

    @Deprecated
    public static class IncrementalHash32 extends IncrementalHash32x86 {
        @Override // org.apache.commons.codec.digest.MurmurHash3.IncrementalHash32x86
        @Deprecated
        public int finalise(int i14, int i15, byte[] bArr, int i16) {
            int i17;
            int i18;
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 == 3) {
                        i18 = bArr[2] << Ascii.DLE;
                    }
                    return MurmurHash3.fmix32(i14 ^ i16);
                }
                i18 = 0;
                i17 = i18 ^ (bArr[1] << 8);
            } else {
                i17 = 0;
            }
            i14 ^= Integer.rotateLeft((i17 ^ bArr[0]) * MurmurHash3.C1_32, 15) * MurmurHash3.C2_32;
            return MurmurHash3.fmix32(i14 ^ i16);
        }
    }

    public static class IncrementalHash32x86 {
        private static final int BLOCK_SIZE = 4;
        private int hash;
        private int totalLen;
        private final byte[] unprocessed = new byte[3];
        private int unprocessedLength;

        private static int orBytes(byte b14, byte b15, byte b16, byte b17) {
            return (b14 & UnsignedBytes.MAX_VALUE) | ((b15 & UnsignedBytes.MAX_VALUE) << 8) | ((b16 & UnsignedBytes.MAX_VALUE) << 16) | ((b17 & UnsignedBytes.MAX_VALUE) << 24);
        }

        public final void add(byte[] bArr, int i14, int i15) {
            int iOrBytes;
            if (i15 <= 0) {
                return;
            }
            this.totalLen += i15;
            int i16 = this.unprocessedLength;
            if ((i16 + i15) - 4 < 0) {
                System.arraycopy(bArr, i14, this.unprocessed, i16, i15);
                this.unprocessedLength += i15;
                return;
            }
            if (i16 > 0) {
                if (i16 == 1) {
                    iOrBytes = orBytes(this.unprocessed[0], bArr[i14], bArr[i14 + 1], bArr[i14 + 2]);
                } else if (i16 == 2) {
                    byte[] bArr2 = this.unprocessed;
                    iOrBytes = orBytes(bArr2[0], bArr2[1], bArr[i14], bArr[i14 + 1]);
                } else if (i16 != 3) {
                    e.i(this.unprocessedLength, "Unprocessed length should be 1, 2, or 3: ");
                    return;
                } else {
                    byte[] bArr3 = this.unprocessed;
                    iOrBytes = orBytes(bArr3[0], bArr3[1], bArr3[2], bArr[i14]);
                }
                this.hash = MurmurHash3.mix32(iOrBytes, this.hash);
                int i17 = 4 - this.unprocessedLength;
                i14 += i17;
                i15 -= i17;
            }
            int i18 = i15 >> 2;
            for (int i19 = 0; i19 < i18; i19++) {
                this.hash = MurmurHash3.mix32(MurmurHash3.getLittleEndianInt(bArr, (i19 << 2) + i14), this.hash);
            }
            int i24 = i18 << 2;
            int i25 = i15 - i24;
            this.unprocessedLength = i25;
            if (i25 != 0) {
                System.arraycopy(bArr, i14 + i24, this.unprocessed, 0, i25);
            }
        }

        public final int end() {
            return finalise(this.hash, this.unprocessedLength, this.unprocessed, this.totalLen);
        }

        public int finalise(int i14, int i15, byte[] bArr, int i16) {
            int i17;
            int i18;
            if (i15 != 1) {
                if (i15 != 2) {
                    if (i15 == 3) {
                        i18 = (bArr[2] & UnsignedBytes.MAX_VALUE) << 16;
                    }
                    return MurmurHash3.fmix32(i14 ^ i16);
                }
                i18 = 0;
                i17 = i18 ^ ((bArr[1] & UnsignedBytes.MAX_VALUE) << 8);
            } else {
                i17 = 0;
            }
            i14 ^= Integer.rotateLeft((i17 ^ (bArr[0] & UnsignedBytes.MAX_VALUE)) * MurmurHash3.C1_32, 15) * MurmurHash3.C2_32;
            return MurmurHash3.fmix32(i14 ^ i16);
        }

        public final void start(int i14) {
            this.totalLen = 0;
            this.unprocessedLength = 0;
            this.hash = i14;
        }
    }

    private MurmurHash3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int fmix32(int i14) {
        int i15 = (i14 ^ (i14 >>> 16)) * (-2048144789);
        int i16 = (i15 ^ (i15 >>> 13)) * (-1028477387);
        return i16 ^ (i16 >>> 16);
    }

    private static long fmix64(long j8) {
        long j14 = (j8 ^ (j8 >>> 33)) * (-49064778989728563L);
        long j15 = (j14 ^ (j14 >>> 33)) * (-4265267296055464877L);
        return j15 ^ (j15 >>> 33);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getLittleEndianInt(byte[] bArr, int i14) {
        return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16);
    }

    private static long getLittleEndianLong(byte[] bArr, int i14) {
        return ((((long) bArr[i14 + 7]) & 255) << 56) | (((long) bArr[i14]) & 255) | ((((long) bArr[i14 + 1]) & 255) << 8) | ((((long) bArr[i14 + 2]) & 255) << 16) | ((((long) bArr[i14 + 3]) & 255) << 24) | ((((long) bArr[i14 + 4]) & 255) << 32) | ((((long) bArr[i14 + 5]) & 255) << 40) | ((((long) bArr[i14 + 6]) & 255) << 48);
    }

    @Deprecated
    public static long[] hash128(String str) {
        byte[] bytesUtf8 = StringUtils.getBytesUtf8(str);
        return hash128(bytesUtf8, 0, bytesUtf8.length, DEFAULT_SEED);
    }

    public static long[] hash128x64(byte[] bArr, int i14, int i15, int i16) {
        return hash128x64Internal(bArr, i14, i15, ((long) i16) & 4294967295L);
    }

    private static long[] hash128x64Internal(byte[] bArr, int i14, int i15, long j8) {
        char c14;
        char c15;
        int i16 = i15 >> 4;
        long jRotateLeft = j8;
        long jRotateLeft2 = jRotateLeft;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i14 + (i17 << 4);
            long littleEndianLong = getLittleEndianLong(bArr, i18);
            long littleEndianLong2 = getLittleEndianLong(bArr, i18 + 8);
            jRotateLeft = ((Long.rotateLeft(jRotateLeft ^ (Long.rotateLeft(littleEndianLong * C1, 31) * C2), 27) + jRotateLeft2) * 5) + 1390208809;
            jRotateLeft2 = ((Long.rotateLeft(jRotateLeft2 ^ (Long.rotateLeft(littleEndianLong2 * C2, 33) * C1), 31) + jRotateLeft) * 5) + 944331445;
        }
        int i19 = i14 + (i16 << 4);
        long j14 = 0;
        switch ((i14 + i15) - i19) {
            case 3:
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
            case 2:
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
            case 1:
                jRotateLeft ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19] & UnsignedBytes.MAX_VALUE))) * C1, 31) * C2;
                break;
            case 4:
                c14 = 24;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19] & UnsignedBytes.MAX_VALUE))) * C1, 31) * C2;
                break;
            case 5:
                c14 = 24;
                c15 = ' ';
                j14 ^= (((long) bArr[i19 + 4]) & 255) << c15;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19] & UnsignedBytes.MAX_VALUE))) * C1, 31) * C2;
                break;
            case 6:
                c14 = 24;
                c15 = ' ';
                j14 ^= (((long) bArr[i19 + 5]) & 255) << 40;
                j14 ^= (((long) bArr[i19 + 4]) & 255) << c15;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19] & UnsignedBytes.MAX_VALUE))) * C1, 31) * C2;
                break;
            case 7:
                c14 = 24;
                c15 = ' ';
                j14 ^= (((long) bArr[i19 + 6]) & 255) << 48;
                j14 ^= (((long) bArr[i19 + 5]) & 255) << 40;
                j14 ^= (((long) bArr[i19 + 4]) & 255) << c15;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19] & UnsignedBytes.MAX_VALUE))) * C1, 31) * C2;
                break;
            case 8:
                c14 = 24;
                c15 = ' ';
                j14 = (((long) bArr[i19 + 7]) & 255) << 56;
                j14 ^= (((long) bArr[i19 + 6]) & 255) << 48;
                j14 ^= (((long) bArr[i19 + 5]) & 255) << 40;
                j14 ^= (((long) bArr[i19 + 4]) & 255) << c15;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19] & UnsignedBytes.MAX_VALUE))) * C1, 31) * C2;
                break;
            case 9:
                c14 = 24;
                c15 = ' ';
                jRotateLeft2 ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19 + 8] & UnsignedBytes.MAX_VALUE))) * C2, 33) * C1;
                j14 = (((long) bArr[i19 + 7]) & 255) << 56;
                j14 ^= (((long) bArr[i19 + 6]) & 255) << 48;
                j14 ^= (((long) bArr[i19 + 5]) & 255) << 40;
                j14 ^= (((long) bArr[i19 + 4]) & 255) << c15;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19] & UnsignedBytes.MAX_VALUE))) * C1, 31) * C2;
                break;
            case 10:
                c14 = 24;
                c15 = ' ';
                j14 ^= (((long) bArr[i19 + 9]) & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19 + 8] & UnsignedBytes.MAX_VALUE))) * C2, 33) * C1;
                j14 = (((long) bArr[i19 + 7]) & 255) << 56;
                j14 ^= (((long) bArr[i19 + 6]) & 255) << 48;
                j14 ^= (((long) bArr[i19 + 5]) & 255) << 40;
                j14 ^= (((long) bArr[i19 + 4]) & 255) << c15;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19] & UnsignedBytes.MAX_VALUE))) * C1, 31) * C2;
                break;
            case 11:
                c14 = 24;
                c15 = ' ';
                j14 ^= (((long) bArr[i19 + 10]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 9]) & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19 + 8] & UnsignedBytes.MAX_VALUE))) * C2, 33) * C1;
                j14 = (((long) bArr[i19 + 7]) & 255) << 56;
                j14 ^= (((long) bArr[i19 + 6]) & 255) << 48;
                j14 ^= (((long) bArr[i19 + 5]) & 255) << 40;
                j14 ^= (((long) bArr[i19 + 4]) & 255) << c15;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19] & UnsignedBytes.MAX_VALUE))) * C1, 31) * C2;
                break;
            case 12:
                c14 = 24;
                c15 = ' ';
                j14 ^= (((long) bArr[i19 + 11]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 10]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 9]) & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19 + 8] & UnsignedBytes.MAX_VALUE))) * C2, 33) * C1;
                j14 = (((long) bArr[i19 + 7]) & 255) << 56;
                j14 ^= (((long) bArr[i19 + 6]) & 255) << 48;
                j14 ^= (((long) bArr[i19 + 5]) & 255) << 40;
                j14 ^= (((long) bArr[i19 + 4]) & 255) << c15;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19] & UnsignedBytes.MAX_VALUE))) * C1, 31) * C2;
                break;
            case 13:
                c14 = 24;
                c15 = ' ';
                j14 ^= (((long) bArr[i19 + 12]) & 255) << c15;
                j14 ^= (((long) bArr[i19 + 11]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 10]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 9]) & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19 + 8] & UnsignedBytes.MAX_VALUE))) * C2, 33) * C1;
                j14 = (((long) bArr[i19 + 7]) & 255) << 56;
                j14 ^= (((long) bArr[i19 + 6]) & 255) << 48;
                j14 ^= (((long) bArr[i19 + 5]) & 255) << 40;
                j14 ^= (((long) bArr[i19 + 4]) & 255) << c15;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19] & UnsignedBytes.MAX_VALUE))) * C1, 31) * C2;
                break;
            case 14:
                c14 = 24;
                c15 = ' ';
                j14 ^= (((long) bArr[i19 + 13]) & 255) << 40;
                j14 ^= (((long) bArr[i19 + 12]) & 255) << c15;
                j14 ^= (((long) bArr[i19 + 11]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 10]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 9]) & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19 + 8] & UnsignedBytes.MAX_VALUE))) * C2, 33) * C1;
                j14 = (((long) bArr[i19 + 7]) & 255) << 56;
                j14 ^= (((long) bArr[i19 + 6]) & 255) << 48;
                j14 ^= (((long) bArr[i19 + 5]) & 255) << 40;
                j14 ^= (((long) bArr[i19 + 4]) & 255) << c15;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19] & UnsignedBytes.MAX_VALUE))) * C1, 31) * C2;
                break;
            case 15:
                c14 = 24;
                c15 = ' ';
                j14 = (((long) bArr[i19 + 14]) & 255) << 48;
                j14 ^= (((long) bArr[i19 + 13]) & 255) << 40;
                j14 ^= (((long) bArr[i19 + 12]) & 255) << c15;
                j14 ^= (((long) bArr[i19 + 11]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 10]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 9]) & 255) << 8;
                jRotateLeft2 ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19 + 8] & UnsignedBytes.MAX_VALUE))) * C2, 33) * C1;
                j14 = (((long) bArr[i19 + 7]) & 255) << 56;
                j14 ^= (((long) bArr[i19 + 6]) & 255) << 48;
                j14 ^= (((long) bArr[i19 + 5]) & 255) << 40;
                j14 ^= (((long) bArr[i19 + 4]) & 255) << c15;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << c14;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft((j14 ^ ((long) (bArr[i19] & UnsignedBytes.MAX_VALUE))) * C1, 31) * C2;
                break;
        }
        long j15 = i15;
        long j16 = jRotateLeft ^ j15;
        long j17 = j15 ^ jRotateLeft2;
        long j18 = j16 + j17;
        long j19 = j17 + j18;
        long jFmix64 = fmix64(j18);
        long jFmix65 = fmix64(j19);
        long j24 = jFmix64 + jFmix65;
        return new long[]{j24, jFmix65 + j24};
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i14, int i15, int i16) {
        int i17 = i15 >> 2;
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            i16 = mix32(getLittleEndianInt(bArr, (i19 << 2) + i14), i16);
        }
        int i24 = (i17 << 2) + i14;
        int i25 = (i14 + i15) - i24;
        if (i25 == 1) {
            i16 ^= Integer.rotateLeft((bArr[i24] ^ i18) * C1_32, 15) * C2_32;
        } else {
            if (i25 != 2) {
                i18 = i25 == 3 ? bArr[i24 + 2] << Ascii.DLE : 0;
            }
            i18 ^= bArr[i24 + 1] << 8;
            i16 ^= Integer.rotateLeft((bArr[i24] ^ i18) * C1_32, 15) * C2_32;
        }
        return fmix32(i16 ^ i15);
    }

    public static int hash32x86(byte[] bArr, int i14, int i15, int i16) {
        int i17 = i15 >> 2;
        int i18 = 0;
        for (int i19 = 0; i19 < i17; i19++) {
            i16 = mix32(getLittleEndianInt(bArr, (i19 << 2) + i14), i16);
        }
        int i24 = (i17 << 2) + i14;
        int i25 = (i14 + i15) - i24;
        if (i25 == 1) {
            i16 ^= Integer.rotateLeft(((bArr[i24] & UnsignedBytes.MAX_VALUE) ^ i18) * C1_32, 15) * C2_32;
        } else {
            if (i25 != 2) {
                i18 = i25 == 3 ? (bArr[i24 + 2] & UnsignedBytes.MAX_VALUE) << 16 : 0;
            }
            i18 ^= (bArr[i24 + 1] & UnsignedBytes.MAX_VALUE) << 8;
            i16 ^= Integer.rotateLeft(((bArr[i24] & UnsignedBytes.MAX_VALUE) ^ i18) * C1_32, 15) * C2_32;
        }
        return fmix32(i16 ^ i15);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0042. Please report as an issue. */
    @Deprecated
    public static long hash64(byte[] bArr, int i14, int i15, int i16) {
        long j8;
        long jRotateLeft = i16;
        int i17 = i15 >> 3;
        int i18 = 0;
        while (true) {
            j8 = C2;
            if (i18 >= i17) {
                break;
            }
            jRotateLeft = (Long.rotateLeft(jRotateLeft ^ (Long.rotateLeft(getLittleEndianLong(bArr, i14 + (i18 << 3)) * C1, 31) * C2), 27) * 5) + 1390208809;
            i18++;
        }
        int i19 = i14 + (i17 << 3);
        long j14 = 0;
        switch ((i14 + i15) - i19) {
            case 1:
                j8 = 5545529020109919103L;
                jRotateLeft ^= Long.rotateLeft(((((long) bArr[i19]) & 255) ^ j14) * C1, 31) * j8;
                break;
            case 2:
                j8 = 5545529020109919103L;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft(((((long) bArr[i19]) & 255) ^ j14) * C1, 31) * j8;
                break;
            case 3:
                j8 = 5545529020109919103L;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft(((((long) bArr[i19]) & 255) ^ j14) * C1, 31) * j8;
                break;
            case 4:
                j8 = 5545529020109919103L;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << 24;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft(((((long) bArr[i19]) & 255) ^ j14) * C1, 31) * j8;
                break;
            case 5:
                j14 ^= (((long) bArr[i19 + 4]) & 255) << 32;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << 24;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft(((((long) bArr[i19]) & 255) ^ j14) * C1, 31) * j8;
                break;
            case 7:
                j14 = (((long) bArr[i19 + 6]) & 255) << 48;
            case 6:
                j14 ^= (((long) bArr[i19 + 5]) & 255) << 40;
                j14 ^= (((long) bArr[i19 + 4]) & 255) << 32;
                j14 ^= (((long) bArr[i19 + 3]) & 255) << 24;
                j14 ^= (((long) bArr[i19 + 2]) & 255) << 16;
                j14 ^= (((long) bArr[i19 + 1]) & 255) << 8;
                jRotateLeft ^= Long.rotateLeft(((((long) bArr[i19]) & 255) ^ j14) * C1, 31) * j8;
                break;
        }
        return fmix64(((long) i15) ^ jRotateLeft);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mix32(int i14, int i15) {
        return (Integer.rotateLeft((Integer.rotateLeft(i14 * C1_32, 15) * C2_32) ^ i15, 13) * 5) + N_32;
    }

    public static long[] hash128x64(byte[] bArr) {
        return hash128x64(bArr, 0, bArr.length, 0);
    }

    @Deprecated
    public static long[] hash128(byte[] bArr, int i14, int i15, int i16) {
        return hash128x64Internal(bArr, i14, i15, i16);
    }

    public static long[] hash128(byte[] bArr) {
        return hash128(bArr, 0, bArr.length, DEFAULT_SEED);
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i14) {
        return hash32(bArr, i14, DEFAULT_SEED);
    }

    @Deprecated
    public static int hash32(byte[] bArr, int i14, int i15) {
        return hash32(bArr, 0, i14, i15);
    }

    @Deprecated
    public static int hash32(byte[] bArr) {
        return hash32(bArr, 0, bArr.length, DEFAULT_SEED);
    }

    public static int hash32(long j8) {
        return hash32(j8, DEFAULT_SEED);
    }

    public static int hash32(long j8, int i14) {
        long jReverseBytes = Long.reverseBytes(j8);
        return fmix32(mix32((int) (jReverseBytes >>> 32), mix32((int) jReverseBytes, i14)) ^ 8);
    }

    public static int hash32x86(byte[] bArr) {
        return hash32x86(bArr, 0, bArr.length, 0);
    }

    public static int hash32(long j8, long j14) {
        return hash32(j8, j14, DEFAULT_SEED);
    }

    public static int hash32(long j8, long j14, int i14) {
        long jReverseBytes = Long.reverseBytes(j8);
        long jReverseBytes2 = Long.reverseBytes(j14);
        int i15 = (int) jReverseBytes2;
        return fmix32(mix32((int) (jReverseBytes2 >>> 32), mix32(i15, mix32((int) (jReverseBytes >>> 32), mix32((int) jReverseBytes, i14)))) ^ 16);
    }

    @Deprecated
    public static int hash32(String str) {
        byte[] bytesUtf8 = StringUtils.getBytesUtf8(str);
        return hash32(bytesUtf8, 0, bytesUtf8.length, DEFAULT_SEED);
    }

    @Deprecated
    public static long hash64(byte[] bArr, int i14, int i15) {
        return hash64(bArr, i14, i15, DEFAULT_SEED);
    }

    @Deprecated
    public static long hash64(byte[] bArr) {
        return hash64(bArr, 0, bArr.length, DEFAULT_SEED);
    }

    @Deprecated
    public static long hash64(int i14) {
        return fmix64((Long.rotateLeft((((long) Integer.reverseBytes(i14)) & 4294967295L) * C1, 31) * C2) ^ 104733);
    }

    @Deprecated
    public static long hash64(long j8) {
        return fmix64(((Long.rotateLeft((Long.rotateLeft(Long.reverseBytes(j8) * C1, 31) * C2) ^ 104729, 27) * 5) + 1390208809) ^ 8);
    }

    @Deprecated
    public static long hash64(short s8) {
        return fmix64((Long.rotateLeft((((((long) s8) & 255) << 8) ^ (255 & ((long) ((s8 & 65280) >> 8)))) * C1, 31) * C2) ^ 104731);
    }
}
