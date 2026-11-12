package androidx.datastore.preferences.protobuf;

import androidx.work.WorkInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.kbq;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2200a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2201b;
    public int c;
    public h d;
    public boolean e;

    public static final class b extends g {
        public final byte[] f;
        public final boolean g;
        public int h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2202k;
        public int l;
        public boolean m;
        public int n;

        @Override // androidx.datastore.preferences.protobuf.g
        public String A() throws IOException {
            int iK = K();
            if (iK > 0) {
                int i = this.h;
                int i2 = this.j;
                if (iK <= i - i2) {
                    String str = new String(this.f, i2, iK, s.f2252a);
                    this.j += iK;
                    return str;
                }
            }
            if (iK == 0) {
                return "";
            }
            if (iK < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public String B() throws IOException {
            int iK = K();
            if (iK > 0) {
                int i = this.h;
                int i2 = this.j;
                if (iK <= i - i2) {
                    String strH = q0.h(this.f, i2, iK);
                    this.j += iK;
                    return strH;
                }
            }
            if (iK == 0) {
                return "";
            }
            if (iK <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int C() throws IOException {
            if (e()) {
                this.l = 0;
                return 0;
            }
            int iK = K();
            this.l = iK;
            if (WireFormat.a(iK) != 0) {
                return this.l;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int D() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long E() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public boolean F(int i) throws IOException {
            int iB = WireFormat.b(i);
            if (iB == 0) {
                Q();
                return true;
            }
            if (iB == 1) {
                P(8);
                return true;
            }
            if (iB == 2) {
                P(K());
                return true;
            }
            if (iB == 3) {
                O();
                a(WireFormat.c(WireFormat.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            P(4);
            return true;
        }

        public byte G() throws IOException {
            int i = this.j;
            if (i == this.h) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f;
            this.j = i + 1;
            return bArr[i];
        }

        public byte[] H(int i) throws IOException {
            if (i > 0) {
                int i2 = this.h;
                int i3 = this.j;
                if (i <= i2 - i3) {
                    int i4 = i + i3;
                    this.j = i4;
                    return Arrays.copyOfRange(this.f, i3, i4);
                }
            }
            if (i > 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (i == 0) {
                return s.c;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public int I() throws IOException {
            int i = this.j;
            if (this.h - i < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f;
            this.j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long J() throws IOException {
            int i = this.j;
            if (this.h - i < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f;
            this.j = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public int K() throws IOException {
            int i;
            int i2 = this.j;
            int i3 = this.h;
            if (i3 != i2) {
                byte[] bArr = this.f;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.j = i4;
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
                    this.j = i5;
                    return i;
                }
            }
            return (int) M();
        }

        public long L() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.j;
            int i2 = this.h;
            if (i2 != i) {
                byte[] bArr = this.f;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.j = i3;
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
                    this.j = i4;
                    return j;
                }
            }
            return M();
        }

        public long M() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bG = G();
                j |= ((long) (bG & 127)) << i;
                if ((bG & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final void N() {
            int i = this.h + this.i;
            this.h = i;
            int i2 = i - this.f2202k;
            int i3 = this.n;
            if (i2 <= i3) {
                this.i = 0;
                return;
            }
            int i4 = i2 - i3;
            this.i = i4;
            this.h = i - i4;
        }

        public void O() throws IOException {
            int iC;
            do {
                iC = C();
                if (iC == 0) {
                    return;
                }
            } while (F(iC));
        }

        public void P(int i) throws IOException {
            if (i >= 0) {
                int i2 = this.h;
                int i3 = this.j;
                if (i <= i2 - i3) {
                    this.j = i3 + i;
                    return;
                }
            }
            if (i >= 0) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public final void Q() throws IOException {
            if (this.h - this.j >= 10) {
                R();
            } else {
                S();
            }
        }

        public final void R() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f;
                int i2 = this.j;
                this.j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final void S() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (G() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.l != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int d() {
            return this.j - this.f2202k;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public boolean e() throws IOException {
            return this.j == this.h;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public void l(int i) {
            this.n = i;
            N();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int m(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iD = i + d();
            int i2 = this.n;
            if (iD > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.n = iD;
            N();
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public boolean n() throws IOException {
            return L() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public ByteString o() throws IOException {
            int iK = K();
            if (iK > 0) {
                int i = this.h;
                int i2 = this.j;
                if (iK <= i - i2) {
                    ByteString byteStringWrap = (this.g && this.m) ? ByteString.wrap(this.f, i2, iK) : ByteString.copyFrom(this.f, i2, iK);
                    this.j += iK;
                    return byteStringWrap;
                }
            }
            return iK == 0 ? ByteString.EMPTY : ByteString.wrap(H(iK));
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public double p() throws IOException {
            return Double.longBitsToDouble(J());
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int q() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int r() throws IOException {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long s() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public float t() throws IOException {
            return Float.intBitsToFloat(I());
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int u() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long v() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int w() throws IOException {
            return I();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long x() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int y() throws IOException {
            return g.b(K());
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long z() throws IOException {
            return g.c(L());
        }

        public b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.n = Integer.MAX_VALUE;
            this.f = bArr;
            this.h = i2 + i;
            this.j = i;
            this.f2202k = i;
            this.g = z;
        }
    }

    public static final class c extends g {
        public final InputStream f;
        public final byte[] g;
        public int h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f2203k;
        public int l;
        public int m;

        private void Q() {
            int i = this.h + this.i;
            this.h = i;
            int i2 = this.l + i;
            int i3 = this.m;
            if (i2 <= i3) {
                this.i = 0;
                return;
            }
            int i4 = i2 - i3;
            this.i = i4;
            this.h = i - i4;
        }

        private void V() throws IOException {
            if (this.h - this.j >= 10) {
                W();
            } else {
                X();
            }
        }

        private void W() throws IOException {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.g;
                int i2 = this.j;
                this.j = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void X() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (H() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public String A() throws IOException {
            int iN = N();
            if (iN > 0) {
                int i = this.h;
                int i2 = this.j;
                if (iN <= i - i2) {
                    String str = new String(this.g, i2, iN, s.f2252a);
                    this.j += iN;
                    return str;
                }
            }
            if (iN == 0) {
                return "";
            }
            if (iN > this.h) {
                return new String(I(iN, false), s.f2252a);
            }
            R(iN);
            String str2 = new String(this.g, this.j, iN, s.f2252a);
            this.j += iN;
            return str2;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public String B() throws IOException {
            byte[] bArrI;
            int iN = N();
            int i = this.j;
            int i2 = this.h;
            if (iN <= i2 - i && iN > 0) {
                bArrI = this.g;
                this.j = i + iN;
            } else {
                if (iN == 0) {
                    return "";
                }
                i = 0;
                if (iN <= i2) {
                    R(iN);
                    bArrI = this.g;
                    this.j = iN;
                } else {
                    bArrI = I(iN, false);
                }
            }
            return q0.h(bArrI, i, iN);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int C() throws IOException {
            if (e()) {
                this.f2203k = 0;
                return 0;
            }
            int iN = N();
            this.f2203k = iN;
            if (WireFormat.a(iN) != 0) {
                return this.f2203k;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int D() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long E() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public boolean F(int i) throws IOException {
            int iB = WireFormat.b(i);
            if (iB == 0) {
                V();
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

        public final ByteString G(int i) throws IOException {
            byte[] bArrJ = J(i);
            if (bArrJ != null) {
                return ByteString.copyFrom(bArrJ);
            }
            int i2 = this.j;
            int i3 = this.h;
            int length = i3 - i2;
            this.l += i3;
            this.j = 0;
            this.h = 0;
            List<byte[]> listK = K(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.g, i2, bArr, 0, length);
            for (byte[] bArr2 : listK) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        public byte H() throws IOException {
            if (this.j == this.h) {
                R(1);
            }
            byte[] bArr = this.g;
            int i = this.j;
            this.j = i + 1;
            return bArr[i];
        }

        public final byte[] I(int i, boolean z) throws IOException {
            byte[] bArrJ = J(i);
            if (bArrJ != null) {
                return z ? (byte[]) bArrJ.clone() : bArrJ;
            }
            int i2 = this.j;
            int i3 = this.h;
            int length = i3 - i2;
            this.l += i3;
            this.j = 0;
            this.h = 0;
            List<byte[]> listK = K(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.g, i2, bArr, 0, length);
            for (byte[] bArr2 : listK) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] J(int i) throws IOException {
            if (i == 0) {
                return s.c;
            }
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.l;
            int i3 = this.j;
            int i4 = i2 + i3 + i;
            if (i4 - this.c > 0) {
                throw InvalidProtocolBufferException.sizeLimitExceeded();
            }
            int i5 = this.m;
            if (i4 > i5) {
                T((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            int i6 = this.h - i3;
            int i7 = i - i6;
            if (i7 >= 4096 && i7 > this.f.available()) {
                return null;
            }
            byte[] bArr = new byte[i];
            System.arraycopy(this.g, this.j, bArr, 0, i6);
            this.l += this.h;
            this.j = 0;
            this.h = 0;
            while (i6 < i) {
                int i8 = this.f.read(bArr, i6, i - i6);
                if (i8 == -1) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                this.l += i8;
                i6 += i8;
            }
            return bArr;
        }

        public final List<byte[]> K(int i) throws IOException {
            ArrayList arrayList = new ArrayList();
            while (i > 0) {
                int iMin = Math.min(i, 4096);
                byte[] bArr = new byte[iMin];
                int i2 = 0;
                while (i2 < iMin) {
                    int i3 = this.f.read(bArr, i2, iMin - i2);
                    if (i3 == -1) {
                        throw InvalidProtocolBufferException.truncatedMessage();
                    }
                    this.l += i3;
                    i2 += i3;
                }
                i -= iMin;
                arrayList.add(bArr);
            }
            return arrayList;
        }

        public int L() throws IOException {
            int i = this.j;
            if (this.h - i < 4) {
                R(4);
                i = this.j;
            }
            byte[] bArr = this.g;
            this.j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long M() throws IOException {
            int i = this.j;
            if (this.h - i < 8) {
                R(8);
                i = this.j;
            }
            byte[] bArr = this.g;
            this.j = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public int N() throws IOException {
            int i;
            int i2 = this.j;
            int i3 = this.h;
            if (i3 != i2) {
                byte[] bArr = this.g;
                int i4 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.j = i4;
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
                    this.j = i5;
                    return i;
                }
            }
            return (int) P();
        }

        public long O() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.j;
            int i2 = this.h;
            if (i2 != i) {
                byte[] bArr = this.g;
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 >= 0) {
                    this.j = i3;
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
                    this.j = i4;
                    return j;
                }
            }
            return P();
        }

        public long P() throws IOException {
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

        public final void R(int i) throws IOException {
            if (Y(i)) {
                return;
            }
            if (i <= (this.c - this.l) - this.j) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        public void S() throws IOException {
            int iC;
            do {
                iC = C();
                if (iC == 0) {
                    return;
                }
            } while (F(iC));
        }

        public void T(int i) throws IOException {
            int i2 = this.h;
            int i3 = this.j;
            if (i > i2 - i3 || i < 0) {
                U(i);
            } else {
                this.j = i3 + i;
            }
        }

        public final void U(int i) throws IOException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.l;
            int i3 = this.j;
            int i4 = i2 + i3 + i;
            int i5 = this.m;
            if (i4 > i5) {
                T((i5 - i2) - i3);
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.l = i2 + i3;
            int i6 = this.h - i3;
            this.h = 0;
            this.j = 0;
            while (i6 < i) {
                try {
                    long j = i - i6;
                    long jSkip = this.f.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(this.f.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i6 += (int) jSkip;
                    }
                } catch (Throwable th) {
                    this.l += i6;
                    Q();
                    throw th;
                }
            }
            this.l += i6;
            Q();
            if (i6 >= i) {
                return;
            }
            int i7 = this.h;
            int i8 = i7 - this.j;
            this.j = i7;
            R(1);
            while (true) {
                int i9 = i - i8;
                int i10 = this.h;
                if (i9 <= i10) {
                    this.j = i9;
                    return;
                } else {
                    i8 += i10;
                    this.j = i10;
                    R(1);
                }
            }
        }

        public final boolean Y(int i) throws IOException {
            int i2 = this.j;
            int i3 = i2 + i;
            int i4 = this.h;
            if (i3 <= i4) {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            }
            int i5 = this.c;
            int i6 = this.l;
            if (i > (i5 - i6) - i2 || i6 + i2 + i > this.m) {
                return false;
            }
            if (i2 > 0) {
                if (i4 > i2) {
                    byte[] bArr = this.g;
                    System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
                }
                this.l += i2;
                this.h -= i2;
                this.j = 0;
            }
            InputStream inputStream = this.f;
            byte[] bArr2 = this.g;
            int i7 = this.h;
            int i8 = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.c - this.l) - i7));
            if (i8 == 0 || i8 < -1 || i8 > this.g.length) {
                throw new IllegalStateException(this.f.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
            }
            if (i8 <= 0) {
                return false;
            }
            this.h += i8;
            Q();
            if (this.h >= i) {
                return true;
            }
            return Y(i);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.f2203k != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int d() {
            return this.l + this.j;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public boolean e() throws IOException {
            return this.j == this.h && !Y(1);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public void l(int i) {
            this.m = i;
            Q();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int m(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = i + this.l + this.j;
            int i3 = this.m;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.m = i2;
            Q();
            return i3;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public boolean n() throws IOException {
            return O() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public ByteString o() throws IOException {
            int iN = N();
            int i = this.h;
            int i2 = this.j;
            if (iN > i - i2 || iN <= 0) {
                return iN == 0 ? ByteString.EMPTY : G(iN);
            }
            ByteString byteStringCopyFrom = ByteString.copyFrom(this.g, i2, iN);
            this.j += iN;
            return byteStringCopyFrom;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public double p() throws IOException {
            return Double.longBitsToDouble(M());
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int q() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int r() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long s() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public float t() throws IOException {
            return Float.intBitsToFloat(L());
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int u() throws IOException {
            return N();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long v() throws IOException {
            return O();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int w() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long x() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int y() throws IOException {
            return g.b(N());
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long z() throws IOException {
            return g.c(O());
        }

        public c(InputStream inputStream, int i) {
            super();
            this.m = Integer.MAX_VALUE;
            s.b(inputStream, "input");
            this.f = inputStream;
            this.g = new byte[i];
            this.h = 0;
            this.j = 0;
            this.l = 0;
        }
    }

    public static final class d extends g {
        public final ByteBuffer f;
        public final boolean g;
        public final long h;
        public long i;
        public long j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f2204k;
        public int l;
        public int m;
        public boolean n;
        public int o;

        public static boolean H() {
            return kbq.H();
        }

        private void O() {
            long j = this.i + ((long) this.l);
            this.i = j;
            int i = (int) (j - this.f2204k);
            int i2 = this.o;
            if (i <= i2) {
                this.l = 0;
                return;
            }
            int i3 = i - i2;
            this.l = i3;
            this.i = j - ((long) i3);
        }

        private void S() throws IOException {
            if (P() >= 10) {
                T();
            } else {
                U();
            }
        }

        private void T() throws IOException {
            for (int i = 0; i < 10; i++) {
                long j = this.j;
                this.j = 1 + j;
                if (kbq.u(j) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void U() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (I() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public String A() throws IOException {
            int iL = L();
            if (iL <= 0 || iL > P()) {
                if (iL == 0) {
                    return "";
                }
                if (iL < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[iL];
            long j = iL;
            kbq.n(this.j, bArr, 0L, j);
            String str = new String(bArr, s.f2252a);
            this.j += j;
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public String B() throws IOException {
            int iL = L();
            if (iL > 0 && iL <= P()) {
                String strG = q0.g(this.f, G(this.j), iL);
                this.j += (long) iL;
                return strG;
            }
            if (iL == 0) {
                return "";
            }
            if (iL <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int C() throws IOException {
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

        @Override // androidx.datastore.preferences.protobuf.g
        public int D() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long E() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public boolean F(int i) throws IOException {
            int iB = WireFormat.b(i);
            if (iB == 0) {
                S();
                return true;
            }
            if (iB == 1) {
                R(8);
                return true;
            }
            if (iB == 2) {
                R(L());
                return true;
            }
            if (iB == 3) {
                Q();
                a(WireFormat.c(WireFormat.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            R(4);
            return true;
        }

        public final int G(long j) {
            return (int) (j - this.h);
        }

        public byte I() throws IOException {
            long j = this.j;
            if (j == this.i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.j = 1 + j;
            return kbq.u(j);
        }

        public int J() throws IOException {
            long j = this.j;
            if (this.i - j < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.j = 4 + j;
            return ((kbq.u(j + 3) & 255) << 24) | (kbq.u(j) & 255) | ((kbq.u(1 + j) & 255) << 8) | ((kbq.u(2 + j) & 255) << 16);
        }

        public long K() throws IOException {
            long j = this.j;
            if (this.i - j < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.j = 8 + j;
            return ((((long) kbq.u(j + 7)) & 255) << 56) | (((long) kbq.u(j)) & 255) | ((((long) kbq.u(1 + j)) & 255) << 8) | ((((long) kbq.u(2 + j)) & 255) << 16) | ((((long) kbq.u(3 + j)) & 255) << 24) | ((((long) kbq.u(4 + j)) & 255) << 32) | ((((long) kbq.u(5 + j)) & 255) << 40) | ((((long) kbq.u(6 + j)) & 255) << 48);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (defpackage.kbq.u(r3) < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int L() throws java.io.IOException {
            /*
                r9 = this;
                long r0 = r9.j
                long r2 = r9.i
                int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
                if (r2 != 0) goto La
                goto L8e
            La:
                r2 = 1
                long r2 = r2 + r0
                byte r4 = defpackage.kbq.u(r0)
                if (r4 < 0) goto L16
                r9.j = r2
                return r4
            L16:
                long r5 = r9.i
                long r5 = r5 - r2
                r7 = 9
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 >= 0) goto L21
                goto L8e
            L21:
                r5 = 2
                long r5 = r5 + r0
                byte r2 = defpackage.kbq.u(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = defpackage.kbq.u(r5)
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
                byte r3 = defpackage.kbq.u(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = defpackage.kbq.u(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = defpackage.kbq.u(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = defpackage.kbq.u(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = defpackage.kbq.u(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = defpackage.kbq.u(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = defpackage.kbq.u(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.N()
                int r0 = (int) r0
                return r0
            L94:
                r0 = r2
                goto L98
            L96:
                r0 = r2
                goto L3f
            L98:
                r9.j = r5
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.g.d.L():int");
        }

        public long M() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.j;
            if (this.i != j4) {
                long j5 = 1 + j4;
                byte bU = kbq.u(j4);
                if (bU >= 0) {
                    this.j = j5;
                    return bU;
                }
                if (this.i - j5 >= 9) {
                    long j6 = 2 + j4;
                    int iU = (kbq.u(j5) << 7) ^ bU;
                    if (iU >= 0) {
                        long j7 = 3 + j4;
                        int iU2 = iU ^ (kbq.u(j6) << HMProSyncDataBaseProfile.DATA_TYPE_COACHING);
                        if (iU2 >= 0) {
                            j = iU2 ^ 16256;
                            j6 = j7;
                        } else {
                            j6 = 4 + j4;
                            int iU3 = iU2 ^ (kbq.u(j7) << 21);
                            if (iU3 < 0) {
                                i = (-2080896) ^ iU3;
                            } else {
                                long j8 = 5 + j4;
                                long jU = ((long) iU3) ^ (((long) kbq.u(j6)) << 28);
                                if (jU >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = 6 + j4;
                                    long jU2 = jU ^ (((long) kbq.u(j8)) << 35);
                                    if (jU2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j8 = 7 + j4;
                                        jU = jU2 ^ (((long) kbq.u(j9)) << 42);
                                        if (jU >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j4;
                                            jU2 = jU ^ (((long) kbq.u(j8)) << 49);
                                            if (jU2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j10 = j4 + 9;
                                                long jU3 = (jU2 ^ (((long) kbq.u(j9)) << 56)) ^ 71499008037633920L;
                                                if (jU3 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (kbq.u(j10) >= 0) {
                                                        j6 = j11;
                                                        j = jU3;
                                                    }
                                                } else {
                                                    j = jU3;
                                                    j6 = j10;
                                                }
                                            }
                                        }
                                    }
                                    j = j2 ^ jU2;
                                    j6 = j9;
                                }
                                j = j3 ^ jU;
                                j6 = j8;
                            }
                        }
                        this.j = j6;
                        return j;
                    }
                    i = iU ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    j = i;
                    this.j = j6;
                    return j;
                }
            }
            return N();
        }

        public long N() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bI = I();
                j |= ((long) (bI & 127)) << i;
                if ((bI & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final int P() {
            return (int) (this.i - this.j);
        }

        public void Q() throws IOException {
            int iC;
            do {
                iC = C();
                if (iC == 0) {
                    return;
                }
            } while (F(iC));
        }

        public void R(int i) throws IOException {
            if (i >= 0 && i <= P()) {
                this.j += (long) i;
            } else {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        public final ByteBuffer V(long j, long j2) throws IOException {
            int iPosition = this.f.position();
            int iLimit = this.f.limit();
            try {
                try {
                    this.f.position(G(j));
                    this.f.limit(G(j2));
                    ByteBuffer byteBufferSlice = this.f.slice();
                    this.f.position(iPosition);
                    this.f.limit(iLimit);
                    return byteBufferSlice;
                } catch (IllegalArgumentException unused) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
            } catch (Throwable th) {
                this.f.position(iPosition);
                this.f.limit(iLimit);
                throw th;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.m != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int d() {
            return (int) (this.j - this.f2204k);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public boolean e() throws IOException {
            return this.j == this.i;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public void l(int i) {
            this.o = i;
            O();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int m(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iD = i + d();
            int i2 = this.o;
            if (iD > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.o = iD;
            O();
            return i2;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public boolean n() throws IOException {
            return M() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public ByteString o() throws IOException {
            int iL = L();
            if (iL <= 0 || iL > P()) {
                if (iL == 0) {
                    return ByteString.EMPTY;
                }
                if (iL < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.g && this.n) {
                long j = this.j;
                long j2 = iL;
                ByteBuffer byteBufferV = V(j, j + j2);
                this.j += j2;
                return ByteString.wrap(byteBufferV);
            }
            byte[] bArr = new byte[iL];
            long j3 = iL;
            kbq.n(this.j, bArr, 0L, j3);
            this.j += j3;
            return ByteString.wrap(bArr);
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public double p() throws IOException {
            return Double.longBitsToDouble(K());
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int q() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int r() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long s() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public float t() throws IOException {
            return Float.intBitsToFloat(J());
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int u() throws IOException {
            return L();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long v() throws IOException {
            return M();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int w() throws IOException {
            return J();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long x() throws IOException {
            return K();
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public int y() throws IOException {
            return g.b(L());
        }

        @Override // androidx.datastore.preferences.protobuf.g
        public long z() throws IOException {
            return g.c(M());
        }

        public d(ByteBuffer byteBuffer, boolean z) {
            super();
            this.o = Integer.MAX_VALUE;
            this.f = byteBuffer;
            long jI = kbq.i(byteBuffer);
            this.h = jI;
            this.i = ((long) byteBuffer.limit()) + jI;
            long jPosition = jI + ((long) byteBuffer.position());
            this.j = jPosition;
            this.f2204k = jPosition;
            this.g = z;
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static g f(InputStream inputStream) {
        return g(inputStream, 4096);
    }

    public static g g(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? i(s.c) : new c(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static g h(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return k(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && d.H()) {
            return new d(byteBuffer, z);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return k(bArr, 0, iRemaining, true);
    }

    public static g i(byte[] bArr) {
        return j(bArr, 0, bArr.length);
    }

    public static g j(byte[] bArr, int i, int i2) {
        return k(bArr, i, i2, false);
    }

    public static g k(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.m(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract String A() throws IOException;

    public abstract String B() throws IOException;

    public abstract int C() throws IOException;

    public abstract int D() throws IOException;

    public abstract long E() throws IOException;

    public abstract boolean F(int i) throws IOException;

    public abstract void a(int i) throws InvalidProtocolBufferException;

    public abstract int d();

    public abstract boolean e() throws IOException;

    public abstract void l(int i);

    public abstract int m(int i) throws InvalidProtocolBufferException;

    public abstract boolean n() throws IOException;

    public abstract ByteString o() throws IOException;

    public abstract double p() throws IOException;

    public abstract int q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract float t() throws IOException;

    public abstract int u() throws IOException;

    public abstract long v() throws IOException;

    public abstract int w() throws IOException;

    public abstract long x() throws IOException;

    public abstract int y() throws IOException;

    public abstract long z() throws IOException;

    public g() {
        this.f2201b = 100;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
}
