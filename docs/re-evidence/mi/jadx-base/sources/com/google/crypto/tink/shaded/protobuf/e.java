package com.google.crypto.tink.shaded.protobuf;

import androidx.work.WorkInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.qee;
import defpackage.wdi;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class e implements i0 {

    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f9378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f9379b;
        public int c;
        public final int d;
        public int e;
        public int f;
        public int g;

        public b(ByteBuffer byteBuffer, boolean z) {
            super();
            this.f9378a = z;
            this.f9379b = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.c = iArrayOffset;
            this.d = iArrayOffset;
            this.e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void A(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof x)) {
                int iB = WireFormat.b(this.f);
                if (iB == 1) {
                    do {
                        list.add(Long.valueOf(s()));
                        if (P()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (Z() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iZ = Z();
                k0(iZ);
                int i3 = this.c + iZ;
                while (this.c < i3) {
                    list.add(Long.valueOf(V()));
                }
                return;
            }
            x xVar = (x) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 1) {
                do {
                    xVar.i(s());
                    if (P()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (Z() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iZ2 = Z();
            k0(iZ2);
            int i4 = this.c + iZ2;
            while (this.c < i4) {
                xVar.i(V());
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void B(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof r)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iZ = this.c + Z();
                    while (this.c < iZ) {
                        list.add(Integer.valueOf(Z()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(c()));
                    if (P()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (Z() == this.f);
                this.c = i;
                return;
            }
            r rVar = (r) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iZ2 = this.c + Z();
                while (this.c < iZ2) {
                    rVar.Q(Z());
                }
                return;
            }
            do {
                rVar.Q(c());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (Z() == this.f);
            this.c = i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public int C() throws IOException {
            e0(5);
            return S();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public long D() throws IOException {
            e0(0);
            return g.c(a0());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public String E() throws IOException {
            return X(false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public int F() throws IOException {
            e0(5);
            return S();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public String G() throws IOException {
            return X(true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public <T> T H(k0<T> k0Var, l lVar) throws IOException {
            e0(3);
            return (T) R(k0Var, lVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public <T> T I(Class<T> cls, l lVar) throws IOException {
            e0(3);
            return (T) R(wdi.a().d(cls), lVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public <K, V> void J(Map<K, V> map, y.a<K, V> aVar, l lVar) throws IOException {
            e0(2);
            int iZ = Z();
            c0(iZ);
            int i = this.e;
            this.e = this.c + iZ;
            try {
                throw null;
            } catch (Throwable th) {
                this.e = i;
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public <T> void K(List<T> list, k0<T> k0Var, l lVar) throws IOException {
            int i;
            if (WireFormat.b(this.f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int i2 = this.f;
            do {
                list.add(W(k0Var, lVar));
                if (P()) {
                    return;
                } else {
                    i = this.c;
                }
            } while (Z() == i2);
            this.c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public <T> T L(k0<T> k0Var, l lVar) throws IOException {
            e0(2);
            return (T) W(k0Var, lVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public <T> T M(Class<T> cls, l lVar) throws IOException {
            e0(2);
            return (T) W(wdi.a().d(cls), lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public <T> void N(List<T> list, k0<T> k0Var, l lVar) throws IOException {
            int i;
            if (WireFormat.b(this.f) != 3) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int i2 = this.f;
            do {
                list.add(R(k0Var, lVar));
                if (P()) {
                    return;
                } else {
                    i = this.c;
                }
            } while (Z() == i2);
            this.c = i;
        }

        public final boolean P() {
            return this.c == this.e;
        }

        public final byte Q() throws IOException {
            int i = this.c;
            if (i == this.e) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f9379b;
            this.c = i + 1;
            return bArr[i];
        }

        public final <T> T R(k0<T> k0Var, l lVar) throws IOException {
            int i = this.g;
            this.g = WireFormat.c(WireFormat.a(this.f), 4);
            try {
                T tE = k0Var.e();
                k0Var.g(tE, this, lVar);
                k0Var.c(tE);
                if (this.f != this.g) {
                    throw InvalidProtocolBufferException.parseFailure();
                }
                this.g = i;
                return tE;
            } catch (Throwable th) {
                this.g = i;
                throw th;
            }
        }

        public final int S() throws IOException {
            c0(4);
            return T();
        }

        public final int T() {
            int i = this.c;
            byte[] bArr = this.f9379b;
            this.c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long U() throws IOException {
            c0(8);
            return V();
        }

        public final long V() {
            int i = this.c;
            byte[] bArr = this.f9379b;
            this.c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public final <T> T W(k0<T> k0Var, l lVar) throws IOException {
            int iZ = Z();
            c0(iZ);
            int i = this.e;
            int i2 = this.c + iZ;
            this.e = i2;
            try {
                T tE = k0Var.e();
                k0Var.g(tE, this, lVar);
                k0Var.c(tE);
                if (this.c != i2) {
                    throw InvalidProtocolBufferException.parseFailure();
                }
                this.e = i;
                return tE;
            } catch (Throwable th) {
                this.e = i;
                throw th;
            }
        }

        public String X(boolean z) throws IOException {
            e0(2);
            int iZ = Z();
            if (iZ == 0) {
                return "";
            }
            c0(iZ);
            if (z) {
                byte[] bArr = this.f9379b;
                int i = this.c;
                if (!q0.t(bArr, i, i + iZ)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.f9379b, this.c, iZ, s.f9434a);
            this.c += iZ;
            return str;
        }

        public void Y(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (WireFormat.b(this.f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            if (!(list instanceof qee) || z) {
                do {
                    list.add(X(z));
                    if (P()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (Z() == this.f);
                this.c = i;
                return;
            }
            qee qeeVar = (qee) list;
            do {
                qeeVar.D(readBytes());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (Z() == this.f);
            this.c = i2;
        }

        public final int Z() throws IOException {
            int i;
            int i2 = this.c;
            int i3 = this.e;
            if (i3 == i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f9379b;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.c = i4;
                return b2;
            }
            if (i3 - i4 < 9) {
                return (int) b0();
            }
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
                                            if (bArr[i7] < 0) {
                                                throw InvalidProtocolBufferException.malformedVarint();
                                            }
                                            i5 = i12;
                                            i = i11;
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
            this.c = i5;
            return i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void a(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof x)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iZ = this.c + Z();
                    while (this.c < iZ) {
                        list.add(Long.valueOf(g.c(a0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(D()));
                    if (P()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (Z() == this.f);
                this.c = i;
                return;
            }
            x xVar = (x) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iZ2 = this.c + Z();
                while (this.c < iZ2) {
                    xVar.i(g.c(a0()));
                }
                return;
            }
            do {
                xVar.i(D());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (Z() == this.f);
            this.c = i2;
        }

        public long a0() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.c;
            int i2 = this.e;
            if (i2 == i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f9379b;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.c = i3;
                return b2;
            }
            if (i2 - i3 < 9) {
                return b0();
            }
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
                                            if (bArr[i4] < 0) {
                                                throw InvalidProtocolBufferException.malformedVarint();
                                            }
                                            i4 = i11;
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
            this.c = i4;
            return j;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public long b() throws IOException {
            e0(1);
            return U();
        }

        public final long b0() throws IOException {
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

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public int c() throws IOException {
            e0(0);
            return Z();
        }

        public final void c0(int i) throws IOException {
            if (i < 0 || i > this.e - this.c) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public int d() throws IOException {
            e0(0);
            return Z();
        }

        public final void d0(int i) throws IOException {
            if (this.c != i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public int e() throws IOException {
            e0(0);
            return g.b(Z());
        }

        public final void e0(int i) throws IOException {
            if (WireFormat.b(this.f) != i) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void f(List<Boolean> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof f)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iZ = this.c + Z();
                    while (this.c < iZ) {
                        list.add(Boolean.valueOf(Z() != 0));
                    }
                    d0(iZ);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(u()));
                    if (P()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (Z() == this.f);
                this.c = i;
                return;
            }
            f fVar = (f) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iZ2 = this.c + Z();
                while (this.c < iZ2) {
                    fVar.p(Z() != 0);
                }
                d0(iZ2);
                return;
            }
            do {
                fVar.p(u());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (Z() == this.f);
            this.c = i2;
        }

        public final void f0(int i) throws IOException {
            c0(i);
            this.c += i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void g(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof r)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iZ = this.c + Z();
                    while (this.c < iZ) {
                        list.add(Integer.valueOf(g.b(Z())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(e()));
                    if (P()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (Z() == this.f);
                this.c = i;
                return;
            }
            r rVar = (r) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iZ2 = this.c + Z();
                while (this.c < iZ2) {
                    rVar.Q(g.b(Z()));
                }
                return;
            }
            do {
                rVar.Q(e());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (Z() == this.f);
            this.c = i2;
        }

        public final void g0() throws IOException {
            int i = this.g;
            this.g = WireFormat.c(WireFormat.a(this.f), 4);
            while (l() != Integer.MAX_VALUE && o()) {
            }
            if (this.f != this.g) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.g = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public int getTag() {
            return this.f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public long h() throws IOException {
            e0(0);
            return a0();
        }

        public final void h0() throws IOException {
            int i = this.e;
            int i2 = this.c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f9379b;
                int i3 = 0;
                while (i3 < 10) {
                    int i4 = i2 + 1;
                    if (bArr[i2] >= 0) {
                        this.c = i4;
                        return;
                    } else {
                        i3++;
                        i2 = i4;
                    }
                }
            }
            i0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void i(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof x)) {
                int iB = WireFormat.b(this.f);
                if (iB == 1) {
                    do {
                        list.add(Long.valueOf(b()));
                        if (P()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (Z() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iZ = Z();
                k0(iZ);
                int i3 = this.c + iZ;
                while (this.c < i3) {
                    list.add(Long.valueOf(V()));
                }
                return;
            }
            x xVar = (x) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 1) {
                do {
                    xVar.i(b());
                    if (P()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (Z() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iZ2 = Z();
            k0(iZ2);
            int i4 = this.c + iZ2;
            while (this.c < i4) {
                xVar.i(V());
            }
        }

        public final void i0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (Q() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void j(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof r)) {
                int iB = WireFormat.b(this.f);
                if (iB == 0) {
                    do {
                        list.add(Integer.valueOf(z()));
                        if (P()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (Z() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iZ = this.c + Z();
                while (this.c < iZ) {
                    list.add(Integer.valueOf(Z()));
                }
                d0(iZ);
                return;
            }
            r rVar = (r) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 0) {
                do {
                    rVar.Q(z());
                    if (P()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (Z() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iZ2 = this.c + Z();
            while (this.c < iZ2) {
                rVar.Q(Z());
            }
            d0(iZ2);
        }

        public final void j0(int i) throws IOException {
            c0(i);
            if ((i & 3) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void k(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof r)) {
                int iB = WireFormat.b(this.f);
                if (iB == 2) {
                    int iZ = Z();
                    j0(iZ);
                    int i3 = this.c + iZ;
                    while (this.c < i3) {
                        list.add(Integer.valueOf(T()));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(C()));
                    if (P()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (Z() == this.f);
                this.c = i;
                return;
            }
            r rVar = (r) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 2) {
                int iZ2 = Z();
                j0(iZ2);
                int i4 = this.c + iZ2;
                while (this.c < i4) {
                    rVar.Q(T());
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                rVar.Q(C());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (Z() == this.f);
            this.c = i2;
        }

        public final void k0(int i) throws IOException {
            c0(i);
            if ((i & 7) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public int l() throws IOException {
            if (P()) {
                return Integer.MAX_VALUE;
            }
            int iZ = Z();
            this.f = iZ;
            if (iZ == this.g) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.a(iZ);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void m(List<String> list) throws IOException {
            Y(list, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void n(List<Float> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof q)) {
                int iB = WireFormat.b(this.f);
                if (iB == 2) {
                    int iZ = Z();
                    j0(iZ);
                    int i3 = this.c + iZ;
                    while (this.c < i3) {
                        list.add(Float.valueOf(Float.intBitsToFloat(T())));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (P()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (Z() == this.f);
                this.c = i;
                return;
            }
            q qVar = (q) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 2) {
                int iZ2 = Z();
                j0(iZ2);
                int i4 = this.c + iZ2;
                while (this.c < i4) {
                    qVar.J(Float.intBitsToFloat(T()));
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                qVar.J(readFloat());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (Z() == this.f);
            this.c = i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public boolean o() throws IOException {
            int i;
            if (P() || (i = this.f) == this.g) {
                return false;
            }
            int iB = WireFormat.b(i);
            if (iB == 0) {
                h0();
                return true;
            }
            if (iB == 1) {
                f0(8);
                return true;
            }
            if (iB == 2) {
                f0(Z());
                return true;
            }
            if (iB == 3) {
                g0();
                return true;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            f0(4);
            return true;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void p(List<ByteString> list) throws IOException {
            int i;
            if (WireFormat.b(this.f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(readBytes());
                if (P()) {
                    return;
                } else {
                    i = this.c;
                }
            } while (Z() == this.f);
            this.c = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void q(List<Double> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof j)) {
                int iB = WireFormat.b(this.f);
                if (iB == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (P()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (Z() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iZ = Z();
                k0(iZ);
                int i3 = this.c + iZ;
                while (this.c < i3) {
                    list.add(Double.valueOf(Double.longBitsToDouble(V())));
                }
                return;
            }
            j jVar = (j) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 1) {
                do {
                    jVar.h(readDouble());
                    if (P()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (Z() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iZ2 = Z();
            k0(iZ2);
            int i4 = this.c + iZ2;
            while (this.c < i4) {
                jVar.h(Double.longBitsToDouble(V()));
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public long r() throws IOException {
            e0(0);
            return a0();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public ByteString readBytes() throws IOException {
            e0(2);
            int iZ = Z();
            if (iZ == 0) {
                return ByteString.EMPTY;
            }
            c0(iZ);
            ByteString byteStringWrap = this.f9378a ? ByteString.wrap(this.f9379b, this.c, iZ) : ByteString.copyFrom(this.f9379b, this.c, iZ);
            this.c += iZ;
            return byteStringWrap;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public double readDouble() throws IOException {
            e0(1);
            return Double.longBitsToDouble(U());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public float readFloat() throws IOException {
            e0(5);
            return Float.intBitsToFloat(S());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public long s() throws IOException {
            e0(1);
            return U();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void t(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof r)) {
                int iB = WireFormat.b(this.f);
                if (iB == 2) {
                    int iZ = Z();
                    j0(iZ);
                    int i3 = this.c + iZ;
                    while (this.c < i3) {
                        list.add(Integer.valueOf(T()));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(F()));
                    if (P()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (Z() == this.f);
                this.c = i;
                return;
            }
            r rVar = (r) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 2) {
                int iZ2 = Z();
                j0(iZ2);
                int i4 = this.c + iZ2;
                while (this.c < i4) {
                    rVar.Q(T());
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                rVar.Q(F());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (Z() == this.f);
            this.c = i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public boolean u() throws IOException {
            e0(0);
            return Z() != 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void v(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof x)) {
                int iB = WireFormat.b(this.f);
                if (iB == 0) {
                    do {
                        list.add(Long.valueOf(h()));
                        if (P()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (Z() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iZ = this.c + Z();
                while (this.c < iZ) {
                    list.add(Long.valueOf(a0()));
                }
                d0(iZ);
                return;
            }
            x xVar = (x) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 0) {
                do {
                    xVar.i(h());
                    if (P()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (Z() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iZ2 = this.c + Z();
            while (this.c < iZ2) {
                xVar.i(a0());
            }
            d0(iZ2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void w(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof x)) {
                int iB = WireFormat.b(this.f);
                if (iB == 0) {
                    do {
                        list.add(Long.valueOf(r()));
                        if (P()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (Z() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iZ = this.c + Z();
                while (this.c < iZ) {
                    list.add(Long.valueOf(a0()));
                }
                d0(iZ);
                return;
            }
            x xVar = (x) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 0) {
                do {
                    xVar.i(r());
                    if (P()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (Z() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iZ2 = this.c + Z();
            while (this.c < iZ2) {
                xVar.i(a0());
            }
            d0(iZ2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void x(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof r)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iZ = this.c + Z();
                    while (this.c < iZ) {
                        list.add(Integer.valueOf(Z()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(d()));
                    if (P()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (Z() == this.f);
                this.c = i;
                return;
            }
            r rVar = (r) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iZ2 = this.c + Z();
                while (this.c < iZ2) {
                    rVar.Q(Z());
                }
                return;
            }
            do {
                rVar.Q(d());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (Z() == this.f);
            this.c = i2;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public void y(List<String> list) throws IOException {
            Y(list, true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.i0
        public int z() throws IOException {
            e0(0);
            return Z();
        }
    }

    public e() {
    }

    public static e O(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
