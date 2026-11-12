package r1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1.d2 f149280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s1.j1<Float> f149281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s1.j1<o4.d0> f149282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final s1.j1<g6.k> f149283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final s1.j1<g6.m> f149284e;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo4/z1;", "it", "Ls1/o;", "invoke-__ExYCQ", "(J)Ls1/o;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<o4.z1, s1.o> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f149285a = new a();

        public a() {
            super(1);
        }

        @Override // e23.l
        public final s1.o invoke(o4.z1 z1Var) {
            long j8 = z1Var.f129048a;
            return new s1.o(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls1/o;", "it", "Lo4/z1;", "invoke-LIALnN8", "(Ls1/o;)J", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.l<s1.o, o4.z1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f149286a = new b();

        public b() {
            super(1);
        }

        @Override // e23.l
        public final o4.z1 invoke(s1.o oVar) {
            s1.o oVar2 = oVar;
            return o4.z1.a(o4.l1.b(oVar2.f155672a, oVar2.f155673b));
        }
    }

    static {
        a aVar = a.f149285a;
        b bVar = b.f149286a;
        s1.d2 d2Var = s1.e2.f155568a;
        f149280a = new s1.d2(aVar, bVar);
        f149281b = s1.l.c(5, 0.0f, 400.0f, null);
        f149282c = s1.l.c(5, 0.0f, 400.0f, null);
        g6.k.a aVar2 = g6.k.f76003b;
        f149283d = s1.l.c(1, 0.0f, 400.0f, g6.k.a(s1.u2.a()));
        g6.m.a aVar3 = g6.m.f76012b;
        f149284e = s1.l.c(1, 0.0f, 400.0f, g6.m.a(s1.u2.c()));
    }

    public static v1 a(s1.f0 f0Var, h4.d.b bVar, int i14) {
        if ((i14 & 1) != 0) {
            g6.m.a aVar = g6.m.f76012b;
            f0Var = s1.l.c(1, 0.0f, 400.0f, g6.m.a(s1.u2.c()));
        }
        if ((i14 & 2) != 0) {
            h4.d.f81522a.getClass();
            bVar = h4.d.a.f81538p;
        }
        return b(f0Var, m(bVar), new f1(e1.f149076a));
    }

    public static final v1 b(s1.f0 f0Var, h4.d dVar, e23.l lVar) {
        return new v1(new o2(null, null, new h0(dVar, lVar, f0Var, true), null, null, false, null, 123, null));
    }

    public static v1 c(s1.f0 f0Var, h4.d.c cVar, int i14) {
        if ((i14 & 1) != 0) {
            g6.m.a aVar = g6.m.f76012b;
            f0Var = s1.l.c(1, 0.0f, 400.0f, g6.m.a(s1.u2.c()));
        }
        if ((i14 & 2) != 0) {
            h4.d.f81522a.getClass();
            cVar = h4.d.a.f81535m;
        }
        return b(f0Var, n(cVar), new i1(h1.f149099a));
    }

    public static v1 d(s1.f0 f0Var, int i14) {
        if ((i14 & 1) != 0) {
            f0Var = s1.l.c(5, 0.0f, 400.0f, null);
        }
        return new v1(new o2(new y1(0.0f, f0Var), null, null, null, null, false, null, 126, null));
    }

    public static x1 e(s1.f0 f0Var, int i14) {
        if ((i14 & 1) != 0) {
            f0Var = s1.l.c(5, 0.0f, 400.0f, null);
        }
        return new x1(new o2(new y1(0.0f, f0Var), null, null, null, null, false, null, 126, null));
    }

    public static v1 f(s1.b2 b2Var) {
        o4.z1.f129046b.getClass();
        return new v1(new o2(null, null, null, new e2(0.92f, o4.z1.f129047c, b2Var, null), null, false, null, 119, null));
    }

    public static x1 g(s1.b2 b2Var, float f14, int i14) {
        s1.f0 f0VarC = (i14 & 1) != 0 ? s1.l.c(5, 0.0f, 400.0f, null) : b2Var;
        o4.z1.f129046b.getClass();
        return new x1(new o2(null, null, null, new e2(f14, o4.z1.f129047c, f0VarC, null), null, false, null, 119, null));
    }

    public static x1 h(s1.f0 f0Var, h4.d.b bVar, int i14) {
        if ((i14 & 1) != 0) {
            g6.m.a aVar = g6.m.f76012b;
            f0Var = s1.l.c(1, 0.0f, 400.0f, g6.m.a(s1.u2.c()));
        }
        if ((i14 & 2) != 0) {
            h4.d.f81522a.getClass();
            bVar = h4.d.a.f81538p;
        }
        return i(f0Var, m(bVar), new k1(j1.f149127a));
    }

    public static final x1 i(s1.f0 f0Var, h4.d dVar, e23.l lVar) {
        return new x1(new o2(null, null, new h0(dVar, lVar, f0Var, true), null, null, false, null, 123, null));
    }

    public static x1 j(s1.f0 f0Var, h4.d.c cVar, int i14) {
        if ((i14 & 1) != 0) {
            g6.m.a aVar = g6.m.f76012b;
            f0Var = s1.l.c(1, 0.0f, 400.0f, g6.m.a(s1.u2.c()));
        }
        if ((i14 & 2) != 0) {
            h4.d.f81522a.getClass();
            cVar = h4.d.a.f81535m;
        }
        return i(f0Var, n(cVar), new n1(m1.f149166a));
    }

    public static final v1 k(e23.l lVar, s1.f0 f0Var) {
        return new v1(new o2(null, new l2(new q1(lVar), f0Var), null, null, null, false, null, 125, null));
    }

    public static /* synthetic */ v1 l() {
        g6.k.a aVar = g6.k.f76003b;
        return k(p1.f149190a, s1.l.c(1, 0.0f, 400.0f, g6.k.a(s1.u2.a())));
    }

    public static final h4.g m(h4.d.b bVar) {
        h4.d.f81522a.getClass();
        if (p005kotlin.jvm.internal.s.g(bVar, h4.d.a.f81536n)) {
            return h4.d.a.f81527e;
        }
        return p005kotlin.jvm.internal.s.g(bVar, h4.d.a.f81538p) ? h4.d.a.f81529g : h4.d.a.f81528f;
    }

    public static final h4.g n(h4.d.c cVar) {
        h4.d.f81522a.getClass();
        if (p005kotlin.jvm.internal.s.g(cVar, h4.d.a.f81533k)) {
            return h4.d.a.f81525c;
        }
        return p005kotlin.jvm.internal.s.g(cVar, h4.d.a.f81535m) ? h4.d.a.f81531i : h4.d.a.f81528f;
    }
}
