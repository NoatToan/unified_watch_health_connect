package r1;

import com.google.firebase.perf.util.Constants;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005R\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lr1/t1;", "Lr1/c2;", "Ls1/t1;", "Lr1/r0;", "transition", "Ls1/t1$a;", "Lg6/m;", "Ls1/o;", "sizeAnimation", "Lg6/k;", "offsetAnimation", "slideAnimation", "Lr1/u1;", "enter", "Lr1/w1;", "exit", "Lkotlin/Function0;", "", Constants.ENABLE_DISABLE, "Lr1/b2;", "graphicsLayerBlock", "<init>", "(Ls1/t1;Ls1/t1$a;Ls1/t1$a;Ls1/t1$a;Lr1/u1;Lr1/w1;Le23/a;Lr1/b2;)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class t1 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s1.t1<r0> f149249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s1.t1<r0>.a<g6.m, s1.o> f149250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s1.t1<r0>.a<g6.k, s1.o> f149251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s1.t1<r0>.a<g6.k, s1.o> f149252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u1 f149253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public w1 f149254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e23.a<Boolean> f149255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b2 f149256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f149257i = g0.f149086a;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h4.d f149258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f149259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f149260l;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f149261a;

        static {
            int[] iArr = new int[r0.values().length];
            try {
                iArr[r0.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[r0.PreEnter.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[r0.PostExit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f149261a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.l<f5.v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f5.v1 f149262a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f5.v1 v1Var) {
            super(1);
            this.f149262a = v1Var;
        }

        @Override // e23.l
        public final Unit invoke(f5.v1.a aVar) {
            aVar.r(this.f149262a, 0, 0, 0.0f);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.l<f5.v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f5.v1 f149263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f149264b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f149265c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.l<o4.t0, Unit> f149266d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(f5.v1 v1Var, long j8, long j14, e23.l<? super o4.t0, Unit> lVar) {
            super(1);
            this.f149263a = v1Var;
            this.f149264b = j8;
            this.f149265c = j14;
            this.f149266d = lVar;
        }

        @Override // e23.l
        public final Unit invoke(f5.v1.a aVar) {
            f5.v1.a aVar2 = aVar;
            g6.k.a aVar3 = g6.k.f76003b;
            long j8 = this.f149264b;
            long j14 = this.f149265c;
            aVar2.J(this.f149263a, ((int) (j8 >> 32)) + ((int) (j14 >> 32)), ((int) (j8 & 4294967295L)) + ((int) (j14 & 4294967295L)), 0.0f, this.f149266d);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lf5/v1$a;", "", "invoke", "(Lf5/v1$a;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.l<f5.v1.a, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f5.v1 f149267a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f5.v1 v1Var) {
            super(1);
            this.f149267a = v1Var;
        }

        @Override // e23.l
        public final Unit invoke(f5.v1.a aVar) {
            aVar.r(this.f149267a, 0, 0, 0.0f);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr1/r0;", "it", "Lg6/m;", "invoke-YEO4UFw", "(Lr1/r0;)J", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.l<r0, g6.m> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f149269b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j8) {
            super(1);
            this.f149269b = j8;
        }

        @Override // e23.l
        public final g6.m invoke(r0 r0Var) {
            e23.l<g6.m, g6.m> lVar;
            e23.l<g6.m, g6.m> lVar2;
            t1 t1Var = t1.this;
            t1Var.getClass();
            int i14 = a.f149261a[r0Var.ordinal()];
            long j8 = this.f149269b;
            if (i14 != 1) {
                if (i14 == 2) {
                    h0 h0Var = t1Var.f149253e.getF149295c().f149183c;
                    if (h0Var != null && (lVar = h0Var.f149095b) != null) {
                        j8 = lVar.invoke(g6.m.a(j8)).f76013a;
                    }
                } else {
                    if (i14 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    h0 h0Var2 = t1Var.f149254f.getF149312d().f149183c;
                    if (h0Var2 != null && (lVar2 = h0Var2.f149095b) != null) {
                        j8 = lVar2.invoke(g6.m.a(j8)).f76013a;
                    }
                }
            }
            return g6.m.a(j8);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls1/t1$b;", "Lr1/r0;", "Ls1/f0;", "Lg6/k;", "invoke", "(Ls1/t1$b;)Ls1/f0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.l<s1.t1.b<r0>, s1.f0<g6.k>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f149270a = new f();

        public f() {
            super(1);
        }

        @Override // e23.l
        public final s1.f0<g6.k> invoke(s1.t1.b<r0> bVar) {
            return u0.f149283d;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr1/r0;", "it", "Lg6/k;", "invoke-Bjo55l4", "(Lr1/r0;)J", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.l<r0, g6.k> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f149272b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j8) {
            super(1);
            this.f149272b = j8;
        }

        @Override // e23.l
        public final g6.k invoke(r0 r0Var) {
            int i14;
            r0 r0Var2 = r0Var;
            t1 t1Var = t1.this;
            long jD = 0;
            if (t1Var.f149258j == null || t1Var.U1() == null || p005kotlin.jvm.internal.s.g(t1Var.f149258j, t1Var.U1()) || (i14 = a.f149261a[r0Var2.ordinal()]) == 1 || i14 == 2) {
                g6.k.f76003b.getClass();
            } else {
                if (i14 != 3) {
                    lc.u0.r();
                    return null;
                }
                h0 h0Var = t1Var.f149254f.getF149312d().f149183c;
                if (h0Var != null) {
                    e23.l<g6.m, g6.m> lVar = h0Var.f149095b;
                    long j8 = this.f149272b;
                    long j14 = lVar.invoke(g6.m.a(j8)).f76013a;
                    h4.d dVarU1 = t1Var.U1();
                    dVarU1.getClass();
                    g6.o oVar = g6.o.Ltr;
                    long jA = dVarU1.a(j8, j14, oVar);
                    h4.d dVar = t1Var.f149258j;
                    dVar.getClass();
                    jD = g6.k.d(jA, dVar.a(j8, j14, oVar));
                } else {
                    g6.k.f76003b.getClass();
                }
            }
            return g6.k.a(jD);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr1/r0;", "it", "Lg6/k;", "invoke-Bjo55l4", "(Lr1/r0;)J", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.l<r0, g6.k> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f149274b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(long j8) {
            super(1);
            this.f149274b = j8;
        }

        @Override // e23.l
        public final g6.k invoke(r0 r0Var) {
            long j8;
            long j14;
            e23.l<g6.m, g6.k> lVar;
            e23.l<g6.m, g6.k> lVar2;
            r0 r0Var2 = r0Var;
            t1 t1Var = t1.this;
            l2 l2Var = t1Var.f149253e.getF149295c().f149182b;
            long j15 = this.f149274b;
            long j16 = 0;
            if (l2Var == null || (lVar2 = l2Var.f149143a) == null) {
                g6.k.f76003b.getClass();
                j8 = 0;
            } else {
                j8 = lVar2.invoke(g6.m.a(j15)).f76005a;
            }
            l2 l2Var2 = t1Var.f149254f.getF149312d().f149182b;
            if (l2Var2 == null || (lVar = l2Var2.f149143a) == null) {
                g6.k.f76003b.getClass();
                j14 = 0;
            } else {
                j14 = lVar.invoke(g6.m.a(j15)).f76005a;
            }
            int i14 = a.f149261a[r0Var2.ordinal()];
            if (i14 == 1) {
                g6.k.f76003b.getClass();
            } else if (i14 == 2) {
                j16 = j8;
            } else {
                if (i14 != 3) {
                    lc.u0.r();
                    return null;
                }
                j16 = j14;
            }
            return g6.k.a(j16);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls1/t1$b;", "Lr1/r0;", "Ls1/f0;", "Lg6/m;", "invoke", "(Ls1/t1$b;)Ls1/f0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class i extends p005kotlin.jvm.internal.w implements e23.l<s1.t1.b<r0>, s1.f0<g6.m>> {
        public i() {
            super(1);
        }

        @Override // e23.l
        public final s1.f0<g6.m> invoke(s1.t1.b<r0> bVar) {
            s1.t1.b<r0> bVar2 = bVar;
            r0 r0Var = r0.PreEnter;
            r0 r0Var2 = r0.Visible;
            boolean zA = bVar2.a(r0Var, r0Var2);
            s1.f0<g6.m> f0Var = null;
            t1 t1Var = t1.this;
            if (zA) {
                h0 h0Var = t1Var.f149253e.getF149295c().f149183c;
                if (h0Var != null) {
                    f0Var = h0Var.f149096c;
                }
            } else if (bVar2.a(r0Var2, r0.PostExit)) {
                h0 h0Var2 = t1Var.f149254f.getF149312d().f149183c;
                if (h0Var2 != null) {
                    f0Var = h0Var2.f149096c;
                }
            } else {
                f0Var = u0.f149284e;
            }
            return f0Var == null ? u0.f149284e : f0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls1/t1$b;", "Lr1/r0;", "Ls1/f0;", "Lg6/k;", "invoke", "(Ls1/t1$b;)Ls1/f0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class j extends p005kotlin.jvm.internal.w implements e23.l<s1.t1.b<r0>, s1.f0<g6.k>> {
        public j() {
            super(1);
        }

        @Override // e23.l
        public final s1.f0<g6.k> invoke(s1.t1.b<r0> bVar) {
            s1.f0<g6.k> f0Var;
            s1.f0<g6.k> f0Var2;
            s1.t1.b<r0> bVar2 = bVar;
            r0 r0Var = r0.PreEnter;
            r0 r0Var2 = r0.Visible;
            boolean zA = bVar2.a(r0Var, r0Var2);
            t1 t1Var = t1.this;
            if (zA) {
                l2 l2Var = t1Var.f149253e.getF149295c().f149182b;
                return (l2Var == null || (f0Var2 = l2Var.f149144b) == null) ? u0.f149283d : f0Var2;
            }
            if (!bVar2.a(r0Var2, r0.PostExit)) {
                return u0.f149283d;
            }
            l2 l2Var2 = t1Var.f149254f.getF149312d().f149182b;
            return (l2Var2 == null || (f0Var = l2Var2.f149144b) == null) ? u0.f149283d : f0Var;
        }
    }

    public t1(s1.t1<r0> t1Var, s1.t1<r0>.a<g6.m, s1.o> aVar, s1.t1<r0>.a<g6.k, s1.o> aVar2, s1.t1<r0>.a<g6.k, s1.o> aVar3, u1 u1Var, w1 w1Var, e23.a<Boolean> aVar4, b2 b2Var) {
        this.f149249a = t1Var;
        this.f149250b = aVar;
        this.f149251c = aVar2;
        this.f149252d = aVar3;
        this.f149253e = u1Var;
        this.f149254f = w1Var;
        this.f149255g = aVar4;
        this.f149256h = b2Var;
        g6.b.b(0, 0, 15);
        this.f149259k = new i();
        this.f149260l = new j();
    }

    public final h4.d U1() {
        h4.d dVar;
        h4.d dVar2;
        if (this.f149249a.f().a(r0.PreEnter, r0.Visible)) {
            h0 h0Var = this.f149253e.getF149295c().f149183c;
            if (h0Var != null && (dVar2 = h0Var.f149094a) != null) {
                return dVar2;
            }
            h0 h0Var2 = this.f149254f.getF149312d().f149183c;
            if (h0Var2 != null) {
                return h0Var2.f149094a;
            }
            return null;
        }
        h0 h0Var3 = this.f149254f.getF149312d().f149183c;
        if (h0Var3 != null && (dVar = h0Var3.f149094a) != null) {
            return dVar;
        }
        h0 h0Var4 = this.f149253e.getF149295c().f149183c;
        if (h0Var4 != null) {
            return h0Var4.f149094a;
        }
        return null;
    }

    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        long j14;
        long j15;
        long j16;
        s1.t1.a.C2947a c2947aA = null;
        if (this.f149249a.f155744a.a() == this.f149249a.f155747d.getF182175a()) {
            this.f149258j = null;
        } else if (this.f149258j == null) {
            h4.d dVarU1 = U1();
            if (dVarU1 == null) {
                h4.d.f81522a.getClass();
                dVarU1 = h4.d.a.f81524b;
            }
            this.f149258j = dVarU1;
        }
        if (b1Var.t1()) {
            f5.v1 v1VarQ = y0Var.Q(j8);
            long j17 = (((long) v1VarQ.f69144a) << 32) | (((long) v1VarQ.f69145b) & 4294967295L);
            g6.m.a aVar = g6.m.f76012b;
            this.f149257i = j17;
            return f5.b1.h0(b1Var, (int) (j17 >> 32), (int) (j17 & 4294967295L), new b(v1VarQ));
        }
        if (!this.f149255g.invoke().booleanValue()) {
            f5.v1 v1VarQ2 = y0Var.Q(j8);
            return f5.b1.h0(b1Var, v1VarQ2.f69144a, v1VarQ2.f69145b, new d(v1VarQ2));
        }
        x0 x0VarA = this.f149256h.a();
        f5.v1 v1VarQ3 = y0Var.Q(j8);
        long j18 = (((long) v1VarQ3.f69144a) << 32) | (((long) v1VarQ3.f69145b) & 4294967295L);
        g6.m.a aVar2 = g6.m.f76012b;
        long j19 = !g6.m.c(this.f149257i, g0.f149086a) ? this.f149257i : j18;
        s1.t1<r0>.a<g6.m, s1.o> aVar3 = this.f149250b;
        if (aVar3 != null) {
            c2947aA = aVar3.a(this.f149259k, new e(j19));
        }
        if (c2947aA != null) {
            j18 = ((g6.m) c2947aA.getF182175a()).f76013a;
        }
        long jD = g6.b.d(j8, j18);
        s1.t1<r0>.a<g6.k, s1.o> aVar4 = this.f149251c;
        long jA = 0;
        if (aVar4 != null) {
            j14 = ((g6.k) aVar4.a(f.f149270a, new g(j19)).getF182175a()).f76005a;
        } else {
            g6.k.f76003b.getClass();
            j14 = 0;
        }
        s1.t1<r0>.a<g6.k, s1.o> aVar5 = this.f149252d;
        if (aVar5 != null) {
            j15 = ((g6.k) aVar5.a(this.f149260l, new h(j19)).getF182175a()).f76005a;
        } else {
            g6.k.f76003b.getClass();
            j15 = 0;
        }
        h4.d dVar = this.f149258j;
        if (dVar != null) {
            long j24 = j19;
            j16 = j15;
            jA = dVar.a(j24, jD, g6.o.Ltr);
        } else {
            j16 = j15;
            g6.k.f76003b.getClass();
        }
        return f5.b1.h0(b1Var, (int) (jD >> 32), (int) (jD & 4294967295L), new c(v1VarQ3, g6.k.e(jA, j16), j14, x0VarA));
    }

    @Override // h4.r.c
    public final void onAttach() {
        super.onAttach();
        this.f149257i = g0.f149086a;
    }
}
