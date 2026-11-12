package com.google.common.hash;

import am.j;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Ints;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes14.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class Murmur3_32HashFunction extends AbstractHashFunction implements Serializable {
    private static final int C1 = -862048943;
    private static final int C2 = 461845907;
    private static final int CHUNK_SIZE = 4;
    private static final long serialVersionUID = 0;
    private final int seed;
    private final boolean supplementaryPlaneFix;
    static final HashFunction MURMUR3_32 = new Murmur3_32HashFunction(0, false);
    static final HashFunction MURMUR3_32_FIXED = new Murmur3_32HashFunction(0, true);
    static final HashFunction GOOD_FAST_HASH_32 = new Murmur3_32HashFunction(Hashing.GOOD_FAST_HASH_SEED, true);

    public Murmur3_32HashFunction(int i14, boolean z14) {
        this.seed = i14;
        this.supplementaryPlaneFix = z14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToThreeUtf8Bytes(char c14) {
        return ((long) (c14 >>> '\f')) | 224 | ((long) ((((c14 >>> 6) & 63) | 128) << 8)) | ((long) (((c14 & '?') | 128) << 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long charToTwoUtf8Bytes(char c14) {
        return ((long) (c14 >>> 6)) | 192 | ((long) (((c14 & '?') | 128) << 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long codePointToFourUtf8Bytes(int i14) {
        return ((long) (i14 >>> 18)) | 240 | ((((long) ((i14 >>> 12) & 63)) | 128) << 8) | ((((long) ((i14 >>> 6) & 63)) | 128) << 16) | ((((long) (i14 & 63)) | 128) << 24);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static HashCode fmix(int i14, int i15) {
        int i16 = i14 ^ i15;
        int i17 = (i16 ^ (i16 >>> 16)) * (-2048144789);
        int i18 = (i17 ^ (i17 >>> 13)) * (-1028477387);
        return HashCode.fromInt(i18 ^ (i18 >>> 16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getIntLittleEndian(byte[] bArr, int i14) {
        return Ints.fromBytes(bArr[i14 + 3], bArr[i14 + 2], bArr[i14 + 1], bArr[i14]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixH1(int i14, int i15) {
        return (Integer.rotateLeft(i14 ^ i15, 13) * 5) - 430675100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int mixK1(int i14) {
        return Integer.rotateLeft(i14 * C1, 15) * C2;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 32;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Murmur3_32HashFunction) {
            Murmur3_32HashFunction murmur3_32HashFunction = (Murmur3_32HashFunction) obj;
            if (this.seed == murmur3_32HashFunction.seed && this.supplementaryPlaneFix == murmur3_32HashFunction.supplementaryPlaneFix) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashBytes(byte[] bArr, int i14, int i15) {
        Preconditions.checkPositionIndexes(i14, i14 + i15, bArr.length);
        int iMixH1 = this.seed;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            int i18 = i17 + 4;
            if (i18 > i15) {
                break;
            }
            iMixH1 = mixH1(iMixH1, mixK1(getIntLittleEndian(bArr, i17 + i14)));
            i17 = i18;
        }
        int i19 = i17;
        int i24 = 0;
        while (i19 < i15) {
            i16 ^= UnsignedBytes.toInt(bArr[i14 + i19]) << i24;
            i19++;
            i24 += 8;
        }
        return fmix(mixK1(i16) ^ iMixH1, i15);
    }

    public int hashCode() {
        return Murmur3_32HashFunction.class.hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashInt(int i14) {
        return fmix(mixH1(this.seed, mixK1(i14)), 4);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashLong(long j8) {
        return fmix(mixH1(mixH1(this.seed, mixK1((int) j8)), mixK1((int) (j8 >>> 32))), 8);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashString(CharSequence charSequence, Charset charset) {
        if (!StandardCharsets.UTF_8.equals(charset)) {
            return hashBytes(charSequence.toString().getBytes(charset));
        }
        int length = charSequence.length();
        int iMixH1 = this.seed;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (true) {
            int i17 = i15 + 4;
            if (i17 > length) {
                break;
            }
            char cCharAt = charSequence.charAt(i15);
            char cCharAt2 = charSequence.charAt(i15 + 1);
            char cCharAt3 = charSequence.charAt(i15 + 2);
            char cCharAt4 = charSequence.charAt(i15 + 3);
            if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                break;
            }
            iMixH1 = mixH1(iMixH1, mixK1((cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24)));
            i16 += 4;
            i15 = i17;
        }
        long jCharToThreeUtf8Bytes = 0;
        while (i15 < length) {
            char cCharAt5 = charSequence.charAt(i15);
            if (cCharAt5 < 128) {
                jCharToThreeUtf8Bytes |= ((long) cCharAt5) << i14;
                i14 += 8;
                i16++;
            } else if (cCharAt5 < 2048) {
                jCharToThreeUtf8Bytes |= charToTwoUtf8Bytes(cCharAt5) << i14;
                i14 += 16;
                i16 += 2;
            } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                jCharToThreeUtf8Bytes |= charToThreeUtf8Bytes(cCharAt5) << i14;
                i14 += 24;
                i16 += 3;
            } else {
                int iCodePointAt = Character.codePointAt(charSequence, i15);
                if (iCodePointAt == cCharAt5) {
                    return hashBytes(charSequence.toString().getBytes(charset));
                }
                i15++;
                jCharToThreeUtf8Bytes |= codePointToFourUtf8Bytes(iCodePointAt) << i14;
                if (this.supplementaryPlaneFix) {
                    i14 += 32;
                }
                i16 += 4;
            }
            if (i14 >= 32) {
                iMixH1 = mixH1(iMixH1, mixK1((int) jCharToThreeUtf8Bytes));
                jCharToThreeUtf8Bytes >>>= 32;
                i14 -= 32;
            }
            i15++;
        }
        return fmix(mixK1((int) jCharToThreeUtf8Bytes) ^ iMixH1, i16);
    }

    @Override // com.google.common.hash.AbstractHashFunction, com.google.common.hash.HashFunction
    public HashCode hashUnencodedChars(CharSequence charSequence) {
        int iMixK1 = this.seed;
        for (int i14 = 1; i14 < charSequence.length(); i14 += 2) {
            iMixK1 = mixH1(iMixK1, mixK1(charSequence.charAt(i14 - 1) | (charSequence.charAt(i14) << 16)));
        }
        if ((charSequence.length() & 1) == 1) {
            iMixK1 ^= mixK1(charSequence.charAt(charSequence.length() - 1));
        }
        return fmix(iMixK1, charSequence.length() * 2);
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_32Hasher(this.seed);
    }

    public String toString() {
        return j.q(new StringBuilder("Hashing.murmur3_32("), this.seed, ")");
    }

    public static final class Murmur3_32Hasher extends AbstractHasher {
        private long buffer;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        private int f53558h1;
        private int shift;
        private int length = 0;
        private boolean isDone = false;

        public Murmur3_32Hasher(int i14) {
            this.f53558h1 = i14;
        }

        private void update(int i14, long j8) {
            long j14 = this.buffer;
            int i15 = this.shift;
            long j15 = ((j8 & 4294967295L) << i15) | j14;
            this.buffer = j15;
            int i16 = (i14 * 8) + i15;
            this.shift = i16;
            this.length += i14;
            if (i16 >= 32) {
                this.f53558h1 = Murmur3_32HashFunction.mixH1(this.f53558h1, Murmur3_32HashFunction.mixK1((int) j15));
                this.buffer >>>= 32;
                this.shift -= 32;
            }
        }

        @Override // com.google.common.hash.Hasher
        public HashCode hash() {
            Preconditions.checkState(!this.isDone);
            this.isDone = true;
            int iMixK1 = this.f53558h1 ^ Murmur3_32HashFunction.mixK1((int) this.buffer);
            this.f53558h1 = iMixK1;
            return Murmur3_32HashFunction.fmix(iMixK1, this.length);
        }

        @Override // com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putByte(byte b14) {
            update(1, b14 & UnsignedBytes.MAX_VALUE);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putBytes(ByteBuffer byteBuffer) {
            ByteOrder byteOrderOrder = byteBuffer.order();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            while (byteBuffer.remaining() >= 4) {
                putInt(byteBuffer.getInt());
            }
            while (byteBuffer.hasRemaining()) {
                putByte(byteBuffer.get());
            }
            byteBuffer.order(byteOrderOrder);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putChar(char c14) {
            update(2, c14);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putInt(int i14) {
            update(4, i14);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putLong(long j8) {
            update(4, (int) j8);
            update(4, j8 >>> 32);
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putString(CharSequence charSequence, Charset charset) {
            if (!StandardCharsets.UTF_8.equals(charset)) {
                return super.putString(charSequence, charset);
            }
            int length = charSequence.length();
            int i14 = 0;
            while (true) {
                int i15 = i14 + 4;
                if (i15 > length) {
                    break;
                }
                char cCharAt = charSequence.charAt(i14);
                char cCharAt2 = charSequence.charAt(i14 + 1);
                char cCharAt3 = charSequence.charAt(i14 + 2);
                char cCharAt4 = charSequence.charAt(i14 + 3);
                if (cCharAt >= 128 || cCharAt2 >= 128 || cCharAt3 >= 128 || cCharAt4 >= 128) {
                    break;
                }
                update(4, (cCharAt2 << '\b') | cCharAt | (cCharAt3 << 16) | (cCharAt4 << 24));
                i14 = i15;
            }
            while (i14 < length) {
                char cCharAt5 = charSequence.charAt(i14);
                if (cCharAt5 < 128) {
                    update(1, cCharAt5);
                } else if (cCharAt5 < 2048) {
                    update(2, Murmur3_32HashFunction.charToTwoUtf8Bytes(cCharAt5));
                } else if (cCharAt5 < 55296 || cCharAt5 > 57343) {
                    update(3, Murmur3_32HashFunction.charToThreeUtf8Bytes(cCharAt5));
                } else {
                    int iCodePointAt = Character.codePointAt(charSequence, i14);
                    if (iCodePointAt == cCharAt5) {
                        putBytes(charSequence.subSequence(i14, length).toString().getBytes(charset));
                        return this;
                    }
                    i14++;
                    update(4, Murmur3_32HashFunction.codePointToFourUtf8Bytes(iCodePointAt));
                }
                i14++;
            }
            return this;
        }

        @Override // com.google.common.hash.AbstractHasher, com.google.common.hash.Hasher, com.google.common.hash.PrimitiveSink
        @CanIgnoreReturnValue
        public Hasher putBytes(byte[] bArr, int i14, int i15) {
            Preconditions.checkPositionIndexes(i14, i14 + i15, bArr.length);
            int i16 = 0;
            while (true) {
                int i17 = i16 + 4;
                if (i17 > i15) {
                    break;
                }
                update(4, Murmur3_32HashFunction.getIntLittleEndian(bArr, i16 + i14));
                i16 = i17;
            }
            while (i16 < i15) {
                putByte(bArr[i14 + i16]);
                i16++;
            }
            return this;
        }
    }
}
