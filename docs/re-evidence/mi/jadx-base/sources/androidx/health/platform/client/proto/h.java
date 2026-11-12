package androidx.health.platform.client.proto;

import androidx.work.WorkInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.bpd;
import defpackage.hbq;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static volatile int f = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2494b;
    public int c;
    public i d;
    public boolean e;

    public static final class b extends h {
        public final byte[] g;
        public final boolean h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2495k;
        public int l;
        public int m;
        public boolean n;
        public int o;

        @Override // androidx.health.platform.client.proto.h
        public long A() throws IOException {
            return h.c(M());
        }

        @Override // androidx.health.platform.client.proto.h
        public String B() throws IOException {
            int iL = L();
            if (iL > 0) {
                int i = this.i;
                int i2 = this.f2495k;
                if (iL <= i - i2) {
                    String str = new String(this.g, i2, iL, f0.f2490b);
                    this.f2495k += iL;
                    return str;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.health.platform.client.proto.h
        public String C() throws IOException {
            int iL = L();
            if (iL > 0) {
                int i = this.i;
                int i2 = this.f2495k;
                if (iL <= i - i2) {
                    String strH = e2.h(this.g, i2, iL);
                    this.f2495k += iL;
                    return strH;
                }
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.health.platform.client.proto.h
        public int D() throws IOException {
            if (e()) {
                this.m = 0;
                return 0;
            }
            int iL = L();
            this.m = iL;
            if (WireFormat.a(iL) != 0) {
                return this.m;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.health.platform.client.proto.h
        public int E() throws IOException {
            return L();
        }

        @Override // androidx.health.platform.client.proto.h
        public long F() throws IOException {
            return M();
        }

        @Override // androidx.health.platform.client.proto.h
        public boolean G(int i) throws IOException {
            int iB = WireFormat.b(i);
            if (iB == 0) {
                R();
                return true;
            }
            if (iB == 1) {
                Q(8);
                return true;
            }
            if (iB == 2) {
                Q(L());
                return true;
            }
            if (iB == 3) {
                P();
                a(WireFormat.c(WireFormat.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            Q(4);
            return true;
        }

        public byte H() throws IOException {
            int i = this.f2495k;
            if (i == this.i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.g;
            this.f2495k = i + 1;
            return bArr[i];
        }

        public byte[] I(int i) throws IOException {
            if (i > 0) {
                int i2 = this.i;
                int i3 = this.f2495k;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.f2495k = i4;
                    return Arrays.copyOfRange(this.g, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return f0.d;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public int J() throws IOException {
            int i = this.f2495k;
            if (this.i - i < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.g;
            this.f2495k = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long K() throws IOException {
            int i = this.f2495k;
            if (this.i - i < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.g;
            this.f2495k = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public int L() throws IOException {
            int i;
            int i2 = this.f2495k;
            int i3 = this.i;
            if (i3 != i2) {
                byte[] bArr = this.g;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f2495k = i4;
                    return b2;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b2;
                    if (i6 < 0) {
                        i = i6 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << HMProSyncDataBaseProfile.DATA_TYPE_COACHING) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b3 = bArr[i9];
                                int i11 = (i10 ^ (b3 << 28)) ^ 266354560;
                                if (b3 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.f2495k = i5;
                    return i;
                }
            }
            return (int) N();
        }

        public long M() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f2495k;
            int i2 = this.i;
            if (i2 != i) {
                byte[] bArr = this.g;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f2495k = i3;
                    return b2;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b2;
                    if (i5 < 0) {
                        j = i5 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << HMProSyncDataBaseProfile.DATA_TYPE_COACHING) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i10]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.f2495k = i4;
                    return j;
                }
            }
            return N();
        }

        public long N() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bH = H();
                j |= ((long) (bH & 127)) << i;
                if ((bH & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final void O() {
            int i = this.i + this.j;
            this.i = i;
            int i2 = i - this.l;
            int i3 = this.o;
            if (i2 <= i3) {
                this.j = 0;
                return;
            }
            int i4 = i2 - i3;
            this.j = i4;
            this.i = i - i4;
        }

        public void P() throws IOException {
            int iD;
            do {
                iD = D();
                if (iD == 0) {
                    return;
                }
            } while (G(iD));
        }

        public void Q(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.i;
                int i3 = this.f2495k;
                if (i <= i2 - i3) {
                    this.f2495k = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public final void R() throws IOException {
            if (this.i - this.f2495k >= 10) {
                S();
            } else {
                T();
            }
        }

        public final void S() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.g;
                int i2 = this.f2495k;
                this.f2495k = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final void T() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.health.platform.client.proto.h
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.m != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.health.platform.client.proto.h
        public int d() {
            return this.f2495k - this.l;
        }

        @Override // androidx.health.platform.client.proto.h
        public boolean e() throws IOException {
            return this.f2495k == this.i;
        }

        @Override // androidx.health.platform.client.proto.h
        public void m(int i) {
            this.o = i;
            O();
        }

        @Override // androidx.health.platform.client.proto.h
        public int n(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iD = i + d();
            if (iD < 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            int i2 = this.o;
            if (iD > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.o = iD;
            O();
            return i2;
        }

        @Override // androidx.health.platform.client.proto.h
        public boolean o() throws IOException {
            return M() != 0;
        }

        @Override // androidx.health.platform.client.proto.h
        public ByteString p() throws IOException {
            int iL = L();
            if (iL > 0) {
                int i = this.i;
                int i2 = this.f2495k;
                if (iL <= i - i2) {
                    ByteString byteStringWrap = (this.h && this.n) ? ByteString.wrap(this.g, i2, iL) : ByteString.copyFrom(this.g, i2, iL);
                    this.f2495k += iL;
                    return byteStringWrap;
                }
            }
            return iL == 0 ? ByteString.EMPTY : ByteString.wrap(I(iL));
        }

        @Override // androidx.health.platform.client.proto.h
        public double q() throws IOException {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.health.platform.client.proto.h
        public int r() throws IOException {
            return L();
        }

        @Override // androidx.health.platform.client.proto.h
        public int s() throws IOException {
            return J();
        }

        @Override // androidx.health.platform.client.proto.h
        public long t() throws IOException {
            return K();
        }

        @Override // androidx.health.platform.client.proto.h
        public float u() throws IOException {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.health.platform.client.proto.h
        public int v() throws IOException {
            return L();
        }

        @Override // androidx.health.platform.client.proto.h
        public long w() throws IOException {
            return M();
        }

        @Override // androidx.health.platform.client.proto.h
        public int x() throws IOException {
            return J();
        }

        @Override // androidx.health.platform.client.proto.h
        public long y() throws IOException {
            return K();
        }

        @Override // androidx.health.platform.client.proto.h
        public int z() throws IOException {
            return h.b(L());
        }

        public b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.o = Integer.MAX_VALUE;
            this.g = bArr;
            this.i = i2 + i;
            this.f2495k = i;
            this.l = i;
            this.h = z;
        }
    }

    public static final class c extends h {
        public final Iterable<ByteBuffer> g;
        public final Iterator<ByteBuffer> h;
        public ByteBuffer i;
        public final boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f2496k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f2497r;
        public long s;
        public long t;
        public long u;

        private void Q() {
            int i = this.l + this.m;
            this.l = i;
            int i2 = i - this.q;
            int i3 = this.n;
            if (i2 <= i3) {
                this.m = 0;
                return;
            }
            int i4 = i2 - i3;
            this.m = i4;
            this.l = i - i4;
        }

        private void U() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.health.platform.client.proto.h
        public long A() throws IOException {
            return h.c(O());
        }

        @Override // androidx.health.platform.client.proto.h
        public String B() throws IOException {
            int iN = N();
            if (iN > 0) {
                long j = iN;
                long j2 = this.u;
                long j3 = this.f2497r;
                if (j <= j2 - j3) {
                    byte[] bArr = new byte[iN];
                    hbq.p(j3, bArr, 0L, j);
                    String str = new String(bArr, f0.f2490b);
                    this.f2497r += j;
                    return str;
                }
            }
            if (iN > 0 && iN <= R()) {
                byte[] bArr2 = new byte[iN];
                K(bArr2, 0, iN);
                return new String(bArr2, f0.f2490b);
            }
            if (iN == 0) {
                return "";
            }
            if (iN < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.health.platform.client.proto.h
        public String C() throws IOException {
            int iN = N();
            if (iN > 0) {
                long j = iN;
                long j2 = this.u;
                long j3 = this.f2497r;
                if (j <= j2 - j3) {
                    String strG = e2.g(this.i, (int) (j3 - this.s), iN);
                    this.f2497r += j;
                    return strG;
                }
            }
            if (iN >= 0 && iN <= R()) {
                byte[] bArr = new byte[iN];
                K(bArr, 0, iN);
                return e2.h(bArr, 0, iN);
            }
            if (iN == 0) {
                return "";
            }
            if (iN <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.health.platform.client.proto.h
        public int D() throws IOException {
            if (e()) {
                this.o = 0;
                return 0;
            }
            int iN = N();
            this.o = iN;
            if (WireFormat.a(iN) != 0) {
                return this.o;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.health.platform.client.proto.h
        public int E() throws IOException {
            return N();
        }

        @Override // androidx.health.platform.client.proto.h
        public long F() throws IOException {
            return O();
        }

        @Override // androidx.health.platform.client.proto.h
        public boolean G(int i) throws IOException {
            int iB = WireFormat.b(i);
            if (iB == 0) {
                U();
                return true;
            }
            if (iB == 1) {
                T(8);
                return true;
            }
            if (iB == 2) {
                T(N());
                return true;
            }
            if (iB == 3) {
                S();
                a(WireFormat.c(WireFormat.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            T(4);
            return true;
        }

        public final long H() {
            return this.u - this.f2497r;
        }

        public final void I() throws InvalidProtocolBufferException {
            if (!this.h.hasNext()) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            W();
        }

        public byte J() throws IOException {
            if (H() == 0) {
                I();
            }
            long j = this.f2497r;
            this.f2497r = 1 + j;
            return hbq.w(j);
        }

        public final void K(byte[] bArr, int i, int i2) throws IOException {
            if (i2 < 0 || i2 > R()) {
                if (i2 > 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                if (i2 != 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                return;
            }
            int i3 = i2;
            while (i3 > 0) {
                if (H() == 0) {
                    I();
                }
                int iMin = Math.min(i3, (int) H());
                long j = iMin;
                hbq.p(this.f2497r, bArr, (i2 - i3) + i, j);
                i3 -= iMin;
                this.f2497r += j;
            }
        }

        public int L() throws IOException {
            if (H() < 4) {
                return (J() & 255) | ((J() & 255) << 8) | ((J() & 255) << 16) | ((J() & 255) << 24);
            }
            long j = this.f2497r;
            this.f2497r = 4 + j;
            return ((hbq.w(j + 3) & 255) << 24) | (hbq.w(j) & 255) | ((hbq.w(1 + j) & 255) << 8) | ((hbq.w(2 + j) & 255) << 16);
        }

        public long M() throws IOException {
            long J;
            byte bJ;
            if (H() >= 8) {
                long j = this.f2497r;
                this.f2497r = 8 + j;
                J = (((long) hbq.w(j)) & 255) | ((((long) hbq.w(1 + j)) & 255) << 8) | ((((long) hbq.w(2 + j)) & 255) << 16) | ((((long) hbq.w(3 + j)) & 255) << 24) | ((((long) hbq.w(4 + j)) & 255) << 32) | ((((long) hbq.w(5 + j)) & 255) << 40) | ((((long) hbq.w(6 + j)) & 255) << 48);
                bJ = hbq.w(j + 7);
            } else {
                J = (((long) J()) & 255) | ((((long) J()) & 255) << 8) | ((((long) J()) & 255) << 16) | ((((long) J()) & 255) << 24) | ((((long) J()) & 255) << 32) | ((((long) J()) & 255) << 40) | ((((long) J()) & 255) << 48);
                bJ = J();
            }
            return ((((long) bJ) & 255) << 56) | J;
        }

        public int N() throws IOException {
            int i;
            long j = this.f2497r;
            if (this.u != j) {
                long j2 = j + 1;
                byte bW = hbq.w(j);
                if (bW >= 0) {
                    this.f2497r++;
                    return bW;
                }
                if (this.u - this.f2497r >= 10) {
                    long j3 = 2 + j;
                    int iW = (hbq.w(j2) << 7) ^ bW;
                    if (iW < 0) {
                        i = iW ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    } else {
                        long j4 = 3 + j;
                        int iW2 = (hbq.w(j3) << HMProSyncDataBaseProfile.DATA_TYPE_COACHING) ^ iW;
                        if (iW2 >= 0) {
                            i = iW2 ^ 16256;
                        } else {
                            long j5 = 4 + j;
                            int iW3 = iW2 ^ (hbq.w(j4) << 21);
                            if (iW3 < 0) {
                                i = (-2080896) ^ iW3;
                            } else {
                                j4 = 5 + j;
                                byte bW2 = hbq.w(j5);
                                int i2 = (iW3 ^ (bW2 << 28)) ^ 266354560;
                                if (bW2 < 0) {
                                    j5 = 6 + j;
                                    if (hbq.w(j4) < 0) {
                                        j4 = 7 + j;
                                        if (hbq.w(j5) < 0) {
                                            j5 = 8 + j;
                                            if (hbq.w(j4) < 0) {
                                                j4 = 9 + j;
                                                if (hbq.w(j5) < 0) {
                                                    long j6 = j + 10;
                                                    if (hbq.w(j4) >= 0) {
                                                        i = i2;
                                                        j3 = j6;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i2;
                                }
                                i = i2;
                            }
                            j3 = j5;
                        }
                        j3 = j4;
                    }
                    this.f2497r = j3;
                    return i;
                }
            }
            return (int) P();
        }

        public long O() throws IOException {
            long j;
            long j2;
            long j3;
            long j4 = this.f2497r;
            if (this.u != j4) {
                long j5 = j4 + 1;
                byte bW = hbq.w(j4);
                if (bW >= 0) {
                    this.f2497r++;
                    return bW;
                }
                if (this.u - this.f2497r >= 10) {
                    long j6 = 2 + j4;
                    int iW = (hbq.w(j5) << 7) ^ bW;
                    if (iW < 0) {
                        j = iW ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    } else {
                        long j7 = 3 + j4;
                        int iW2 = (hbq.w(j6) << HMProSyncDataBaseProfile.DATA_TYPE_COACHING) ^ iW;
                        if (iW2 >= 0) {
                            j = iW2 ^ 16256;
                            j6 = j7;
                        } else {
                            long j8 = 4 + j4;
                            int iW3 = iW2 ^ (hbq.w(j7) << 21);
                            if (iW3 < 0) {
                                j = (-2080896) ^ iW3;
                                j6 = j8;
                            } else {
                                long j9 = 5 + j4;
                                long jW = (((long) hbq.w(j8)) << 28) ^ ((long) iW3);
                                if (jW >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j10 = 6 + j4;
                                    long jW2 = jW ^ (((long) hbq.w(j9)) << 35);
                                    if (jW2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j9 = 7 + j4;
                                        jW = jW2 ^ (((long) hbq.w(j10)) << 42);
                                        if (jW >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j10 = 8 + j4;
                                            jW2 = jW ^ (((long) hbq.w(j9)) << 49);
                                            if (jW2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                j9 = 9 + j4;
                                                long jW3 = (jW2 ^ (((long) hbq.w(j10)) << 56)) ^ 71499008037633920L;
                                                if (jW3 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (hbq.w(j9) >= 0) {
                                                        j = jW3;
                                                        j6 = j11;
                                                    }
                                                } else {
                                                    j = jW3;
                                                    j6 = j9;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jW2;
                                    j6 = j10;
                                }
                                j = j3 ^ jW;
                                j6 = j9;
                            }
                        }
                    }
                    this.f2497r = j6;
                    return j;
                }
            }
            return P();
        }

        public long P() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bJ = J();
                j |= ((long) (bJ & 127)) << i;
                if ((bJ & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final int R() {
            return (int) ((((long) (this.l - this.p)) - this.f2497r) + this.s);
        }

        public void S() throws IOException {
            int iD;
            do {
                iD = D();
                if (iD == 0) {
                    return;
                }
            } while (G(iD));
        }

        public void T(int i) throws IOException {
            if (i < 0 || i > (((long) (this.l - this.p)) - this.f2497r) + this.s) {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
            while (i > 0) {
                if (H() == 0) {
                    I();
                }
                int iMin = Math.min(i, (int) H());
                i -= iMin;
                this.f2497r += (long) iMin;
            }
        }

        public final ByteBuffer V(int i, int i2) throws IOException {
            int iPosition = this.i.position();
            int iLimit = this.i.limit();
            ByteBuffer byteBuffer = this.i;
            try {
                try {
                    byteBuffer.position(i);
                    byteBuffer.limit(i2);
                    ByteBuffer byteBufferSlice = this.i.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }

        public final void W() {
            ByteBuffer next = this.h.next();
            this.i = next;
            this.p += (int) (this.f2497r - this.s);
            long jPosition = next.position();
            this.f2497r = jPosition;
            this.s = jPosition;
            this.u = this.i.limit();
            long jK = hbq.k(this.i);
            this.t = jK;
            this.f2497r += jK;
            this.s += jK;
            this.u += jK;
        }

        @Override // androidx.health.platform.client.proto.h
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.o != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.health.platform.client.proto.h
        public int d() {
            return (int) ((((long) (this.p - this.q)) + this.f2497r) - this.s);
        }

        @Override // androidx.health.platform.client.proto.h
        public boolean e() throws IOException {
            return (((long) this.p) + this.f2497r) - this.s == ((long) this.l);
        }

        @Override // androidx.health.platform.client.proto.h
        public void m(int i) {
            this.n = i;
            Q();
        }

        @Override // androidx.health.platform.client.proto.h
        public int n(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iD = i + d();
            int i2 = this.n;
            if (iD > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.n = iD;
            Q();
            return i2;
        }

        @Override // androidx.health.platform.client.proto.h
        public boolean o() throws IOException {
            return O() != 0;
        }

        @Override // androidx.health.platform.client.proto.h
        public ByteString p() throws IOException {
            int iN = N();
            if (iN > 0) {
                long j = iN;
                long j2 = this.u;
                long j3 = this.f2497r;
                if (j <= j2 - j3) {
                    if (this.j && this.f2496k) {
                        int i = (int) (j3 - this.t);
                        ByteString byteStringWrap = ByteString.wrap(V(i, iN + i));
                        this.f2497r += j;
                        return byteStringWrap;
                    }
                    byte[] bArr = new byte[iN];
                    hbq.p(j3, bArr, 0L, j);
                    this.f2497r += j;
                    return ByteString.wrap(bArr);
                }
            }
            if (iN <= 0 || iN > R()) {
                if (iN == 0) {
                    return ByteString.EMPTY;
                }
                if (iN < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (!this.j || !this.f2496k) {
                byte[] bArr2 = new byte[iN];
                K(bArr2, 0, iN);
                return ByteString.wrap(bArr2);
            }
            ArrayList arrayList = new ArrayList();
            while (iN > 0) {
                if (H() == 0) {
                    I();
                }
                int iMin = Math.min(iN, (int) H());
                int i2 = (int) (this.f2497r - this.t);
                arrayList.add(ByteString.wrap(V(i2, i2 + iMin)));
                iN -= iMin;
                this.f2497r += (long) iMin;
            }
            return ByteString.copyFrom(arrayList);
        }

        @Override // androidx.health.platform.client.proto.h
        public double q() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // androidx.health.platform.client.proto.h
        public int r() throws IOException {
            return N();
        }

        @Override // androidx.health.platform.client.proto.h
        public int s() throws IOException {
            return L();
        }

        @Override // androidx.health.platform.client.proto.h
        public long t() throws IOException {
            return M();
        }

        @Override // androidx.health.platform.client.proto.h
        public float u() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // androidx.health.platform.client.proto.h
        public int v() throws IOException {
            return N();
        }

        @Override // androidx.health.platform.client.proto.h
        public long w() throws IOException {
            return O();
        }

        @Override // androidx.health.platform.client.proto.h
        public int x() throws IOException {
            return L();
        }

        @Override // androidx.health.platform.client.proto.h
        public long y() throws IOException {
            return M();
        }

        @Override // androidx.health.platform.client.proto.h
        public int z() throws IOException {
            return h.b(N());
        }

        public c(Iterable<ByteBuffer> iterable, int i, boolean z) {
            super();
            this.n = Integer.MAX_VALUE;
            this.l = i;
            this.g = iterable;
            this.h = iterable.iterator();
            this.j = z;
            this.p = 0;
            this.q = 0;
            if (i != 0) {
                W();
                return;
            }
            this.i = f0.e;
            this.f2497r = 0L;
            this.s = 0L;
            this.u = 0L;
            this.t = 0L;
        }
    }

    public static final class d extends h {
        public final InputStream g;
        public final byte[] h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2498k;
        public int l;
        public int m;
        public int n;

        public static int H(InputStream inputStream) throws IOException {
            try {
                return inputStream.available();
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        public static int I(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
            try {
                return inputStream.read(bArr, i, i2);
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private void T() {
            int i = this.i + this.j;
            this.i = i;
            int i2 = this.m + i;
            int i3 = this.n;
            if (i2 <= i3) {
                this.j = 0;
                return;
            }
            int i4 = i2 - i3;
            this.j = i4;
            this.i = i - i4;
        }

        public static long V(InputStream inputStream, long j) throws IOException {
            try {
                return inputStream.skip(j);
            } catch (InvalidProtocolBufferException e) {
                e.setThrownFromInputStream();
                throw e;
            }
        }

        private void Z() throws IOException {
            if (this.i - this.f2498k >= 10) {
                a0();
            } else {
                b0();
            }
        }

        private void a0() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.h;
                int i2 = this.f2498k;
                this.f2498k = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void b0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (K() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.health.platform.client.proto.h
        public long A() throws IOException {
            return h.c(R());
        }

        @Override // androidx.health.platform.client.proto.h
        public String B() throws IOException {
            int iQ = Q();
            if (iQ > 0) {
                int i = this.i;
                int i2 = this.f2498k;
                if (iQ <= i - i2) {
                    String str = new String(this.h, i2, iQ, f0.f2490b);
                    this.f2498k += iQ;
                    return str;
                }
            }
            if (iQ == 0) {
                return "";
            }
            if (iQ > this.i) {
                return new String(L(iQ, false), f0.f2490b);
            }
            U(iQ);
            String str2 = new String(this.h, this.f2498k, iQ, f0.f2490b);
            this.f2498k += iQ;
            return str2;
        }

        @Override // androidx.health.platform.client.proto.h
        public String C() throws IOException {
            byte[] bArrL;
            int iQ = Q();
            int i = this.f2498k;
            int i2 = this.i;
            if (iQ <= i2 - i && iQ > 0) {
                bArrL = this.h;
                this.f2498k = i + iQ;
            } else {
                if (iQ == 0) {
                    return "";
                }
                i = 0;
                if (iQ <= i2) {
                    U(iQ);
                    bArrL = this.h;
                    this.f2498k = iQ;
                } else {
                    bArrL = L(iQ, false);
                }
            }
            return e2.h(bArrL, i, iQ);
        }

        @Override // androidx.health.platform.client.proto.h
        public int D() throws IOException {
            if (e()) {
                this.l = 0;
                return 0;
            }
            int iQ = Q();
            this.l = iQ;
            if (WireFormat.a(iQ) != 0) {
                return this.l;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.health.platform.client.proto.h
        public int E() throws IOException {
            return Q();
        }

        @Override // androidx.health.platform.client.proto.h
        public long F() throws IOException {
            return R();
        }

        @Override // androidx.health.platform.client.proto.h
        public boolean G(int i) throws IOException {
            int iB = WireFormat.b(i);
            if (iB == 0) {
                Z();
                return true;
            }
            if (iB == 1) {
                X(8);
                return true;
            }
            if (iB == 2) {
                X(Q());
                return true;
            }
            if (iB == 3) {
                W();
                a(WireFormat.c(WireFormat.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            X(4);
            return true;
        }

        public final ByteString J(int i) throws IOException {
            byte[] bArrM = M(i);
            if (bArrM != null) {
                return ByteString.copyFrom(bArrM);
            }
            int i2 = this.f2498k;
            int i3 = this.i;
            int length = i3 - i2;
            this.m += i3;
            this.f2498k = 0;
            this.i = 0;
            List<byte[]> listN = N(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.h, i2, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        public byte K() throws IOException {
            if (this.f2498k == this.i) {
                U(1);
            }
            byte[] bArr = this.h;
            int i = this.f2498k;
            this.f2498k = i + 1;
            return bArr[i];
        }

        public final byte[] L(int i, boolean z) throws IOException {
            byte[] bArrM = M(i);
            if (bArrM != null) {
                return z ? (byte[]) bArrM.clone() : bArrM;
            }
            int i2 = this.f2498k;
            int i3 = this.i;
            int length = i3 - i2;
            this.m += i3;
            this.f2498k = 0;
            this.i = 0;
            List<byte[]> listN = N(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.h, i2, bArr, 0, length);
            for (byte[] bArr2 : listN) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] M(int i) throws IOException {
            if (i == 0) {
                return f0.d;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.m;
            int i3 = this.f2498k;
            int i4 = i2 + i3 + i;
            if (i4 - this.c > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i5 = this.n;
            if (i4 > i5) {
                X((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i6 = this.i - i3;
            int i7 = i - i6;
            if (i7 >= 4096 && i7 > H(this.g)) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.h, this.f2498k, bArr, 0, i6);
            this.m += this.i;
            this.f2498k = 0;
            this.i = 0;
            while (i6 < i) {
                int I = I(this.g, bArr, i6, i - i6);
                if (I == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.m += I;
                i6 += I;
            }
            return bArr;
        }

        public final List<byte[]> N(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.g.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.m += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int O() throws IOException {
            int i = this.f2498k;
            if (this.i - i < 4) {
                U(4);
                i = this.f2498k;
            }
            byte[] bArr = this.h;
            this.f2498k = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long P() throws IOException {
            int i = this.f2498k;
            if (this.i - i < 8) {
                U(8);
                i = this.f2498k;
            }
            byte[] bArr = this.h;
            this.f2498k = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public int Q() throws IOException {
            int i;
            int i2 = this.f2498k;
            int i3 = this.i;
            if (i3 != i2) {
                byte[] bArr = this.h;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.f2498k = i4;
                    return b2;
                }
                if (i3 - i4 >= 9) {
                    int i5 = i2 + 2;
                    int i6 = (bArr[i4] << 7) ^ b2;
                    if (i6 < 0) {
                        i = i6 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    } else {
                        int i7 = i2 + 3;
                        int i8 = (bArr[i5] << HMProSyncDataBaseProfile.DATA_TYPE_COACHING) ^ i6;
                        if (i8 >= 0) {
                            i = i8 ^ 16256;
                        } else {
                            int i9 = i2 + 4;
                            int i10 = i8 ^ (bArr[i7] << 21);
                            if (i10 < 0) {
                                i = (-2080896) ^ i10;
                            } else {
                                i7 = i2 + 5;
                                byte b3 = bArr[i9];
                                int i11 = (i10 ^ (b3 << 28)) ^ 266354560;
                                if (b3 < 0) {
                                    i9 = i2 + 6;
                                    if (bArr[i7] < 0) {
                                        i7 = i2 + 7;
                                        if (bArr[i9] < 0) {
                                            i9 = i2 + 8;
                                            if (bArr[i7] < 0) {
                                                i7 = i2 + 9;
                                                if (bArr[i9] < 0) {
                                                    int i12 = i2 + 10;
                                                    if (bArr[i7] >= 0) {
                                                        i5 = i12;
                                                        i = i11;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    i = i11;
                                }
                                i = i11;
                            }
                            i5 = i9;
                        }
                        i5 = i7;
                    }
                    this.f2498k = i5;
                    return i;
                }
            }
            return (int) S();
        }

        public long R() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.f2498k;
            int i2 = this.i;
            if (i2 != i) {
                byte[] bArr = this.h;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.f2498k = i3;
                    return b2;
                }
                if (i2 - i3 >= 9) {
                    int i4 = i + 2;
                    int i5 = (bArr[i3] << 7) ^ b2;
                    if (i5 < 0) {
                        j = i5 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    } else {
                        int i6 = i + 3;
                        int i7 = (bArr[i4] << HMProSyncDataBaseProfile.DATA_TYPE_COACHING) ^ i5;
                        if (i7 >= 0) {
                            j = i7 ^ 16256;
                            i4 = i6;
                        } else {
                            int i8 = i + 4;
                            int i9 = i7 ^ (bArr[i6] << 21);
                            if (i9 < 0) {
                                long j4 = (-2080896) ^ i9;
                                i4 = i8;
                                j = j4;
                            } else {
                                long j5 = i9;
                                i4 = i + 5;
                                long j6 = j5 ^ (((long) bArr[i8]) << 28);
                                if (j6 >= 0) {
                                    j3 = 266354560;
                                } else {
                                    int i10 = i + 6;
                                    long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                    if (j7 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        i4 = i + 7;
                                        j6 = j7 ^ (((long) bArr[i10]) << 42);
                                        if (j6 >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            i10 = i + 8;
                                            j7 = j6 ^ (((long) bArr[i4]) << 49);
                                            if (j7 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                i4 = i + 9;
                                                long j8 = (j7 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    int i11 = i + 10;
                                                    if (bArr[i4] >= 0) {
                                                        i4 = i11;
                                                    }
                                                }
                                                j = j8;
                                            }
                                        }
                                    }
                                    j = j7 ^ j2;
                                    i4 = i10;
                                }
                                j = j6 ^ j3;
                            }
                        }
                    }
                    this.f2498k = i4;
                    return j;
                }
            }
            return S();
        }

        public long S() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bK = K();
                j |= ((long) (bK & 127)) << i;
                if ((bK & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final void U(int i) throws IOException {
            if (c0(i)) {
                return;
            }
            if (i <= (this.c - this.m) - this.f2498k) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        public void W() throws IOException {
            int iD;
            do {
                iD = D();
                if (iD == 0) {
                    return;
                }
            } while (G(iD));
        }

        public void X(int i) throws IOException {
            int i2 = this.i;
            int i3 = this.f2498k;
            if (i > i2 - i3 || i < 0) {
                Y(i);
            } else {
                this.f2498k = i3 + i;
            }
        }

        public final void Y(int i) throws IOException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.m;
            int i3 = this.f2498k;
            int i4 = i2 + i3 + i;
            int i5 = this.n;
            if (i4 > i5) {
                X((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.m = i2 + i3;
            int i6 = this.i - i3;
            this.i = 0;
            this.f2498k = 0;
            while (i6 < i) {
                try {
                    long j = i - i6;
                    long jV = V(this.g, j);
                    if (jV < 0 || jV > j) {
                        throw new IllegalStateException(this.g.getClass() + "#skip returned invalid result: " + jV + "\nThe InputStream implementation is buggy.");
                    }
                    if (jV == 0) {
                        break;
                    } else {
                        i6 += (int) jV;
                    }
                } catch (Throwable th) {
                    this.m += i6;
                    T();
                    throw th;
                }
            }
            this.m += i6;
            T();
            if (i6 >= i) {
                return;
            }
            int i7 = this.i;
            int i8 = i7 - this.f2498k;
            this.f2498k = i7;
            U(1);
            while (true) {
                int i9 = i - i8;
                int i10 = this.i;
                if (i9 <= i10) {
                    this.f2498k = i9;
                    return;
                } else {
                    i8 += i10;
                    this.f2498k = i10;
                    U(1);
                }
            }
        }

        @Override // androidx.health.platform.client.proto.h
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.l != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public final boolean c0(int i) throws IOException {
            int i2 = this.f2498k;
            int i3 = i2 + i;
            int i4 = this.i;
            if (i3 <= i4) {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
            int i5 = this.c;
            int i6 = this.m;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.n) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.h;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.m += i2;
                this.i -= i2;
                this.f2498k = 0;
            }
            InputStream inputStream = this.g;
            byte[] bArr2 = this.h;
            int i7 = this.i;
            int I = I(inputStream, bArr2, i7, Math.min(bArr2.length - i7, (this.c - this.m) - i7));
            if (I == 0 || I < -1 || I > this.h.length) {
                throw new IllegalStateException(this.g.getClass() + "#read(byte[]) returned invalid result: " + I + "\nThe InputStream implementation is buggy.");
            }
            if (I <= 0) {
                return false;
            }
            this.i += I;
            T();
            if (this.i >= i) {
                return true;
            }
            return c0(i);
        }

        @Override // androidx.health.platform.client.proto.h
        public int d() {
            return this.m + this.f2498k;
        }

        @Override // androidx.health.platform.client.proto.h
        public boolean e() throws IOException {
            return this.f2498k == this.i && !c0(1);
        }

        @Override // androidx.health.platform.client.proto.h
        public void m(int i) {
            this.n = i;
            T();
        }

        @Override // androidx.health.platform.client.proto.h
        public int n(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = i + this.m + this.f2498k;
            int i3 = this.n;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.n = i2;
            T();
            return i3;
        }

        @Override // androidx.health.platform.client.proto.h
        public boolean o() throws IOException {
            return R() != 0;
        }

        @Override // androidx.health.platform.client.proto.h
        public ByteString p() throws IOException {
            int iQ = Q();
            int i = this.i;
            int i2 = this.f2498k;
            if (iQ > i - i2 || iQ <= 0) {
                return iQ == 0 ? ByteString.EMPTY : J(iQ);
            }
            ByteString byteStringCopyFrom = ByteString.copyFrom(this.h, i2, iQ);
            this.f2498k += iQ;
            return byteStringCopyFrom;
        }

        @Override // androidx.health.platform.client.proto.h
        public double q() throws IOException {
            return Double.longBitsToDouble(P());
        }

        @Override // androidx.health.platform.client.proto.h
        public int r() throws IOException {
            return Q();
        }

        @Override // androidx.health.platform.client.proto.h
        public int s() throws IOException {
            return O();
        }

        @Override // androidx.health.platform.client.proto.h
        public long t() throws IOException {
            return P();
        }

        @Override // androidx.health.platform.client.proto.h
        public float u() throws IOException {
            return Float.intBitsToFloat(O());
        }

        @Override // androidx.health.platform.client.proto.h
        public int v() throws IOException {
            return Q();
        }

        @Override // androidx.health.platform.client.proto.h
        public long w() throws IOException {
            return R();
        }

        @Override // androidx.health.platform.client.proto.h
        public int x() throws IOException {
            return O();
        }

        @Override // androidx.health.platform.client.proto.h
        public long y() throws IOException {
            return P();
        }

        @Override // androidx.health.platform.client.proto.h
        public int z() throws IOException {
            return h.b(Q());
        }

        public d(InputStream inputStream, int i) {
            super();
            this.n = Integer.MAX_VALUE;
            f0.b(inputStream, "input");
            this.g = inputStream;
            this.h = new byte[i];
            this.i = 0;
            this.f2498k = 0;
            this.m = 0;
        }
    }

    public static final class e extends h {
        public final ByteBuffer g;
        public final boolean h;
        public final long i;
        public long j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f2499k;
        public long l;
        public int m;
        public int n;
        public boolean o;
        public int p;

        public static boolean I() {
            return hbq.J();
        }

        private void P() {
            long j = this.j + ((long) this.m);
            this.j = j;
            int i = (int) (j - this.l);
            int i2 = this.p;
            if (i <= i2) {
                this.m = 0;
                return;
            }
            int i3 = i - i2;
            this.m = i3;
            this.j = j - ((long) i3);
        }

        private int Q() {
            return (int) (this.j - this.f2499k);
        }

        private void T() throws IOException {
            if (Q() >= 10) {
                U();
            } else {
                V();
            }
        }

        private void U() throws IOException {
            for (int i = 0; i < 10; i++) {
                long j = this.f2499k;
                this.f2499k = 1 + j;
                if (hbq.w(j) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void V() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (J() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.health.platform.client.proto.h
        public long A() throws IOException {
            return h.c(N());
        }

        @Override // androidx.health.platform.client.proto.h
        public String B() throws IOException {
            int iM = M();
            if (iM <= 0 || iM > Q()) {
                if (iM == 0) {
                    return "";
                }
                if (iM < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[iM];
            long j = iM;
            hbq.p(this.f2499k, bArr, 0L, j);
            String str = new String(bArr, f0.f2490b);
            this.f2499k += j;
            return str;
        }

        @Override // androidx.health.platform.client.proto.h
        public String C() throws IOException {
            int iM = M();
            if (iM > 0 && iM <= Q()) {
                String strG = e2.g(this.g, H(this.f2499k), iM);
                this.f2499k += (long) iM;
                return strG;
            }
            if (iM == 0) {
                return "";
            }
            if (iM <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.health.platform.client.proto.h
        public int D() throws IOException {
            if (e()) {
                this.n = 0;
                return 0;
            }
            int iM = M();
            this.n = iM;
            if (WireFormat.a(iM) != 0) {
                return this.n;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.health.platform.client.proto.h
        public int E() throws IOException {
            return M();
        }

        @Override // androidx.health.platform.client.proto.h
        public long F() throws IOException {
            return N();
        }

        @Override // androidx.health.platform.client.proto.h
        public boolean G(int i) throws IOException {
            int iB = WireFormat.b(i);
            if (iB == 0) {
                T();
                return true;
            }
            if (iB == 1) {
                S(8);
                return true;
            }
            if (iB == 2) {
                S(M());
                return true;
            }
            if (iB == 3) {
                R();
                a(WireFormat.c(WireFormat.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            S(4);
            return true;
        }

        public final int H(long j) {
            return (int) (j - this.i);
        }

        public byte J() throws IOException {
            long j = this.f2499k;
            if (j == this.j) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f2499k = 1 + j;
            return hbq.w(j);
        }

        public int K() throws IOException {
            long j = this.f2499k;
            if (this.j - j < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f2499k = 4 + j;
            return ((hbq.w(j + 3) & 255) << 24) | (hbq.w(j) & 255) | ((hbq.w(1 + j) & 255) << 8) | ((hbq.w(2 + j) & 255) << 16);
        }

        public long L() throws IOException {
            long j = this.f2499k;
            if (this.j - j < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.f2499k = 8 + j;
            return ((((long) hbq.w(j + 7)) & 255) << 56) | (((long) hbq.w(j)) & 255) | ((((long) hbq.w(1 + j)) & 255) << 8) | ((((long) hbq.w(2 + j)) & 255) << 16) | ((((long) hbq.w(3 + j)) & 255) << 24) | ((((long) hbq.w(4 + j)) & 255) << 32) | ((((long) hbq.w(5 + j)) & 255) << 40) | ((((long) hbq.w(6 + j)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (defpackage.hbq.w(r3) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int M() throws java.io.IOException {
            /*
                r9 = this;
                long r0 = r9.f2499k
                long r2 = r9.j
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = defpackage.hbq.w(r0)
                if (r4 < 0) goto L16
                r9.f2499k = r2
                return r4
            L16:
                long r5 = r9.j
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = defpackage.hbq.w(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = defpackage.hbq.w(r5)
                int r5 = r5 << 14
                r2 = r2 ^ r5
                if (r2 < 0) goto L41
                r0 = r2 ^ 16256(0x3f80, float:2.278E-41)
            L3f:
                r5 = r3
                goto L98
            L41:
                r5 = 4
                long r5 = r5 + r0
                byte r3 = defpackage.hbq.w(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = defpackage.hbq.w(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = defpackage.hbq.w(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = defpackage.hbq.w(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = defpackage.hbq.w(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = defpackage.hbq.w(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = defpackage.hbq.w(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.O()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.f2499k = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.health.platform.client.proto.h.e.M():int");
        }

        public long N() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.f2499k;
            if (this.j != j4) {
                long j5 = 1 + j4;
                byte bW = hbq.w(j4);
                if (bW >= 0) {
                    this.f2499k = j5;
                    return bW;
                }
                if (this.j - j5 >= 9) {
                    long j6 = 2 + j4;
                    int iW = (hbq.w(j5) << 7) ^ bW;
                    if (iW >= 0) {
                        long j7 = 3 + j4;
                        int iW2 = iW ^ (hbq.w(j6) << HMProSyncDataBaseProfile.DATA_TYPE_COACHING);
                        if (iW2 >= 0) {
                            j = iW2 ^ 16256;
                            j6 = j7;
                        } else {
                            j6 = 4 + j4;
                            int iW3 = iW2 ^ (hbq.w(j7) << 21);
                            if (iW3 < 0) {
                                i = (-2080896) ^ iW3;
                            } else {
                                long j8 = 5 + j4;
                                long jW = ((long) iW3) ^ (((long) hbq.w(j6)) << 28);
                                if (jW >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = 6 + j4;
                                    long jW2 = jW ^ (((long) hbq.w(j8)) << 35);
                                    if (jW2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j8 = 7 + j4;
                                        jW = jW2 ^ (((long) hbq.w(j9)) << 42);
                                        if (jW >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j4;
                                            jW2 = jW ^ (((long) hbq.w(j8)) << 49);
                                            if (jW2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j10 = j4 + 9;
                                                long jW3 = (jW2 ^ (((long) hbq.w(j9)) << 56)) ^ 71499008037633920L;
                                                if (jW3 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (hbq.w(j10) >= 0) {
                                                        j6 = j11;
                                                        j = jW3;
                                                    }
                                                } else {
                                                    j = jW3;
                                                    j6 = j10;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jW2;
                                    j6 = j9;
                                }
                                j = j3 ^ jW;
                                j6 = j8;
                            }
                        }
                        this.f2499k = j6;
                        return j;
                    }
                    i = iW ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    j = i;
                    this.f2499k = j6;
                    return j;
                }
            }
            return O();
        }

        public long O() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bJ = J();
                j |= ((long) (bJ & 127)) << i;
                if ((bJ & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public void R() throws IOException {
            int iD;
            do {
                iD = D();
                if (iD == 0) {
                    return;
                }
            } while (G(iD));
        }

        public void S(int i) throws IOException {
            if (i >= 0 && i <= Q()) {
                this.f2499k += (long) i;
            } else {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        public final ByteBuffer W(long j, long j2) throws IOException {
            int iPosition = this.g.position();
            int iLimit = this.g.limit();
            ByteBuffer byteBuffer = this.g;
            try {
                try {
                    byteBuffer.position(H(j));
                    byteBuffer.limit(H(j2));
                    ByteBuffer byteBufferSlice = this.g.slice();
                    byteBuffer.position(iPosition);
                    byteBuffer.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException e) {
                    InvalidProtocolBufferException invalidProtocolBufferExceptionTruncatedMessage = InvalidProtocolBufferException.truncatedMessage();
                    invalidProtocolBufferExceptionTruncatedMessage.initCause(e);
                    throw invalidProtocolBufferExceptionTruncatedMessage;
                }
            } catch (Throwable th) {
                byteBuffer.position(iPosition);
                byteBuffer.limit(iLimit);
                throw th;
            }
        }

        @Override // androidx.health.platform.client.proto.h
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.n != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.health.platform.client.proto.h
        public int d() {
            return (int) (this.f2499k - this.l);
        }

        @Override // androidx.health.platform.client.proto.h
        public boolean e() throws IOException {
            return this.f2499k == this.j;
        }

        @Override // androidx.health.platform.client.proto.h
        public void m(int i) {
            this.p = i;
            P();
        }

        @Override // androidx.health.platform.client.proto.h
        public int n(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iD = i + d();
            int i2 = this.p;
            if (iD > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.p = iD;
            P();
            return i2;
        }

        @Override // androidx.health.platform.client.proto.h
        public boolean o() throws IOException {
            return N() != 0;
        }

        @Override // androidx.health.platform.client.proto.h
        public ByteString p() throws IOException {
            int iM = M();
            if (iM <= 0 || iM > Q()) {
                if (iM == 0) {
                    return ByteString.EMPTY;
                }
                if (iM < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.h && this.o) {
                long j = this.f2499k;
                long j2 = iM;
                ByteBuffer byteBufferW = W(j, j + j2);
                this.f2499k += j2;
                return ByteString.wrap(byteBufferW);
            }
            byte[] bArr = new byte[iM];
            long j3 = iM;
            hbq.p(this.f2499k, bArr, 0L, j3);
            this.f2499k += j3;
            return ByteString.wrap(bArr);
        }

        @Override // androidx.health.platform.client.proto.h
        public double q() throws IOException {
            return Double.longBitsToDouble(L());
        }

        @Override // androidx.health.platform.client.proto.h
        public int r() throws IOException {
            return M();
        }

        @Override // androidx.health.platform.client.proto.h
        public int s() throws IOException {
            return K();
        }

        @Override // androidx.health.platform.client.proto.h
        public long t() throws IOException {
            return L();
        }

        @Override // androidx.health.platform.client.proto.h
        public float u() throws IOException {
            return Float.intBitsToFloat(K());
        }

        @Override // androidx.health.platform.client.proto.h
        public int v() throws IOException {
            return M();
        }

        @Override // androidx.health.platform.client.proto.h
        public long w() throws IOException {
            return N();
        }

        @Override // androidx.health.platform.client.proto.h
        public int x() throws IOException {
            return K();
        }

        @Override // androidx.health.platform.client.proto.h
        public long y() throws IOException {
            return L();
        }

        @Override // androidx.health.platform.client.proto.h
        public int z() throws IOException {
            return h.b(M());
        }

        public e(ByteBuffer byteBuffer, boolean z) {
            super();
            this.p = Integer.MAX_VALUE;
            this.g = byteBuffer;
            long jK = hbq.k(byteBuffer);
            this.i = jK;
            this.j = ((long) byteBuffer.limit()) + jK;
            long jPosition = jK + ((long) byteBuffer.position());
            this.f2499k = jPosition;
            this.l = jPosition;
            this.h = z;
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static h f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static h g(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? j(f0.d) : new d(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static h h(Iterable<ByteBuffer> iterable, boolean z) {
        int i = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : iterable) {
            iRemaining += byteBuffer.remaining();
            i = byteBuffer.hasArray() ? i | 1 : byteBuffer.isDirect() ? i | 2 : i | 4;
        }
        return i == 2 ? new c(iterable, iRemaining, z) : f(new bpd(iterable));
    }

    public static h i(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return l(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && e.I()) {
            return new e(byteBuffer, z);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return l(bArr, 0, iRemaining, true);
    }

    public static h j(byte[] bArr) {
        return k(bArr, 0, bArr.length);
    }

    public static h k(byte[] bArr, int i, int i2) {
        return l(bArr, i, i2, false);
    }

    public static h l(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.n(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public abstract long A() throws IOException;

    public abstract String B() throws IOException;

    public abstract String C() throws IOException;

    public abstract int D() throws IOException;

    public abstract int E() throws IOException;

    public abstract long F() throws IOException;

    public abstract boolean G(int i) throws IOException;

    public abstract void a(int i) throws InvalidProtocolBufferException;

    public abstract int d();

    public abstract boolean e() throws IOException;

    public abstract void m(int i);

    public abstract int n(int i) throws InvalidProtocolBufferException;

    public abstract boolean o() throws IOException;

    public abstract ByteString p() throws IOException;

    public abstract double q() throws IOException;

    public abstract int r() throws IOException;

    public abstract int s() throws IOException;

    public abstract long t() throws IOException;

    public abstract float u() throws IOException;

    public abstract int v() throws IOException;

    public abstract long w() throws IOException;

    public abstract int x() throws IOException;

    public abstract long y() throws IOException;

    public abstract int z() throws IOException;

    public h() {
        this.f2494b = f;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
}
