package defpackage;

import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes5.dex */
public final class vag extends v00 implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final jlb f36662b = new vag(0);
    public static final jlb c = new vag(plb.f30517a);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36663a;

    public static final class a extends v10 {
        public long d;
        public long e;
        public int f;

        public a(int i) {
            super(16);
            long j = i;
            this.d = j;
            this.e = j;
            this.f = 0;
        }

        public static long h(long j) {
            long j2 = (j ^ (j >>> 33)) * (-49064778989728563L);
            long j3 = (j2 ^ (j2 >>> 33)) * (-4265267296055464877L);
            return j3 ^ (j3 >>> 33);
        }

        public static long i(long j) {
            return Long.rotateLeft(j * (-8663945395140668459L), 31) * 5545529020109919103L;
        }

        public static long j(long j) {
            return Long.rotateLeft(j * 5545529020109919103L, 33) * (-8663945395140668459L);
        }

        @Override // defpackage.v10
        public hlb c() {
            long j = this.d;
            int i = this.f;
            long j2 = j ^ ((long) i);
            long j3 = this.e ^ ((long) i);
            long j4 = j2 + j3;
            this.d = j4;
            this.e = j3 + j4;
            this.d = h(j4);
            long jH = h(this.e);
            long j5 = this.d + jH;
            this.d = j5;
            this.e = jH + j5;
            return hlb.f(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.d).putLong(this.e).array());
        }

        @Override // defpackage.v10
        public void e(ByteBuffer byteBuffer) {
            g(byteBuffer.getLong(), byteBuffer.getLong());
            this.f += 16;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // defpackage.v10
        public void f(ByteBuffer byteBuffer) {
            long jB;
            long jB2;
            long jB3;
            long jB4;
            long jB5;
            long jB6;
            long jB7;
            this.f += byteBuffer.remaining();
            long jB8 = 0;
            switch (byteBuffer.remaining()) {
                case 1:
                    jB = 0;
                    jB7 = jB ^ ((long) lbq.b(byteBuffer.get(0)));
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                case 2:
                    jB2 = 0;
                    jB = jB2 ^ (((long) lbq.b(byteBuffer.get(1))) << 8);
                    jB7 = jB ^ ((long) lbq.b(byteBuffer.get(0)));
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                case 3:
                    jB3 = 0;
                    jB2 = (((long) lbq.b(byteBuffer.get(2))) << 16) ^ jB3;
                    jB = jB2 ^ (((long) lbq.b(byteBuffer.get(1))) << 8);
                    jB7 = jB ^ ((long) lbq.b(byteBuffer.get(0)));
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                case 4:
                    jB4 = 0;
                    jB3 = jB4 ^ (((long) lbq.b(byteBuffer.get(3))) << 24);
                    jB2 = (((long) lbq.b(byteBuffer.get(2))) << 16) ^ jB3;
                    jB = jB2 ^ (((long) lbq.b(byteBuffer.get(1))) << 8);
                    jB7 = jB ^ ((long) lbq.b(byteBuffer.get(0)));
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                case 5:
                    jB5 = 0;
                    jB4 = jB5 ^ (((long) lbq.b(byteBuffer.get(4))) << 32);
                    jB3 = jB4 ^ (((long) lbq.b(byteBuffer.get(3))) << 24);
                    jB2 = (((long) lbq.b(byteBuffer.get(2))) << 16) ^ jB3;
                    jB = jB2 ^ (((long) lbq.b(byteBuffer.get(1))) << 8);
                    jB7 = jB ^ ((long) lbq.b(byteBuffer.get(0)));
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                case 6:
                    jB6 = 0;
                    jB5 = (((long) lbq.b(byteBuffer.get(5))) << 40) ^ jB6;
                    jB4 = jB5 ^ (((long) lbq.b(byteBuffer.get(4))) << 32);
                    jB3 = jB4 ^ (((long) lbq.b(byteBuffer.get(3))) << 24);
                    jB2 = (((long) lbq.b(byteBuffer.get(2))) << 16) ^ jB3;
                    jB = jB2 ^ (((long) lbq.b(byteBuffer.get(1))) << 8);
                    jB7 = jB ^ ((long) lbq.b(byteBuffer.get(0)));
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                case 7:
                    jB6 = ((long) lbq.b(byteBuffer.get(6))) << 48;
                    jB5 = (((long) lbq.b(byteBuffer.get(5))) << 40) ^ jB6;
                    jB4 = jB5 ^ (((long) lbq.b(byteBuffer.get(4))) << 32);
                    jB3 = jB4 ^ (((long) lbq.b(byteBuffer.get(3))) << 24);
                    jB2 = (((long) lbq.b(byteBuffer.get(2))) << 16) ^ jB3;
                    jB = jB2 ^ (((long) lbq.b(byteBuffer.get(1))) << 8);
                    jB7 = jB ^ ((long) lbq.b(byteBuffer.get(0)));
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                case 8:
                    jB7 = byteBuffer.getLong();
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                case 9:
                    jB8 ^= (long) lbq.b(byteBuffer.get(8));
                    jB7 = byteBuffer.getLong();
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                case 10:
                    jB8 ^= ((long) lbq.b(byteBuffer.get(9))) << 8;
                    jB8 ^= (long) lbq.b(byteBuffer.get(8));
                    jB7 = byteBuffer.getLong();
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                case 11:
                    jB8 ^= ((long) lbq.b(byteBuffer.get(10))) << 16;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(9))) << 8;
                    jB8 ^= (long) lbq.b(byteBuffer.get(8));
                    jB7 = byteBuffer.getLong();
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                case 12:
                    jB8 ^= ((long) lbq.b(byteBuffer.get(11))) << 24;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(10))) << 16;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(9))) << 8;
                    jB8 ^= (long) lbq.b(byteBuffer.get(8));
                    jB7 = byteBuffer.getLong();
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                case 13:
                    jB8 ^= ((long) lbq.b(byteBuffer.get(12))) << 32;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(11))) << 24;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(10))) << 16;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(9))) << 8;
                    jB8 ^= (long) lbq.b(byteBuffer.get(8));
                    jB7 = byteBuffer.getLong();
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                case 14:
                    jB8 ^= ((long) lbq.b(byteBuffer.get(13))) << 40;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(12))) << 32;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(11))) << 24;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(10))) << 16;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(9))) << 8;
                    jB8 ^= (long) lbq.b(byteBuffer.get(8));
                    jB7 = byteBuffer.getLong();
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                case 15:
                    jB8 = ((long) lbq.b(byteBuffer.get(14))) << 48;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(13))) << 40;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(12))) << 32;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(11))) << 24;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(10))) << 16;
                    jB8 ^= ((long) lbq.b(byteBuffer.get(9))) << 8;
                    jB8 ^= (long) lbq.b(byteBuffer.get(8));
                    jB7 = byteBuffer.getLong();
                    this.d = i(jB7) ^ this.d;
                    this.e ^= j(jB8);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }

        public final void g(long j, long j2) {
            long jI = i(j) ^ this.d;
            this.d = jI;
            long jRotateLeft = Long.rotateLeft(jI, 27);
            long j3 = this.e;
            this.d = ((jRotateLeft + j3) * 5) + 1390208809;
            long j4 = j(j2) ^ j3;
            this.e = j4;
            this.e = ((Long.rotateLeft(j4, 31) + this.d) * 5) + 944331445;
        }
    }

    public vag(int i) {
        this.f36663a = i;
    }

    @Override // defpackage.jlb
    public olb b() {
        return new a(this.f36663a);
    }

    public boolean equals(Object obj) {
        return (obj instanceof vag) && this.f36663a == ((vag) obj).f36663a;
    }

    public int hashCode() {
        return vag.class.hashCode() ^ this.f36663a;
    }

    public String toString() {
        int i = this.f36663a;
        StringBuilder sb = new StringBuilder(32);
        sb.append("Hashing.murmur3_128(");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
