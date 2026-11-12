package androidx.datastore.preferences.protobuf;

import androidx.work.WorkInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import defpackage.see;
import defpackage.ydi;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements i0 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2194a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2194a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2194a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2194a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2194a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2194a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2194a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2194a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2194a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2194a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2194a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2194a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2194a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2194a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2194a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2194a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2194a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2194a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static final class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f2195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f2196b;
        public int c;
        public final int d;
        public int e;
        public int f;
        public int g;

        public b(ByteBuffer byteBuffer, boolean z) {
            super(null);
            this.f2195a = z;
            this.f2196b = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
            this.c = iArrayOffset;
            this.d = iArrayOffset;
            this.e = byteBuffer.arrayOffset() + byteBuffer.limit();
        }

        @Override // androidx.datastore.preferences.protobuf.i0
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
                    } while (a0() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iA0 = a0();
                l0(iA0);
                int i3 = this.c + iA0;
                while (this.c < i3) {
                    list.add(Long.valueOf(W()));
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
                } while (a0() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iA1 = a0();
            l0(iA1);
            int i4 = this.c + iA1;
            while (this.c < i4) {
                xVar.i(W());
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public void B(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof r)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iA0 = this.c + a0();
                    while (this.c < iA0) {
                        list.add(Integer.valueOf(a0()));
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
                } while (a0() == this.f);
                this.c = i;
                return;
            }
            r rVar = (r) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iA1 = this.c + a0();
                while (this.c < iA1) {
                    rVar.Q(a0());
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
            } while (a0() == this.f);
            this.c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public int C() throws IOException {
            f0(5);
            return T();
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public long D() throws IOException {
            f0(0);
            return g.c(b0());
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public String E() throws IOException {
            return Y(false);
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public int F() throws IOException {
            f0(5);
            return T();
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public String G() throws IOException {
            return Y(true);
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public <T> T H(k0<T> k0Var, l lVar) throws IOException {
            f0(3);
            return (T) S(k0Var, lVar);
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public <T> T I(Class<T> cls, l lVar) throws IOException {
            f0(2);
            return (T) X(ydi.a().d(cls), lVar);
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public <T> T J(k0<T> k0Var, l lVar) throws IOException {
            f0(2);
            return (T) X(k0Var, lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.i0
        public <T> void K(List<T> list, k0<T> k0Var, l lVar) throws IOException {
            int i;
            if (WireFormat.b(this.f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int i2 = this.f;
            do {
                list.add(X(k0Var, lVar));
                if (P()) {
                    return;
                } else {
                    i = this.c;
                }
            } while (a0() == i2);
            this.c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public <T> T L(Class<T> cls, l lVar) throws IOException {
            f0(3);
            return (T) S(ydi.a().d(cls), lVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.i0
        public <K, V> void M(Map<K, V> map, y.a<K, V> aVar, l lVar) throws IOException {
            f0(2);
            int iA0 = a0();
            d0(iA0);
            int i = this.e;
            this.e = this.c + iA0;
            try {
                Object objR = aVar.f2265b;
                Object objR2 = aVar.d;
                while (true) {
                    int iL = l();
                    if (iL == Integer.MAX_VALUE) {
                        map.put(objR, objR2);
                        this.e = i;
                        return;
                    } else if (iL == 1) {
                        objR = R(aVar.f2264a, null, null);
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
                        objR2 = R(aVar.c, aVar.d.getClass(), lVar);
                    }
                }
            } catch (Throwable th) {
                this.e = i;
                throw th;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.i0
        public <T> void N(List<T> list, k0<T> k0Var, l lVar) throws IOException {
            int i;
            if (WireFormat.b(this.f) != 3) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int i2 = this.f;
            do {
                list.add(S(k0Var, lVar));
                if (P()) {
                    return;
                } else {
                    i = this.c;
                }
            } while (a0() == i2);
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
            byte[] bArr = this.f2196b;
            this.c = i + 1;
            return bArr[i];
        }

        public final Object R(WireFormat.FieldType fieldType, Class<?> cls, l lVar) throws IOException {
            switch (a.f2194a[fieldType.ordinal()]) {
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
                    return I(cls, lVar);
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

        public final <T> T S(k0<T> k0Var, l lVar) throws IOException {
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

        public final int T() throws IOException {
            d0(4);
            return U();
        }

        public final int U() {
            int i = this.c;
            byte[] bArr = this.f2196b;
            this.c = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public final long V() throws IOException {
            d0(8);
            return W();
        }

        public final long W() {
            int i = this.c;
            byte[] bArr = this.f2196b;
            this.c = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }

        public final <T> T X(k0<T> k0Var, l lVar) throws IOException {
            int iA0 = a0();
            d0(iA0);
            int i = this.e;
            int i2 = this.c + iA0;
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

        public String Y(boolean z) throws IOException {
            f0(2);
            int iA0 = a0();
            if (iA0 == 0) {
                return "";
            }
            d0(iA0);
            if (z) {
                byte[] bArr = this.f2196b;
                int i = this.c;
                if (!q0.t(bArr, i, i + iA0)) {
                    throw InvalidProtocolBufferException.invalidUtf8();
                }
            }
            String str = new String(this.f2196b, this.c, iA0, s.f2252a);
            this.c += iA0;
            return str;
        }

        public void Z(List<String> list, boolean z) throws IOException {
            int i;
            int i2;
            if (WireFormat.b(this.f) != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            if (!(list instanceof see) || z) {
                do {
                    list.add(Y(z));
                    if (P()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (a0() == this.f);
                this.c = i;
                return;
            }
            see seeVar = (see) list;
            do {
                seeVar.y(readBytes());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (a0() == this.f);
            this.c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public void a(List<Long> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof x)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iA0 = this.c + a0();
                    while (this.c < iA0) {
                        list.add(Long.valueOf(g.c(b0())));
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
                } while (a0() == this.f);
                this.c = i;
                return;
            }
            x xVar = (x) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iA1 = this.c + a0();
                while (this.c < iA1) {
                    xVar.i(g.c(b0()));
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
            } while (a0() == this.f);
            this.c = i2;
        }

        public final int a0() throws IOException {
            int i;
            int i2 = this.c;
            int i3 = this.e;
            if (i3 == i2) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f2196b;
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 >= 0) {
                this.c = i4;
                return b2;
            }
            if (i3 - i4 < 9) {
                return (int) c0();
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

        @Override // androidx.datastore.preferences.protobuf.i0
        public long b() throws IOException {
            f0(1);
            return V();
        }

        public long b0() throws IOException {
            long j;
            long j2;
            long j3;
            int i = this.c;
            int i2 = this.e;
            if (i2 == i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
            byte[] bArr = this.f2196b;
            int i3 = i + 1;
            byte b2 = bArr[i];
            if (b2 >= 0) {
                this.c = i3;
                return b2;
            }
            if (i2 - i3 < 9) {
                return c0();
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

        @Override // androidx.datastore.preferences.protobuf.i0
        public int c() throws IOException {
            f0(0);
            return a0();
        }

        public final long c0() throws IOException {
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

        @Override // androidx.datastore.preferences.protobuf.i0
        public int d() throws IOException {
            f0(0);
            return a0();
        }

        public final void d0(int i) throws IOException {
            if (i < 0 || i > this.e - this.c) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public int e() throws IOException {
            f0(0);
            return g.b(a0());
        }

        public final void e0(int i) throws IOException {
            if (this.c != i) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public void f(List<Boolean> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof f)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iA0 = this.c + a0();
                    while (this.c < iA0) {
                        list.add(Boolean.valueOf(a0() != 0));
                    }
                    e0(iA0);
                    return;
                }
                do {
                    list.add(Boolean.valueOf(u()));
                    if (P()) {
                        return;
                    } else {
                        i = this.c;
                    }
                } while (a0() == this.f);
                this.c = i;
                return;
            }
            f fVar = (f) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iA1 = this.c + a0();
                while (this.c < iA1) {
                    fVar.p(a0() != 0);
                }
                e0(iA1);
                return;
            }
            do {
                fVar.p(u());
                if (P()) {
                    return;
                } else {
                    i2 = this.c;
                }
            } while (a0() == this.f);
            this.c = i2;
        }

        public final void f0(int i) throws IOException {
            if (WireFormat.b(this.f) != i) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public void g(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof r)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iA0 = this.c + a0();
                    while (this.c < iA0) {
                        list.add(Integer.valueOf(g.b(a0())));
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
                } while (a0() == this.f);
                this.c = i;
                return;
            }
            r rVar = (r) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iA1 = this.c + a0();
                while (this.c < iA1) {
                    rVar.Q(g.b(a0()));
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
            } while (a0() == this.f);
            this.c = i2;
        }

        public final void g0(int i) throws IOException {
            d0(i);
            this.c += i;
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public int getTag() {
            return this.f;
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public long h() throws IOException {
            f0(0);
            return b0();
        }

        public final void h0() throws IOException {
            int i = this.g;
            this.g = WireFormat.c(WireFormat.a(this.f), 4);
            while (l() != Integer.MAX_VALUE && o()) {
            }
            if (this.f != this.g) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.g = i;
        }

        @Override // androidx.datastore.preferences.protobuf.i0
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
                    } while (a0() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iA0 = a0();
                l0(iA0);
                int i3 = this.c + iA0;
                while (this.c < i3) {
                    list.add(Long.valueOf(W()));
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
                } while (a0() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iA1 = a0();
            l0(iA1);
            int i4 = this.c + iA1;
            while (this.c < i4) {
                xVar.i(W());
            }
        }

        public final void i0() throws IOException {
            int i = this.e;
            int i2 = this.c;
            if (i - i2 >= 10) {
                byte[] bArr = this.f2196b;
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
            j0();
        }

        @Override // androidx.datastore.preferences.protobuf.i0
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
                    } while (a0() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iA0 = this.c + a0();
                while (this.c < iA0) {
                    list.add(Integer.valueOf(a0()));
                }
                e0(iA0);
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
                } while (a0() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iA1 = this.c + a0();
            while (this.c < iA1) {
                rVar.Q(a0());
            }
            e0(iA1);
        }

        public final void j0() throws IOException {
            for (int i = 0; i < 10; i++) {
                if (Q() >= 0) {
                    return;
                }
            }
            throw InvalidProtocolBufferException.malformedVarint();
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public void k(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof r)) {
                int iB = WireFormat.b(this.f);
                if (iB == 2) {
                    int iA0 = a0();
                    k0(iA0);
                    int i3 = this.c + iA0;
                    while (this.c < i3) {
                        list.add(Integer.valueOf(U()));
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
                } while (a0() == this.f);
                this.c = i;
                return;
            }
            r rVar = (r) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 2) {
                int iA1 = a0();
                k0(iA1);
                int i4 = this.c + iA1;
                while (this.c < i4) {
                    rVar.Q(U());
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
            } while (a0() == this.f);
            this.c = i2;
        }

        public final void k0(int i) throws IOException {
            d0(i);
            if ((i & 3) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public int l() throws IOException {
            if (P()) {
                return Integer.MAX_VALUE;
            }
            int iA0 = a0();
            this.f = iA0;
            if (iA0 == this.g) {
                return Integer.MAX_VALUE;
            }
            return WireFormat.a(iA0);
        }

        public final void l0(int i) throws IOException {
            d0(i);
            if ((i & 7) != 0) {
                throw InvalidProtocolBufferException.parseFailure();
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public void m(List<String> list) throws IOException {
            Z(list, false);
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public void n(List<Float> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof q)) {
                int iB = WireFormat.b(this.f);
                if (iB == 2) {
                    int iA0 = a0();
                    k0(iA0);
                    int i3 = this.c + iA0;
                    while (this.c < i3) {
                        list.add(Float.valueOf(Float.intBitsToFloat(U())));
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
                } while (a0() == this.f);
                this.c = i;
                return;
            }
            q qVar = (q) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 2) {
                int iA1 = a0();
                k0(iA1);
                int i4 = this.c + iA1;
                while (this.c < i4) {
                    qVar.J(Float.intBitsToFloat(U()));
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
            } while (a0() == this.f);
            this.c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public boolean o() throws IOException {
            int i;
            if (P() || (i = this.f) == this.g) {
                return false;
            }
            int iB = WireFormat.b(i);
            if (iB == 0) {
                i0();
                return true;
            }
            if (iB == 1) {
                g0(8);
                return true;
            }
            if (iB == 2) {
                g0(a0());
                return true;
            }
            if (iB == 3) {
                h0();
                return true;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            g0(4);
            return true;
        }

        @Override // androidx.datastore.preferences.protobuf.i0
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
            } while (a0() == this.f);
            this.c = i;
        }

        @Override // androidx.datastore.preferences.protobuf.i0
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
                    } while (a0() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iA0 = a0();
                l0(iA0);
                int i3 = this.c + iA0;
                while (this.c < i3) {
                    list.add(Double.valueOf(Double.longBitsToDouble(W())));
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
                } while (a0() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iA1 = a0();
            l0(iA1);
            int i4 = this.c + iA1;
            while (this.c < i4) {
                jVar.h(Double.longBitsToDouble(W()));
            }
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public long r() throws IOException {
            f0(0);
            return b0();
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public ByteString readBytes() throws IOException {
            f0(2);
            int iA0 = a0();
            if (iA0 == 0) {
                return ByteString.EMPTY;
            }
            d0(iA0);
            ByteString byteStringWrap = this.f2195a ? ByteString.wrap(this.f2196b, this.c, iA0) : ByteString.copyFrom(this.f2196b, this.c, iA0);
            this.c += iA0;
            return byteStringWrap;
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public double readDouble() throws IOException {
            f0(1);
            return Double.longBitsToDouble(V());
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public float readFloat() throws IOException {
            f0(5);
            return Float.intBitsToFloat(T());
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public long s() throws IOException {
            f0(1);
            return V();
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public void t(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof r)) {
                int iB = WireFormat.b(this.f);
                if (iB == 2) {
                    int iA0 = a0();
                    k0(iA0);
                    int i3 = this.c + iA0;
                    while (this.c < i3) {
                        list.add(Integer.valueOf(U()));
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
                } while (a0() == this.f);
                this.c = i;
                return;
            }
            r rVar = (r) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 == 2) {
                int iA1 = a0();
                k0(iA1);
                int i4 = this.c + iA1;
                while (this.c < i4) {
                    rVar.Q(U());
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
            } while (a0() == this.f);
            this.c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public boolean u() throws IOException {
            f0(0);
            return a0() != 0;
        }

        @Override // androidx.datastore.preferences.protobuf.i0
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
                    } while (a0() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iA0 = this.c + a0();
                while (this.c < iA0) {
                    list.add(Long.valueOf(b0()));
                }
                e0(iA0);
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
                } while (a0() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iA1 = this.c + a0();
            while (this.c < iA1) {
                xVar.i(b0());
            }
            e0(iA1);
        }

        @Override // androidx.datastore.preferences.protobuf.i0
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
                    } while (a0() == this.f);
                    this.c = i;
                    return;
                }
                if (iB != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iA0 = this.c + a0();
                while (this.c < iA0) {
                    list.add(Long.valueOf(b0()));
                }
                e0(iA0);
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
                } while (a0() == this.f);
                this.c = i2;
                return;
            }
            if (iB2 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iA1 = this.c + a0();
            while (this.c < iA1) {
                xVar.i(b0());
            }
            e0(iA1);
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public void x(List<Integer> list) throws IOException {
            int i;
            int i2;
            if (!(list instanceof r)) {
                int iB = WireFormat.b(this.f);
                if (iB != 0) {
                    if (iB != 2) {
                        throw InvalidProtocolBufferException.invalidWireType();
                    }
                    int iA0 = this.c + a0();
                    while (this.c < iA0) {
                        list.add(Integer.valueOf(a0()));
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
                } while (a0() == this.f);
                this.c = i;
                return;
            }
            r rVar = (r) list;
            int iB2 = WireFormat.b(this.f);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw InvalidProtocolBufferException.invalidWireType();
                }
                int iA1 = this.c + a0();
                while (this.c < iA1) {
                    rVar.Q(a0());
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
            } while (a0() == this.f);
            this.c = i2;
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public void y(List<String> list) throws IOException {
            Z(list, true);
        }

        @Override // androidx.datastore.preferences.protobuf.i0
        public int z() throws IOException {
            f0(0);
            return a0();
        }
    }

    public e() {
    }

    public /* synthetic */ e(a aVar) {
        this();
    }

    public static e O(ByteBuffer byteBuffer, boolean z) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer, z);
        }
        throw new IllegalArgumentException("Direct buffers not yet supported");
    }
}
