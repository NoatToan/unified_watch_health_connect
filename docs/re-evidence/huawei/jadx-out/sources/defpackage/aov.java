package defpackage;

import com.google.common.hash.AbstractHashFunction;
import com.google.common.hash.AbstractStreamingHasher;
import com.google.common.hash.ElementTypesAreNonnullByDefault;
import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.google.common.hash.Hasher;
import com.google.common.hash.Hashing;
import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.Immutable;
import com.huawei.operation.utils.Constants;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes21.dex */
@Immutable
@ElementTypesAreNonnullByDefault
public final class aov extends AbstractHashFunction implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f637c;
    public static final HashFunction d = new aov(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final HashFunction f636b = new aov(Hashing.d);

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 128;
    }

    aov(int i) {
        this.f637c = i;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new a(this.f637c);
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.f637c + Constants.RIGHT_BRACKET_ONLY;
    }

    public boolean equals(@CheckForNull Object obj) {
        return (obj instanceof aov) && this.f637c == ((aov) obj).f637c;
    }

    public int hashCode() {
        return getClass().hashCode() ^ this.f637c;
    }

    static final class a extends AbstractStreamingHasher {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f638b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f639c;
        private int d;

        private static long b(long j) {
            long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
            long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
            return j3 ^ (j3 >>> 33);
        }

        a(int i) {
            super(16);
            long j = i;
            this.f639c = j;
            this.f638b = j;
            this.d = 0;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer byteBuffer) {
            c(byteBuffer.getLong(), byteBuffer.getLong());
            this.d += 16;
        }

        private void c(long j, long j2) {
            long jC = c(j) ^ this.f639c;
            this.f639c = jC;
            long jRotateLeft = Long.rotateLeft(jC, 27);
            long j3 = this.f638b;
            this.f639c = ((jRotateLeft + j3) * 5) + 1390208809;
            long jA = a(j2) ^ j3;
            this.f638b = jA;
            this.f638b = ((Long.rotateLeft(jA, 31) + this.f639c) * 5) + 944331445;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer byteBuffer) {
            long jC;
            long jC2;
            long jC3;
            long jC4;
            long jC5;
            long jC6;
            long jC7;
            this.d += byteBuffer.remaining();
            long jC8 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    jC = 0;
                    jC7 = jC ^ ((long) UnsignedBytes.c(byteBuffer.get(0)));
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                case 2:
                    jC2 = 0;
                    jC = jC2 ^ (((long) UnsignedBytes.c(byteBuffer.get(1))) << 8);
                    jC7 = jC ^ ((long) UnsignedBytes.c(byteBuffer.get(0)));
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                case 3:
                    jC3 = 0;
                    jC2 = jC3 ^ (((long) UnsignedBytes.c(byteBuffer.get(2))) << 16);
                    jC = jC2 ^ (((long) UnsignedBytes.c(byteBuffer.get(1))) << 8);
                    jC7 = jC ^ ((long) UnsignedBytes.c(byteBuffer.get(0)));
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                case 4:
                    jC4 = 0;
                    jC3 = jC4 ^ (((long) UnsignedBytes.c(byteBuffer.get(3))) << 24);
                    jC2 = jC3 ^ (((long) UnsignedBytes.c(byteBuffer.get(2))) << 16);
                    jC = jC2 ^ (((long) UnsignedBytes.c(byteBuffer.get(1))) << 8);
                    jC7 = jC ^ ((long) UnsignedBytes.c(byteBuffer.get(0)));
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                case 5:
                    jC5 = 0;
                    jC4 = jC5 ^ (((long) UnsignedBytes.c(byteBuffer.get(4))) << 32);
                    jC3 = jC4 ^ (((long) UnsignedBytes.c(byteBuffer.get(3))) << 24);
                    jC2 = jC3 ^ (((long) UnsignedBytes.c(byteBuffer.get(2))) << 16);
                    jC = jC2 ^ (((long) UnsignedBytes.c(byteBuffer.get(1))) << 8);
                    jC7 = jC ^ ((long) UnsignedBytes.c(byteBuffer.get(0)));
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                case 6:
                    jC6 = 0;
                    jC5 = jC6 ^ (((long) UnsignedBytes.c(byteBuffer.get(5))) << 40);
                    jC4 = jC5 ^ (((long) UnsignedBytes.c(byteBuffer.get(4))) << 32);
                    jC3 = jC4 ^ (((long) UnsignedBytes.c(byteBuffer.get(3))) << 24);
                    jC2 = jC3 ^ (((long) UnsignedBytes.c(byteBuffer.get(2))) << 16);
                    jC = jC2 ^ (((long) UnsignedBytes.c(byteBuffer.get(1))) << 8);
                    jC7 = jC ^ ((long) UnsignedBytes.c(byteBuffer.get(0)));
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                case 7:
                    jC6 = ((long) UnsignedBytes.c(byteBuffer.get(6))) << 48;
                    jC5 = jC6 ^ (((long) UnsignedBytes.c(byteBuffer.get(5))) << 40);
                    jC4 = jC5 ^ (((long) UnsignedBytes.c(byteBuffer.get(4))) << 32);
                    jC3 = jC4 ^ (((long) UnsignedBytes.c(byteBuffer.get(3))) << 24);
                    jC2 = jC3 ^ (((long) UnsignedBytes.c(byteBuffer.get(2))) << 16);
                    jC = jC2 ^ (((long) UnsignedBytes.c(byteBuffer.get(1))) << 8);
                    jC7 = jC ^ ((long) UnsignedBytes.c(byteBuffer.get(0)));
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                case 8:
                    jC7 = byteBuffer.getLong();
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                case 9:
                    jC8 ^= (long) UnsignedBytes.c(byteBuffer.get(8));
                    jC7 = byteBuffer.getLong();
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                case 10:
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(9))) << 8;
                    jC8 ^= (long) UnsignedBytes.c(byteBuffer.get(8));
                    jC7 = byteBuffer.getLong();
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                case 11:
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(10))) << 16;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(9))) << 8;
                    jC8 ^= (long) UnsignedBytes.c(byteBuffer.get(8));
                    jC7 = byteBuffer.getLong();
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                case 12:
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(11))) << 24;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(10))) << 16;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(9))) << 8;
                    jC8 ^= (long) UnsignedBytes.c(byteBuffer.get(8));
                    jC7 = byteBuffer.getLong();
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                case 13:
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(12))) << 32;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(11))) << 24;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(10))) << 16;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(9))) << 8;
                    jC8 ^= (long) UnsignedBytes.c(byteBuffer.get(8));
                    jC7 = byteBuffer.getLong();
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                case 14:
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(13))) << 40;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(12))) << 32;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(11))) << 24;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(10))) << 16;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(9))) << 8;
                    jC8 ^= (long) UnsignedBytes.c(byteBuffer.get(8));
                    jC7 = byteBuffer.getLong();
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                case 15:
                    jC8 = ((long) UnsignedBytes.c(byteBuffer.get(14))) << 48;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(13))) << 40;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(12))) << 32;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(11))) << 24;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(10))) << 16;
                    jC8 ^= ((long) UnsignedBytes.c(byteBuffer.get(9))) << 8;
                    jC8 ^= (long) UnsignedBytes.c(byteBuffer.get(8));
                    jC7 = byteBuffer.getLong();
                    this.f639c = c(jC7) ^ this.f639c;
                    this.f638b ^= a(jC8);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j = this.f639c;
            long j2 = this.d;
            long j3 = this.f638b ^ j2;
            long j4 = (j ^ j2) + j3;
            this.f639c = j4;
            this.f638b = j3 + j4;
            this.f639c = b(j4);
            long jB = b(this.f638b);
            long j5 = this.f639c + jB;
            this.f639c = j5;
            this.f638b = jB + j5;
            return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f639c).putLong(this.f638b).array());
        }

        private static long c(long j) {
            return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
        }

        private static long a(long j) {
            return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
        }
    }
}
