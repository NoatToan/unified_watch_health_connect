package r1;

import ch.qos.logback.core.joran.action.Action;
import kotlin.v3;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003\u000b\f\rB'\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u0010²\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lr1/q;", "S", "Lr1/n;", "Ls1/t1;", "transition", "Lh4/d;", "contentAlignment", "Lg6/o;", "layoutDirection", "<init>", "(Ls1/t1;Lh4/d;Lg6/o;)V", "a", "b", "c", "", "shouldAnimateSize", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q<S> implements n<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1.t1<S> f149191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h4.d f149192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g6.o f149193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p3.c2 f149194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p1.t0<S, x3<g6.m>> f149195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1.t1.a.C2947a f149196f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lr1/q$a;", "Lf5/s1;", "", "isTarget", "<init>", "(Z)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements f5.s1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p3.c2 f149197a;

        public a(boolean z14) {
            this.f149197a = p3.p0.n(Boolean.valueOf(z14));
        }

        @Override // f5.s1
        public final Object r(g6.c cVar, Object obj) {
            return this;
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002BE\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004R\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lr1/q$b;", "S", "Lh5/x0;", "Lr1/q$c;", "Ls1/t1$a;", "Lg6/m;", "Ls1/o;", "Ls1/t1;", "sizeAnimation", "Lp3/x3;", "Lr1/j2;", "sizeTransform", "Lr1/q;", Action.SCOPE_ATTRIBUTE, "<init>", "(Ls1/t1$a;Lp3/x3;Lr1/q;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b<S> extends h5.x0<c<S>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s1.t1<S>.a<g6.m, s1.o> f149198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final x3<j2> f149199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q<S> f149200c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(s1.t1<S>.a<g6.m, s1.o> aVar, x3<? extends j2> x3Var, q<S> qVar) {
            this.f149198a = aVar;
            this.f149199b = x3Var;
            this.f149200c = qVar;
        }

        @Override // h5.x0
        public final h4.r.c create() {
            return new c(this.f149198a, this.f149199b, this.f149200c);
        }

        @Override // h5.x0
        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(bVar.f149198a, this.f149198a) && p005kotlin.jvm.internal.s.g(bVar.f149199b, this.f149199b);
        }

        @Override // h5.x0
        public final int hashCode() {
            int iHashCode = this.f149200c.hashCode() * 31;
            s1.t1<S>.a<g6.m, s1.o> aVar = this.f149198a;
            return this.f149199b.hashCode() + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }

        @Override // h5.x0
        public final void inspectableProperties(kotlin.m2 m2Var) {
            m2Var.f91341a = "sizeTransform";
            v3 v3Var = m2Var.f91343c;
            v3Var.c(this.f149198a, "sizeAnimation");
            v3Var.c(this.f149199b, "sizeTransform");
            v3Var.c(this.f149200c, Action.SCOPE_ATTRIBUTE);
        }

        @Override // h5.x0
        public final void update(h4.r.c cVar) {
            c cVar2 = (c) cVar;
            cVar2.f149201a = this.f149198a;
            cVar2.f149202b = this.f149199b;
            cVar2.f149203c = this.f149200c;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002BE\u0012\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003R\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr1/q$c;", "S", "Lr1/c2;", "Ls1/t1$a;", "Lg6/m;", "Ls1/o;", "Ls1/t1;", "sizeAnimation", "Lp3/x3;", "Lr1/j2;", "sizeTransform", "Lr1/q;", Action.SCOPE_ATTRIBUTE, "<init>", "(Ls1/t1$a;Lp3/x3;Lr1/q;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c<S> extends c2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s1.t1<S>.a<g6.m, s1.o> f149201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public x3<? extends j2> f149202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q<S> f149203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f149204d = r1.b.f148978a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        public static final class a extends p005kotlin.jvm.internal.w implements e23.l<f5.v1.a, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c<S> f149205a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f5.v1 f149206b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ long f149207c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c<S> cVar, f5.v1 v1Var, long j8) {
                super(1);
                this.f149205a = cVar;
                this.f149206b = v1Var;
                this.f149207c = j8;
            }

            @Override // e23.l
            public final Unit invoke(f5.v1.a aVar) {
                h4.d dVar = this.f149205a.f149203c.f149192b;
                f5.v1 v1Var = this.f149206b;
                long j8 = (((long) v1Var.f69145b) & 4294967295L) | (((long) v1Var.f69144a) << 32);
                g6.m.a aVar2 = g6.m.f76012b;
                f5.v1.a.y(aVar, v1Var, dVar.a(j8, this.f149207c, g6.o.Ltr));
                return Unit.INSTANCE;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"S", "Ls1/t1$b;", "Ls1/f0;", "Lg6/m;", "invoke", "(Ls1/t1$b;)Ls1/f0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        public static final class b extends p005kotlin.jvm.internal.w implements e23.l<s1.t1.b<S>, s1.f0<g6.m>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c<S> f149208a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f149209b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c<S> cVar, long j8) {
                super(1);
                this.f149208a = cVar;
                this.f149209b = j8;
            }

            @Override // e23.l
            public final s1.f0<g6.m> invoke(Object obj) {
                long j8;
                s1.f0<g6.m> f0VarA;
                s1.t1.b bVar = (s1.t1.b) obj;
                Object objC = bVar.c();
                c<S> cVar = this.f149208a;
                long j14 = 0;
                if (p005kotlin.jvm.internal.s.g(objC, cVar.f149203c.c())) {
                    j8 = g6.m.c(cVar.f149204d, r1.b.f148978a) ? this.f149209b : cVar.f149204d;
                } else {
                    x3<g6.m> x3VarD = cVar.f149203c.f149195e.d((S) bVar.c());
                    if (x3VarD != null) {
                        j8 = x3VarD.getF182175a().f76013a;
                    } else {
                        g6.m.f76012b.getClass();
                        j8 = 0;
                    }
                }
                x3<g6.m> x3VarD2 = cVar.f149203c.f149195e.d((S) bVar.f());
                if (x3VarD2 != null) {
                    j14 = x3VarD2.getF182175a().f76013a;
                } else {
                    g6.m.f76012b.getClass();
                }
                j2 f182175a = cVar.f149202b.getF182175a();
                return (f182175a == null || (f0VarA = f182175a.a(j8, j14)) == null) ? s1.l.c(5, 0.0f, 400.0f, null) : f0VarA;
            }
        }

        /* JADX INFO: renamed from: r1.q$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"S", "it", "Lg6/m;", "invoke-YEO4UFw", "(Ljava/lang/Object;)J", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        public static final class C2814c extends p005kotlin.jvm.internal.w implements e23.l<S, g6.m> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c<S> f149210a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f149211b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2814c(c<S> cVar, long j8) {
                super(1);
                this.f149210a = cVar;
                this.f149211b = j8;
            }

            @Override // e23.l
            public final g6.m invoke(Object obj) {
                long j8;
                c<S> cVar = this.f149210a;
                if (p005kotlin.jvm.internal.s.g(obj, cVar.f149203c.c())) {
                    j8 = g6.m.c(cVar.f149204d, r1.b.f148978a) ? this.f149211b : cVar.f149204d;
                } else {
                    x3<g6.m> x3VarD = cVar.f149203c.f149195e.d(obj);
                    if (x3VarD != null) {
                        j8 = x3VarD.getF182175a().f76013a;
                    } else {
                        g6.m.f76012b.getClass();
                        j8 = 0;
                    }
                }
                return g6.m.a(j8);
            }
        }

        public c(s1.t1<S>.a<g6.m, s1.o> aVar, x3<? extends j2> x3Var, q<S> qVar) {
            this.f149201a = aVar;
            this.f149202b = x3Var;
            this.f149203c = qVar;
        }

        @Override // h5.c0
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
            long j14;
            f5.v1 v1VarQ = y0Var.Q(j8);
            if (b1Var.t1()) {
                j14 = (((long) v1VarQ.f69144a) << 32) | (((long) v1VarQ.f69145b) & 4294967295L);
                g6.m.a aVar = g6.m.f76012b;
            } else {
                s1.t1<S>.a<g6.m, s1.o> aVar2 = this.f149201a;
                int i14 = v1VarQ.f69144a;
                if (aVar2 == null) {
                    j14 = (((long) i14) << 32) | (((long) v1VarQ.f69145b) & 4294967295L);
                    g6.m.a aVar3 = g6.m.f76012b;
                    this.f149204d = j14;
                } else {
                    long j15 = (((long) v1VarQ.f69145b) & 4294967295L) | (((long) i14) << 32);
                    g6.m.a aVar4 = g6.m.f76012b;
                    s1.t1.a.C2947a c2947aA = aVar2.a(new b(this, j15), new C2814c(this, j15));
                    this.f149203c.f149196f = c2947aA;
                    j14 = ((g6.m) c2947aA.getF182175a()).f76013a;
                    this.f149204d = ((g6.m) c2947aA.getF182175a()).f76013a;
                }
            }
            return f5.b1.h0(b1Var, (int) (j14 >> 32), (int) (4294967295L & j14), new a(this, v1VarQ, j14));
        }

        @Override // h4.r.c
        public final void onReset() {
            super.onReset();
            this.f149204d = r1.b.f148978a;
        }
    }

    public q(s1.t1<S> t1Var, h4.d dVar, g6.o oVar) {
        this.f149191a = t1Var;
        this.f149192b = dVar;
        this.f149193c = oVar;
        g6.m.f76012b.getClass();
        this.f149194d = p3.p0.n(g6.m.a(0L));
        this.f149195e = p1.g1.b();
    }

    public static final long g(q qVar, long j8, long j14) {
        return qVar.f149192b.a(j8, j14, g6.o.Ltr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long h(q qVar) {
        s1.t1.a.C2947a c2947a = qVar.f149196f;
        return c2947a != null ? ((g6.m) c2947a.getF182175a()).f76013a : ((g6.m) qVar.f149194d.getF182175a()).f76013a;
    }

    @Override // r1.n
    public final x1 b(int i14, s1.b2 b2Var, e23.l lVar) {
        if (i(i14)) {
            v vVar = new v(this, lVar);
            s1.d2 d2Var = u0.f149280a;
            return new x1(new o2(null, new l2(new r1(vVar), b2Var), null, null, null, false, null, 125, null));
        }
        if (j(i14)) {
            w wVar = new w(this, lVar);
            s1.d2 d2Var2 = u0.f149280a;
            return new x1(new o2(null, new l2(new r1(wVar), b2Var), null, null, null, false, null, 125, null));
        }
        n.a.f149168b.getClass();
        if (i14 == n.a.f149170d) {
            x xVar = new x(this, lVar);
            s1.d2 d2Var3 = u0.f149280a;
            return new x1(new o2(null, new l2(new s1(xVar), b2Var), null, null, null, false, null, 125, null));
        }
        if (i14 != n.a.f149171e) {
            w1.f149304a.getClass();
            return w1.f149305b;
        }
        y yVar = new y(this, lVar);
        s1.d2 d2Var4 = u0.f149280a;
        return new x1(new o2(null, new l2(new s1(yVar), b2Var), null, null, null, false, null, 125, null));
    }

    @Override // s1.t1.b
    public final S c() {
        return this.f149191a.f().c();
    }

    @Override // r1.n
    public final l0 d(l0 l0Var, j2 j2Var) {
        l0Var.f149141d = j2Var;
        return l0Var;
    }

    @Override // r1.n
    public final v1 e(int i14, s1.b2 b2Var, e23.l lVar) {
        if (i(i14)) {
            r rVar = new r(lVar, this);
            s1.d2 d2Var = u0.f149280a;
            return new v1(new o2(null, new l2(new o1(rVar), b2Var), null, null, null, false, null, 125, null));
        }
        if (j(i14)) {
            s sVar = new s(lVar, this);
            s1.d2 d2Var2 = u0.f149280a;
            return new v1(new o2(null, new l2(new o1(sVar), b2Var), null, null, null, false, null, 125, null));
        }
        n.a.f149168b.getClass();
        if (i14 == n.a.f149170d) {
            return u0.k(new t(lVar, this), b2Var);
        }
        if (i14 == n.a.f149171e) {
            return u0.k(new u(lVar, this), b2Var);
        }
        u1.f149287a.getClass();
        return u1.f149288b;
    }

    @Override // s1.t1.b
    public final S f() {
        return this.f149191a.f().f();
    }

    public final boolean i(int i14) {
        n.a.f149168b.getClass();
        if (i14 == 0) {
            return true;
        }
        if (i14 == n.a.f149172f && this.f149193c == g6.o.Ltr) {
            return true;
        }
        return i14 == n.a.f149173g && this.f149193c == g6.o.Rtl;
    }

    public final boolean j(int i14) {
        n.a.f149168b.getClass();
        if (i14 == n.a.f149169c) {
            return true;
        }
        if (i14 == n.a.f149172f && this.f149193c == g6.o.Rtl) {
            return true;
        }
        return i14 == n.a.f149173g && this.f149193c == g6.o.Ltr;
    }
}
