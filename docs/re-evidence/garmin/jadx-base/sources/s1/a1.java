package s1;

import java.util.concurrent.CancellationException;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Ls1/a1;", "S", "Ls1/a2;", "initialState", "<init>", "(Ljava/lang/Object;)V", "b", "a", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a1<S> extends a2<S> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f155458r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f155459s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final n f155460t = new n(0.0f);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final n f155461u = new n(1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.c2 f155462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p3.c2 f155463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S f155464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public t1<S> f155465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f155466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ro0.g f155467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p3.z1 f155468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o53.k f155469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z53.b f155470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v0 f155471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f155472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p1.q0<b> f155473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f155474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final z0 f155475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f155476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z0 f155477q;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls1/a1$b;", "", "<init>", "()V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f155478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l2 f155479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f155480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f155481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n f155482e = new n(0.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public n f155483f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f155484g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f155485h;

        public final String toString() {
            return "progress nanos: " + this.f155478a + ", animationSpec: " + this.f155479b + ", isComplete: " + this.f155480c + ", value: " + this.f155481d + ", start: " + this.f155482e + ", initialVelocity: " + this.f155483f + ", durationNanos: " + this.f155484g + ", animationSpecDuration: " + this.f155485h;
        }
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [s1.z0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [s1.z0] */
    public a1(S s8) {
        super(null);
        this.f155462b = p3.p0.n(s8);
        this.f155463c = p3.p0.n(s8);
        this.f155464d = s8;
        this.f155467g = new ro0.g(this, 9);
        this.f155468h = new p3.z1(0.0f);
        this.f155470j = z53.c.a();
        this.f155471k = new v0();
        this.f155472l = Long.MIN_VALUE;
        this.f155473m = new p1.q0<>(0, 1, null);
        final int i14 = 0;
        this.f155475o = new e23.l(this) { // from class: s1.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a1 f155859b;

            {
                this.f155859b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                Long l14 = (Long) obj;
                switch (i14) {
                    case 0:
                        this.f155859b.f155472l = l14.longValue();
                        break;
                    default:
                        long jLongValue = l14.longValue();
                        a1 a1Var = this.f155859b;
                        long j8 = jLongValue - a1Var.f155472l;
                        a1Var.f155472l = jLongValue;
                        long jD = MathKt.d(j8 / ((double) a1Var.f155476p));
                        p1.q0<a1.b> q0Var = a1Var.f155473m;
                        if (q0Var.e()) {
                            Object[] objArr = q0Var.f134667a;
                            int i15 = q0Var.f134668b;
                            int i16 = 0;
                            for (int i17 = 0; i17 < i15; i17++) {
                                a1.b bVar = (a1.b) objArr[i17];
                                a1.m(bVar, jD);
                                bVar.f155480c = true;
                            }
                            t1<S> t1Var = a1Var.f155465e;
                            if (t1Var != 0) {
                                t1Var.q();
                            }
                            int i18 = q0Var.f134668b;
                            Object[] objArr2 = q0Var.f134667a;
                            j23.l lVarO = j23.t.o(0, i18);
                            int i19 = lVarO.f96796a;
                            int i24 = lVarO.f96797b;
                            if (i19 <= i24) {
                                while (true) {
                                    objArr2[i19 - i16] = objArr2[i19];
                                    if (((a1.b) objArr2[i19]).f155480c) {
                                        i16++;
                                    }
                                    if (i19 != i24) {
                                        i19++;
                                    }
                                }
                            }
                            p13.s.m(i18 - i16, i18, null, objArr2);
                            q0Var.f134668b -= i16;
                        }
                        a1.b bVar2 = a1Var.f155474n;
                        if (bVar2 != null) {
                            bVar2.f155484g = a1Var.f155466f;
                            a1.m(bVar2, jD);
                            a1Var.p(bVar2.f155481d);
                            if (bVar2.f155481d == 1.0f) {
                                a1Var.f155474n = null;
                            }
                            a1Var.o();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
        final int i15 = 1;
        this.f155477q = new e23.l(this) { // from class: s1.z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a1 f155859b;

            {
                this.f155859b = this;
            }

            @Override // e23.l
            public final Object invoke(Object obj) {
                Long l14 = (Long) obj;
                switch (i15) {
                    case 0:
                        this.f155859b.f155472l = l14.longValue();
                        break;
                    default:
                        long jLongValue = l14.longValue();
                        a1 a1Var = this.f155859b;
                        long j8 = jLongValue - a1Var.f155472l;
                        a1Var.f155472l = jLongValue;
                        long jD = MathKt.d(j8 / ((double) a1Var.f155476p));
                        p1.q0<a1.b> q0Var = a1Var.f155473m;
                        if (q0Var.e()) {
                            Object[] objArr = q0Var.f134667a;
                            int i16 = q0Var.f134668b;
                            int i17 = 0;
                            for (int i18 = 0; i18 < i16; i18++) {
                                a1.b bVar = (a1.b) objArr[i18];
                                a1.m(bVar, jD);
                                bVar.f155480c = true;
                            }
                            t1<S> t1Var = a1Var.f155465e;
                            if (t1Var != 0) {
                                t1Var.q();
                            }
                            int i19 = q0Var.f134668b;
                            Object[] objArr2 = q0Var.f134667a;
                            j23.l lVarO = j23.t.o(0, i19);
                            int i110 = lVarO.f96796a;
                            int i24 = lVarO.f96797b;
                            if (i110 <= i24) {
                                while (true) {
                                    objArr2[i110 - i17] = objArr2[i110];
                                    if (((a1.b) objArr2[i110]).f155480c) {
                                        i17++;
                                    }
                                    if (i110 != i24) {
                                        i110++;
                                    }
                                }
                            }
                            p13.s.m(i19 - i17, i19, null, objArr2);
                            q0Var.f134668b -= i17;
                        }
                        a1.b bVar2 = a1Var.f155474n;
                        if (bVar2 != null) {
                            bVar2.f155484g = a1Var.f155466f;
                            a1.m(bVar2, jD);
                            a1Var.p(bVar2.f155481d);
                            if (bVar2.f155481d == 1.0f) {
                                a1Var.f155474n = null;
                            }
                            a1Var.o();
                        }
                        break;
                }
                return Unit.INSTANCE;
            }
        };
    }

    public static final void f(a1 a1Var) {
        p3.z1 z1Var = a1Var.f155468h;
        t1<S> t1Var = a1Var.f155465e;
        if (t1Var == null) {
            return;
        }
        b bVar = a1Var.f155474n;
        if (bVar == null) {
            if (a1Var.f155466f <= 0 || z1Var.getFloatValue() == 1.0f || p005kotlin.jvm.internal.s.g(a1Var.f155463c.getF182175a(), a1Var.f155462b.getF182175a())) {
                bVar = null;
            } else {
                bVar = new b();
                bVar.f155481d = z1Var.getFloatValue();
                long j8 = a1Var.f155466f;
                bVar.f155484g = j8;
                bVar.f155485h = MathKt.d((1.0d - ((double) z1Var.getFloatValue())) * j8);
                bVar.f155482e.e(z1Var.getFloatValue(), 0);
            }
        }
        if (bVar != null) {
            bVar.f155484g = a1Var.f155466f;
            a1Var.f155473m.g(bVar);
            t1Var.o(bVar);
        }
        a1Var.f155474n = null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object g(a1 a1Var, v13.c cVar) {
        c1 c1Var;
        p1.q0<b> q0Var = a1Var.f155473m;
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i14 = c1Var.f155521c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c1Var.f155521c = i14 - Integer.MIN_VALUE;
            } else {
                c1Var = new c1(a1Var, cVar);
            }
        } else {
            c1Var = new c1(a1Var, cVar);
        }
        Object obj = c1Var.f155519a;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = c1Var.f155521c;
        if (i15 == 0) {
            o13.r.b(obj);
            if (q0Var.d() && a1Var.f155474n == null) {
                return Unit.INSTANCE;
            }
            if (q1.h(c1Var.getF157466b()) == 0.0f) {
                a1Var.l();
                a1Var.f155472l = Long.MIN_VALUE;
                return Unit.INSTANCE;
            }
            if (a1Var.f155472l == Long.MIN_VALUE) {
                z0 z0Var = a1Var.f155475o;
                c1Var.f155521c = 1;
                if (p3.g1.a(c1Var.getF157466b()).v(z0Var, c1Var) != obj2) {
                }
            }
            return obj2;
        }
        if (i15 != 1 && i15 != 2) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        do {
            if (!q0Var.e() && a1Var.f155474n == null) {
                a1Var.f155472l = Long.MIN_VALUE;
                return Unit.INSTANCE;
            }
            c1Var.f155521c = 2;
        } while (a1Var.j(c1Var) != obj2);
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0076  */
    /* JADX WARN: Code duplicated, block: B:27:0x0079  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object h(a1 a1Var, v13.c cVar) throws Throwable {
        f1 f1Var;
        Object f182175a;
        Object obj;
        z53.b bVar = a1Var.f155470j;
        if (cVar instanceof f1) {
            f1Var = (f1) cVar;
            int i14 = f1Var.f155582d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                f1Var.f155582d = i14 - Integer.MIN_VALUE;
            } else {
                f1Var = new f1(a1Var, cVar);
            }
        } else {
            f1Var = new f1(a1Var, cVar);
        }
        Object obj2 = f1Var.f155580b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = f1Var.f155582d;
        if (i15 == 0) {
            o13.r.b(obj2);
            f182175a = a1Var.f155462b.getF182175a();
            f1Var.f155579a = f182175a;
            f1Var.f155582d = 1;
            if (bVar.c(f1Var) != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            Object obj3 = f1Var.f155579a;
            o13.r.b(obj2);
            f182175a = obj3;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = f1Var.f155579a;
            o13.r.b(obj2);
        }
        if (p005kotlin.jvm.internal.s.g(obj2, obj)) {
            return Unit.INSTANCE;
        }
        a1Var.f155472l = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        f1Var.f155579a = f182175a;
        f1Var.f155582d = 2;
        o53.k kVar = new o53.k(u13.f.b(f1Var), 1);
        kVar.q();
        a1Var.f155469i = kVar;
        bVar.e(null);
        Object objP = kVar.p();
        if (objP != aVar) {
            obj = f182175a;
            obj2 = objP;
            if (p005kotlin.jvm.internal.s.g(obj2, obj)) {
                return Unit.INSTANCE;
            }
            a1Var.f155472l = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return aVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0085  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x0085, please report this as an issue */
    public static final Object i(a1 a1Var, v13.c cVar) throws Throwable {
        g1 g1Var;
        Object f182175a;
        Object obj;
        z53.b bVar = a1Var.f155470j;
        if (cVar instanceof g1) {
            g1Var = (g1) cVar;
            int i14 = g1Var.f155586d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                g1Var.f155586d = i14 - Integer.MIN_VALUE;
            } else {
                g1Var = new g1(a1Var, cVar);
            }
        } else {
            g1Var = new g1(a1Var, cVar);
        }
        Object obj2 = g1Var.f155584b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = g1Var.f155586d;
        if (i15 == 0) {
            o13.r.b(obj2);
            f182175a = a1Var.f155462b.getF182175a();
            g1Var.f155583a = f182175a;
            g1Var.f155586d = 1;
            if (bVar.c(g1Var) != aVar) {
            }
            return aVar;
        }
        if (i15 == 1) {
            Object obj3 = g1Var.f155583a;
            o13.r.b(obj2);
            f182175a = obj3;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = g1Var.f155583a;
            o13.r.b(obj2);
        }
        if (!p005kotlin.jvm.internal.s.g(obj2, obj)) {
            a1Var.f155472l = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return Unit.INSTANCE;
        if (!p005kotlin.jvm.internal.s.g(f182175a, a1Var.f155464d)) {
            g1Var.f155583a = f182175a;
            g1Var.f155586d = 2;
            o53.k kVar = new o53.k(u13.f.b(g1Var), 1);
            kVar.q();
            a1Var.f155469i = kVar;
            bVar.e(null);
            Object objP = kVar.p();
            if (objP != aVar) {
                obj = f182175a;
                obj2 = objP;
                if (!p005kotlin.jvm.internal.s.g(obj2, obj)) {
                    a1Var.f155472l = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return aVar;
        }
        bVar.e(null);
        return Unit.INSTANCE;
    }

    public static Object k(a1 a1Var, Object obj, v13.i iVar) {
        Object objA;
        t1<S> t1Var = a1Var.f155465e;
        return (t1Var != null && (objA = v0.a(a1Var.f155471k, new b1(t1Var, a1Var, obj, null, null), iVar)) == u13.a.COROUTINE_SUSPENDED) ? objA : Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void m(b bVar, long j8) {
        long j14 = bVar.f155478a + j8;
        bVar.f155478a = j14;
        long j15 = bVar.f155485h;
        if (j14 >= j15) {
            bVar.f155481d = 1.0f;
            return;
        }
        l2 l2Var = bVar.f155479b;
        n nVar = bVar.f155482e;
        if (l2Var == null) {
            float f14 = j14 / j15;
            bVar.f155481d = (f14 * 1.0f) + ((1 - f14) * nVar.a(0));
            return;
        }
        n nVar2 = bVar.f155483f;
        if (nVar2 == null) {
            nVar2 = f155460t;
        }
        bVar.f155481d = j23.t.d(((n) l2Var.f(j14, nVar, f155461u, nVar2)).a(0), 0.0f, 1.0f);
    }

    @Override // s1.a2
    public final S a() {
        return (S) this.f155463c.getF182175a();
    }

    @Override // s1.a2
    public final S b() {
        return (S) this.f155462b.getF182175a();
    }

    @Override // s1.a2
    public final void c(S s8) {
        this.f155463c.setValue(s8);
    }

    @Override // s1.a2
    public final void d(t1<S> t1Var) {
        t1<S> t1Var2 = this.f155465e;
        if (t1Var2 != null && !t1Var.equals(t1Var2)) {
            x0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f155465e + ", new instance: " + t1Var);
        }
        this.f155465e = t1Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, o13.l] */
    @Override // s1.a2
    public final void e() {
        this.f155465e = null;
        ((f4.v) w1.f155836b.getValue()).b(this);
    }

    public final Object j(v13.c cVar) {
        float fH = q1.h(cVar.getF157466b());
        if (fH <= 0.0f) {
            l();
            return Unit.INSTANCE;
        }
        this.f155476p = fH;
        Object objV = p3.g1.a(cVar.getF157466b()).v(this.f155477q, cVar);
        return objV == u13.a.COROUTINE_SUSPENDED ? objV : Unit.INSTANCE;
    }

    public final void l() {
        t1<S> t1Var = this.f155465e;
        if (t1Var != null) {
            t1Var.c();
        }
        this.f155473m.j();
        if (this.f155474n != null) {
            this.f155474n = null;
            p(1.0f);
            o();
        }
    }

    public final Object n(float f14, Object obj, v13.i iVar) {
        if (0.0f > f14 || f14 > 1.0f) {
            x0.a("Expecting fraction between 0 and 1. Got " + f14);
        }
        t1<S> t1Var = this.f155465e;
        if (t1Var == null) {
            return Unit.INSTANCE;
        }
        Object objA = v0.a(this.f155471k, new d1(obj, this.f155462b.getF182175a(), this, t1Var, f14, null), iVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    public final void o() {
        t1<S> t1Var = this.f155465e;
        if (t1Var == null) {
            return;
        }
        t1Var.n(MathKt.d(((double) this.f155468h.getFloatValue()) * t1Var.g()));
    }

    public final void p(float f14) {
        this.f155468h.i(f14);
    }

    public final Object q(Object obj, v13.i iVar) {
        t1<S> t1Var = this.f155465e;
        if (t1Var == null) {
            return Unit.INSTANCE;
        }
        if (p005kotlin.jvm.internal.s.g(this.f155463c.getF182175a(), obj) && p005kotlin.jvm.internal.s.g(this.f155462b.getF182175a(), obj)) {
            return Unit.INSTANCE;
        }
        Object objA = v0.a(this.f155471k, new e1(this, obj, t1Var, null), iVar);
        return objA == u13.a.COROUTINE_SUSPENDED ? objA : Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls1/a1$a;", "", "<init>", "()V", "animation-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
