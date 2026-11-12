package com.google.protobuf;

import androidx.work.WorkInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.jbq;
import defpackage.vkh;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9667b;
    public int c;
    public k d;
    public boolean e;

    public static final class b extends j {
        public final byte[] f;
        public final boolean g;
        public int h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f9668k;
        public int l;
        public boolean m;
        public int n;

        @Override // com.google.protobuf.j
        public void A(q0.a aVar, t tVar) throws IOException {
            int iB = B();
            if (this.f9666a >= this.f9667b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iO = o(iB);
            this.f9666a++;
            aVar.mergeFrom(this, tVar);
            a(0);
            this.f9666a--;
            n(iO);
        }

        @Override // com.google.protobuf.j
        public int B() throws IOException {
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
            return (int) T();
        }

        @Override // com.google.protobuf.j
        public int D() throws IOException {
            return Q();
        }

        @Override // com.google.protobuf.j
        public long E() throws IOException {
            return R();
        }

        @Override // com.google.protobuf.j
        public int F() throws IOException {
            return j.b(B());
        }

        @Override // com.google.protobuf.j
        public long G() throws IOException {
            return j.c(S());
        }

        @Override // com.google.protobuf.j
        public String H() throws IOException {
            int iB = B();
            if (iB > 0) {
                int i = this.h;
                int i2 = this.j;
                if (iB <= i - i2) {
                    String str = new String(this.f, i2, iB, d0.f9618a);
                    this.j += iB;
                    return str;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.j
        public String I() throws IOException {
            int iB = B();
            if (iB > 0) {
                int i = this.h;
                int i2 = this.j;
                if (iB <= i - i2) {
                    String strH = v1.h(this.f, i2, iB);
                    this.j += iB;
                    return strH;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.j
        public int J() throws IOException {
            if (f()) {
                this.l = 0;
                return 0;
            }
            int iB = B();
            this.l = iB;
            if (WireFormat.a(iB) != 0) {
                return this.l;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.j
        public int K() throws IOException {
            return B();
        }

        @Override // com.google.protobuf.j
        public long L() throws IOException {
            return S();
        }

        @Override // com.google.protobuf.j
        public boolean N(int i) throws IOException {
            int iB = WireFormat.b(i);
            if (iB == 0) {
                X();
                return true;
            }
            if (iB == 1) {
                W(8);
                return true;
            }
            if (iB == 2) {
                W(B());
                return true;
            }
            if (iB == 3) {
                V();
                a(WireFormat.c(WireFormat.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            W(4);
            return true;
        }

        public byte O() throws IOException {
            int i = this.j;
            if (i == this.h) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f;
            this.j = i + 1;
            return bArr[i];
        }

        public byte[] P(int i) throws IOException {
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
                return d0.c;
            }
            throw InvalidProtocolBufferException.negativeSize();
        }

        public int Q() throws IOException {
            int i = this.j;
            if (this.h - i < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f;
            this.j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long R() throws IOException {
            int i = this.j;
            if (this.h - i < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f;
            this.j = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public long S() throws IOException {
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
            return T();
        }

        public long T() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bO = O();
                j |= ((long) (bO & 127)) << i;
                if ((bO & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final void U() {
            int i = this.h + this.i;
            this.h = i;
            int i2 = i - this.f9668k;
            int i3 = this.n;
            if (i2 <= i3) {
                this.i = 0;
                return;
            }
            int i4 = i2 - i3;
            this.i = i4;
            this.h = i - i4;
        }

        public void V() throws IOException {
            int iJ;
            do {
                iJ = J();
                if (iJ == 0) {
                    return;
                }
            } while (N(iJ));
        }

        public void W(int i) throws IOException {
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

        public final void X() throws IOException {
            if (this.h - this.j >= 10) {
                Y();
            } else {
                Z();
            }
        }

        public final void Y() throws IOException {
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

        public final void Z() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (O() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.j
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.l != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        @Override // com.google.protobuf.j
        public int d() {
            int i = this.n;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - e();
        }

        @Override // com.google.protobuf.j
        public int e() {
            return this.j - this.f9668k;
        }

        @Override // com.google.protobuf.j
        public boolean f() throws IOException {
            return this.j == this.h;
        }

        @Override // com.google.protobuf.j
        public void n(int i) {
            this.n = i;
            U();
        }

        @Override // com.google.protobuf.j
        public int o(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iE = i + e();
            int i2 = this.n;
            if (iE > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.n = iE;
            U();
            return i2;
        }

        @Override // com.google.protobuf.j
        public boolean p() throws IOException {
            return S() != 0;
        }

        @Override // com.google.protobuf.j
        public ByteString q() throws IOException {
            int iB = B();
            if (iB > 0) {
                int i = this.h;
                int i2 = this.j;
                if (iB <= i - i2) {
                    ByteString byteStringWrap = (this.g && this.m) ? ByteString.wrap(this.f, i2, iB) : ByteString.copyFrom(this.f, i2, iB);
                    this.j += iB;
                    return byteStringWrap;
                }
            }
            return iB == 0 ? ByteString.EMPTY : ByteString.wrap(P(iB));
        }

        @Override // com.google.protobuf.j
        public double r() throws IOException {
            return Double.longBitsToDouble(R());
        }

        @Override // com.google.protobuf.j
        public int s() throws IOException {
            return B();
        }

        @Override // com.google.protobuf.j
        public int t() throws IOException {
            return Q();
        }

        @Override // com.google.protobuf.j
        public long u() throws IOException {
            return R();
        }

        @Override // com.google.protobuf.j
        public float v() throws IOException {
            return Float.intBitsToFloat(Q());
        }

        @Override // com.google.protobuf.j
        public void w(int i, q0.a aVar, t tVar) throws IOException {
            int i2 = this.f9666a;
            if (i2 >= this.f9667b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f9666a = i2 + 1;
            aVar.mergeFrom(this, tVar);
            a(WireFormat.c(i, 4));
            this.f9666a--;
        }

        @Override // com.google.protobuf.j
        public int x() throws IOException {
            return B();
        }

        @Override // com.google.protobuf.j
        public long y() throws IOException {
            return S();
        }

        @Override // com.google.protobuf.j
        public <T extends q0> T z(vkh<T> vkhVar, t tVar) throws IOException {
            int iB = B();
            if (this.f9666a >= this.f9667b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iO = o(iB);
            this.f9666a++;
            T partialFrom = vkhVar.parsePartialFrom(this, tVar);
            a(0);
            this.f9666a--;
            n(iO);
            return partialFrom;
        }

        public b(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.n = Integer.MAX_VALUE;
            this.f = bArr;
            this.h = i2 + i;
            this.j = i;
            this.f9668k = i;
            this.g = z;
        }
    }

    public static final class c extends j {
        public final InputStream f;
        public final byte[] g;
        public int h;
        public int i;
        public int j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f9669k;
        public int l;
        public int m;

        private void X() {
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

        private void c0() throws IOException {
            if (this.h - this.j >= 10) {
                d0();
            } else {
                e0();
            }
        }

        private void d0() throws IOException {
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

        private void e0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (P() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.j
        public void A(q0.a aVar, t tVar) throws IOException {
            int iB = B();
            if (this.f9666a >= this.f9667b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iO = o(iB);
            this.f9666a++;
            aVar.mergeFrom(this, tVar);
            a(0);
            this.f9666a--;
            n(iO);
        }

        @Override // com.google.protobuf.j
        public int B() throws IOException {
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
            return (int) W();
        }

        @Override // com.google.protobuf.j
        public int D() throws IOException {
            return T();
        }

        @Override // com.google.protobuf.j
        public long E() throws IOException {
            return U();
        }

        @Override // com.google.protobuf.j
        public int F() throws IOException {
            return j.b(B());
        }

        @Override // com.google.protobuf.j
        public long G() throws IOException {
            return j.c(V());
        }

        @Override // com.google.protobuf.j
        public String H() throws IOException {
            int iB = B();
            if (iB > 0) {
                int i = this.h;
                int i2 = this.j;
                if (iB <= i - i2) {
                    String str = new String(this.g, i2, iB, d0.f9618a);
                    this.j += iB;
                    return str;
                }
            }
            if (iB == 0) {
                return "";
            }
            if (iB > this.h) {
                return new String(Q(iB, false), d0.f9618a);
            }
            Y(iB);
            String str2 = new String(this.g, this.j, iB, d0.f9618a);
            this.j += iB;
            return str2;
        }

        @Override // com.google.protobuf.j
        public String I() throws IOException {
            byte[] bArrQ;
            int iB = B();
            int i = this.j;
            int i2 = this.h;
            if (iB <= i2 - i && iB > 0) {
                bArrQ = this.g;
                this.j = i + iB;
            } else {
                if (iB == 0) {
                    return "";
                }
                i = 0;
                if (iB <= i2) {
                    Y(iB);
                    bArrQ = this.g;
                    this.j = iB;
                } else {
                    bArrQ = Q(iB, false);
                }
            }
            return v1.h(bArrQ, i, iB);
        }

        @Override // com.google.protobuf.j
        public int J() throws IOException {
            if (f()) {
                this.f9669k = 0;
                return 0;
            }
            int iB = B();
            this.f9669k = iB;
            if (WireFormat.a(iB) != 0) {
                return this.f9669k;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.j
        public int K() throws IOException {
            return B();
        }

        @Override // com.google.protobuf.j
        public long L() throws IOException {
            return V();
        }

        @Override // com.google.protobuf.j
        public boolean N(int i) throws IOException {
            int iB = WireFormat.b(i);
            if (iB == 0) {
                c0();
                return true;
            }
            if (iB == 1) {
                a0(8);
                return true;
            }
            if (iB == 2) {
                a0(B());
                return true;
            }
            if (iB == 3) {
                Z();
                a(WireFormat.c(WireFormat.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            a0(4);
            return true;
        }

        public final ByteString O(int i) throws IOException {
            byte[] bArrR = R(i);
            if (bArrR != null) {
                return ByteString.copyFrom(bArrR);
            }
            int i2 = this.j;
            int i3 = this.h;
            int length = i3 - i2;
            this.l += i3;
            this.j = 0;
            this.h = 0;
            List<byte[]> listS = S(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.g, i2, bArr, 0, length);
            for (byte[] bArr2 : listS) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return ByteString.wrap(bArr);
        }

        public byte P() throws IOException {
            if (this.j == this.h) {
                Y(1);
            }
            byte[] bArr = this.g;
            int i = this.j;
            this.j = i + 1;
            return bArr[i];
        }

        public final byte[] Q(int i, boolean z) throws IOException {
            byte[] bArrR = R(i);
            if (bArrR != null) {
                return z ? (byte[]) bArrR.clone() : bArrR;
            }
            int i2 = this.j;
            int i3 = this.h;
            int length = i3 - i2;
            this.l += i3;
            this.j = 0;
            this.h = 0;
            List<byte[]> listS = S(i - length);
            byte[] bArr = new byte[i];
            System.arraycopy(this.g, i2, bArr, 0, length);
            for (byte[] bArr2 : listS) {
                System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
                length += bArr2.length;
            }
            return bArr;
        }

        public final byte[] R(int i) throws IOException {
            if (i == 0) {
                return d0.c;
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
                a0((i5 - i2) - i3);
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

        public final List<byte[]> S(int i) throws IOException {
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

        public int T() throws IOException {
            int i = this.j;
            if (this.h - i < 4) {
                Y(4);
                i = this.j;
            }
            byte[] bArr = this.g;
            this.j = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long U() throws IOException {
            int i = this.j;
            if (this.h - i < 8) {
                Y(8);
                i = this.j;
            }
            byte[] bArr = this.g;
            this.j = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public long V() throws IOException {
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
            return W();
        }

        public long W() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bP = P();
                j |= ((long) (bP & 127)) << i;
                if ((bP & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final void Y(int i) throws IOException {
            if (f0(i)) {
                return;
            }
            if (i <= (this.c - this.l) - this.j) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            throw InvalidProtocolBufferException.sizeLimitExceeded();
        }

        public void Z() throws IOException {
            int iJ;
            do {
                iJ = J();
                if (iJ == 0) {
                    return;
                }
            } while (N(iJ));
        }

        @Override // com.google.protobuf.j
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.f9669k != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public void a0(int i) throws IOException {
            int i2 = this.h;
            int i3 = this.j;
            if (i > i2 - i3 || i < 0) {
                b0(i);
            } else {
                this.j = i3 + i;
            }
        }

        public final void b0(int i) throws IOException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = this.l;
            int i3 = this.j;
            int i4 = i2 + i3 + i;
            int i5 = this.m;
            if (i4 > i5) {
                a0((i5 - i2) - i3);
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
                    X();
                    throw th;
                }
            }
            this.l += i6;
            X();
            if (i6 >= i) {
                return;
            }
            int i7 = this.h;
            int i8 = i7 - this.j;
            this.j = i7;
            Y(1);
            while (true) {
                int i9 = i - i8;
                int i10 = this.h;
                if (i9 <= i10) {
                    this.j = i9;
                    return;
                } else {
                    i8 += i10;
                    this.j = i10;
                    Y(1);
                }
            }
        }

        @Override // com.google.protobuf.j
        public int d() {
            int i = this.m;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - (this.l + this.j);
        }

        @Override // com.google.protobuf.j
        public int e() {
            return this.l + this.j;
        }

        @Override // com.google.protobuf.j
        public boolean f() throws IOException {
            return this.j == this.h && !f0(1);
        }

        public final boolean f0(int i) throws IOException {
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
            X();
            if (this.h >= i) {
                return true;
            }
            return f0(i);
        }

        @Override // com.google.protobuf.j
        public void n(int i) {
            this.m = i;
            X();
        }

        @Override // com.google.protobuf.j
        public int o(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int i2 = i + this.l + this.j;
            int i3 = this.m;
            if (i2 > i3) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.m = i2;
            X();
            return i3;
        }

        @Override // com.google.protobuf.j
        public boolean p() throws IOException {
            return V() != 0;
        }

        @Override // com.google.protobuf.j
        public ByteString q() throws IOException {
            int iB = B();
            int i = this.h;
            int i2 = this.j;
            if (iB > i - i2 || iB <= 0) {
                return iB == 0 ? ByteString.EMPTY : O(iB);
            }
            ByteString byteStringCopyFrom = ByteString.copyFrom(this.g, i2, iB);
            this.j += iB;
            return byteStringCopyFrom;
        }

        @Override // com.google.protobuf.j
        public double r() throws IOException {
            return Double.longBitsToDouble(U());
        }

        @Override // com.google.protobuf.j
        public int s() throws IOException {
            return B();
        }

        @Override // com.google.protobuf.j
        public int t() throws IOException {
            return T();
        }

        @Override // com.google.protobuf.j
        public long u() throws IOException {
            return U();
        }

        @Override // com.google.protobuf.j
        public float v() throws IOException {
            return Float.intBitsToFloat(T());
        }

        @Override // com.google.protobuf.j
        public void w(int i, q0.a aVar, t tVar) throws IOException {
            int i2 = this.f9666a;
            if (i2 >= this.f9667b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f9666a = i2 + 1;
            aVar.mergeFrom(this, tVar);
            a(WireFormat.c(i, 4));
            this.f9666a--;
        }

        @Override // com.google.protobuf.j
        public int x() throws IOException {
            return B();
        }

        @Override // com.google.protobuf.j
        public long y() throws IOException {
            return V();
        }

        @Override // com.google.protobuf.j
        public <T extends q0> T z(vkh<T> vkhVar, t tVar) throws IOException {
            int iB = B();
            if (this.f9666a >= this.f9667b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iO = o(iB);
            this.f9666a++;
            T partialFrom = vkhVar.parsePartialFrom(this, tVar);
            a(0);
            this.f9666a--;
            n(iO);
            return partialFrom;
        }

        public c(InputStream inputStream, int i) {
            super();
            this.m = Integer.MAX_VALUE;
            d0.b(inputStream, "input");
            this.f = inputStream;
            this.g = new byte[i];
            this.h = 0;
            this.j = 0;
            this.l = 0;
        }
    }

    public static final class d extends j {
        public final ByteBuffer f;
        public final boolean g;
        public final long h;
        public long i;
        public long j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f9670k;
        public int l;
        public int m;
        public boolean n;
        public int o;

        public static boolean P() {
            return jbq.K();
        }

        private void V() {
            long j = this.i + ((long) this.l);
            this.i = j;
            int i = (int) (j - this.f9670k);
            int i2 = this.o;
            if (i <= i2) {
                this.l = 0;
                return;
            }
            int i3 = i - i2;
            this.l = i3;
            this.i = j - ((long) i3);
        }

        private void Z() throws IOException {
            if (W() >= 10) {
                a0();
            } else {
                b0();
            }
        }

        private void a0() throws IOException {
            for (int i = 0; i < 10; i++) {
                long j = this.j;
                this.j = 1 + j;
                if (jbq.w(j) >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        private void b0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (Q() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.j
        public void A(q0.a aVar, t tVar) throws IOException {
            int iB = B();
            if (this.f9666a >= this.f9667b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iO = o(iB);
            this.f9666a++;
            aVar.mergeFrom(this, tVar);
            a(0);
            this.f9666a--;
            n(iO);
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x008c, code lost:
        
            if (defpackage.jbq.w(r3) < 0) goto L34;
         */
        @Override // com.google.protobuf.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int B() throws java.io.IOException {
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
                byte r4 = defpackage.jbq.w(r0)
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
                byte r2 = defpackage.jbq.w(r2)
                int r2 = r2 << 7
                r2 = r2 ^ r4
                if (r2 >= 0) goto L31
                r0 = r2 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L98
            L31:
                r3 = 3
                long r3 = r3 + r0
                byte r5 = defpackage.jbq.w(r5)
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
                byte r3 = defpackage.jbq.w(r3)
                int r3 = r3 << 21
                r2 = r2 ^ r3
                if (r2 >= 0) goto L52
                r0 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L98
            L52:
                r3 = 5
                long r3 = r3 + r0
                byte r5 = defpackage.jbq.w(r5)
                int r6 = r5 << 28
                r2 = r2 ^ r6
                r6 = 266354560(0xfe03f80, float:2.2112565E-29)
                r2 = r2 ^ r6
                if (r5 >= 0) goto L96
                r5 = 6
                long r5 = r5 + r0
                byte r3 = defpackage.jbq.w(r3)
                if (r3 >= 0) goto L94
                r3 = 7
                long r3 = r3 + r0
                byte r5 = defpackage.jbq.w(r5)
                if (r5 >= 0) goto L96
                r5 = 8
                long r5 = r5 + r0
                byte r3 = defpackage.jbq.w(r3)
                if (r3 >= 0) goto L94
                long r3 = r0 + r7
                byte r5 = defpackage.jbq.w(r5)
                if (r5 >= 0) goto L96
                r5 = 10
                long r5 = r5 + r0
                byte r0 = defpackage.jbq.w(r3)
                if (r0 >= 0) goto L94
            L8e:
                long r0 = r9.U()
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.j.d.B():int");
        }

        @Override // com.google.protobuf.j
        public int D() throws IOException {
            return R();
        }

        @Override // com.google.protobuf.j
        public long E() throws IOException {
            return S();
        }

        @Override // com.google.protobuf.j
        public int F() throws IOException {
            return j.b(B());
        }

        @Override // com.google.protobuf.j
        public long G() throws IOException {
            return j.c(T());
        }

        @Override // com.google.protobuf.j
        public String H() throws IOException {
            int iB = B();
            if (iB <= 0 || iB > W()) {
                if (iB == 0) {
                    return "";
                }
                if (iB < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = new byte[iB];
            long j = iB;
            jbq.p(this.j, bArr, 0L, j);
            String str = new String(bArr, d0.f9618a);
            this.j += j;
            return str;
        }

        @Override // com.google.protobuf.j
        public String I() throws IOException {
            int iB = B();
            if (iB > 0 && iB <= W()) {
                String strG = v1.g(this.f, O(this.j), iB);
                this.j += (long) iB;
                return strG;
            }
            if (iB == 0) {
                return "";
            }
            if (iB <= 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            throw InvalidProtocolBufferException.truncatedMessage();
        }

        @Override // com.google.protobuf.j
        public int J() throws IOException {
            if (f()) {
                this.m = 0;
                return 0;
            }
            int iB = B();
            this.m = iB;
            if (WireFormat.a(iB) != 0) {
                return this.m;
            }
            throw InvalidProtocolBufferException.invalidTag();
        }

        @Override // com.google.protobuf.j
        public int K() throws IOException {
            return B();
        }

        @Override // com.google.protobuf.j
        public long L() throws IOException {
            return T();
        }

        @Override // com.google.protobuf.j
        public boolean N(int i) throws IOException {
            int iB = WireFormat.b(i);
            if (iB == 0) {
                Z();
                return true;
            }
            if (iB == 1) {
                Y(8);
                return true;
            }
            if (iB == 2) {
                Y(B());
                return true;
            }
            if (iB == 3) {
                X();
                a(WireFormat.c(WireFormat.a(i), 4));
                return true;
            }
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            Y(4);
            return true;
        }

        public final int O(long j) {
            return (int) (j - this.h);
        }

        public byte Q() throws IOException {
            long j = this.j;
            if (j == this.i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.j = 1 + j;
            return jbq.w(j);
        }

        public int R() throws IOException {
            long j = this.j;
            if (this.i - j < 4) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.j = 4 + j;
            return ((jbq.w(j + 3) & 255) << 24) | (jbq.w(j) & 255) | ((jbq.w(1 + j) & 255) << 8) | ((jbq.w(2 + j) & 255) << 16);
        }

        public long S() throws IOException {
            long j = this.j;
            if (this.i - j < 8) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.j = 8 + j;
            return ((((long) jbq.w(j + 7)) & 255) << 56) | (((long) jbq.w(j)) & 255) | ((((long) jbq.w(1 + j)) & 255) << 8) | ((((long) jbq.w(2 + j)) & 255) << 16) | ((((long) jbq.w(3 + j)) & 255) << 24) | ((((long) jbq.w(4 + j)) & 255) << 32) | ((((long) jbq.w(5 + j)) & 255) << 40) | ((((long) jbq.w(6 + j)) & 255) << 48);
        }

        public long T() throws IOException {
            long j;
            long j2;
            long j3;
            int i;
            long j4 = this.j;
            if (this.i != j4) {
                long j5 = 1 + j4;
                byte bW = jbq.w(j4);
                if (bW >= 0) {
                    this.j = j5;
                    return bW;
                }
                if (this.i - j5 >= 9) {
                    long j6 = 2 + j4;
                    int iW = (jbq.w(j5) << 7) ^ bW;
                    if (iW >= 0) {
                        long j7 = 3 + j4;
                        int iW2 = iW ^ (jbq.w(j6) << HMProSyncDataBaseProfile.DATA_TYPE_COACHING);
                        if (iW2 >= 0) {
                            j = iW2 ^ 16256;
                            j6 = j7;
                        } else {
                            j6 = 4 + j4;
                            int iW3 = iW2 ^ (jbq.w(j7) << 21);
                            if (iW3 < 0) {
                                i = (-2080896) ^ iW3;
                            } else {
                                long j8 = 5 + j4;
                                long jW = ((long) iW3) ^ (((long) jbq.w(j6)) << 28);
                                if (jW >= 0) {
                                    j3 = 266354560;
                                } else {
                                    long j9 = 6 + j4;
                                    long jW2 = jW ^ (((long) jbq.w(j8)) << 35);
                                    if (jW2 < 0) {
                                        j2 = -34093383808L;
                                    } else {
                                        j8 = 7 + j4;
                                        jW = jW2 ^ (((long) jbq.w(j9)) << 42);
                                        if (jW >= 0) {
                                            j3 = 4363953127296L;
                                        } else {
                                            j9 = 8 + j4;
                                            jW2 = jW ^ (((long) jbq.w(j8)) << 49);
                                            if (jW2 < 0) {
                                                j2 = -558586000294016L;
                                            } else {
                                                long j10 = j4 + 9;
                                                long jW3 = (jW2 ^ (((long) jbq.w(j9)) << 56)) ^ 71499008037633920L;
                                                if (jW3 < 0) {
                                                    long j11 = j4 + 10;
                                                    if (jbq.w(j10) >= 0) {
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
                        this.j = j6;
                        return j;
                    }
                    i = iW ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                    j = i;
                    this.j = j6;
                    return j;
                }
            }
            return U();
        }

        public long U() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bQ = Q();
                j |= ((long) (bQ & 127)) << i;
                if ((bQ & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        public final int W() {
            return (int) (this.i - this.j);
        }

        public void X() throws IOException {
            int iJ;
            do {
                iJ = J();
                if (iJ == 0) {
                    return;
                }
            } while (N(iJ));
        }

        public void Y(int i) throws IOException {
            if (i >= 0 && i <= W()) {
                this.j += (long) i;
            } else {
                if (i >= 0) {
                    throw InvalidProtocolBufferException.truncatedMessage();
                }
                throw InvalidProtocolBufferException.negativeSize();
            }
        }

        @Override // com.google.protobuf.j
        public void a(int i) throws InvalidProtocolBufferException {
            if (this.m != i) {
                throw InvalidProtocolBufferException.invalidEndTag();
            }
        }

        public final ByteBuffer c0(long j, long j2) throws IOException {
            int iPosition = this.f.position();
            int iLimit = this.f.limit();
            try {
                try {
                    this.f.position(O(j));
                    this.f.limit(O(j2));
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

        @Override // com.google.protobuf.j
        public int d() {
            int i = this.o;
            if (i == Integer.MAX_VALUE) {
                return -1;
            }
            return i - e();
        }

        @Override // com.google.protobuf.j
        public int e() {
            return (int) (this.j - this.f9670k);
        }

        @Override // com.google.protobuf.j
        public boolean f() throws IOException {
            return this.j == this.i;
        }

        @Override // com.google.protobuf.j
        public void n(int i) {
            this.o = i;
            V();
        }

        @Override // com.google.protobuf.j
        public int o(int i) throws InvalidProtocolBufferException {
            if (i < 0) {
                throw InvalidProtocolBufferException.negativeSize();
            }
            int iE = i + e();
            int i2 = this.o;
            if (iE > i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            this.o = iE;
            V();
            return i2;
        }

        @Override // com.google.protobuf.j
        public boolean p() throws IOException {
            return T() != 0;
        }

        @Override // com.google.protobuf.j
        public ByteString q() throws IOException {
            int iB = B();
            if (iB <= 0 || iB > W()) {
                if (iB == 0) {
                    return ByteString.EMPTY;
                }
                if (iB < 0) {
                    throw InvalidProtocolBufferException.negativeSize();
                }
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if (this.g && this.n) {
                long j = this.j;
                long j2 = iB;
                ByteBuffer byteBufferC0 = c0(j, j + j2);
                this.j += j2;
                return ByteString.wrap(byteBufferC0);
            }
            byte[] bArr = new byte[iB];
            long j3 = iB;
            jbq.p(this.j, bArr, 0L, j3);
            this.j += j3;
            return ByteString.wrap(bArr);
        }

        @Override // com.google.protobuf.j
        public double r() throws IOException {
            return Double.longBitsToDouble(S());
        }

        @Override // com.google.protobuf.j
        public int s() throws IOException {
            return B();
        }

        @Override // com.google.protobuf.j
        public int t() throws IOException {
            return R();
        }

        @Override // com.google.protobuf.j
        public long u() throws IOException {
            return S();
        }

        @Override // com.google.protobuf.j
        public float v() throws IOException {
            return Float.intBitsToFloat(R());
        }

        @Override // com.google.protobuf.j
        public void w(int i, q0.a aVar, t tVar) throws IOException {
            int i2 = this.f9666a;
            if (i2 >= this.f9667b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            this.f9666a = i2 + 1;
            aVar.mergeFrom(this, tVar);
            a(WireFormat.c(i, 4));
            this.f9666a--;
        }

        @Override // com.google.protobuf.j
        public int x() throws IOException {
            return B();
        }

        @Override // com.google.protobuf.j
        public long y() throws IOException {
            return T();
        }

        @Override // com.google.protobuf.j
        public <T extends q0> T z(vkh<T> vkhVar, t tVar) throws IOException {
            int iB = B();
            if (this.f9666a >= this.f9667b) {
                throw InvalidProtocolBufferException.recursionLimitExceeded();
            }
            int iO = o(iB);
            this.f9666a++;
            T partialFrom = vkhVar.parsePartialFrom(this, tVar);
            a(0);
            this.f9666a--;
            n(iO);
            return partialFrom;
        }

        public d(ByteBuffer byteBuffer, boolean z) {
            super();
            this.o = Integer.MAX_VALUE;
            this.f = byteBuffer;
            long jK = jbq.k(byteBuffer);
            this.h = jK;
            this.i = ((long) byteBuffer.limit()) + jK;
            long jPosition = jK + ((long) byteBuffer.position());
            this.j = jPosition;
            this.f9670k = jPosition;
            this.g = z;
        }
    }

    public static int C(int i, InputStream inputStream) throws IOException {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & 127;
        int i3 = 7;
        while (i3 < 32) {
            int i4 = inputStream.read();
            if (i4 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            i2 |= (i4 & 127) << i3;
            if ((i4 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int i5 = inputStream.read();
            if (i5 == -1) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            if ((i5 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw InvalidProtocolBufferException.malformedVarint();
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static j g(InputStream inputStream) {
        return h(inputStream, 4096);
    }

    public static j h(InputStream inputStream, int i) {
        if (i > 0) {
            return inputStream == null ? k(d0.c) : new c(inputStream, i);
        }
        throw new IllegalArgumentException("bufferSize must be > 0");
    }

    public static j i(ByteBuffer byteBuffer) {
        return j(byteBuffer, false);
    }

    public static j j(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return m(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining(), z);
        }
        if (byteBuffer.isDirect() && d.P()) {
            return new d(byteBuffer, z);
        }
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.duplicate().get(bArr);
        return m(bArr, 0, iRemaining, true);
    }

    public static j k(byte[] bArr) {
        return l(bArr, 0, bArr.length);
    }

    public static j l(byte[] bArr, int i, int i2) {
        return m(bArr, i, i2, false);
    }

    public static j m(byte[] bArr, int i, int i2, boolean z) {
        b bVar = new b(bArr, i, i2, z);
        try {
            bVar.o(i2);
            return bVar;
        } catch (InvalidProtocolBufferException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract void A(q0.a aVar, t tVar) throws IOException;

    public abstract int B() throws IOException;

    public abstract int D() throws IOException;

    public abstract long E() throws IOException;

    public abstract int F() throws IOException;

    public abstract long G() throws IOException;

    public abstract String H() throws IOException;

    public abstract String I() throws IOException;

    public abstract int J() throws IOException;

    public abstract int K() throws IOException;

    public abstract long L() throws IOException;

    public final boolean M() {
        return this.e;
    }

    public abstract boolean N(int i) throws IOException;

    public abstract void a(int i) throws InvalidProtocolBufferException;

    public abstract int d();

    public abstract int e();

    public abstract boolean f() throws IOException;

    public abstract void n(int i);

    public abstract int o(int i) throws InvalidProtocolBufferException;

    public abstract boolean p() throws IOException;

    public abstract ByteString q() throws IOException;

    public abstract double r() throws IOException;

    public abstract int s() throws IOException;

    public abstract int t() throws IOException;

    public abstract long u() throws IOException;

    public abstract float v() throws IOException;

    public abstract void w(int i, q0.a aVar, t tVar) throws IOException;

    public abstract int x() throws IOException;

    public abstract long y() throws IOException;

    public abstract <T extends q0> T z(vkh<T> vkhVar, t tVar) throws IOException;

    public j() {
        this.f9667b = 100;
        this.c = Integer.MAX_VALUE;
        this.e = false;
    }
}
