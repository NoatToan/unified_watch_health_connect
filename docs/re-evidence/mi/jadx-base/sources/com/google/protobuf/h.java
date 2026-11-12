package com.google.protobuf;

import androidx.work.WorkInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.ree;
import defpackage.xdi;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class h implements a1 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9645a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9645a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9645a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9645a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9645a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9645a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9645a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9645a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9645a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9645a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9645a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9645a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9645a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9645a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9645a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9645a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9645a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9645a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final class b extends h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f9646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f9647b;
        public int c;
        public final int d;
        public int e;
        public int f;
        public int g;

        public b(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.f9646a = z;
            this.f9647b = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.c = iArrayOffset;
            this.d = iArrayOffset;
            this.e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        @Override // com.google.protobuf.a1
        public void A(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof i0)) {
                int iB = WireFormat.b(this.f);
                if (iB == 1) {
                    do {
                        list.add(Long.valueOf(s()));
                        if (Q()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (b0() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iB0 = b0();
                m0(iB0);
                int i3 = this.c + iB0;
                while (this.c < i3) {
                    list.add(Long.valueOf(X()));
                }
                return;
            }
            i0 i0Var = (i0) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 1) {
                do {
                    i0Var.i(s());
                    if (Q()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iB1 = b0();
            m0(iB1);
            int i4 = this.c + iB1;
            while (this.c < i4) {
                i0Var.i(X());
            }
        }

        @Override // com.google.protobuf.a1
        public void B(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof c0)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iB0 = this.c + b0();
                    while (this.c < iB0) {
                        list.add(Integer.valueOf(b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(c()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (b0() == this.f);
                this.c = i;
                return;
            }
            c0 c0Var = (c0) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iB1 = this.c + b0();
                while (this.c < iB1) {
                    c0Var.Q(b0());
                }
                return;
            }
            do {
                c0Var.Q(c());
                if (Q()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (b0() == this.f);
            this.c = i2;
        }

        @Override // com.google.protobuf.a1
        public int C() throws IOException {
            g0(5);
            return U();
        }

        @Override // com.google.protobuf.a1
        public long D() throws IOException {
            g0(0);
            return j.c(c0());
        }

        @Override // com.google.protobuf.a1
        public String E() throws IOException {
            return Z(false);
        }

        @Override // com.google.protobuf.a1
        public int F() throws IOException {
            g0(5);
            return U();
        }

        @Override // com.google.protobuf.a1
        public String G() throws IOException {
            return Z(true);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.a1
        public <K, V> void H(Map<K, V> map, k0.b<K, V> bVar, t tVar) throws IOException {
            g0(2);
            int iB0 = b0();
            e0(iB0);
            int i = this.e;
            this.e = this.c + iB0;
            try {
                Object objS = bVar.f9684b;
                Object objS2 = bVar.d;
                while (true) {
                    int iL = l();
                    if (iL == Integer.MAX_VALUE) {
                        map.put(objS, objS2);
                        this.e = i;
                        return;
                    } else if (iL == 1) {
                        objS = S(bVar.f9683a, null, null);
                    } else if (iL != 2) {
                        try {
                            if (!o()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        } catch (InvalidProtocolBufferException.InvalidWireTypeException unused) {
                            if (!o()) {
                                throw new InvalidProtocolBufferException("Unable to parse map entry.");
                            }
                        }
                    } else {
                        objS2 = S(bVar.c, bVar.d.getClass(), tVar);
                    }
                }
            } catch (Throwable th) {
                this.e = i;
                throw th;
            }
        }

        @Override // com.google.protobuf.a1
        public <T> T I(e1<T> e1Var, t tVar) throws IOException {
            g0(3);
            return (T) T(e1Var, tVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.a1
        public <T> void K(List<T> list, e1<T> e1Var, t tVar) throws IOException {
            int i;
            if (WireFormat.b(this.f) != 3) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int i2 = this.f;
            do {
                list.add(T(e1Var, tVar));
                if (Q()) {
                    return;
                } else {
                    i = this.c;
                }
            } while (b0() == i2);
            this.c = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.a1
        public <T> void L(List<T> list, e1<T> e1Var, t tVar) throws IOException {
            int i;
            if (WireFormat.b(this.f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int i2 = this.f;
            do {
                list.add(Y(e1Var, tVar));
                if (Q()) {
                    return;
                } else {
                    i = this.c;
                }
            } while (b0() == i2);
            this.c = i;
        }

        @Override // com.google.protobuf.a1
        public <T> T M(Class<T> cls, t tVar) throws IOException {
            g0(3);
            return (T) T(xdi.a().d(cls), tVar);
        }

        @Override // com.google.protobuf.a1
        public <T> T N(Class<T> cls, t tVar) throws IOException {
            g0(2);
            return (T) Y(xdi.a().d(cls), tVar);
        }

        @Override // com.google.protobuf.a1
        public <T> T O(e1<T> e1Var, t tVar) throws IOException {
            g0(2);
            return (T) Y(e1Var, tVar);
        }

        public final boolean Q() {
            return this.c == this.e;
        }

        public final byte R() throws IOException {
            int i = this.c;
            if (i == this.e) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f9647b;
            this.c = i + 1;
            return bArr[i];
        }

        public final Object S(WireFormat.FieldType fieldType, Class<?> cls, t tVar) throws IOException {
            switch (a.f9645a[fieldType.ordinal()]) {
                case 1:
                    return Boolean.valueOf(u());
                case 2:
                    return readBytes();
                case 3:
                    return Double.valueOf(readDouble());
                case 4:
                    return Integer.valueOf(d());
                case 5:
                    return Integer.valueOf(C());
                case 6:
                    return Long.valueOf(s());
                case 7:
                    return Float.valueOf(readFloat());
                case 8:
                    return Integer.valueOf(z());
                case 9:
                    return Long.valueOf(r());
                case 10:
                    return N(cls, tVar);
                case 11:
                    return Integer.valueOf(F());
                case 12:
                    return Long.valueOf(b());
                case 13:
                    return Integer.valueOf(e());
                case 14:
                    return Long.valueOf(D());
                case 15:
                    return G();
                case 16:
                    return Integer.valueOf(c());
                case 17:
                    return Long.valueOf(h());
                default:
                    throw new RuntimeException("unsupported field type.");
            }
        }

        public final <T> T T(e1<T> e1Var, t tVar) throws IOException {
            int i = this.g;
            this.g = WireFormat.c(WireFormat.a(this.f), 4);
            try {
                T tE = e1Var.e();
                e1Var.h(tE, this, tVar);
                e1Var.c(tE);
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

        public final int U() throws IOException {
            e0(4);
            return V();
        }

        public final int V() {
            int i = this.c;
            byte[] bArr = this.f9647b;
            this.c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long W() throws IOException {
            e0(8);
            return X();
        }

        public final long X() {
            int i = this.c;
            byte[] bArr = this.f9647b;
            this.c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public final <T> T Y(e1<T> e1Var, t tVar) throws IOException {
            int iB0 = b0();
            e0(iB0);
            int i = this.e;
            int i2 = this.c + iB0;
            this.e = i2;
            try {
                T tE = e1Var.e();
                e1Var.h(tE, this, tVar);
                e1Var.c(tE);
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

        public String Z(boolean z) throws IOException {
            g0(2);
            int iB0 = b0();
            if (iB0 == 0) {
                return "";
            }
            e0(iB0);
            if (z) {
                byte[] bArr = this.f9647b;
                int i = this.c;
                if (!v1.t(bArr, i, i + iB0)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.f9647b, this.c, iB0, d0.f9618a);
            this.c += iB0;
            return str;
        }

        @Override // com.google.protobuf.a1
        public void a(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof i0)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iB0 = this.c + b0();
                    while (this.c < iB0) {
                        list.add(Long.valueOf(j.c(c0())));
                    }
                    return;
                }
                do {
                    list.add(Long.valueOf(D()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (b0() == this.f);
                this.c = i;
                return;
            }
            i0 i0Var = (i0) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iB1 = this.c + b0();
                while (this.c < iB1) {
                    i0Var.i(j.c(c0()));
                }
                return;
            }
            do {
                i0Var.i(D());
                if (Q()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (b0() == this.f);
            this.c = i2;
        }

        public void a0(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (WireFormat.b(this.f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            if (!(list instanceof ree) || z) {
                do {
                    list.add(Z(z));
                    if (Q()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (b0() == this.f);
                this.c = i;
                return;
            }
            ree reeVar = (ree) list;
            do {
                reeVar.n(readBytes());
                if (Q()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (b0() == this.f);
            this.c = i2;
        }

        @Override // com.google.protobuf.a1
        public long b() throws IOException {
            g0(1);
            return W();
        }

        public final int b0() throws IOException {
            int i;
            int i2 = this.c;
            int i3 = this.e;
            if (i3 == i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f9647b;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.c = i4;
                return b2;
            }
            if (i3 - i4 < 9) {
                return (int) d0();
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

        @Override // com.google.protobuf.a1
        public int c() throws IOException {
            g0(0);
            return b0();
        }

        public long c0() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.c;
            int i2 = this.e;
            if (i2 == i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f9647b;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.c = i3;
                return b2;
            }
            if (i2 - i3 < 9) {
                return d0();
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

        @Override // com.google.protobuf.a1
        public int d() throws IOException {
            g0(0);
            return b0();
        }

        public final long d0() throws IOException {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte bR = R();
                j |= ((long) (bR & 127)) << i;
                if ((bR & 128) == 0) {
                    return j;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.a1
        public int e() throws IOException {
            g0(0);
            return j.b(b0());
        }

        public final void e0(int i) throws IOException {
            if (i < 0 || i > this.e - this.c) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.a1
        public void f(List<Boolean> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof i)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iB0 = this.c + b0();
                    while (this.c < iB0) {
                        list.add(Boolean.valueOf(b0() != 0));
                    }
                    f0(iB0);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(u()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (b0() == this.f);
                this.c = i;
                return;
            }
            i iVar = (i) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iB1 = this.c + b0();
                while (this.c < iB1) {
                    iVar.p(b0() != 0);
                }
                f0(iB1);
                return;
            }
            do {
                iVar.p(u());
                if (Q()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (b0() == this.f);
            this.c = i2;
        }

        public final void f0(int i) throws IOException {
            if (this.c != i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.a1
        public void g(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof c0)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iB0 = this.c + b0();
                    while (this.c < iB0) {
                        list.add(Integer.valueOf(j.b(b0())));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(e()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (b0() == this.f);
                this.c = i;
                return;
            }
            c0 c0Var = (c0) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iB1 = this.c + b0();
                while (this.c < iB1) {
                    c0Var.Q(j.b(b0()));
                }
                return;
            }
            do {
                c0Var.Q(e());
                if (Q()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (b0() == this.f);
            this.c = i2;
        }

        public final void g0(int i) throws IOException {
            if (WireFormat.b(this.f) != i) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Override // com.google.protobuf.a1
        public int getTag() {
            return this.f;
        }

        @Override // com.google.protobuf.a1
        public long h() throws IOException {
            g0(0);
            return c0();
        }

        public final void h0(int i) throws IOException {
            e0(i);
            this.c += i;
        }

        @Override // com.google.protobuf.a1
        public void i(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof i0)) {
                int iB = WireFormat.b(this.f);
                if (iB == 1) {
                    do {
                        list.add(Long.valueOf(b()));
                        if (Q()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (b0() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iB0 = b0();
                m0(iB0);
                int i3 = this.c + iB0;
                while (this.c < i3) {
                    list.add(Long.valueOf(X()));
                }
                return;
            }
            i0 i0Var = (i0) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 1) {
                do {
                    i0Var.i(b());
                    if (Q()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iB1 = b0();
            m0(iB1);
            int i4 = this.c + iB1;
            while (this.c < i4) {
                i0Var.i(X());
            }
        }

        public final void i0() throws IOException {
            int i = this.g;
            this.g = WireFormat.c(WireFormat.a(this.f), 4);
            while (l() != Integer.MAX_VALUE && o()) {
            }
            if (this.f != this.g) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.g = i;
        }

        @Override // com.google.protobuf.a1
        public void j(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof c0)) {
                int iB = WireFormat.b(this.f);
                if (iB == 0) {
                    do {
                        list.add(Integer.valueOf(z()));
                        if (Q()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (b0() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iB0 = this.c + b0();
                while (this.c < iB0) {
                    list.add(Integer.valueOf(b0()));
                }
                f0(iB0);
                return;
            }
            c0 c0Var = (c0) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 0) {
                do {
                    c0Var.Q(z());
                    if (Q()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iB1 = this.c + b0();
            while (this.c < iB1) {
                c0Var.Q(b0());
            }
            f0(iB1);
        }

        public final void j0() throws IOException {
            int i = this.e;
            int i2 = this.c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f9647b;
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
            k0();
        }

        @Override // com.google.protobuf.a1
        public void k(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof c0)) {
                int iB = WireFormat.b(this.f);
                if (iB == 2) {
                    int iB0 = b0();
                    l0(iB0);
                    int i3 = this.c + iB0;
                    while (this.c < i3) {
                        list.add(Integer.valueOf(V()));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(C()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (b0() == this.f);
                this.c = i;
                return;
            }
            c0 c0Var = (c0) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 2) {
                int iB1 = b0();
                l0(iB1);
                int i4 = this.c + iB1;
                while (this.c < i4) {
                    c0Var.Q(V());
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c0Var.Q(C());
                if (Q()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (b0() == this.f);
            this.c = i2;
        }

        public final void k0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (R() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // com.google.protobuf.a1
        public int l() throws IOException {
            if (Q()) {
                return Integer.MAX_VALUE;
            }
            int iB0 = b0();
            this.f = iB0;
            if (iB0 == this.g) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.a(iB0);
        }

        public final void l0(int i) throws IOException {
            e0(i);
            if ((i & 3) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        @Override // com.google.protobuf.a1
        public void m(List<String> list) throws IOException {
            a0(list, false);
        }

        public final void m0(int i) throws IOException {
            e0(i);
            if ((i & 7) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        @Override // com.google.protobuf.a1
        public void n(List<Float> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof b0)) {
                int iB = WireFormat.b(this.f);
                if (iB == 2) {
                    int iB0 = b0();
                    l0(iB0);
                    int i3 = this.c + iB0;
                    while (this.c < i3) {
                        list.add(Float.valueOf(Float.intBitsToFloat(V())));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Float.valueOf(readFloat()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (b0() == this.f);
                this.c = i;
                return;
            }
            b0 b0Var = (b0) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 2) {
                int iB1 = b0();
                l0(iB1);
                int i4 = this.c + iB1;
                while (this.c < i4) {
                    b0Var.J(Float.intBitsToFloat(V()));
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                b0Var.J(readFloat());
                if (Q()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (b0() == this.f);
            this.c = i2;
        }

        @Override // com.google.protobuf.a1
        public boolean o() throws IOException {
            int i;
            if (Q() || (i = this.f) == this.g) {
                return false;
            }
            int iB = WireFormat.b(i);
            if (iB == 0) {
                j0();
                return true;
            }
            if (iB == 1) {
                h0(8);
                return true;
            }
            if (iB == 2) {
                h0(b0());
                return true;
            }
            if (iB == 3) {
                i0();
                return true;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            h0(4);
            return true;
        }

        @Override // com.google.protobuf.a1
        public void p(List<ByteString> list) throws IOException {
            int i;
            if (WireFormat.b(this.f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(readBytes());
                if (Q()) {
                    return;
                } else {
                    i = this.c;
                }
            } while (b0() == this.f);
            this.c = i;
        }

        @Override // com.google.protobuf.a1
        public void q(List<Double> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof n)) {
                int iB = WireFormat.b(this.f);
                if (iB == 1) {
                    do {
                        list.add(Double.valueOf(readDouble()));
                        if (Q()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (b0() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iB0 = b0();
                m0(iB0);
                int i3 = this.c + iB0;
                while (this.c < i3) {
                    list.add(Double.valueOf(Double.longBitsToDouble(X())));
                }
                return;
            }
            n nVar = (n) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 1) {
                do {
                    nVar.h(readDouble());
                    if (Q()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iB1 = b0();
            m0(iB1);
            int i4 = this.c + iB1;
            while (this.c < i4) {
                nVar.h(Double.longBitsToDouble(X()));
            }
        }

        @Override // com.google.protobuf.a1
        public long r() throws IOException {
            g0(0);
            return c0();
        }

        @Override // com.google.protobuf.a1
        public ByteString readBytes() throws IOException {
            g0(2);
            int iB0 = b0();
            if (iB0 == 0) {
                return ByteString.EMPTY;
            }
            e0(iB0);
            ByteString byteStringWrap = this.f9646a ? ByteString.wrap(this.f9647b, this.c, iB0) : ByteString.copyFrom(this.f9647b, this.c, iB0);
            this.c += iB0;
            return byteStringWrap;
        }

        @Override // com.google.protobuf.a1
        public double readDouble() throws IOException {
            g0(1);
            return Double.longBitsToDouble(W());
        }

        @Override // com.google.protobuf.a1
        public float readFloat() throws IOException {
            g0(5);
            return Float.intBitsToFloat(U());
        }

        @Override // com.google.protobuf.a1
        public long s() throws IOException {
            g0(1);
            return W();
        }

        @Override // com.google.protobuf.a1
        public void t(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof c0)) {
                int iB = WireFormat.b(this.f);
                if (iB == 2) {
                    int iB0 = b0();
                    l0(iB0);
                    int i3 = this.c + iB0;
                    while (this.c < i3) {
                        list.add(Integer.valueOf(V()));
                    }
                    return;
                }
                if (iB != 5) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                do {
                    list.add(Integer.valueOf(F()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (b0() == this.f);
                this.c = i;
                return;
            }
            c0 c0Var = (c0) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 2) {
                int iB1 = b0();
                l0(iB1);
                int i4 = this.c + iB1;
                while (this.c < i4) {
                    c0Var.Q(V());
                }
                return;
            }
            if (iB2 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                c0Var.Q(F());
                if (Q()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (b0() == this.f);
            this.c = i2;
        }

        @Override // com.google.protobuf.a1
        public boolean u() throws IOException {
            g0(0);
            return b0() != 0;
        }

        @Override // com.google.protobuf.a1
        public void v(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof i0)) {
                int iB = WireFormat.b(this.f);
                if (iB == 0) {
                    do {
                        list.add(Long.valueOf(h()));
                        if (Q()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (b0() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iB0 = this.c + b0();
                while (this.c < iB0) {
                    list.add(Long.valueOf(c0()));
                }
                f0(iB0);
                return;
            }
            i0 i0Var = (i0) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 0) {
                do {
                    i0Var.i(h());
                    if (Q()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iB1 = this.c + b0();
            while (this.c < iB1) {
                i0Var.i(c0());
            }
            f0(iB1);
        }

        @Override // com.google.protobuf.a1
        public void w(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof i0)) {
                int iB = WireFormat.b(this.f);
                if (iB == 0) {
                    do {
                        list.add(Long.valueOf(r()));
                        if (Q()) {
                            return;
                        } else {
                            i = this.c;
                        }
                    } while (b0() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iB0 = this.c + b0();
                while (this.c < iB0) {
                    list.add(Long.valueOf(c0()));
                }
                f0(iB0);
                return;
            }
            i0 i0Var = (i0) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 0) {
                do {
                    i0Var.i(r());
                    if (Q()) {
                        return;
                    } else {
                        i2 = this.c;
                    }
                } while (b0() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iB1 = this.c + b0();
            while (this.c < iB1) {
                i0Var.i(c0());
            }
            f0(iB1);
        }

        @Override // com.google.protobuf.a1
        public void x(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof c0)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iB0 = this.c + b0();
                    while (this.c < iB0) {
                        list.add(Integer.valueOf(b0()));
                    }
                    return;
                }
                do {
                    list.add(Integer.valueOf(d()));
                    if (Q()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (b0() == this.f);
                this.c = i;
                return;
            }
            c0 c0Var = (c0) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iB1 = this.c + b0();
                while (this.c < iB1) {
                    c0Var.Q(b0());
                }
                return;
            }
            do {
                c0Var.Q(d());
                if (Q()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (b0() == this.f);
            this.c = i2;
        }

        @Override // com.google.protobuf.a1
        public void y(List<String> list) throws IOException {
            a0(list, true);
        }

        @Override // com.google.protobuf.a1
        public int z() throws IOException {
            g0(0);
            return b0();
        }
    }

    public h() {
    }

    public /* synthetic */ h(a aVar) {
        this();
    }

    public static h P(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }

    @Override // com.google.protobuf.a1
    public boolean J() {
        return false;
    }
}
