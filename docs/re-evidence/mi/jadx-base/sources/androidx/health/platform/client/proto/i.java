package androidx.health.platform.client.proto;

import defpackage.pee;
import defpackage.vdi;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class i implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f2502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2503b;
    public int c;
    public int d = 0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2504a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2504a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2504a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2504a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2504a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2504a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2504a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2504a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2504a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2504a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2504a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2504a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2504a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2504a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2504a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2504a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2504a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2504a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public i(h hVar) {
        h hVar2 = (h) f0.b(hVar, "input");
        this.f2502a = hVar2;
        hVar2.d = this;
    }

    public static i O(h hVar) {
        i iVar = hVar.d;
        return iVar != null ? iVar : new i(hVar);
    }

    @Override // androidx.health.platform.client.proto.w0
    public void A(List<Long> list) throws IOException {
        int iD;
        int iD2;
        if (!(list instanceof k0)) {
            int iB = WireFormat.b(this.f2503b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f2502a.t()));
                    if (this.f2502a.e()) {
                        return;
                    } else {
                        iD = this.f2502a.D();
                    }
                } while (iD == this.f2503b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f2502a.E();
            Y(iE);
            int iD3 = this.f2502a.d() + iE;
            do {
                list.add(Long.valueOf(this.f2502a.t()));
            } while (this.f2502a.d() < iD3);
            return;
        }
        k0 k0Var = (k0) list;
        int iB2 = WireFormat.b(this.f2503b);
        if (iB2 == 1) {
            do {
                k0Var.i(this.f2502a.t());
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD2 = this.f2502a.D();
                }
            } while (iD2 == this.f2503b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f2502a.E();
        Y(iE2);
        int iD4 = this.f2502a.d() + iE2;
        do {
            k0Var.i(this.f2502a.t());
        } while (this.f2502a.d() < iD4);
    }

    @Override // androidx.health.platform.client.proto.w0
    public void B(List<Integer> list) throws IOException {
        int iD;
        int iD2;
        if (!(list instanceof e0)) {
            int iB = WireFormat.b(this.f2503b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2502a.E()));
                    if (this.f2502a.e()) {
                        return;
                    } else {
                        iD = this.f2502a.D();
                    }
                } while (iD == this.f2503b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD3 = this.f2502a.d() + this.f2502a.E();
            do {
                list.add(Integer.valueOf(this.f2502a.E()));
            } while (this.f2502a.d() < iD3);
            V(iD3);
            return;
        }
        e0 e0Var = (e0) list;
        int iB2 = WireFormat.b(this.f2503b);
        if (iB2 == 0) {
            do {
                e0Var.Q(this.f2502a.E());
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD2 = this.f2502a.D();
                }
            } while (iD2 == this.f2503b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD4 = this.f2502a.d() + this.f2502a.E();
        do {
            e0Var.Q(this.f2502a.E());
        } while (this.f2502a.d() < iD4);
        V(iD4);
    }

    @Override // androidx.health.platform.client.proto.w0
    public int C() throws IOException {
        W(5);
        return this.f2502a.s();
    }

    @Override // androidx.health.platform.client.proto.w0
    public long D() throws IOException {
        W(0);
        return this.f2502a.A();
    }

    @Override // androidx.health.platform.client.proto.w0
    public String E() throws IOException {
        W(2);
        return this.f2502a.B();
    }

    @Override // androidx.health.platform.client.proto.w0
    public int F() throws IOException {
        W(5);
        return this.f2502a.x();
    }

    @Override // androidx.health.platform.client.proto.w0
    public String G() throws IOException {
        W(2);
        return this.f2502a.C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.health.platform.client.proto.w0
    public <K, V> void H(Map<K, V> map, l0.a<K, V> aVar, y yVar) throws IOException {
        W(2);
        int iN = this.f2502a.n(this.f2502a.E());
        Object objR = aVar.f2517b;
        Object objR2 = aVar.d;
        while (true) {
            try {
                int iL = l();
                if (iL == Integer.MAX_VALUE || this.f2502a.e()) {
                    break;
                }
                if (iL == 1) {
                    objR = R(aVar.f2516a, null, null);
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
                    objR2 = R(aVar.c, aVar.d.getClass(), yVar);
                }
            } catch (Throwable th) {
                this.f2502a.m(iN);
                throw th;
            }
        }
        map.put(objR, objR2);
        this.f2502a.m(iN);
    }

    @Override // androidx.health.platform.client.proto.w0
    public <T> void I(T t, w1<T> w1Var, y yVar) throws IOException {
        W(2);
        Q(t, w1Var, yVar);
    }

    @Override // androidx.health.platform.client.proto.w0
    public <T> void J(T t, w1<T> w1Var, y yVar) throws IOException {
        W(3);
        P(t, w1Var, yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.health.platform.client.proto.w0
    @Deprecated
    public <T> void K(List<T> list, w1<T> w1Var, y yVar) throws IOException {
        int iD;
        if (WireFormat.b(this.f2503b) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f2503b;
        do {
            list.add(S(w1Var, yVar));
            if (this.f2502a.e() || this.d != 0) {
                return;
            } else {
                iD = this.f2502a.D();
            }
        } while (iD == i);
        this.d = iD;
    }

    @Override // androidx.health.platform.client.proto.w0
    public <T> T L(Class<T> cls, y yVar) throws IOException {
        W(2);
        return (T) T(vdi.a().c(cls), yVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.health.platform.client.proto.w0
    public <T> void M(List<T> list, w1<T> w1Var, y yVar) throws IOException {
        int iD;
        if (WireFormat.b(this.f2503b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f2503b;
        do {
            list.add(T(w1Var, yVar));
            if (this.f2502a.e() || this.d != 0) {
                return;
            } else {
                iD = this.f2502a.D();
            }
        } while (iD == i);
        this.d = iD;
    }

    @Override // androidx.health.platform.client.proto.w0
    @Deprecated
    public <T> T N(Class<T> cls, y yVar) throws IOException {
        W(3);
        return (T) S(vdi.a().c(cls), yVar);
    }

    public final <T> void P(T t, w1<T> w1Var, y yVar) throws IOException {
        int i = this.c;
        this.c = WireFormat.c(WireFormat.a(this.f2503b), 4);
        try {
            w1Var.h(t, this, yVar);
            if (this.f2503b != this.c) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.c = i;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    public final <T> void Q(T t, w1<T> w1Var, y yVar) throws IOException {
        int iE = this.f2502a.E();
        h hVar = this.f2502a;
        if (hVar.f2493a >= hVar.f2494b) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iN = hVar.n(iE);
        this.f2502a.f2493a++;
        w1Var.h(t, this, yVar);
        this.f2502a.a(0);
        h hVar2 = this.f2502a;
        hVar2.f2493a--;
        hVar2.m(iN);
    }

    public final Object R(WireFormat.FieldType fieldType, Class<?> cls, y yVar) throws IOException {
        switch (a.f2504a[fieldType.ordinal()]) {
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
                return L(cls, yVar);
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
                throw new IllegalArgumentException("unsupported field type.");
        }
    }

    public final <T> T S(w1<T> w1Var, y yVar) throws IOException {
        T tE = w1Var.e();
        P(tE, w1Var, yVar);
        w1Var.c(tE);
        return tE;
    }

    public final <T> T T(w1<T> w1Var, y yVar) throws IOException {
        T tE = w1Var.e();
        Q(tE, w1Var, yVar);
        w1Var.c(tE);
        return tE;
    }

    public void U(List<String> list, boolean z) throws IOException {
        int iD;
        int iD2;
        if (WireFormat.b(this.f2503b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof pee) || z) {
            do {
                list.add(z ? G() : E());
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD = this.f2502a.D();
                }
            } while (iD == this.f2503b);
            this.d = iD;
            return;
        }
        pee peeVar = (pee) list;
        do {
            peeVar.N(readBytes());
            if (this.f2502a.e()) {
                return;
            } else {
                iD2 = this.f2502a.D();
            }
        } while (iD2 == this.f2503b);
        this.d = iD2;
    }

    public final void V(int i) throws IOException {
        if (this.f2502a.d() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void W(int i) throws IOException {
        if (WireFormat.b(this.f2503b) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public final void X(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public final void Y(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // androidx.health.platform.client.proto.w0
    public void a(List<Long> list) throws IOException {
        int iD;
        int iD2;
        if (!(list instanceof k0)) {
            int iB = WireFormat.b(this.f2503b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f2502a.A()));
                    if (this.f2502a.e()) {
                        return;
                    } else {
                        iD = this.f2502a.D();
                    }
                } while (iD == this.f2503b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD3 = this.f2502a.d() + this.f2502a.E();
            do {
                list.add(Long.valueOf(this.f2502a.A()));
            } while (this.f2502a.d() < iD3);
            V(iD3);
            return;
        }
        k0 k0Var = (k0) list;
        int iB2 = WireFormat.b(this.f2503b);
        if (iB2 == 0) {
            do {
                k0Var.i(this.f2502a.A());
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD2 = this.f2502a.D();
                }
            } while (iD2 == this.f2503b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD4 = this.f2502a.d() + this.f2502a.E();
        do {
            k0Var.i(this.f2502a.A());
        } while (this.f2502a.d() < iD4);
        V(iD4);
    }

    @Override // androidx.health.platform.client.proto.w0
    public long b() throws IOException {
        W(1);
        return this.f2502a.y();
    }

    @Override // androidx.health.platform.client.proto.w0
    public int c() throws IOException {
        W(0);
        return this.f2502a.E();
    }

    @Override // androidx.health.platform.client.proto.w0
    public int d() throws IOException {
        W(0);
        return this.f2502a.r();
    }

    @Override // androidx.health.platform.client.proto.w0
    public int e() throws IOException {
        W(0);
        return this.f2502a.z();
    }

    @Override // androidx.health.platform.client.proto.w0
    public void f(List<Boolean> list) throws IOException {
        int iD;
        int iD2;
        if (!(list instanceof e)) {
            int iB = WireFormat.b(this.f2503b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f2502a.o()));
                    if (this.f2502a.e()) {
                        return;
                    } else {
                        iD = this.f2502a.D();
                    }
                } while (iD == this.f2503b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD3 = this.f2502a.d() + this.f2502a.E();
            do {
                list.add(Boolean.valueOf(this.f2502a.o()));
            } while (this.f2502a.d() < iD3);
            V(iD3);
            return;
        }
        e eVar = (e) list;
        int iB2 = WireFormat.b(this.f2503b);
        if (iB2 == 0) {
            do {
                eVar.p(this.f2502a.o());
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD2 = this.f2502a.D();
                }
            } while (iD2 == this.f2503b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD4 = this.f2502a.d() + this.f2502a.E();
        do {
            eVar.p(this.f2502a.o());
        } while (this.f2502a.d() < iD4);
        V(iD4);
    }

    @Override // androidx.health.platform.client.proto.w0
    public void g(List<Integer> list) throws IOException {
        int iD;
        int iD2;
        if (!(list instanceof e0)) {
            int iB = WireFormat.b(this.f2503b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2502a.z()));
                    if (this.f2502a.e()) {
                        return;
                    } else {
                        iD = this.f2502a.D();
                    }
                } while (iD == this.f2503b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD3 = this.f2502a.d() + this.f2502a.E();
            do {
                list.add(Integer.valueOf(this.f2502a.z()));
            } while (this.f2502a.d() < iD3);
            V(iD3);
            return;
        }
        e0 e0Var = (e0) list;
        int iB2 = WireFormat.b(this.f2503b);
        if (iB2 == 0) {
            do {
                e0Var.Q(this.f2502a.z());
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD2 = this.f2502a.D();
                }
            } while (iD2 == this.f2503b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD4 = this.f2502a.d() + this.f2502a.E();
        do {
            e0Var.Q(this.f2502a.z());
        } while (this.f2502a.d() < iD4);
        V(iD4);
    }

    @Override // androidx.health.platform.client.proto.w0
    public int getTag() {
        return this.f2503b;
    }

    @Override // androidx.health.platform.client.proto.w0
    public long h() throws IOException {
        W(0);
        return this.f2502a.F();
    }

    @Override // androidx.health.platform.client.proto.w0
    public void i(List<Long> list) throws IOException {
        int iD;
        int iD2;
        if (!(list instanceof k0)) {
            int iB = WireFormat.b(this.f2503b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f2502a.y()));
                    if (this.f2502a.e()) {
                        return;
                    } else {
                        iD = this.f2502a.D();
                    }
                } while (iD == this.f2503b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f2502a.E();
            Y(iE);
            int iD3 = this.f2502a.d() + iE;
            do {
                list.add(Long.valueOf(this.f2502a.y()));
            } while (this.f2502a.d() < iD3);
            return;
        }
        k0 k0Var = (k0) list;
        int iB2 = WireFormat.b(this.f2503b);
        if (iB2 == 1) {
            do {
                k0Var.i(this.f2502a.y());
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD2 = this.f2502a.D();
                }
            } while (iD2 == this.f2503b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f2502a.E();
        Y(iE2);
        int iD4 = this.f2502a.d() + iE2;
        do {
            k0Var.i(this.f2502a.y());
        } while (this.f2502a.d() < iD4);
    }

    @Override // androidx.health.platform.client.proto.w0
    public void j(List<Integer> list) throws IOException {
        int iD;
        int iD2;
        if (!(list instanceof e0)) {
            int iB = WireFormat.b(this.f2503b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2502a.v()));
                    if (this.f2502a.e()) {
                        return;
                    } else {
                        iD = this.f2502a.D();
                    }
                } while (iD == this.f2503b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD3 = this.f2502a.d() + this.f2502a.E();
            do {
                list.add(Integer.valueOf(this.f2502a.v()));
            } while (this.f2502a.d() < iD3);
            V(iD3);
            return;
        }
        e0 e0Var = (e0) list;
        int iB2 = WireFormat.b(this.f2503b);
        if (iB2 == 0) {
            do {
                e0Var.Q(this.f2502a.v());
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD2 = this.f2502a.D();
                }
            } while (iD2 == this.f2503b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD4 = this.f2502a.d() + this.f2502a.E();
        do {
            e0Var.Q(this.f2502a.v());
        } while (this.f2502a.d() < iD4);
        V(iD4);
    }

    @Override // androidx.health.platform.client.proto.w0
    public void k(List<Integer> list) throws IOException {
        int iD;
        int iD2;
        if (!(list instanceof e0)) {
            int iB = WireFormat.b(this.f2503b);
            if (iB == 2) {
                int iE = this.f2502a.E();
                X(iE);
                int iD3 = this.f2502a.d() + iE;
                do {
                    list.add(Integer.valueOf(this.f2502a.s()));
                } while (this.f2502a.d() < iD3);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f2502a.s()));
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD = this.f2502a.D();
                }
            } while (iD == this.f2503b);
            this.d = iD;
            return;
        }
        e0 e0Var = (e0) list;
        int iB2 = WireFormat.b(this.f2503b);
        if (iB2 == 2) {
            int iE2 = this.f2502a.E();
            X(iE2);
            int iD4 = this.f2502a.d() + iE2;
            do {
                e0Var.Q(this.f2502a.s());
            } while (this.f2502a.d() < iD4);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            e0Var.Q(this.f2502a.s());
            if (this.f2502a.e()) {
                return;
            } else {
                iD2 = this.f2502a.D();
            }
        } while (iD2 == this.f2503b);
        this.d = iD2;
    }

    @Override // androidx.health.platform.client.proto.w0
    public int l() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.f2503b = i;
            this.d = 0;
        } else {
            this.f2503b = this.f2502a.D();
        }
        int i2 = this.f2503b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.a(i2);
    }

    @Override // androidx.health.platform.client.proto.w0
    public void m(List<String> list) throws IOException {
        U(list, false);
    }

    @Override // androidx.health.platform.client.proto.w0
    public void n(List<Float> list) throws IOException {
        int iD;
        int iD2;
        if (!(list instanceof d0)) {
            int iB = WireFormat.b(this.f2503b);
            if (iB == 2) {
                int iE = this.f2502a.E();
                X(iE);
                int iD3 = this.f2502a.d() + iE;
                do {
                    list.add(Float.valueOf(this.f2502a.u()));
                } while (this.f2502a.d() < iD3);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.f2502a.u()));
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD = this.f2502a.D();
                }
            } while (iD == this.f2503b);
            this.d = iD;
            return;
        }
        d0 d0Var = (d0) list;
        int iB2 = WireFormat.b(this.f2503b);
        if (iB2 == 2) {
            int iE2 = this.f2502a.E();
            X(iE2);
            int iD4 = this.f2502a.d() + iE2;
            do {
                d0Var.J(this.f2502a.u());
            } while (this.f2502a.d() < iD4);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            d0Var.J(this.f2502a.u());
            if (this.f2502a.e()) {
                return;
            } else {
                iD2 = this.f2502a.D();
            }
        } while (iD2 == this.f2503b);
        this.d = iD2;
    }

    @Override // androidx.health.platform.client.proto.w0
    public boolean o() throws IOException {
        int i;
        if (this.f2502a.e() || (i = this.f2503b) == this.c) {
            return false;
        }
        return this.f2502a.G(i);
    }

    @Override // androidx.health.platform.client.proto.w0
    public void p(List<ByteString> list) throws IOException {
        int iD;
        if (WireFormat.b(this.f2503b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.f2502a.e()) {
                return;
            } else {
                iD = this.f2502a.D();
            }
        } while (iD == this.f2503b);
        this.d = iD;
    }

    @Override // androidx.health.platform.client.proto.w0
    public void q(List<Double> list) throws IOException {
        int iD;
        int iD2;
        if (!(list instanceof u)) {
            int iB = WireFormat.b(this.f2503b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f2502a.q()));
                    if (this.f2502a.e()) {
                        return;
                    } else {
                        iD = this.f2502a.D();
                    }
                } while (iD == this.f2503b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f2502a.E();
            Y(iE);
            int iD3 = this.f2502a.d() + iE;
            do {
                list.add(Double.valueOf(this.f2502a.q()));
            } while (this.f2502a.d() < iD3);
            return;
        }
        u uVar = (u) list;
        int iB2 = WireFormat.b(this.f2503b);
        if (iB2 == 1) {
            do {
                uVar.h(this.f2502a.q());
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD2 = this.f2502a.D();
                }
            } while (iD2 == this.f2503b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f2502a.E();
        Y(iE2);
        int iD4 = this.f2502a.d() + iE2;
        do {
            uVar.h(this.f2502a.q());
        } while (this.f2502a.d() < iD4);
    }

    @Override // androidx.health.platform.client.proto.w0
    public long r() throws IOException {
        W(0);
        return this.f2502a.w();
    }

    @Override // androidx.health.platform.client.proto.w0
    public ByteString readBytes() throws IOException {
        W(2);
        return this.f2502a.p();
    }

    @Override // androidx.health.platform.client.proto.w0
    public double readDouble() throws IOException {
        W(1);
        return this.f2502a.q();
    }

    @Override // androidx.health.platform.client.proto.w0
    public float readFloat() throws IOException {
        W(5);
        return this.f2502a.u();
    }

    @Override // androidx.health.platform.client.proto.w0
    public long s() throws IOException {
        W(1);
        return this.f2502a.t();
    }

    @Override // androidx.health.platform.client.proto.w0
    public void t(List<Integer> list) throws IOException {
        int iD;
        int iD2;
        if (!(list instanceof e0)) {
            int iB = WireFormat.b(this.f2503b);
            if (iB == 2) {
                int iE = this.f2502a.E();
                X(iE);
                int iD3 = this.f2502a.d() + iE;
                do {
                    list.add(Integer.valueOf(this.f2502a.x()));
                } while (this.f2502a.d() < iD3);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f2502a.x()));
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD = this.f2502a.D();
                }
            } while (iD == this.f2503b);
            this.d = iD;
            return;
        }
        e0 e0Var = (e0) list;
        int iB2 = WireFormat.b(this.f2503b);
        if (iB2 == 2) {
            int iE2 = this.f2502a.E();
            X(iE2);
            int iD4 = this.f2502a.d() + iE2;
            do {
                e0Var.Q(this.f2502a.x());
            } while (this.f2502a.d() < iD4);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            e0Var.Q(this.f2502a.x());
            if (this.f2502a.e()) {
                return;
            } else {
                iD2 = this.f2502a.D();
            }
        } while (iD2 == this.f2503b);
        this.d = iD2;
    }

    @Override // androidx.health.platform.client.proto.w0
    public boolean u() throws IOException {
        W(0);
        return this.f2502a.o();
    }

    @Override // androidx.health.platform.client.proto.w0
    public void v(List<Long> list) throws IOException {
        int iD;
        int iD2;
        if (!(list instanceof k0)) {
            int iB = WireFormat.b(this.f2503b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f2502a.F()));
                    if (this.f2502a.e()) {
                        return;
                    } else {
                        iD = this.f2502a.D();
                    }
                } while (iD == this.f2503b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD3 = this.f2502a.d() + this.f2502a.E();
            do {
                list.add(Long.valueOf(this.f2502a.F()));
            } while (this.f2502a.d() < iD3);
            V(iD3);
            return;
        }
        k0 k0Var = (k0) list;
        int iB2 = WireFormat.b(this.f2503b);
        if (iB2 == 0) {
            do {
                k0Var.i(this.f2502a.F());
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD2 = this.f2502a.D();
                }
            } while (iD2 == this.f2503b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD4 = this.f2502a.d() + this.f2502a.E();
        do {
            k0Var.i(this.f2502a.F());
        } while (this.f2502a.d() < iD4);
        V(iD4);
    }

    @Override // androidx.health.platform.client.proto.w0
    public void w(List<Long> list) throws IOException {
        int iD;
        int iD2;
        if (!(list instanceof k0)) {
            int iB = WireFormat.b(this.f2503b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f2502a.w()));
                    if (this.f2502a.e()) {
                        return;
                    } else {
                        iD = this.f2502a.D();
                    }
                } while (iD == this.f2503b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD3 = this.f2502a.d() + this.f2502a.E();
            do {
                list.add(Long.valueOf(this.f2502a.w()));
            } while (this.f2502a.d() < iD3);
            V(iD3);
            return;
        }
        k0 k0Var = (k0) list;
        int iB2 = WireFormat.b(this.f2503b);
        if (iB2 == 0) {
            do {
                k0Var.i(this.f2502a.w());
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD2 = this.f2502a.D();
                }
            } while (iD2 == this.f2503b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD4 = this.f2502a.d() + this.f2502a.E();
        do {
            k0Var.i(this.f2502a.w());
        } while (this.f2502a.d() < iD4);
        V(iD4);
    }

    @Override // androidx.health.platform.client.proto.w0
    public void x(List<Integer> list) throws IOException {
        int iD;
        int iD2;
        if (!(list instanceof e0)) {
            int iB = WireFormat.b(this.f2503b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2502a.r()));
                    if (this.f2502a.e()) {
                        return;
                    } else {
                        iD = this.f2502a.D();
                    }
                } while (iD == this.f2503b);
                this.d = iD;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD3 = this.f2502a.d() + this.f2502a.E();
            do {
                list.add(Integer.valueOf(this.f2502a.r()));
            } while (this.f2502a.d() < iD3);
            V(iD3);
            return;
        }
        e0 e0Var = (e0) list;
        int iB2 = WireFormat.b(this.f2503b);
        if (iB2 == 0) {
            do {
                e0Var.Q(this.f2502a.r());
                if (this.f2502a.e()) {
                    return;
                } else {
                    iD2 = this.f2502a.D();
                }
            } while (iD2 == this.f2503b);
            this.d = iD2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD4 = this.f2502a.d() + this.f2502a.E();
        do {
            e0Var.Q(this.f2502a.r());
        } while (this.f2502a.d() < iD4);
        V(iD4);
    }

    @Override // androidx.health.platform.client.proto.w0
    public void y(List<String> list) throws IOException {
        U(list, true);
    }

    @Override // androidx.health.platform.client.proto.w0
    public int z() throws IOException {
        W(0);
        return this.f2502a.v();
    }
}
