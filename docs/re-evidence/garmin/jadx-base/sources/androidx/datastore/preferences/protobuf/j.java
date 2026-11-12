package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class j implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f6743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6746d = 0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6747a;

        static {
            int[] iArr = new int[s1.values().length];
            f6747a = iArr;
            try {
                iArr[s1.f6833j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6747a[s1.f6837n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6747a[s1.f6826c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6747a[s1.f6839p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6747a[s1.f6832i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6747a[s1.f6831h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6747a[s1.f6827d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6747a[s1.f6830g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6747a[s1.f6828e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6747a[s1.f6836m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6747a[s1.f6840q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6747a[s1.f6841r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6747a[s1.f6842t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6747a[s1.f6843v.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6747a[s1.f6834k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6747a[s1.f6838o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6747a[s1.f6829f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private j(i iVar) {
        z.a(iVar, "input");
        this.f6743a = iVar;
        iVar.f6723d = this;
    }

    public static void A(int i14) throws InvalidProtocolBufferException {
        if ((i14 & 3) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public static void B(int i14) throws InvalidProtocolBufferException {
        if ((i14 & 7) != 0) {
            throw InvalidProtocolBufferException.parseFailure();
        }
    }

    public static j a(i iVar) {
        j jVar = iVar.f6723d;
        return jVar != null ? jVar : new j(iVar);
    }

    public final int b() {
        int i14 = this.f6746d;
        if (i14 != 0) {
            this.f6744b = i14;
            this.f6746d = 0;
        } else {
            this.f6744b = this.f6743a.v();
        }
        int i15 = this.f6744b;
        if (i15 == 0 || i15 == this.f6745c) {
            return Integer.MAX_VALUE;
        }
        return i15 >>> 3;
    }

    public final <T> void c(T t7, g1<T> g1Var, o oVar) {
        int i14 = this.f6745c;
        this.f6745c = ((this.f6744b >>> 3) << 3) | 4;
        try {
            g1Var.b(t7, this, oVar);
            if (this.f6744b != this.f6745c) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.f6745c = i14;
        } catch (Throwable th3) {
            this.f6745c = i14;
            throw th3;
        }
    }

    public final <T> void d(T t7, g1<T> g1Var, o oVar) throws InvalidProtocolBufferException {
        i iVar = this.f6743a;
        int iW = iVar.w();
        if (iVar.f6720a >= iVar.f6721b) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iF = iVar.f(iW);
        iVar.f6720a++;
        g1Var.b(t7, this, oVar);
        iVar.a(0);
        iVar.f6720a--;
        iVar.e(iF);
    }

    public final void e(List<Boolean> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z14 = list instanceof e;
        int i14 = this.f6744b;
        i iVar = this.f6743a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Boolean.valueOf(iVar.g()));
                    if (iVar.c()) {
                        return;
                    } else {
                        iV = iVar.v();
                    }
                } while (iV == this.f6744b);
                this.f6746d = iV;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iB = iVar.b() + iVar.w();
            do {
                list.add(Boolean.valueOf(iVar.g()));
            } while (iVar.b() < iB);
            x(iB);
            return;
        }
        e eVar = (e) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                eVar.addBoolean(iVar.g());
                if (iVar.c()) {
                    return;
                } else {
                    iV2 = iVar.v();
                }
            } while (iV2 == this.f6744b);
            this.f6746d = iV2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iB2 = iVar.b() + iVar.w();
        do {
            eVar.addBoolean(iVar.g());
        } while (iVar.b() < iB2);
        x(iB2);
    }

    public final h f() throws InvalidProtocolBufferException.InvalidWireTypeException {
        y(2);
        return this.f6743a.h();
    }

    public final void g(List<h> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iV;
        if ((this.f6744b & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(f());
            i iVar = this.f6743a;
            if (iVar.c()) {
                return;
            } else {
                iV = iVar.v();
            }
        } while (iV == this.f6744b);
        this.f6746d = iV;
    }

    public final void h(List<Double> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z14 = list instanceof l;
        int i14 = this.f6744b;
        i iVar = this.f6743a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 1) {
                do {
                    list.add(Double.valueOf(iVar.i()));
                    if (iVar.c()) {
                        return;
                    } else {
                        iV = iVar.v();
                    }
                } while (iV == this.f6744b);
                this.f6746d = iV;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iW = iVar.w();
            B(iW);
            int iB = iVar.b() + iW;
            do {
                list.add(Double.valueOf(iVar.i()));
            } while (iVar.b() < iB);
            return;
        }
        l lVar = (l) list;
        int i16 = i14 & 7;
        if (i16 == 1) {
            do {
                lVar.addDouble(iVar.i());
                if (iVar.c()) {
                    return;
                } else {
                    iV2 = iVar.v();
                }
            } while (iV2 == this.f6744b);
            this.f6746d = iV2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iW2 = iVar.w();
        B(iW2);
        int iB2 = iVar.b() + iW2;
        do {
            lVar.addDouble(iVar.i());
        } while (iVar.b() < iB2);
    }

    public final void i(List<Integer> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z14 = list instanceof y;
        int i14 = this.f6744b;
        i iVar = this.f6743a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Integer.valueOf(iVar.j()));
                    if (iVar.c()) {
                        return;
                    } else {
                        iV = iVar.v();
                    }
                } while (iV == this.f6744b);
                this.f6746d = iV;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iB = iVar.b() + iVar.w();
            do {
                list.add(Integer.valueOf(iVar.j()));
            } while (iVar.b() < iB);
            x(iB);
            return;
        }
        y yVar = (y) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                yVar.addInt(iVar.j());
                if (iVar.c()) {
                    return;
                } else {
                    iV2 = iVar.v();
                }
            } while (iV2 == this.f6744b);
            this.f6746d = iV2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iB2 = iVar.b() + iVar.w();
        do {
            yVar.addInt(iVar.j());
        } while (iVar.b() < iB2);
        x(iB2);
    }

    public final Object j(s1 s1Var, Class<?> cls, o oVar) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i14 = a.f6747a[s1Var.ordinal()];
        i iVar = this.f6743a;
        switch (i14) {
            case 1:
                y(0);
                return Boolean.valueOf(iVar.g());
            case 2:
                return f();
            case 3:
                y(1);
                return Double.valueOf(iVar.i());
            case 4:
                y(0);
                return Integer.valueOf(iVar.j());
            case 5:
                y(5);
                return Integer.valueOf(iVar.k());
            case 6:
                y(1);
                return Long.valueOf(iVar.l());
            case 7:
                y(5);
                return Float.valueOf(iVar.m());
            case 8:
                y(0);
                return Integer.valueOf(iVar.n());
            case 9:
                y(0);
                return Long.valueOf(iVar.o());
            case 10:
                return p(cls, oVar);
            case 11:
                y(5);
                return Integer.valueOf(iVar.p());
            case 12:
                y(1);
                return Long.valueOf(iVar.q());
            case 13:
                y(0);
                return Integer.valueOf(iVar.r());
            case 14:
                y(0);
                return Long.valueOf(iVar.s());
            case 15:
                y(2);
                return iVar.u();
            case 16:
                y(0);
                return Integer.valueOf(iVar.w());
            case 17:
                y(0);
                return Long.valueOf(iVar.x());
            default:
                vb.h.s("unsupported field type.");
                return null;
        }
    }

    public final void k(List<Integer> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z14 = list instanceof y;
        int i14 = this.f6744b;
        i iVar = this.f6743a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 2) {
                int iW = iVar.w();
                A(iW);
                int iB = iVar.b() + iW;
                do {
                    list.add(Integer.valueOf(iVar.k()));
                } while (iVar.b() < iB);
                return;
            }
            if (i15 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(iVar.k()));
                if (iVar.c()) {
                    return;
                } else {
                    iV = iVar.v();
                }
            } while (iV == this.f6744b);
            this.f6746d = iV;
            return;
        }
        y yVar = (y) list;
        int i16 = i14 & 7;
        if (i16 == 2) {
            int iW2 = iVar.w();
            A(iW2);
            int iB2 = iVar.b() + iW2;
            do {
                yVar.addInt(iVar.k());
            } while (iVar.b() < iB2);
            return;
        }
        if (i16 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            yVar.addInt(iVar.k());
            if (iVar.c()) {
                return;
            } else {
                iV2 = iVar.v();
            }
        } while (iV2 == this.f6744b);
        this.f6746d = iV2;
    }

    public final void l(List<Long> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z14 = list instanceof h0;
        int i14 = this.f6744b;
        i iVar = this.f6743a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 1) {
                do {
                    list.add(Long.valueOf(iVar.l()));
                    if (iVar.c()) {
                        return;
                    } else {
                        iV = iVar.v();
                    }
                } while (iV == this.f6744b);
                this.f6746d = iV;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iW = iVar.w();
            B(iW);
            int iB = iVar.b() + iW;
            do {
                list.add(Long.valueOf(iVar.l()));
            } while (iVar.b() < iB);
            return;
        }
        h0 h0Var = (h0) list;
        int i16 = i14 & 7;
        if (i16 == 1) {
            do {
                h0Var.addLong(iVar.l());
                if (iVar.c()) {
                    return;
                } else {
                    iV2 = iVar.v();
                }
            } while (iV2 == this.f6744b);
            this.f6746d = iV2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iW2 = iVar.w();
        B(iW2);
        int iB2 = iVar.b() + iW2;
        do {
            h0Var.addLong(iVar.l());
        } while (iVar.b() < iB2);
    }

    public final void m(List<Float> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z14 = list instanceof v;
        int i14 = this.f6744b;
        i iVar = this.f6743a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 2) {
                int iW = iVar.w();
                A(iW);
                int iB = iVar.b() + iW;
                do {
                    list.add(Float.valueOf(iVar.m()));
                } while (iVar.b() < iB);
                return;
            }
            if (i15 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(iVar.m()));
                if (iVar.c()) {
                    return;
                } else {
                    iV = iVar.v();
                }
            } while (iV == this.f6744b);
            this.f6746d = iV;
            return;
        }
        v vVar = (v) list;
        int i16 = i14 & 7;
        if (i16 == 2) {
            int iW2 = iVar.w();
            A(iW2);
            int iB2 = iVar.b() + iW2;
            do {
                vVar.addFloat(iVar.m());
            } while (iVar.b() < iB2);
            return;
        }
        if (i16 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            vVar.addFloat(iVar.m());
            if (iVar.c()) {
                return;
            } else {
                iV2 = iVar.v();
            }
        } while (iV2 == this.f6744b);
        this.f6746d = iV2;
    }

    public final void n(List<Integer> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z14 = list instanceof y;
        int i14 = this.f6744b;
        i iVar = this.f6743a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Integer.valueOf(iVar.n()));
                    if (iVar.c()) {
                        return;
                    } else {
                        iV = iVar.v();
                    }
                } while (iV == this.f6744b);
                this.f6746d = iV;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iB = iVar.b() + iVar.w();
            do {
                list.add(Integer.valueOf(iVar.n()));
            } while (iVar.b() < iB);
            x(iB);
            return;
        }
        y yVar = (y) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                yVar.addInt(iVar.n());
                if (iVar.c()) {
                    return;
                } else {
                    iV2 = iVar.v();
                }
            } while (iV2 == this.f6744b);
            this.f6746d = iV2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iB2 = iVar.b() + iVar.w();
        do {
            yVar.addInt(iVar.n());
        } while (iVar.b() < iB2);
        x(iB2);
    }

    public final void o(List<Long> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z14 = list instanceof h0;
        int i14 = this.f6744b;
        i iVar = this.f6743a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Long.valueOf(iVar.o()));
                    if (iVar.c()) {
                        return;
                    } else {
                        iV = iVar.v();
                    }
                } while (iV == this.f6744b);
                this.f6746d = iV;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iB = iVar.b() + iVar.w();
            do {
                list.add(Long.valueOf(iVar.o()));
            } while (iVar.b() < iB);
            x(iB);
            return;
        }
        h0 h0Var = (h0) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                h0Var.addLong(iVar.o());
                if (iVar.c()) {
                    return;
                } else {
                    iV2 = iVar.v();
                }
            } while (iV2 == this.f6744b);
            this.f6746d = iV2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iB2 = iVar.b() + iVar.w();
        do {
            h0Var.addLong(iVar.o());
        } while (iVar.b() < iB2);
        x(iB2);
    }

    public final <T> T p(Class<T> cls, o oVar) throws InvalidProtocolBufferException {
        y(2);
        g1<T> g1VarA = c1.f6688c.a(cls);
        T tNewInstance = g1VarA.newInstance();
        d(tNewInstance, g1VarA, oVar);
        g1VarA.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    public final void q(List<Integer> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z14 = list instanceof y;
        int i14 = this.f6744b;
        i iVar = this.f6743a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 2) {
                int iW = iVar.w();
                A(iW);
                int iB = iVar.b() + iW;
                do {
                    list.add(Integer.valueOf(iVar.p()));
                } while (iVar.b() < iB);
                return;
            }
            if (i15 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(iVar.p()));
                if (iVar.c()) {
                    return;
                } else {
                    iV = iVar.v();
                }
            } while (iV == this.f6744b);
            this.f6746d = iV;
            return;
        }
        y yVar = (y) list;
        int i16 = i14 & 7;
        if (i16 == 2) {
            int iW2 = iVar.w();
            A(iW2);
            int iB2 = iVar.b() + iW2;
            do {
                yVar.addInt(iVar.p());
            } while (iVar.b() < iB2);
            return;
        }
        if (i16 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            yVar.addInt(iVar.p());
            if (iVar.c()) {
                return;
            } else {
                iV2 = iVar.v();
            }
        } while (iV2 == this.f6744b);
        this.f6746d = iV2;
    }

    public final void r(List<Long> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z14 = list instanceof h0;
        int i14 = this.f6744b;
        i iVar = this.f6743a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 1) {
                do {
                    list.add(Long.valueOf(iVar.q()));
                    if (iVar.c()) {
                        return;
                    } else {
                        iV = iVar.v();
                    }
                } while (iV == this.f6744b);
                this.f6746d = iV;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iW = iVar.w();
            B(iW);
            int iB = iVar.b() + iW;
            do {
                list.add(Long.valueOf(iVar.q()));
            } while (iVar.b() < iB);
            return;
        }
        h0 h0Var = (h0) list;
        int i16 = i14 & 7;
        if (i16 == 1) {
            do {
                h0Var.addLong(iVar.q());
                if (iVar.c()) {
                    return;
                } else {
                    iV2 = iVar.v();
                }
            } while (iV2 == this.f6744b);
            this.f6746d = iV2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iW2 = iVar.w();
        B(iW2);
        int iB2 = iVar.b() + iW2;
        do {
            h0Var.addLong(iVar.q());
        } while (iVar.b() < iB2);
    }

    public final void s(List<Integer> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z14 = list instanceof y;
        int i14 = this.f6744b;
        i iVar = this.f6743a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Integer.valueOf(iVar.r()));
                    if (iVar.c()) {
                        return;
                    } else {
                        iV = iVar.v();
                    }
                } while (iV == this.f6744b);
                this.f6746d = iV;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iB = iVar.b() + iVar.w();
            do {
                list.add(Integer.valueOf(iVar.r()));
            } while (iVar.b() < iB);
            x(iB);
            return;
        }
        y yVar = (y) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                yVar.addInt(iVar.r());
                if (iVar.c()) {
                    return;
                } else {
                    iV2 = iVar.v();
                }
            } while (iV2 == this.f6744b);
            this.f6746d = iV2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iB2 = iVar.b() + iVar.w();
        do {
            yVar.addInt(iVar.r());
        } while (iVar.b() < iB2);
        x(iB2);
    }

    public final void t(List<Long> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z14 = list instanceof h0;
        int i14 = this.f6744b;
        i iVar = this.f6743a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Long.valueOf(iVar.s()));
                    if (iVar.c()) {
                        return;
                    } else {
                        iV = iVar.v();
                    }
                } while (iV == this.f6744b);
                this.f6746d = iV;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iB = iVar.b() + iVar.w();
            do {
                list.add(Long.valueOf(iVar.s()));
            } while (iVar.b() < iB);
            x(iB);
            return;
        }
        h0 h0Var = (h0) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                h0Var.addLong(iVar.s());
                if (iVar.c()) {
                    return;
                } else {
                    iV2 = iVar.v();
                }
            } while (iV2 == this.f6744b);
            this.f6746d = iV2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iB2 = iVar.b() + iVar.w();
        do {
            h0Var.addLong(iVar.s());
        } while (iVar.b() < iB2);
        x(iB2);
    }

    public final void u(List<String> list, boolean z14) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strT;
        int iV;
        int iV2;
        if ((this.f6744b & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        boolean z15 = list instanceof d0;
        i iVar = this.f6743a;
        if (z15 && !z14) {
            d0 d0Var = (d0) list;
            do {
                f();
                d0Var.s();
                if (iVar.c()) {
                    return;
                } else {
                    iV2 = iVar.v();
                }
            } while (iV2 == this.f6744b);
            this.f6746d = iV2;
            return;
        }
        do {
            if (z14) {
                y(2);
                strT = iVar.u();
            } else {
                y(2);
                strT = iVar.t();
            }
            list.add(strT);
            if (iVar.c()) {
                return;
            } else {
                iV = iVar.v();
            }
        } while (iV == this.f6744b);
        this.f6746d = iV;
    }

    public final void v(List<Integer> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z14 = list instanceof y;
        int i14 = this.f6744b;
        i iVar = this.f6743a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Integer.valueOf(iVar.w()));
                    if (iVar.c()) {
                        return;
                    } else {
                        iV = iVar.v();
                    }
                } while (iV == this.f6744b);
                this.f6746d = iV;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iB = iVar.b() + iVar.w();
            do {
                list.add(Integer.valueOf(iVar.w()));
            } while (iVar.b() < iB);
            x(iB);
            return;
        }
        y yVar = (y) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                yVar.addInt(iVar.w());
                if (iVar.c()) {
                    return;
                } else {
                    iV2 = iVar.v();
                }
            } while (iV2 == this.f6744b);
            this.f6746d = iV2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iB2 = iVar.b() + iVar.w();
        do {
            yVar.addInt(iVar.w());
        } while (iVar.b() < iB2);
        x(iB2);
    }

    public final void w(List<Long> list) throws InvalidProtocolBufferException {
        int iV;
        int iV2;
        boolean z14 = list instanceof h0;
        int i14 = this.f6744b;
        i iVar = this.f6743a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Long.valueOf(iVar.x()));
                    if (iVar.c()) {
                        return;
                    } else {
                        iV = iVar.v();
                    }
                } while (iV == this.f6744b);
                this.f6746d = iV;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iB = iVar.b() + iVar.w();
            do {
                list.add(Long.valueOf(iVar.x()));
            } while (iVar.b() < iB);
            x(iB);
            return;
        }
        h0 h0Var = (h0) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                h0Var.addLong(iVar.x());
                if (iVar.c()) {
                    return;
                } else {
                    iV2 = iVar.v();
                }
            } while (iV2 == this.f6744b);
            this.f6746d = iV2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iB2 = iVar.b() + iVar.w();
        do {
            h0Var.addLong(iVar.x());
        } while (iVar.b() < iB2);
        x(iB2);
    }

    public final void x(int i14) throws InvalidProtocolBufferException {
        if (this.f6743a.b() != i14) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void y(int i14) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f6744b & 7) != i14) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public final boolean z() {
        int i14;
        i iVar = this.f6743a;
        if (iVar.c() || (i14 = this.f6744b) == this.f6745c) {
            return false;
        }
        return iVar.y(i14);
    }
}
