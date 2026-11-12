package com.google.protobuf;

import defpackage.ree;
import defpackage.xdi;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f9678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9679b;
    public int c;
    public int d = 0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9680a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f9680a = iArr;
            try {
                iArr[WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9680a[WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9680a[WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9680a[WireFormat.FieldType.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9680a[WireFormat.FieldType.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9680a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9680a[WireFormat.FieldType.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9680a[WireFormat.FieldType.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9680a[WireFormat.FieldType.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9680a[WireFormat.FieldType.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9680a[WireFormat.FieldType.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9680a[WireFormat.FieldType.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9680a[WireFormat.FieldType.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9680a[WireFormat.FieldType.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9680a[WireFormat.FieldType.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9680a[WireFormat.FieldType.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9680a[WireFormat.FieldType.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public k(j jVar) {
        j jVar2 = (j) d0.b(jVar, "input");
        this.f9678a = jVar2;
        jVar2.d = this;
    }

    public static k P(j jVar) {
        k kVar = jVar.d;
        return kVar != null ? kVar : new k(jVar);
    }

    private Object Q(WireFormat.FieldType fieldType, Class<?> cls, t tVar) throws IOException {
        switch (a.f9680a[fieldType.ordinal()]) {
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

    private <T> T R(e1<T> e1Var, t tVar) throws IOException {
        int i = this.c;
        this.c = WireFormat.c(WireFormat.a(this.f9679b), 4);
        try {
            T tE = e1Var.e();
            e1Var.h(tE, this, tVar);
            e1Var.c(tE);
            if (this.f9679b != this.c) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.c = i;
            return tE;
        } catch (Throwable th) {
            this.c = i;
            throw th;
        }
    }

    private <T> T S(e1<T> e1Var, t tVar) throws IOException {
        int iK = this.f9678a.K();
        j jVar = this.f9678a;
        if (jVar.f9666a >= jVar.f9667b) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iO = jVar.o(iK);
        T tE = e1Var.e();
        this.f9678a.f9666a++;
        e1Var.h(tE, this, tVar);
        e1Var.c(tE);
        this.f9678a.a(0);
        j jVar2 = this.f9678a;
        jVar2.f9666a--;
        jVar2.n(iO);
        return tE;
    }

    private void U(int i) throws IOException {
        if (this.f9678a.e() != i) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    private void V(int i) throws IOException {
        if (WireFormat.b(this.f9679b) != i) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    private void W(int i) throws IOException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    private void X(int i) throws IOException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    @Override // com.google.protobuf.a1
    public void A(List<Long> list) throws IOException {
        int iJ;
        int iJ2;
        if (!(list instanceof i0)) {
            int iB = WireFormat.b(this.f9679b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f9678a.u()));
                    if (this.f9678a.f()) {
                        return;
                    } else {
                        iJ = this.f9678a.J();
                    }
                } while (iJ == this.f9679b);
                this.d = iJ;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iK = this.f9678a.K();
            X(iK);
            int iE = this.f9678a.e() + iK;
            do {
                list.add(Long.valueOf(this.f9678a.u()));
            } while (this.f9678a.e() < iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = WireFormat.b(this.f9679b);
        if (iB2 == 1) {
            do {
                i0Var.i(this.f9678a.u());
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ2 = this.f9678a.J();
                }
            } while (iJ2 == this.f9679b);
            this.d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iK2 = this.f9678a.K();
        X(iK2);
        int iE2 = this.f9678a.e() + iK2;
        do {
            i0Var.i(this.f9678a.u());
        } while (this.f9678a.e() < iE2);
    }

    @Override // com.google.protobuf.a1
    public void B(List<Integer> list) throws IOException {
        int iJ;
        int iJ2;
        if (!(list instanceof c0)) {
            int iB = WireFormat.b(this.f9679b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f9678a.K()));
                    if (this.f9678a.f()) {
                        return;
                    } else {
                        iJ = this.f9678a.J();
                    }
                } while (iJ == this.f9679b);
                this.d = iJ;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f9678a.e() + this.f9678a.K();
            do {
                list.add(Integer.valueOf(this.f9678a.K()));
            } while (this.f9678a.e() < iE);
            U(iE);
            return;
        }
        c0 c0Var = (c0) list;
        int iB2 = WireFormat.b(this.f9679b);
        if (iB2 == 0) {
            do {
                c0Var.Q(this.f9678a.K());
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ2 = this.f9678a.J();
                }
            } while (iJ2 == this.f9679b);
            this.d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f9678a.e() + this.f9678a.K();
        do {
            c0Var.Q(this.f9678a.K());
        } while (this.f9678a.e() < iE2);
        U(iE2);
    }

    @Override // com.google.protobuf.a1
    public int C() throws IOException {
        V(5);
        return this.f9678a.t();
    }

    @Override // com.google.protobuf.a1
    public long D() throws IOException {
        V(0);
        return this.f9678a.G();
    }

    @Override // com.google.protobuf.a1
    public String E() throws IOException {
        V(2);
        return this.f9678a.H();
    }

    @Override // com.google.protobuf.a1
    public int F() throws IOException {
        V(5);
        return this.f9678a.D();
    }

    @Override // com.google.protobuf.a1
    public String G() throws IOException {
        V(2);
        return this.f9678a.I();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.a1
    public <K, V> void H(Map<K, V> map, k0.b<K, V> bVar, t tVar) throws IOException {
        V(2);
        int iO = this.f9678a.o(this.f9678a.K());
        Object objQ = bVar.f9684b;
        Object objQ2 = bVar.d;
        while (true) {
            try {
                int iL = l();
                if (iL == Integer.MAX_VALUE || this.f9678a.f()) {
                    break;
                }
                if (iL == 1) {
                    objQ = Q(bVar.f9683a, null, null);
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
                    objQ2 = Q(bVar.c, bVar.d.getClass(), tVar);
                }
            } catch (Throwable th) {
                this.f9678a.n(iO);
                throw th;
            }
        }
        map.put(objQ, objQ2);
        this.f9678a.n(iO);
    }

    @Override // com.google.protobuf.a1
    public <T> T I(e1<T> e1Var, t tVar) throws IOException {
        V(3);
        return (T) R(e1Var, tVar);
    }

    @Override // com.google.protobuf.a1
    public boolean J() {
        return this.f9678a.M();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.a1
    public <T> void K(List<T> list, e1<T> e1Var, t tVar) throws IOException {
        int iJ;
        if (WireFormat.b(this.f9679b) != 3) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f9679b;
        do {
            list.add(R(e1Var, tVar));
            if (this.f9678a.f() || this.d != 0) {
                return;
            } else {
                iJ = this.f9678a.J();
            }
        } while (iJ == i);
        this.d = iJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.protobuf.a1
    public <T> void L(List<T> list, e1<T> e1Var, t tVar) throws IOException {
        int iJ;
        if (WireFormat.b(this.f9679b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int i = this.f9679b;
        do {
            list.add(S(e1Var, tVar));
            if (this.f9678a.f() || this.d != 0) {
                return;
            } else {
                iJ = this.f9678a.J();
            }
        } while (iJ == i);
        this.d = iJ;
    }

    @Override // com.google.protobuf.a1
    public <T> T M(Class<T> cls, t tVar) throws IOException {
        V(3);
        return (T) R(xdi.a().d(cls), tVar);
    }

    @Override // com.google.protobuf.a1
    public <T> T N(Class<T> cls, t tVar) throws IOException {
        V(2);
        return (T) S(xdi.a().d(cls), tVar);
    }

    @Override // com.google.protobuf.a1
    public <T> T O(e1<T> e1Var, t tVar) throws IOException {
        V(2);
        return (T) S(e1Var, tVar);
    }

    public void T(List<String> list, boolean z) throws IOException {
        int iJ;
        int iJ2;
        if (WireFormat.b(this.f9679b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        if (!(list instanceof ree) || z) {
            do {
                list.add(z ? G() : E());
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ = this.f9678a.J();
                }
            } while (iJ == this.f9679b);
            this.d = iJ;
            return;
        }
        ree reeVar = (ree) list;
        do {
            reeVar.n(readBytes());
            if (this.f9678a.f()) {
                return;
            } else {
                iJ2 = this.f9678a.J();
            }
        } while (iJ2 == this.f9679b);
        this.d = iJ2;
    }

    @Override // com.google.protobuf.a1
    public void a(List<Long> list) throws IOException {
        int iJ;
        int iJ2;
        if (!(list instanceof i0)) {
            int iB = WireFormat.b(this.f9679b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f9678a.G()));
                    if (this.f9678a.f()) {
                        return;
                    } else {
                        iJ = this.f9678a.J();
                    }
                } while (iJ == this.f9679b);
                this.d = iJ;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f9678a.e() + this.f9678a.K();
            do {
                list.add(Long.valueOf(this.f9678a.G()));
            } while (this.f9678a.e() < iE);
            U(iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = WireFormat.b(this.f9679b);
        if (iB2 == 0) {
            do {
                i0Var.i(this.f9678a.G());
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ2 = this.f9678a.J();
                }
            } while (iJ2 == this.f9679b);
            this.d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f9678a.e() + this.f9678a.K();
        do {
            i0Var.i(this.f9678a.G());
        } while (this.f9678a.e() < iE2);
        U(iE2);
    }

    @Override // com.google.protobuf.a1
    public long b() throws IOException {
        V(1);
        return this.f9678a.E();
    }

    @Override // com.google.protobuf.a1
    public int c() throws IOException {
        V(0);
        return this.f9678a.K();
    }

    @Override // com.google.protobuf.a1
    public int d() throws IOException {
        V(0);
        return this.f9678a.s();
    }

    @Override // com.google.protobuf.a1
    public int e() throws IOException {
        V(0);
        return this.f9678a.F();
    }

    @Override // com.google.protobuf.a1
    public void f(List<Boolean> list) throws IOException {
        int iJ;
        int iJ2;
        if (!(list instanceof i)) {
            int iB = WireFormat.b(this.f9679b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f9678a.p()));
                    if (this.f9678a.f()) {
                        return;
                    } else {
                        iJ = this.f9678a.J();
                    }
                } while (iJ == this.f9679b);
                this.d = iJ;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f9678a.e() + this.f9678a.K();
            do {
                list.add(Boolean.valueOf(this.f9678a.p()));
            } while (this.f9678a.e() < iE);
            U(iE);
            return;
        }
        i iVar = (i) list;
        int iB2 = WireFormat.b(this.f9679b);
        if (iB2 == 0) {
            do {
                iVar.p(this.f9678a.p());
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ2 = this.f9678a.J();
                }
            } while (iJ2 == this.f9679b);
            this.d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f9678a.e() + this.f9678a.K();
        do {
            iVar.p(this.f9678a.p());
        } while (this.f9678a.e() < iE2);
        U(iE2);
    }

    @Override // com.google.protobuf.a1
    public void g(List<Integer> list) throws IOException {
        int iJ;
        int iJ2;
        if (!(list instanceof c0)) {
            int iB = WireFormat.b(this.f9679b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f9678a.F()));
                    if (this.f9678a.f()) {
                        return;
                    } else {
                        iJ = this.f9678a.J();
                    }
                } while (iJ == this.f9679b);
                this.d = iJ;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f9678a.e() + this.f9678a.K();
            do {
                list.add(Integer.valueOf(this.f9678a.F()));
            } while (this.f9678a.e() < iE);
            U(iE);
            return;
        }
        c0 c0Var = (c0) list;
        int iB2 = WireFormat.b(this.f9679b);
        if (iB2 == 0) {
            do {
                c0Var.Q(this.f9678a.F());
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ2 = this.f9678a.J();
                }
            } while (iJ2 == this.f9679b);
            this.d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f9678a.e() + this.f9678a.K();
        do {
            c0Var.Q(this.f9678a.F());
        } while (this.f9678a.e() < iE2);
        U(iE2);
    }

    @Override // com.google.protobuf.a1
    public int getTag() {
        return this.f9679b;
    }

    @Override // com.google.protobuf.a1
    public long h() throws IOException {
        V(0);
        return this.f9678a.L();
    }

    @Override // com.google.protobuf.a1
    public void i(List<Long> list) throws IOException {
        int iJ;
        int iJ2;
        if (!(list instanceof i0)) {
            int iB = WireFormat.b(this.f9679b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f9678a.E()));
                    if (this.f9678a.f()) {
                        return;
                    } else {
                        iJ = this.f9678a.J();
                    }
                } while (iJ == this.f9679b);
                this.d = iJ;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iK = this.f9678a.K();
            X(iK);
            int iE = this.f9678a.e() + iK;
            do {
                list.add(Long.valueOf(this.f9678a.E()));
            } while (this.f9678a.e() < iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = WireFormat.b(this.f9679b);
        if (iB2 == 1) {
            do {
                i0Var.i(this.f9678a.E());
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ2 = this.f9678a.J();
                }
            } while (iJ2 == this.f9679b);
            this.d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iK2 = this.f9678a.K();
        X(iK2);
        int iE2 = this.f9678a.e() + iK2;
        do {
            i0Var.i(this.f9678a.E());
        } while (this.f9678a.e() < iE2);
    }

    @Override // com.google.protobuf.a1
    public void j(List<Integer> list) throws IOException {
        int iJ;
        int iJ2;
        if (!(list instanceof c0)) {
            int iB = WireFormat.b(this.f9679b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f9678a.x()));
                    if (this.f9678a.f()) {
                        return;
                    } else {
                        iJ = this.f9678a.J();
                    }
                } while (iJ == this.f9679b);
                this.d = iJ;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f9678a.e() + this.f9678a.K();
            do {
                list.add(Integer.valueOf(this.f9678a.x()));
            } while (this.f9678a.e() < iE);
            U(iE);
            return;
        }
        c0 c0Var = (c0) list;
        int iB2 = WireFormat.b(this.f9679b);
        if (iB2 == 0) {
            do {
                c0Var.Q(this.f9678a.x());
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ2 = this.f9678a.J();
                }
            } while (iJ2 == this.f9679b);
            this.d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f9678a.e() + this.f9678a.K();
        do {
            c0Var.Q(this.f9678a.x());
        } while (this.f9678a.e() < iE2);
        U(iE2);
    }

    @Override // com.google.protobuf.a1
    public void k(List<Integer> list) throws IOException {
        int iJ;
        int iJ2;
        if (!(list instanceof c0)) {
            int iB = WireFormat.b(this.f9679b);
            if (iB == 2) {
                int iK = this.f9678a.K();
                W(iK);
                int iE = this.f9678a.e() + iK;
                do {
                    list.add(Integer.valueOf(this.f9678a.t()));
                } while (this.f9678a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f9678a.t()));
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ = this.f9678a.J();
                }
            } while (iJ == this.f9679b);
            this.d = iJ;
            return;
        }
        c0 c0Var = (c0) list;
        int iB2 = WireFormat.b(this.f9679b);
        if (iB2 == 2) {
            int iK2 = this.f9678a.K();
            W(iK2);
            int iE2 = this.f9678a.e() + iK2;
            do {
                c0Var.Q(this.f9678a.t());
            } while (this.f9678a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c0Var.Q(this.f9678a.t());
            if (this.f9678a.f()) {
                return;
            } else {
                iJ2 = this.f9678a.J();
            }
        } while (iJ2 == this.f9679b);
        this.d = iJ2;
    }

    @Override // com.google.protobuf.a1
    public int l() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.f9679b = i;
            this.d = 0;
        } else {
            this.f9679b = this.f9678a.J();
        }
        int i2 = this.f9679b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return WireFormat.a(i2);
    }

    @Override // com.google.protobuf.a1
    public void m(List<String> list) throws IOException {
        T(list, false);
    }

    @Override // com.google.protobuf.a1
    public void n(List<Float> list) throws IOException {
        int iJ;
        int iJ2;
        if (!(list instanceof b0)) {
            int iB = WireFormat.b(this.f9679b);
            if (iB == 2) {
                int iK = this.f9678a.K();
                W(iK);
                int iE = this.f9678a.e() + iK;
                do {
                    list.add(Float.valueOf(this.f9678a.v()));
                } while (this.f9678a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(this.f9678a.v()));
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ = this.f9678a.J();
                }
            } while (iJ == this.f9679b);
            this.d = iJ;
            return;
        }
        b0 b0Var = (b0) list;
        int iB2 = WireFormat.b(this.f9679b);
        if (iB2 == 2) {
            int iK2 = this.f9678a.K();
            W(iK2);
            int iE2 = this.f9678a.e() + iK2;
            do {
                b0Var.J(this.f9678a.v());
            } while (this.f9678a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            b0Var.J(this.f9678a.v());
            if (this.f9678a.f()) {
                return;
            } else {
                iJ2 = this.f9678a.J();
            }
        } while (iJ2 == this.f9679b);
        this.d = iJ2;
    }

    @Override // com.google.protobuf.a1
    public boolean o() throws IOException {
        int i;
        if (this.f9678a.f() || (i = this.f9679b) == this.c) {
            return false;
        }
        return this.f9678a.N(i);
    }

    @Override // com.google.protobuf.a1
    public void p(List<ByteString> list) throws IOException {
        int iJ;
        if (WireFormat.b(this.f9679b) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(readBytes());
            if (this.f9678a.f()) {
                return;
            } else {
                iJ = this.f9678a.J();
            }
        } while (iJ == this.f9679b);
        this.d = iJ;
    }

    @Override // com.google.protobuf.a1
    public void q(List<Double> list) throws IOException {
        int iJ;
        int iJ2;
        if (!(list instanceof n)) {
            int iB = WireFormat.b(this.f9679b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f9678a.r()));
                    if (this.f9678a.f()) {
                        return;
                    } else {
                        iJ = this.f9678a.J();
                    }
                } while (iJ == this.f9679b);
                this.d = iJ;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iK = this.f9678a.K();
            X(iK);
            int iE = this.f9678a.e() + iK;
            do {
                list.add(Double.valueOf(this.f9678a.r()));
            } while (this.f9678a.e() < iE);
            return;
        }
        n nVar = (n) list;
        int iB2 = WireFormat.b(this.f9679b);
        if (iB2 == 1) {
            do {
                nVar.h(this.f9678a.r());
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ2 = this.f9678a.J();
                }
            } while (iJ2 == this.f9679b);
            this.d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iK2 = this.f9678a.K();
        X(iK2);
        int iE2 = this.f9678a.e() + iK2;
        do {
            nVar.h(this.f9678a.r());
        } while (this.f9678a.e() < iE2);
    }

    @Override // com.google.protobuf.a1
    public long r() throws IOException {
        V(0);
        return this.f9678a.y();
    }

    @Override // com.google.protobuf.a1
    public ByteString readBytes() throws IOException {
        V(2);
        return this.f9678a.q();
    }

    @Override // com.google.protobuf.a1
    public double readDouble() throws IOException {
        V(1);
        return this.f9678a.r();
    }

    @Override // com.google.protobuf.a1
    public float readFloat() throws IOException {
        V(5);
        return this.f9678a.v();
    }

    @Override // com.google.protobuf.a1
    public long s() throws IOException {
        V(1);
        return this.f9678a.u();
    }

    @Override // com.google.protobuf.a1
    public void t(List<Integer> list) throws IOException {
        int iJ;
        int iJ2;
        if (!(list instanceof c0)) {
            int iB = WireFormat.b(this.f9679b);
            if (iB == 2) {
                int iK = this.f9678a.K();
                W(iK);
                int iE = this.f9678a.e() + iK;
                do {
                    list.add(Integer.valueOf(this.f9678a.D()));
                } while (this.f9678a.e() < iE);
                return;
            }
            if (iB != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(this.f9678a.D()));
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ = this.f9678a.J();
                }
            } while (iJ == this.f9679b);
            this.d = iJ;
            return;
        }
        c0 c0Var = (c0) list;
        int iB2 = WireFormat.b(this.f9679b);
        if (iB2 == 2) {
            int iK2 = this.f9678a.K();
            W(iK2);
            int iE2 = this.f9678a.e() + iK2;
            do {
                c0Var.Q(this.f9678a.D());
            } while (this.f9678a.e() < iE2);
            return;
        }
        if (iB2 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            c0Var.Q(this.f9678a.D());
            if (this.f9678a.f()) {
                return;
            } else {
                iJ2 = this.f9678a.J();
            }
        } while (iJ2 == this.f9679b);
        this.d = iJ2;
    }

    @Override // com.google.protobuf.a1
    public boolean u() throws IOException {
        V(0);
        return this.f9678a.p();
    }

    @Override // com.google.protobuf.a1
    public void v(List<Long> list) throws IOException {
        int iJ;
        int iJ2;
        if (!(list instanceof i0)) {
            int iB = WireFormat.b(this.f9679b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f9678a.L()));
                    if (this.f9678a.f()) {
                        return;
                    } else {
                        iJ = this.f9678a.J();
                    }
                } while (iJ == this.f9679b);
                this.d = iJ;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f9678a.e() + this.f9678a.K();
            do {
                list.add(Long.valueOf(this.f9678a.L()));
            } while (this.f9678a.e() < iE);
            U(iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = WireFormat.b(this.f9679b);
        if (iB2 == 0) {
            do {
                i0Var.i(this.f9678a.L());
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ2 = this.f9678a.J();
                }
            } while (iJ2 == this.f9679b);
            this.d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f9678a.e() + this.f9678a.K();
        do {
            i0Var.i(this.f9678a.L());
        } while (this.f9678a.e() < iE2);
        U(iE2);
    }

    @Override // com.google.protobuf.a1
    public void w(List<Long> list) throws IOException {
        int iJ;
        int iJ2;
        if (!(list instanceof i0)) {
            int iB = WireFormat.b(this.f9679b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f9678a.y()));
                    if (this.f9678a.f()) {
                        return;
                    } else {
                        iJ = this.f9678a.J();
                    }
                } while (iJ == this.f9679b);
                this.d = iJ;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f9678a.e() + this.f9678a.K();
            do {
                list.add(Long.valueOf(this.f9678a.y()));
            } while (this.f9678a.e() < iE);
            U(iE);
            return;
        }
        i0 i0Var = (i0) list;
        int iB2 = WireFormat.b(this.f9679b);
        if (iB2 == 0) {
            do {
                i0Var.i(this.f9678a.y());
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ2 = this.f9678a.J();
                }
            } while (iJ2 == this.f9679b);
            this.d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f9678a.e() + this.f9678a.K();
        do {
            i0Var.i(this.f9678a.y());
        } while (this.f9678a.e() < iE2);
        U(iE2);
    }

    @Override // com.google.protobuf.a1
    public void x(List<Integer> list) throws IOException {
        int iJ;
        int iJ2;
        if (!(list instanceof c0)) {
            int iB = WireFormat.b(this.f9679b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f9678a.s()));
                    if (this.f9678a.f()) {
                        return;
                    } else {
                        iJ = this.f9678a.J();
                    }
                } while (iJ == this.f9679b);
                this.d = iJ;
                return;
            }
            if (iB != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iE = this.f9678a.e() + this.f9678a.K();
            do {
                list.add(Integer.valueOf(this.f9678a.s()));
            } while (this.f9678a.e() < iE);
            U(iE);
            return;
        }
        c0 c0Var = (c0) list;
        int iB2 = WireFormat.b(this.f9679b);
        if (iB2 == 0) {
            do {
                c0Var.Q(this.f9678a.s());
                if (this.f9678a.f()) {
                    return;
                } else {
                    iJ2 = this.f9678a.J();
                }
            } while (iJ2 == this.f9679b);
            this.d = iJ2;
            return;
        }
        if (iB2 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iE2 = this.f9678a.e() + this.f9678a.K();
        do {
            c0Var.Q(this.f9678a.s());
        } while (this.f9678a.e() < iE2);
        U(iE2);
    }

    @Override // com.google.protobuf.a1
    public void y(List<String> list) throws IOException {
        T(list, true);
    }

    @Override // com.google.protobuf.a1
    public int z() throws IOException {
        V(0);
        return this.f9678a.x();
    }
}
