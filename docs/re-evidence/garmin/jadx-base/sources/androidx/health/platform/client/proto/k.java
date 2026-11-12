package androidx.health.platform.client.proto;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class k implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f7698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7701d = 0;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7702a;

        static {
            int[] iArr = new int[b3.values().length];
            f7702a = iArr;
            try {
                iArr[b3.f7547j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7702a[b3.f7551n.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7702a[b3.f7540c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7702a[b3.f7553p.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7702a[b3.f7546i.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7702a[b3.f7545h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7702a[b3.f7541d.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7702a[b3.f7544g.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7702a[b3.f7542e.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7702a[b3.f7550m.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7702a[b3.f7554q.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7702a[b3.f7555r.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7702a[b3.f7556t.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7702a[b3.f7557v.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7702a[b3.f7548k.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7702a[b3.f7552o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7702a[b3.f7543f.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private k(j jVar) {
        l0.a(jVar, "input");
        this.f7698a = jVar;
        jVar.f7668c = this;
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

    public static k a(j jVar) {
        k kVar = jVar.f7668c;
        return kVar != null ? kVar : new k(jVar);
    }

    public final int b() {
        int i14 = this.f7701d;
        if (i14 != 0) {
            this.f7699b = i14;
            this.f7701d = 0;
        } else {
            this.f7699b = this.f7698a.w();
        }
        int i15 = this.f7699b;
        if (i15 == 0 || i15 == this.f7700c) {
            return Integer.MAX_VALUE;
        }
        return i15 >>> 3;
    }

    public final <T> void c(T t7, n2<T> n2Var, a0 a0Var) {
        int i14 = this.f7700c;
        this.f7700c = ((this.f7699b >>> 3) << 3) | 4;
        try {
            n2Var.e(t7, this, a0Var);
            if (this.f7699b != this.f7700c) {
                throw InvalidProtocolBufferException.parseFailure();
            }
            this.f7700c = i14;
        } catch (Throwable th3) {
            this.f7700c = i14;
            throw th3;
        }
    }

    public final <T> void d(T t7, n2<T> n2Var, a0 a0Var) throws InvalidProtocolBufferException {
        j jVar = this.f7698a;
        int iX = jVar.x();
        if (jVar.f7666a >= jVar.f7667b) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        int iG = jVar.g(iX);
        jVar.f7666a++;
        n2Var.e(t7, this, a0Var);
        jVar.a(0);
        jVar.f7666a--;
        jVar.f(iG);
    }

    public final void e(List<Boolean> list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z14 = list instanceof f;
        int i14 = this.f7699b;
        j jVar = this.f7698a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Boolean.valueOf(jVar.h()));
                    if (jVar.e()) {
                        return;
                    } else {
                        iW = jVar.w();
                    }
                } while (iW == this.f7699b);
                this.f7701d = iW;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = jVar.d() + jVar.x();
            do {
                list.add(Boolean.valueOf(jVar.h()));
            } while (jVar.d() < iD);
            x(iD);
            return;
        }
        f fVar = (f) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                fVar.addBoolean(jVar.h());
                if (jVar.e()) {
                    return;
                } else {
                    iW2 = jVar.w();
                }
            } while (iW2 == this.f7699b);
            this.f7701d = iW2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = jVar.d() + jVar.x();
        do {
            fVar.addBoolean(jVar.h());
        } while (jVar.d() < iD2);
        x(iD2);
    }

    public final i f() throws InvalidProtocolBufferException.InvalidWireTypeException {
        y(2);
        return this.f7698a.i();
    }

    public final void g(List<i> list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iW;
        if ((this.f7699b & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            list.add(f());
            j jVar = this.f7698a;
            if (jVar.e()) {
                return;
            } else {
                iW = jVar.w();
            }
        } while (iW == this.f7699b);
        this.f7701d = iW;
    }

    public final void h(List<Double> list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z14 = list instanceof v;
        int i14 = this.f7699b;
        j jVar = this.f7698a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 1) {
                do {
                    list.add(Double.valueOf(jVar.j()));
                    if (jVar.e()) {
                        return;
                    } else {
                        iW = jVar.w();
                    }
                } while (iW == this.f7699b);
                this.f7701d = iW;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iX = jVar.x();
            B(iX);
            int iD = jVar.d() + iX;
            do {
                list.add(Double.valueOf(jVar.j()));
            } while (jVar.d() < iD);
            return;
        }
        v vVar = (v) list;
        int i16 = i14 & 7;
        if (i16 == 1) {
            do {
                vVar.addDouble(jVar.j());
                if (jVar.e()) {
                    return;
                } else {
                    iW2 = jVar.w();
                }
            } while (iW2 == this.f7699b);
            this.f7701d = iW2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iX2 = jVar.x();
        B(iX2);
        int iD2 = jVar.d() + iX2;
        do {
            vVar.addDouble(jVar.j());
        } while (jVar.d() < iD2);
    }

    public final void i(List<Integer> list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z14 = list instanceof k0;
        int i14 = this.f7699b;
        j jVar = this.f7698a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.k()));
                    if (jVar.e()) {
                        return;
                    } else {
                        iW = jVar.w();
                    }
                } while (iW == this.f7699b);
                this.f7701d = iW;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = jVar.d() + jVar.x();
            do {
                list.add(Integer.valueOf(jVar.k()));
            } while (jVar.d() < iD);
            x(iD);
            return;
        }
        k0 k0Var = (k0) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                k0Var.addInt(jVar.k());
                if (jVar.e()) {
                    return;
                } else {
                    iW2 = jVar.w();
                }
            } while (iW2 == this.f7699b);
            this.f7701d = iW2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = jVar.d() + jVar.x();
        do {
            k0Var.addInt(jVar.k());
        } while (jVar.d() < iD2);
        x(iD2);
    }

    public final Object j(b3 b3Var, Class<?> cls, a0 a0Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int i14 = a.f7702a[b3Var.ordinal()];
        j jVar = this.f7698a;
        switch (i14) {
            case 1:
                y(0);
                return Boolean.valueOf(jVar.h());
            case 2:
                return f();
            case 3:
                y(1);
                return Double.valueOf(jVar.j());
            case 4:
                y(0);
                return Integer.valueOf(jVar.k());
            case 5:
                y(5);
                return Integer.valueOf(jVar.l());
            case 6:
                y(1);
                return Long.valueOf(jVar.m());
            case 7:
                y(5);
                return Float.valueOf(jVar.n());
            case 8:
                y(0);
                return Integer.valueOf(jVar.o());
            case 9:
                y(0);
                return Long.valueOf(jVar.p());
            case 10:
                return p(cls, a0Var);
            case 11:
                y(5);
                return Integer.valueOf(jVar.q());
            case 12:
                y(1);
                return Long.valueOf(jVar.r());
            case 13:
                y(0);
                return Integer.valueOf(jVar.s());
            case 14:
                y(0);
                return Long.valueOf(jVar.t());
            case 15:
                y(2);
                return jVar.v();
            case 16:
                y(0);
                return Integer.valueOf(jVar.x());
            case 17:
                y(0);
                return Long.valueOf(jVar.y());
            default:
                vb.h.s("unsupported field type.");
                return null;
        }
    }

    public final void k(List<Integer> list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z14 = list instanceof k0;
        int i14 = this.f7699b;
        j jVar = this.f7698a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 2) {
                int iX = jVar.x();
                A(iX);
                int iD = jVar.d() + iX;
                do {
                    list.add(Integer.valueOf(jVar.l()));
                } while (jVar.d() < iD);
                return;
            }
            if (i15 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(jVar.l()));
                if (jVar.e()) {
                    return;
                } else {
                    iW = jVar.w();
                }
            } while (iW == this.f7699b);
            this.f7701d = iW;
            return;
        }
        k0 k0Var = (k0) list;
        int i16 = i14 & 7;
        if (i16 == 2) {
            int iX2 = jVar.x();
            A(iX2);
            int iD2 = jVar.d() + iX2;
            do {
                k0Var.addInt(jVar.l());
            } while (jVar.d() < iD2);
            return;
        }
        if (i16 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            k0Var.addInt(jVar.l());
            if (jVar.e()) {
                return;
            } else {
                iW2 = jVar.w();
            }
        } while (iW2 == this.f7699b);
        this.f7701d = iW2;
    }

    public final void l(List<Long> list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z14 = list instanceof t0;
        int i14 = this.f7699b;
        j jVar = this.f7698a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 1) {
                do {
                    list.add(Long.valueOf(jVar.m()));
                    if (jVar.e()) {
                        return;
                    } else {
                        iW = jVar.w();
                    }
                } while (iW == this.f7699b);
                this.f7701d = iW;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iX = jVar.x();
            B(iX);
            int iD = jVar.d() + iX;
            do {
                list.add(Long.valueOf(jVar.m()));
            } while (jVar.d() < iD);
            return;
        }
        t0 t0Var = (t0) list;
        int i16 = i14 & 7;
        if (i16 == 1) {
            do {
                t0Var.addLong(jVar.m());
                if (jVar.e()) {
                    return;
                } else {
                    iW2 = jVar.w();
                }
            } while (iW2 == this.f7699b);
            this.f7701d = iW2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iX2 = jVar.x();
        B(iX2);
        int iD2 = jVar.d() + iX2;
        do {
            t0Var.addLong(jVar.m());
        } while (jVar.d() < iD2);
    }

    public final void m(List<Float> list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z14 = list instanceof h0;
        int i14 = this.f7699b;
        j jVar = this.f7698a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 2) {
                int iX = jVar.x();
                A(iX);
                int iD = jVar.d() + iX;
                do {
                    list.add(Float.valueOf(jVar.n()));
                } while (jVar.d() < iD);
                return;
            }
            if (i15 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Float.valueOf(jVar.n()));
                if (jVar.e()) {
                    return;
                } else {
                    iW = jVar.w();
                }
            } while (iW == this.f7699b);
            this.f7701d = iW;
            return;
        }
        h0 h0Var = (h0) list;
        int i16 = i14 & 7;
        if (i16 == 2) {
            int iX2 = jVar.x();
            A(iX2);
            int iD2 = jVar.d() + iX2;
            do {
                h0Var.addFloat(jVar.n());
            } while (jVar.d() < iD2);
            return;
        }
        if (i16 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            h0Var.addFloat(jVar.n());
            if (jVar.e()) {
                return;
            } else {
                iW2 = jVar.w();
            }
        } while (iW2 == this.f7699b);
        this.f7701d = iW2;
    }

    public final void n(List<Integer> list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z14 = list instanceof k0;
        int i14 = this.f7699b;
        j jVar = this.f7698a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.o()));
                    if (jVar.e()) {
                        return;
                    } else {
                        iW = jVar.w();
                    }
                } while (iW == this.f7699b);
                this.f7701d = iW;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = jVar.d() + jVar.x();
            do {
                list.add(Integer.valueOf(jVar.o()));
            } while (jVar.d() < iD);
            x(iD);
            return;
        }
        k0 k0Var = (k0) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                k0Var.addInt(jVar.o());
                if (jVar.e()) {
                    return;
                } else {
                    iW2 = jVar.w();
                }
            } while (iW2 == this.f7699b);
            this.f7701d = iW2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = jVar.d() + jVar.x();
        do {
            k0Var.addInt(jVar.o());
        } while (jVar.d() < iD2);
        x(iD2);
    }

    public final void o(List<Long> list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z14 = list instanceof t0;
        int i14 = this.f7699b;
        j jVar = this.f7698a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Long.valueOf(jVar.p()));
                    if (jVar.e()) {
                        return;
                    } else {
                        iW = jVar.w();
                    }
                } while (iW == this.f7699b);
                this.f7701d = iW;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = jVar.d() + jVar.x();
            do {
                list.add(Long.valueOf(jVar.p()));
            } while (jVar.d() < iD);
            x(iD);
            return;
        }
        t0 t0Var = (t0) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                t0Var.addLong(jVar.p());
                if (jVar.e()) {
                    return;
                } else {
                    iW2 = jVar.w();
                }
            } while (iW2 == this.f7699b);
            this.f7701d = iW2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = jVar.d() + jVar.x();
        do {
            t0Var.addLong(jVar.p());
        } while (jVar.d() < iD2);
        x(iD2);
    }

    public final <T> T p(Class<T> cls, a0 a0Var) throws InvalidProtocolBufferException {
        y(2);
        n2<T> n2VarA = r1.f7767c.a(cls);
        T tNewInstance = n2VarA.newInstance();
        d(tNewInstance, n2VarA, a0Var);
        n2VarA.makeImmutable(tNewInstance);
        return tNewInstance;
    }

    public final void q(List<Integer> list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z14 = list instanceof k0;
        int i14 = this.f7699b;
        j jVar = this.f7698a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 2) {
                int iX = jVar.x();
                A(iX);
                int iD = jVar.d() + iX;
                do {
                    list.add(Integer.valueOf(jVar.q()));
                } while (jVar.d() < iD);
                return;
            }
            if (i15 != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            do {
                list.add(Integer.valueOf(jVar.q()));
                if (jVar.e()) {
                    return;
                } else {
                    iW = jVar.w();
                }
            } while (iW == this.f7699b);
            this.f7701d = iW;
            return;
        }
        k0 k0Var = (k0) list;
        int i16 = i14 & 7;
        if (i16 == 2) {
            int iX2 = jVar.x();
            A(iX2);
            int iD2 = jVar.d() + iX2;
            do {
                k0Var.addInt(jVar.q());
            } while (jVar.d() < iD2);
            return;
        }
        if (i16 != 5) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        do {
            k0Var.addInt(jVar.q());
            if (jVar.e()) {
                return;
            } else {
                iW2 = jVar.w();
            }
        } while (iW2 == this.f7699b);
        this.f7701d = iW2;
    }

    public final void r(List<Long> list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z14 = list instanceof t0;
        int i14 = this.f7699b;
        j jVar = this.f7698a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 1) {
                do {
                    list.add(Long.valueOf(jVar.r()));
                    if (jVar.e()) {
                        return;
                    } else {
                        iW = jVar.w();
                    }
                } while (iW == this.f7699b);
                this.f7701d = iW;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iX = jVar.x();
            B(iX);
            int iD = jVar.d() + iX;
            do {
                list.add(Long.valueOf(jVar.r()));
            } while (jVar.d() < iD);
            return;
        }
        t0 t0Var = (t0) list;
        int i16 = i14 & 7;
        if (i16 == 1) {
            do {
                t0Var.addLong(jVar.r());
                if (jVar.e()) {
                    return;
                } else {
                    iW2 = jVar.w();
                }
            } while (iW2 == this.f7699b);
            this.f7701d = iW2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iX2 = jVar.x();
        B(iX2);
        int iD2 = jVar.d() + iX2;
        do {
            t0Var.addLong(jVar.r());
        } while (jVar.d() < iD2);
    }

    public final void s(List<Integer> list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z14 = list instanceof k0;
        int i14 = this.f7699b;
        j jVar = this.f7698a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.s()));
                    if (jVar.e()) {
                        return;
                    } else {
                        iW = jVar.w();
                    }
                } while (iW == this.f7699b);
                this.f7701d = iW;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = jVar.d() + jVar.x();
            do {
                list.add(Integer.valueOf(jVar.s()));
            } while (jVar.d() < iD);
            x(iD);
            return;
        }
        k0 k0Var = (k0) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                k0Var.addInt(jVar.s());
                if (jVar.e()) {
                    return;
                } else {
                    iW2 = jVar.w();
                }
            } while (iW2 == this.f7699b);
            this.f7701d = iW2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = jVar.d() + jVar.x();
        do {
            k0Var.addInt(jVar.s());
        } while (jVar.d() < iD2);
        x(iD2);
    }

    public final void t(List<Long> list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z14 = list instanceof t0;
        int i14 = this.f7699b;
        j jVar = this.f7698a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Long.valueOf(jVar.t()));
                    if (jVar.e()) {
                        return;
                    } else {
                        iW = jVar.w();
                    }
                } while (iW == this.f7699b);
                this.f7701d = iW;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = jVar.d() + jVar.x();
            do {
                list.add(Long.valueOf(jVar.t()));
            } while (jVar.d() < iD);
            x(iD);
            return;
        }
        t0 t0Var = (t0) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                t0Var.addLong(jVar.t());
                if (jVar.e()) {
                    return;
                } else {
                    iW2 = jVar.w();
                }
            } while (iW2 == this.f7699b);
            this.f7701d = iW2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = jVar.d() + jVar.x();
        do {
            t0Var.addLong(jVar.t());
        } while (jVar.d() < iD2);
        x(iD2);
    }

    public final void u(List<String> list, boolean z14) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strU;
        int iW;
        int iW2;
        if ((this.f7699b & 7) != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        boolean z15 = list instanceof p0;
        j jVar = this.f7698a;
        if (z15 && !z14) {
            p0 p0Var = (p0) list;
            do {
                f();
                p0Var.s();
                if (jVar.e()) {
                    return;
                } else {
                    iW2 = jVar.w();
                }
            } while (iW2 == this.f7699b);
            this.f7701d = iW2;
            return;
        }
        do {
            if (z14) {
                y(2);
                strU = jVar.v();
            } else {
                y(2);
                strU = jVar.u();
            }
            list.add(strU);
            if (jVar.e()) {
                return;
            } else {
                iW = jVar.w();
            }
        } while (iW == this.f7699b);
        this.f7701d = iW;
    }

    public final void v(List<Integer> list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z14 = list instanceof k0;
        int i14 = this.f7699b;
        j jVar = this.f7698a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Integer.valueOf(jVar.x()));
                    if (jVar.e()) {
                        return;
                    } else {
                        iW = jVar.w();
                    }
                } while (iW == this.f7699b);
                this.f7701d = iW;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = jVar.d() + jVar.x();
            do {
                list.add(Integer.valueOf(jVar.x()));
            } while (jVar.d() < iD);
            x(iD);
            return;
        }
        k0 k0Var = (k0) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                k0Var.addInt(jVar.x());
                if (jVar.e()) {
                    return;
                } else {
                    iW2 = jVar.w();
                }
            } while (iW2 == this.f7699b);
            this.f7701d = iW2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = jVar.d() + jVar.x();
        do {
            k0Var.addInt(jVar.x());
        } while (jVar.d() < iD2);
        x(iD2);
    }

    public final void w(List<Long> list) throws InvalidProtocolBufferException {
        int iW;
        int iW2;
        boolean z14 = list instanceof t0;
        int i14 = this.f7699b;
        j jVar = this.f7698a;
        if (!z14) {
            int i15 = i14 & 7;
            if (i15 == 0) {
                do {
                    list.add(Long.valueOf(jVar.y()));
                    if (jVar.e()) {
                        return;
                    } else {
                        iW = jVar.w();
                    }
                } while (iW == this.f7699b);
                this.f7701d = iW;
                return;
            }
            if (i15 != 2) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            int iD = jVar.d() + jVar.x();
            do {
                list.add(Long.valueOf(jVar.y()));
            } while (jVar.d() < iD);
            x(iD);
            return;
        }
        t0 t0Var = (t0) list;
        int i16 = i14 & 7;
        if (i16 == 0) {
            do {
                t0Var.addLong(jVar.y());
                if (jVar.e()) {
                    return;
                } else {
                    iW2 = jVar.w();
                }
            } while (iW2 == this.f7699b);
            this.f7701d = iW2;
            return;
        }
        if (i16 != 2) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
        int iD2 = jVar.d() + jVar.x();
        do {
            t0Var.addLong(jVar.y());
        } while (jVar.d() < iD2);
        x(iD2);
    }

    public final void x(int i14) throws InvalidProtocolBufferException {
        if (this.f7698a.d() != i14) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public final void y(int i14) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.f7699b & 7) != i14) {
            throw InvalidProtocolBufferException.invalidWireType();
        }
    }

    public final boolean z() {
        int i14;
        j jVar = this.f7698a;
        if (jVar.e() || (i14 = this.f7699b) == this.f7700c) {
            return false;
        }
        return jVar.z(i14);
    }
}
