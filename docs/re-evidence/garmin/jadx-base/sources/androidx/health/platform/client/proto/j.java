package androidx.health.platform.client.proto;

import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f7668c;

    public static final class b extends j {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f7669d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7671f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7672g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f7673h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f7674i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f7675j;

        private b(byte[] bArr, int i14, int i15, boolean z14) {
            super();
            this.f7675j = Integer.MAX_VALUE;
            this.f7669d = bArr;
            this.f7670e = i15 + i14;
            this.f7672g = i14;
            this.f7673h = i14;
        }

        public final int A() throws InvalidProtocolBufferException {
            int i14 = this.f7672g;
            if (this.f7670e - i14 < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f7672g = i14 + 4;
            byte[] bArr = this.f7669d;
            return ((bArr[i14 + 3] & UnsignedBytes.MAX_VALUE) << 24) | (bArr[i14] & UnsignedBytes.MAX_VALUE) | ((bArr[i14 + 1] & UnsignedBytes.MAX_VALUE) << 8) | ((bArr[i14 + 2] & UnsignedBytes.MAX_VALUE) << 16);
        }

        public final long B() throws InvalidProtocolBufferException {
            int i14 = this.f7672g;
            if (this.f7670e - i14 < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f7672g = i14 + 8;
            byte[] bArr = this.f7669d;
            return ((((long) bArr[i14 + 7]) & 255) << 56) | (((long) bArr[i14]) & 255) | ((((long) bArr[i14 + 1]) & 255) << 8) | ((((long) bArr[i14 + 2]) & 255) << 16) | ((((long) bArr[i14 + 3]) & 255) << 24) | ((((long) bArr[i14 + 4]) & 255) << 32) | ((((long) bArr[i14 + 5]) & 255) << 40) | ((((long) bArr[i14 + 6]) & 255) << 48);
        }

        public final int C() {
            int i14;
            int i15 = this.f7672g;
            int i16 = this.f7670e;
            if (i16 != i15) {
                int i17 = i15 + 1;
                byte[] bArr = this.f7669d;
                byte b14 = bArr[i15];
                if (b14 >= 0) {
                    this.f7672g = i17;
                    return b14;
                }
                if (i16 - i17 >= 9) {
                    int i18 = i15 + 2;
                    int i19 = (bArr[i17] << 7) ^ b14;
                    if (i19 < 0) {
                        i14 = i19 ^ (-128);
                    } else {
                        int i24 = i15 + 3;
                        int i25 = (bArr[i18] << Ascii.SO) ^ i19;
                        if (i25 >= 0) {
                            i14 = i25 ^ 16256;
                        } else {
                            int i26 = i15 + 4;
                            int i27 = i25 ^ (bArr[i24] << Ascii.NAK);
                            if (i27 < 0) {
                                i14 = (-2080896) ^ i27;
                            } else {
                                i24 = i15 + 5;
                                byte b15 = bArr[i26];
                                int i28 = (i27 ^ (b15 << Ascii.FS)) ^ 266354560;
                                if (b15 < 0) {
                                    i26 = i15 + 6;
                                    if (bArr[i24] < 0) {
                                        i24 = i15 + 7;
                                        if (bArr[i26] < 0) {
                                            i26 = i15 + 8;
                                            if (bArr[i24] < 0) {
                                                i24 = i15 + 9;
                                                if (bArr[i26] < 0) {
                                                    int i29 = i15 + 10;
                                                    if (bArr[i24] >= 0) {
                                                        i18 = i29;
                                                        i14 = i28;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i14 = i28;
                                }
                                i14 = i28;
                            }
                            i18 = i26;
                        }
                        i18 = i24;
                    }
                    this.f7672g = i18;
                    return i14;
                }
            }
            return (int) E();
        }

        public final long D() {
            long j8;
            long j14;
            long j15;
            long j16;
            int i14 = this.f7672g;
            int i15 = this.f7670e;
            if (i15 != i14) {
                int i16 = i14 + 1;
                byte[] bArr = this.f7669d;
                byte b14 = bArr[i14];
                if (b14 >= 0) {
                    this.f7672g = i16;
                    return b14;
                }
                if (i15 - i16 >= 9) {
                    int i17 = i14 + 2;
                    int i18 = (bArr[i16] << 7) ^ b14;
                    if (i18 < 0) {
                        j8 = i18 ^ (-128);
                    } else {
                        int i19 = i14 + 3;
                        int i24 = (bArr[i17] << Ascii.SO) ^ i18;
                        if (i24 >= 0) {
                            j8 = i24 ^ 16256;
                            i17 = i19;
                        } else {
                            int i25 = i14 + 4;
                            int i26 = i24 ^ (bArr[i19] << Ascii.NAK);
                            if (i26 < 0) {
                                j16 = (-2080896) ^ i26;
                            } else {
                                long j17 = i26;
                                i17 = i14 + 5;
                                long j18 = j17 ^ (((long) bArr[i25]) << 28);
                                if (j18 >= 0) {
                                    j15 = 266354560;
                                } else {
                                    i25 = i14 + 6;
                                    long j19 = j18 ^ (((long) bArr[i17]) << 35);
                                    if (j19 < 0) {
                                        j14 = -34093383808L;
                                    } else {
                                        i17 = i14 + 7;
                                        j18 = j19 ^ (((long) bArr[i25]) << 42);
                                        if (j18 >= 0) {
                                            j15 = 4363953127296L;
                                        } else {
                                            i25 = i14 + 8;
                                            j19 = j18 ^ (((long) bArr[i17]) << 49);
                                            if (j19 < 0) {
                                                j14 = -558586000294016L;
                                            } else {
                                                i17 = i14 + 9;
                                                long j24 = (j19 ^ (((long) bArr[i25]) << 56)) ^ 71499008037633920L;
                                                if (j24 < 0) {
                                                    int i27 = i14 + 10;
                                                    if (bArr[i17] >= 0) {
                                                        i17 = i27;
                                                    }
                                                }
                                                j8 = j24;
                                            }
                                        }
                                    }
                                    j16 = j14 ^ j19;
                                }
                                j8 = j15 ^ j18;
                            }
                            i17 = i25;
                            j8 = j16;
                        }
                    }
                    this.f7672g = i17;
                    return j8;
                }
            }
            return E();
        }

        public final long E() throws InvalidProtocolBufferException {
            long j8 = 0;
            for (int i14 = 0; i14 < 64; i14 += 7) {
                int i15 = this.f7672g;
                if (i15 == this.f7670e) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.f7672g = i15 + 1;
                byte b14 = this.f7669d[i15];
                j8 |= ((long) (b14 & Ascii.DEL)) << i14;
                if ((b14 & UnsignedBytes.MAX_POWER_OF_TWO) == 0) {
                    return j8;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final void F() {
            int i14 = this.f7670e + this.f7671f;
            this.f7670e = i14;
            int i15 = i14 - this.f7673h;
            int i16 = this.f7675j;
            if (i15 <= i16) {
                this.f7671f = 0;
                return;
            }
            int i17 = i15 - i16;
            this.f7671f = i17;
            this.f7670e = i14 - i17;
        }

        public final void G(int i14) throws InvalidProtocolBufferException {
            if (i14 >= 0) {
                int i15 = this.f7670e;
                int i16 = this.f7672g;
                if (i14 <= i15 - i16) {
                    this.f7672g = i16 + i14;
                    return;
                }
            }
            if (i14 >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        @Override // androidx.health.platform.client.proto.j
        public final void a(int i14) throws InvalidProtocolBufferException {
            if (this.f7674i != i14) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.health.platform.client.proto.j
        public final int d() {
            return this.f7672g - this.f7673h;
        }

        @Override // androidx.health.platform.client.proto.j
        public final boolean e() {
            return this.f7672g == this.f7670e;
        }

        @Override // androidx.health.platform.client.proto.j
        public final void f(int i14) {
            this.f7675j = i14;
            F();
        }

        @Override // androidx.health.platform.client.proto.j
        public final int g(int i14) {
            if (i14 < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iD = d() + i14;
            if (iD < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i15 = this.f7675j;
            if (iD > i15) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f7675j = iD;
            F();
            return i15;
        }

        @Override // androidx.health.platform.client.proto.j
        public final boolean h() {
            return D() != 0;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:16:0x0031 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:17:0x0033  */
        /* JADX WARN: Code duplicated, block: B:20:0x003d  */
        /* JADX WARN: Code duplicated, block: B:22:0x0042  */
        @Override // androidx.health.platform.client.proto.j
        public final i.h i() throws InvalidProtocolBufferException {
            byte[] bArrCopyOfRange;
            int iC = C();
            byte[] bArr = this.f7669d;
            if (iC > 0) {
                int i14 = this.f7670e;
                int i15 = this.f7672g;
                if (iC <= i14 - i15) {
                    i.h hVarC = i.c(i15, iC, bArr);
                    this.f7672g += iC;
                    return hVarC;
                }
            }
            if (iC == 0) {
                return i.f7657b;
            }
            if (iC > 0) {
                int i16 = this.f7670e;
                int i17 = this.f7672g;
                if (iC <= i16 - i17) {
                    int i18 = iC + i17;
                    this.f7672g = i18;
                    bArrCopyOfRange = Arrays.copyOfRange(bArr, i17, i18);
                } else {
                    if (iC <= 0) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    if (iC == 0) {
                        throw InvalidProtocolBufferException.negativeSize();
                    }
                    bArrCopyOfRange = l0.f7709b;
                }
            } else {
                if (iC <= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (iC == 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                bArrCopyOfRange = l0.f7709b;
            }
            i.h hVar = i.f7657b;
            return new i.h(bArrCopyOfRange);
        }

        @Override // androidx.health.platform.client.proto.j
        public final double j() {
            return Double.longBitsToDouble(B());
        }

        @Override // androidx.health.platform.client.proto.j
        public final int k() {
            return C();
        }

        @Override // androidx.health.platform.client.proto.j
        public final int l() {
            return A();
        }

        @Override // androidx.health.platform.client.proto.j
        public final long m() {
            return B();
        }

        @Override // androidx.health.platform.client.proto.j
        public final float n() {
            return Float.intBitsToFloat(A());
        }

        @Override // androidx.health.platform.client.proto.j
        public final int o() {
            return C();
        }

        @Override // androidx.health.platform.client.proto.j
        public final long p() {
            return D();
        }

        @Override // androidx.health.platform.client.proto.j
        public final int q() {
            return A();
        }

        @Override // androidx.health.platform.client.proto.j
        public final long r() {
            return B();
        }

        @Override // androidx.health.platform.client.proto.j
        public final int s() {
            return j.b(C());
        }

        @Override // androidx.health.platform.client.proto.j
        public final long t() {
            return j.c(D());
        }

        @Override // androidx.health.platform.client.proto.j
        public final String u() throws InvalidProtocolBufferException {
            int iC = C();
            if (iC > 0) {
                int i14 = this.f7670e;
                int i15 = this.f7672g;
                if (iC <= i14 - i15) {
                    String str = new String(this.f7669d, i15, iC, l0.f7708a);
                    this.f7672g += iC;
                    return str;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.health.platform.client.proto.j
        public final String v() throws InvalidProtocolBufferException {
            int iC = C();
            if (iC > 0) {
                int i14 = this.f7670e;
                int i15 = this.f7672g;
                if (iC <= i14 - i15) {
                    String strA = z2.f7824a.a(this.f7669d, i15, iC);
                    this.f7672g += iC;
                    return strA;
                }
            }
            if (iC == 0) {
                return "";
            }
            if (iC <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.health.platform.client.proto.j
        public final int w() throws InvalidProtocolBufferException {
            if (e()) {
                this.f7674i = 0;
                return 0;
            }
            int iC = C();
            this.f7674i = iC;
            if ((iC >>> 3) != 0) {
                return iC;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.health.platform.client.proto.j
        public final int x() {
            return C();
        }

        @Override // androidx.health.platform.client.proto.j
        public final long y() {
            return D();
        }

        @Override // androidx.health.platform.client.proto.j
        public final boolean z(int i14) throws InvalidProtocolBufferException {
            boolean z14;
            int i15 = i14 & 7;
            int i16 = 0;
            if (i15 == 0) {
                int i17 = this.f7670e - this.f7672g;
                byte[] bArr = this.f7669d;
                if (i17 >= 10) {
                    while (i16 < 10) {
                        int i18 = this.f7672g;
                        this.f7672g = i18 + 1;
                        if (bArr[i18] < 0) {
                            i16++;
                        }
                    }
                    throw InvalidProtocolBufferException.malformedVarint();
                }
                while (i16 < 10) {
                    int i19 = this.f7672g;
                    if (i19 == this.f7670e) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.f7672g = i19 + 1;
                    if (bArr[i19] < 0) {
                        i16++;
                    }
                }
                throw InvalidProtocolBufferException.malformedVarint();
                return true;
            }
            if (i15 == 1) {
                G(8);
                return true;
            }
            if (i15 == 2) {
                G(C());
                return true;
            }
            if (i15 != 3) {
                if (i15 == 4) {
                    return false;
                }
                if (i15 != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                G(4);
                return true;
            }
            do {
                int iW = w();
                if (iW == 0) {
                    break;
                }
                int i24 = this.f7666a;
                if (i24 >= this.f7667b) {
                    throw InvalidProtocolBufferException.recursionLimitExceeded();
                }
                this.f7666a = i24 + 1;
                z14 = z(iW);
                this.f7666a--;
            } while (z14);
            a(((i14 >>> 3) << 3) | 4);
            return true;
        }
    }

    private j() {
        this.f7667b = 100;
    }

    public static int b(int i14) {
        return (-(i14 & 1)) ^ (i14 >>> 1);
    }

    public static long c(long j8) {
        return (-(j8 & 1)) ^ (j8 >>> 1);
    }

    public abstract void a(int i14);

    public abstract int d();

    public abstract boolean e();

    public abstract void f(int i14);

    public abstract int g(int i14);

    public abstract boolean h();

    public abstract i.h i();

    public abstract double j();

    public abstract int k();

    public abstract int l();

    public abstract long m();

    public abstract float n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    public abstract long t();

    public abstract String u();

    public abstract String v();

    public abstract int w();

    public abstract int x();

    public abstract long y();

    public abstract boolean z(int i14);
}
