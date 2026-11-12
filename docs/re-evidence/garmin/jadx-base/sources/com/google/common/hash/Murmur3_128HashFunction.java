package com.google.common.hash;

import am.j;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import vb.h;

/* JADX INFO: loaded from: classes14.dex */
@Immutable
@ElementTypesAreNonnullByDefault
final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;
    private final int seed;
    static final HashFunction MURMUR3_128 = new Murmur3_128HashFunction(0);
    static final HashFunction GOOD_FAST_HASH_128 = new Murmur3_128HashFunction(Hashing.GOOD_FAST_HASH_SEED);

    public static final class Murmur3_128Hasher extends AbstractStreamingHasher {
        private static final long C1 = -8663945395140668459L;
        private static final long C2 = 5545529020109919103L;
        private static final int CHUNK_SIZE = 16;

        /* JADX INFO: renamed from: h1, reason: collision with root package name */
        private long f53556h1;

        /* JADX INFO: renamed from: h2, reason: collision with root package name */
        private long f53557h2;
        private int length;

        public Murmur3_128Hasher(int i14) {
            super(16);
            long j8 = i14;
            this.f53556h1 = j8;
            this.f53557h2 = j8;
            this.length = 0;
        }

        private void bmix64(long j8, long j14) {
            long jMixK1 = mixK1(j8) ^ this.f53556h1;
            this.f53556h1 = jMixK1;
            long jRotateLeft = Long.rotateLeft(jMixK1, 27);
            long j15 = this.f53557h2;
            this.f53556h1 = ((jRotateLeft + j15) * 5) + 1390208809;
            long jMixK2 = mixK2(j14) ^ j15;
            this.f53557h2 = jMixK2;
            this.f53557h2 = ((Long.rotateLeft(jMixK2, 31) + this.f53556h1) * 5) + 944331445;
        }

        private static long fmix64(long j8) {
            long j14 = (j8 ^ (j8 >>> 33)) * (-49064778989728563L);
            long j15 = (j14 ^ (j14 >>> 33)) * (-4265267296055464877L);
            return j15 ^ (j15 >>> 33);
        }

        private static long mixK1(long j8) {
            return Long.rotateLeft(j8 * C1, 31) * C2;
        }

        private static long mixK2(long j8) {
            return Long.rotateLeft(j8 * C2, 33) * C1;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j8 = this.f53556h1;
            int i14 = this.length;
            long j14 = j8 ^ ((long) i14);
            long j15 = this.f53557h2 ^ ((long) i14);
            long j16 = j14 + j15;
            this.f53556h1 = j16;
            this.f53557h2 = j15 + j16;
            this.f53556h1 = fmix64(j16);
            long jFmix64 = fmix64(this.f53557h2);
            long j17 = this.f53556h1 + jFmix64;
            this.f53556h1 = j17;
            this.f53557h2 = jFmix64 + j17;
            return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f53556h1).putLong(this.f53557h2).array());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer byteBuffer) {
            bmix64(byteBuffer.getLong(), byteBuffer.getLong());
            this.length += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer byteBuffer) {
            long j8;
            long j14;
            long j15;
            long j16;
            long j17;
            long j18;
            long j19;
            this.length = byteBuffer.remaining() + this.length;
            long j24 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j8 = 0;
                    j19 = j8 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                case 2:
                    j14 = 0;
                    j8 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j19 = j8 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                case 3:
                    j15 = 0;
                    j14 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j15;
                    j8 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j19 = j8 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                case 4:
                    j16 = 0;
                    j15 = j16 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j14 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j15;
                    j8 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j19 = j8 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                case 5:
                    j17 = 0;
                    j16 = j17 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j15 = j16 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j14 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j15;
                    j8 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j19 = j8 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                case 6:
                    j18 = 0;
                    j17 = (((long) UnsignedBytes.toInt(byteBuffer.get(5))) << 40) ^ j18;
                    j16 = j17 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j15 = j16 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j14 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j15;
                    j8 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j19 = j8 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                case 7:
                    j18 = ((long) UnsignedBytes.toInt(byteBuffer.get(6))) << 48;
                    j17 = (((long) UnsignedBytes.toInt(byteBuffer.get(5))) << 40) ^ j18;
                    j16 = j17 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j15 = j16 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j14 = (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16) ^ j15;
                    j8 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j19 = j8 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(0)));
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                case 8:
                    j19 = byteBuffer.getLong();
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                case 9:
                    j24 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j19 = byteBuffer.getLong();
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                case 10:
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j24 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j19 = byteBuffer.getLong();
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                case 11:
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j24 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j19 = byteBuffer.getLong();
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                case 12:
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j24 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j19 = byteBuffer.getLong();
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                case 13:
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j24 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j19 = byteBuffer.getLong();
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                case 14:
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(13))) << 40;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j24 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j19 = byteBuffer.getLong();
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                case 15:
                    j24 = ((long) UnsignedBytes.toInt(byteBuffer.get(14))) << 48;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(13))) << 40;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16;
                    j24 ^= ((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8;
                    j24 ^= (long) UnsignedBytes.toInt(byteBuffer.get(8));
                    j19 = byteBuffer.getLong();
                    this.f53556h1 = mixK1(j19) ^ this.f53556h1;
                    this.f53557h2 ^= mixK2(j24);
                    break;
                default:
                    h.q("Should never get here.");
                    break;
            }
        }
    }

    public Murmur3_128HashFunction(int i14) {
        this.seed = i14;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 128;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Murmur3_128HashFunction) && this.seed == ((Murmur3_128HashFunction) obj).seed;
    }

    public int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.seed;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_128Hasher(this.seed);
    }

    public String toString() {
        return j.q(new StringBuilder("Hashing.murmur3_128("), this.seed, ")");
    }
}
