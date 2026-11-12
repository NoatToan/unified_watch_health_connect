package androidx.datastore.preferences.protobuf;

import defpackage.see;
import defpackage.ydi;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class h implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f2208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2209b;
    public int c;
    public int d = 0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2210a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f2210a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2210a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2210a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2210a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2210a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2210a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2210a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2210a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2210a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2210a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2210a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2210a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2210a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2210a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2210a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2210a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2210a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public h(g gVar) {
        g gVar2 = (g) s.b(gVar, "input");
        this.f2208a = gVar2;
        gVar2.d = this;
    }

    public static h O(g gVar) {
        h hVar = gVar.d;
        return hVar != null ? hVar : new h(gVar);
    }

    private Object P(WireFormat.FieldType fieldType, Class<?> cls, l lVar) throws IOException {
        switch (a.f2210a[fieldType.ordinal()]) {
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

    private <T> T Q(k0<T> k0Var, l lVar) throws IOException {
        int i = this.c;
        this.c = WireFormat.c(WireFormat.a(this.f2209b), 4);
        try {
            T tE = k0Var.e();
            k0Var.g(tE, this, lVar);
            k0Var.c(tE);
            if (this.f2209b != this.c) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.c = i;
            return tE;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    private <T> T R(k0<T> k0Var, l lVar) throws IOException {
        int iD = this.f2208a.D();
        g gVar = this.f2208a;
        if (gVar.f2200a >= gVar.f2201b) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iM = gVar.m(iD);
        T tE = k0Var.e();
        this.f2208a.f2200a++;
        k0Var.g(tE, this, lVar);
        k0Var.c(tE);
        this.f2208a.a(0);
        g gVar2 = this.f2208a;
        gVar2.f2200a--;
        gVar2.l(iM);
        return tE;
    }

    private void T(int i) throws IOException {
        if (this.f2208a.d() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void U(int i) throws IOException {
        if (WireFormat.b(this.f2209b) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    private void V(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    private void W(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void A(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = WireFormat.b(this.f2209b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f2208a.s()));
                    if (this.f2208a.e()) {
                        return;
                    } else {
                        iC = this.f2208a.C();
                    }
                } while (iC == this.f2209b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f2208a.D();
            W(iD);
            int iD2 = this.f2208a.d() + iD;
            do {
                list.add(Long.valueOf(this.f2208a.s()));
            } while (this.f2208a.d() < iD2);
            return;
        }
        x xVar = (x) list;
        int iB2 = WireFormat.b(this.f2209b);
        if (iB2 == 1) {
            do {
                xVar.i(this.f2208a.s());
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC2 = this.f2208a.C();
                }
            } while (iC2 == this.f2209b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD3 = this.f2208a.D();
        W(iD3);
        int iD4 = this.f2208a.d() + iD3;
        do {
            xVar.i(this.f2208a.s());
        } while (this.f2208a.d() < iD4);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void B(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof r)) {
            int iB = WireFormat.b(this.f2209b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2208a.D()));
                    if (this.f2208a.e()) {
                        return;
                    } else {
                        iC = this.f2208a.C();
                    }
                } while (iC == this.f2209b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f2208a.d() + this.f2208a.D();
            do {
                list.add(Integer.valueOf(this.f2208a.D()));
            } while (this.f2208a.d() < iD);
            T(iD);
            return;
        }
        r rVar = (r) list;
        int iB2 = WireFormat.b(this.f2209b);
        if (iB2 == 0) {
            do {
                rVar.Q(this.f2208a.D());
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC2 = this.f2208a.C();
                }
            } while (iC2 == this.f2209b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f2208a.d() + this.f2208a.D();
        do {
            rVar.Q(this.f2208a.D());
        } while (this.f2208a.d() < iD2);
        T(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public int C() throws IOException {
        U(5);
        return this.f2208a.r();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public long D() throws IOException {
        U(0);
        return this.f2208a.z();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public String E() throws IOException {
        U(2);
        return this.f2208a.A();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public int F() throws IOException {
        U(5);
        return this.f2208a.w();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public String G() throws IOException {
        U(2);
        return this.f2208a.B();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public <T> T H(k0<T> k0Var, l lVar) throws IOException {
        U(3);
        return (T) Q(k0Var, lVar);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public <T> T I(Class<T> cls, l lVar) throws IOException {
        U(2);
        return (T) R(ydi.a().d(cls), lVar);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public <T> T J(k0<T> k0Var, l lVar) throws IOException {
        U(2);
        return (T) R(k0Var, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.i0
    public <T> void K(List<T> list, k0<T> k0Var, l lVar) throws IOException {
        int iC;
        if (WireFormat.b(this.f2209b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f2209b;
        do {
            list.add(R(k0Var, lVar));
            if (this.f2208a.e() || this.d != 0) {
                return;
            } else {
                iC = this.f2208a.C();
            }
        } while (iC == i);
        this.d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public <T> T L(Class<T> cls, l lVar) throws IOException {
        U(3);
        return (T) Q(ydi.a().d(cls), lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.i0
    public <K, V> void M(Map<K, V> map, y.a<K, V> aVar, l lVar) throws IOException {
        U(2);
        int iM = this.f2208a.m(this.f2208a.D());
        Object objP = aVar.f2265b;
        Object objP2 = aVar.d;
        while (true) {
            try {
                int iL = l();
                if (iL == Integer.MAX_VALUE || this.f2208a.e()) {
                    break;
                }
                if (iL == 1) {
                    objP = P(aVar.f2264a, null, null);
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
                    objP2 = P(aVar.c, aVar.d.getClass(), lVar);
                }
            } catch (Throwable th) {
                this.f2208a.l(iM);
                throw th;
            }
        }
        map.put(objP, objP2);
        this.f2208a.l(iM);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.protobuf.i0
    public <T> void N(List<T> list, k0<T> k0Var, l lVar) throws IOException {
        int iC;
        if (WireFormat.b(this.f2209b) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f2209b;
        do {
            list.add(Q(k0Var, lVar));
            if (this.f2208a.e() || this.d != 0) {
                return;
            } else {
                iC = this.f2208a.C();
            }
        } while (iC == i);
        this.d = iC;
    }

    public void S(List<String> list, boolean z) throws IOException {
        int iC;
        int iC2;
        if (WireFormat.b(this.f2209b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof see) || z) {
            do {
                list.add(z ? G() : E());
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC = this.f2208a.C();
                }
            } while (iC == this.f2209b);
            this.d = iC;
            return;
        }
        see seeVar = (see) list;
        do {
            seeVar.y(readBytes());
            if (this.f2208a.e()) {
                return;
            } else {
                iC2 = this.f2208a.C();
            }
        } while (iC2 == this.f2209b);
        this.d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void a(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = WireFormat.b(this.f2209b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f2208a.z()));
                    if (this.f2208a.e()) {
                        return;
                    } else {
                        iC = this.f2208a.C();
                    }
                } while (iC == this.f2209b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f2208a.d() + this.f2208a.D();
            do {
                list.add(Long.valueOf(this.f2208a.z()));
            } while (this.f2208a.d() < iD);
            T(iD);
            return;
        }
        x xVar = (x) list;
        int iB2 = WireFormat.b(this.f2209b);
        if (iB2 == 0) {
            do {
                xVar.i(this.f2208a.z());
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC2 = this.f2208a.C();
                }
            } while (iC2 == this.f2209b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f2208a.d() + this.f2208a.D();
        do {
            xVar.i(this.f2208a.z());
        } while (this.f2208a.d() < iD2);
        T(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public long b() throws IOException {
        U(1);
        return this.f2208a.x();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public int c() throws IOException {
        U(0);
        return this.f2208a.D();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public int d() throws IOException {
        U(0);
        return this.f2208a.q();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public int e() throws IOException {
        U(0);
        return this.f2208a.y();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void f(List<Boolean> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof f)) {
            int iB = WireFormat.b(this.f2209b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f2208a.n()));
                    if (this.f2208a.e()) {
                        return;
                    } else {
                        iC = this.f2208a.C();
                    }
                } while (iC == this.f2209b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f2208a.d() + this.f2208a.D();
            do {
                list.add(Boolean.valueOf(this.f2208a.n()));
            } while (this.f2208a.d() < iD);
            T(iD);
            return;
        }
        f fVar = (f) list;
        int iB2 = WireFormat.b(this.f2209b);
        if (iB2 == 0) {
            do {
                fVar.p(this.f2208a.n());
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC2 = this.f2208a.C();
                }
            } while (iC2 == this.f2209b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f2208a.d() + this.f2208a.D();
        do {
            fVar.p(this.f2208a.n());
        } while (this.f2208a.d() < iD2);
        T(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void g(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof r)) {
            int iB = WireFormat.b(this.f2209b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2208a.y()));
                    if (this.f2208a.e()) {
                        return;
                    } else {
                        iC = this.f2208a.C();
                    }
                } while (iC == this.f2209b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f2208a.d() + this.f2208a.D();
            do {
                list.add(Integer.valueOf(this.f2208a.y()));
            } while (this.f2208a.d() < iD);
            T(iD);
            return;
        }
        r rVar = (r) list;
        int iB2 = WireFormat.b(this.f2209b);
        if (iB2 == 0) {
            do {
                rVar.Q(this.f2208a.y());
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC2 = this.f2208a.C();
                }
            } while (iC2 == this.f2209b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f2208a.d() + this.f2208a.D();
        do {
            rVar.Q(this.f2208a.y());
        } while (this.f2208a.d() < iD2);
        T(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public int getTag() {
        return this.f2209b;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public long h() throws IOException {
        U(0);
        return this.f2208a.E();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void i(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = WireFormat.b(this.f2209b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f2208a.x()));
                    if (this.f2208a.e()) {
                        return;
                    } else {
                        iC = this.f2208a.C();
                    }
                } while (iC == this.f2209b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f2208a.D();
            W(iD);
            int iD2 = this.f2208a.d() + iD;
            do {
                list.add(Long.valueOf(this.f2208a.x()));
            } while (this.f2208a.d() < iD2);
            return;
        }
        x xVar = (x) list;
        int iB2 = WireFormat.b(this.f2209b);
        if (iB2 == 1) {
            do {
                xVar.i(this.f2208a.x());
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC2 = this.f2208a.C();
                }
            } while (iC2 == this.f2209b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD3 = this.f2208a.D();
        W(iD3);
        int iD4 = this.f2208a.d() + iD3;
        do {
            xVar.i(this.f2208a.x());
        } while (this.f2208a.d() < iD4);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void j(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof r)) {
            int iB = WireFormat.b(this.f2209b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2208a.u()));
                    if (this.f2208a.e()) {
                        return;
                    } else {
                        iC = this.f2208a.C();
                    }
                } while (iC == this.f2209b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f2208a.d() + this.f2208a.D();
            do {
                list.add(Integer.valueOf(this.f2208a.u()));
            } while (this.f2208a.d() < iD);
            T(iD);
            return;
        }
        r rVar = (r) list;
        int iB2 = WireFormat.b(this.f2209b);
        if (iB2 == 0) {
            do {
                rVar.Q(this.f2208a.u());
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC2 = this.f2208a.C();
                }
            } while (iC2 == this.f2209b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f2208a.d() + this.f2208a.D();
        do {
            rVar.Q(this.f2208a.u());
        } while (this.f2208a.d() < iD2);
        T(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void k(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof r)) {
            int iB = WireFormat.b(this.f2209b);
            if (iB == 2) {
                int iD = this.f2208a.D();
                V(iD);
                int iD2 = this.f2208a.d() + iD;
                do {
                    list.add(Integer.valueOf(this.f2208a.r()));
                } while (this.f2208a.d() < iD2);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f2208a.r()));
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC = this.f2208a.C();
                }
            } while (iC == this.f2209b);
            this.d = iC;
            return;
        }
        r rVar = (r) list;
        int iB2 = WireFormat.b(this.f2209b);
        if (iB2 == 2) {
            int iD3 = this.f2208a.D();
            V(iD3);
            int iD4 = this.f2208a.d() + iD3;
            do {
                rVar.Q(this.f2208a.r());
            } while (this.f2208a.d() < iD4);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            rVar.Q(this.f2208a.r());
            if (this.f2208a.e()) {
                return;
            } else {
                iC2 = this.f2208a.C();
            }
        } while (iC2 == this.f2209b);
        this.d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public int l() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.f2209b = i;
            this.d = 0;
        } else {
            this.f2209b = this.f2208a.C();
        }
        int i2 = this.f2209b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.a(i2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void m(List<String> list) throws IOException {
        S(list, false);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void n(List<Float> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof q)) {
            int iB = WireFormat.b(this.f2209b);
            if (iB == 2) {
                int iD = this.f2208a.D();
                V(iD);
                int iD2 = this.f2208a.d() + iD;
                do {
                    list.add(Float.valueOf(this.f2208a.t()));
                } while (this.f2208a.d() < iD2);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.f2208a.t()));
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC = this.f2208a.C();
                }
            } while (iC == this.f2209b);
            this.d = iC;
            return;
        }
        q qVar = (q) list;
        int iB2 = WireFormat.b(this.f2209b);
        if (iB2 == 2) {
            int iD3 = this.f2208a.D();
            V(iD3);
            int iD4 = this.f2208a.d() + iD3;
            do {
                qVar.J(this.f2208a.t());
            } while (this.f2208a.d() < iD4);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            qVar.J(this.f2208a.t());
            if (this.f2208a.e()) {
                return;
            } else {
                iC2 = this.f2208a.C();
            }
        } while (iC2 == this.f2209b);
        this.d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public boolean o() throws IOException {
        int i;
        if (this.f2208a.e() || (i = this.f2209b) == this.c) {
            return false;
        }
        return this.f2208a.F(i);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void p(List<ByteString> list) throws IOException {
        int iC;
        if (WireFormat.b(this.f2209b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.f2208a.e()) {
                return;
            } else {
                iC = this.f2208a.C();
            }
        } while (iC == this.f2209b);
        this.d = iC;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void q(List<Double> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof j)) {
            int iB = WireFormat.b(this.f2209b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f2208a.p()));
                    if (this.f2208a.e()) {
                        return;
                    } else {
                        iC = this.f2208a.C();
                    }
                } while (iC == this.f2209b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f2208a.D();
            W(iD);
            int iD2 = this.f2208a.d() + iD;
            do {
                list.add(Double.valueOf(this.f2208a.p()));
            } while (this.f2208a.d() < iD2);
            return;
        }
        j jVar = (j) list;
        int iB2 = WireFormat.b(this.f2209b);
        if (iB2 == 1) {
            do {
                jVar.h(this.f2208a.p());
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC2 = this.f2208a.C();
                }
            } while (iC2 == this.f2209b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD3 = this.f2208a.D();
        W(iD3);
        int iD4 = this.f2208a.d() + iD3;
        do {
            jVar.h(this.f2208a.p());
        } while (this.f2208a.d() < iD4);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public long r() throws IOException {
        U(0);
        return this.f2208a.v();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public ByteString readBytes() throws IOException {
        U(2);
        return this.f2208a.o();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public double readDouble() throws IOException {
        U(1);
        return this.f2208a.p();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public float readFloat() throws IOException {
        U(5);
        return this.f2208a.t();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public long s() throws IOException {
        U(1);
        return this.f2208a.s();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void t(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof r)) {
            int iB = WireFormat.b(this.f2209b);
            if (iB == 2) {
                int iD = this.f2208a.D();
                V(iD);
                int iD2 = this.f2208a.d() + iD;
                do {
                    list.add(Integer.valueOf(this.f2208a.w()));
                } while (this.f2208a.d() < iD2);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f2208a.w()));
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC = this.f2208a.C();
                }
            } while (iC == this.f2209b);
            this.d = iC;
            return;
        }
        r rVar = (r) list;
        int iB2 = WireFormat.b(this.f2209b);
        if (iB2 == 2) {
            int iD3 = this.f2208a.D();
            V(iD3);
            int iD4 = this.f2208a.d() + iD3;
            do {
                rVar.Q(this.f2208a.w());
            } while (this.f2208a.d() < iD4);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            rVar.Q(this.f2208a.w());
            if (this.f2208a.e()) {
                return;
            } else {
                iC2 = this.f2208a.C();
            }
        } while (iC2 == this.f2209b);
        this.d = iC2;
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public boolean u() throws IOException {
        U(0);
        return this.f2208a.n();
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void v(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = WireFormat.b(this.f2209b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f2208a.E()));
                    if (this.f2208a.e()) {
                        return;
                    } else {
                        iC = this.f2208a.C();
                    }
                } while (iC == this.f2209b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f2208a.d() + this.f2208a.D();
            do {
                list.add(Long.valueOf(this.f2208a.E()));
            } while (this.f2208a.d() < iD);
            T(iD);
            return;
        }
        x xVar = (x) list;
        int iB2 = WireFormat.b(this.f2209b);
        if (iB2 == 0) {
            do {
                xVar.i(this.f2208a.E());
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC2 = this.f2208a.C();
                }
            } while (iC2 == this.f2209b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f2208a.d() + this.f2208a.D();
        do {
            xVar.i(this.f2208a.E());
        } while (this.f2208a.d() < iD2);
        T(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void w(List<Long> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof x)) {
            int iB = WireFormat.b(this.f2209b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f2208a.v()));
                    if (this.f2208a.e()) {
                        return;
                    } else {
                        iC = this.f2208a.C();
                    }
                } while (iC == this.f2209b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f2208a.d() + this.f2208a.D();
            do {
                list.add(Long.valueOf(this.f2208a.v()));
            } while (this.f2208a.d() < iD);
            T(iD);
            return;
        }
        x xVar = (x) list;
        int iB2 = WireFormat.b(this.f2209b);
        if (iB2 == 0) {
            do {
                xVar.i(this.f2208a.v());
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC2 = this.f2208a.C();
                }
            } while (iC2 == this.f2209b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f2208a.d() + this.f2208a.D();
        do {
            xVar.i(this.f2208a.v());
        } while (this.f2208a.d() < iD2);
        T(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void x(List<Integer> list) throws IOException {
        int iC;
        int iC2;
        if (!(list instanceof r)) {
            int iB = WireFormat.b(this.f2209b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f2208a.q()));
                    if (this.f2208a.e()) {
                        return;
                    } else {
                        iC = this.f2208a.C();
                    }
                } while (iC == this.f2209b);
                this.d = iC;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = this.f2208a.d() + this.f2208a.D();
            do {
                list.add(Integer.valueOf(this.f2208a.q()));
            } while (this.f2208a.d() < iD);
            T(iD);
            return;
        }
        r rVar = (r) list;
        int iB2 = WireFormat.b(this.f2209b);
        if (iB2 == 0) {
            do {
                rVar.Q(this.f2208a.q());
                if (this.f2208a.e()) {
                    return;
                } else {
                    iC2 = this.f2208a.C();
                }
            } while (iC2 == this.f2209b);
            this.d = iC2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = this.f2208a.d() + this.f2208a.D();
        do {
            rVar.Q(this.f2208a.q());
        } while (this.f2208a.d() < iD2);
        T(iD2);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public void y(List<String> list) throws IOException {
        S(list, true);
    }

    @Override // androidx.datastore.preferences.protobuf.i0
    public int z() throws IOException {
        U(0);
        return this.f2208a.u();
    }
}
