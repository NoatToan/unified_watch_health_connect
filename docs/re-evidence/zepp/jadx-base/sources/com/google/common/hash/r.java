package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@Immutable
final class r extends c implements Serializable {
    public static final HashFunction b = new r(0);
    public static final HashFunction c = new r(Hashing.a);
    private static final long serialVersionUID = 0;
    private final int a;

    public static final class a extends f {
        private static final int g = 16;
        private static final long h = -8663945395140668459L;
        private static final long i = 5545529020109919103L;
        private long d;
        private long e;
        private int f;

        public a(int i2) {
            super(16);
            long j = i2;
            this.d = j;
            this.e = j;
            this.f = 0;
        }

        private void g(long j, long j2) {
            long jI = i(j) ^ this.d;
            this.d = jI;
            long jRotateLeft = Long.rotateLeft(jI, 27);
            this.d = jRotateLeft;
            long j3 = this.e;
            long j4 = jRotateLeft + j3;
            this.d = j4;
            this.d = (j4 * 5) + 1390208809;
            long j5 = j(j2) ^ j3;
            this.e = j5;
            long jRotateLeft2 = Long.rotateLeft(j5, 31);
            this.e = jRotateLeft2;
            long j6 = jRotateLeft2 + this.d;
            this.e = j6;
            this.e = (j6 * 5) + 944331445;
        }

        private static long h(long j) {
            long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
            long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
            return j3 ^ (j3 >>> 33);
        }

        private static long i(long j) {
            return Long.rotateLeft(j * h, 31) * i;
        }

        private static long j(long j) {
            return Long.rotateLeft(j * i, 33) * h;
        }

        @Override // com.google.common.hash.f
        public HashCode a() {
            long j = this.d;
            int i2 = this.f;
            long j2 = j ^ ((long) i2);
            this.d = j2;
            long j3 = this.e ^ ((long) i2);
            this.e = j3;
            long j4 = j2 + j3;
            this.d = j4;
            this.e = j3 + j4;
            this.d = h(j4);
            long jH = h(this.e);
            this.e = jH;
            long j5 = this.d + jH;
            this.d = j5;
            this.e = jH + j5;
            return HashCode.c(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.d).putLong(this.e).array());
        }

        @Override // com.google.common.hash.f
        public void d(ByteBuffer byteBuffer) {
            g(byteBuffer.getLong(), byteBuffer.getLong());
            this.f += 16;
        }

        @Override // com.google.common.hash.f
        public void e(ByteBuffer byteBuffer) {
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            long j8;
            long j9;
            long j10;
            long j11;
            long j12;
            long j13;
            long j14;
            this.f += byteBuffer.remaining();
            long j15 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    j = 0;
                    j7 = ((long) UnsignedBytes.toInt(byteBuffer.get(0))) ^ j;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                case 2:
                    j2 = 0;
                    j = j2 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j7 = ((long) UnsignedBytes.toInt(byteBuffer.get(0))) ^ j;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                case 3:
                    j3 = 0;
                    j2 = j3 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16);
                    j = j2 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j7 = ((long) UnsignedBytes.toInt(byteBuffer.get(0))) ^ j;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                case 4:
                    j4 = 0;
                    j3 = j4 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j2 = j3 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16);
                    j = j2 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j7 = ((long) UnsignedBytes.toInt(byteBuffer.get(0))) ^ j;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                case 5:
                    j5 = 0;
                    j4 = j5 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j3 = j4 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j2 = j3 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16);
                    j = j2 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j7 = ((long) UnsignedBytes.toInt(byteBuffer.get(0))) ^ j;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                case 6:
                    j6 = 0;
                    j5 = j6 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(5))) << 40);
                    j4 = j5 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j3 = j4 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j2 = j3 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16);
                    j = j2 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j7 = ((long) UnsignedBytes.toInt(byteBuffer.get(0))) ^ j;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                case 7:
                    j6 = (((long) UnsignedBytes.toInt(byteBuffer.get(6))) << 48) ^ 0;
                    j5 = j6 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(5))) << 40);
                    j4 = j5 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(4))) << 32);
                    j3 = j4 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(3))) << 24);
                    j2 = j3 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(2))) << 16);
                    j = j2 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(1))) << 8);
                    j7 = ((long) UnsignedBytes.toInt(byteBuffer.get(0))) ^ j;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                case 8:
                    j8 = 0;
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                case 9:
                    j9 = 0;
                    j8 = j9 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(8)));
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                case 10:
                    j10 = 0;
                    j9 = j10 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8);
                    j8 = j9 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(8)));
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                case 11:
                    j11 = 0;
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16);
                    j9 = j10 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8);
                    j8 = j9 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(8)));
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                case 12:
                    j12 = 0;
                    j11 = j12 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24);
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16);
                    j9 = j10 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8);
                    j8 = j9 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(8)));
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                case 13:
                    j13 = 0;
                    j12 = j13 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32);
                    j11 = j12 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24);
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16);
                    j9 = j10 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8);
                    j8 = j9 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(8)));
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                case 14:
                    j14 = 0;
                    j13 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(13))) << 40);
                    j12 = j13 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32);
                    j11 = j12 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24);
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16);
                    j9 = j10 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8);
                    j8 = j9 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(8)));
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                case 15:
                    j14 = (((long) UnsignedBytes.toInt(byteBuffer.get(14))) << 48) ^ 0;
                    j13 = j14 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(13))) << 40);
                    j12 = j13 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(12))) << 32);
                    j11 = j12 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(11))) << 24);
                    j10 = j11 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(10))) << 16);
                    j9 = j10 ^ (((long) UnsignedBytes.toInt(byteBuffer.get(9))) << 8);
                    j8 = j9 ^ ((long) UnsignedBytes.toInt(byteBuffer.get(8)));
                    j7 = byteBuffer.getLong() ^ 0;
                    j15 = j8;
                    this.d ^= i(j7);
                    this.e ^= j(j15);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }
    }

    public r(int i) {
        this.a = i;
    }

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 128;
    }

    public boolean equals(@NullableDecl Object obj) {
        return (obj instanceof r) && this.a == ((r) obj).a;
    }

    public int hashCode() {
        return r.class.hashCode() ^ this.a;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new a(this.a);
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.a + ")";
    }
}
