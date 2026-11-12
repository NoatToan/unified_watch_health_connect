package h2;

import g2.r1;
import g2.s1;
import g2.x1;
import g2.y0;
import g2.z0;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.math.MathKt;
import p008y1.e3;
import p008y1.o2;
import p3.a2;
import p3.a4;
import p3.c2;
import p3.p1;
import p3.t1;
import p3.z1;
import s1.b2;
import u1.k1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B)\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lh2/j0;", "Ly1/e3;", "", "currentPage", "", "currentPageOffsetFraction", "Lg2/x1;", "prefetchScheduler", "<init>", "(IFLg2/x1;)V", "(IF)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class j0 implements e3 {
    public final g2.c A;
    public final c2 B;
    public final c C;
    public long D;
    public final y0 E;
    public final p1<Unit> F;
    public final p1<Unit> G;
    public final c2 H;
    public final c2 I;
    public final c2 J;
    public final c2 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f80925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b0 f80926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f80927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e0 f80928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f80929e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f80930f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f80931g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f80932h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f80933i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f80934j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p008y1.c0 f80935k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f80936l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f80937m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public z0.b f80938n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f80939o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c2 f80940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public g6.c f80941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f80942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a2.k f80943s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a2 f80944t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final a2 f80945u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p3.d0 f80946v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p3.d0 f80947w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z0 f80948x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final m f80949y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final g2.n f80950z;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h2/j0$a", "", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public a(j0 j0Var) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h2/j0$b", "Lg2/t;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements g2.t {
        public b() {
        }

        @Override // g2.t
        public final int a() {
            return j0.this.f80942r;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h2/j0$c", "Lf5/a2;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c implements f5.a2 {
        public c() {
        }

        @Override // f5.a2
        public final void I1(h5.e0 e0Var) {
            j0.this.B.setValue(e0Var);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @v13.e(c = "androidx.compose.foundation.pager.PagerState", f = "PagerState.kt", l = {691, 696}, m = "scroll$suspendImpl", v = 1)
    public static final class d extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j0 f80953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k1 f80954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public v13.i f80955c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f80956d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f80958f;

        public d(t13.d<? super d> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f80956d = obj;
            this.f80958f |= Integer.MIN_VALUE;
            return j0.v(j0.this, null, null, this);
        }
    }

    public j0(int i14, float f14, x1 x1Var) {
        double d14 = f14;
        if (-0.5d > d14 || d14 > 0.5d) {
            b2.e.a("currentPageOffsetFraction " + f14 + " is not within the range -0.5 to 0.5");
        }
        n4.c.f123541b.getClass();
        this.f80927c = p3.p0.n(n4.c.a(0L));
        this.f80928d = new e0(i14, f14, this);
        this.f80929e = i14;
        this.f80931g = Long.MAX_VALUE;
        final int i15 = 0;
        this.f80935k = new p008y1.c0(new e23.l(this) { // from class: h2.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f80922b;

            {
                this.f80922b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Long] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // e23.l
            public final Object invoke(Object obj) {
                b0 b0Var;
                int i16 = i15;
                b0 b0Var2 = null;
                j0 j0Var = this.f80922b;
                switch (i16) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jP = gl.b.p(j0Var);
                        float f15 = j0Var.f80933i + fFloatValue;
                        long jD = MathKt.d(f15);
                        j0Var.f80933i = f15 - jD;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j8 = jP + jD;
                            long jG = j23.t.g(j8, j0Var.f80932h, j0Var.f80931g);
                            ?? r14 = j8 != jG;
                            long j14 = jG - jP;
                            float f16 = j14;
                            j0Var.f80934j = f16;
                            if (Math.abs(j14) != 0) {
                                j0Var.J.setValue(Boolean.valueOf(f16 > 0.0f));
                                j0Var.K.setValue(Boolean.valueOf(f16 < 0.0f));
                            }
                            int i17 = (int) j14;
                            int i18 = -i17;
                            b0 b0VarH = ((b0) j0Var.f80940p.getF182175a()).h(i18);
                            if (b0VarH == null || (b0Var = j0Var.f80926b) == null) {
                                b0Var2 = b0VarH;
                            } else {
                                b0 b0VarH2 = b0Var.h(i18);
                                if (b0VarH2 != null) {
                                    j0Var.f80926b = b0VarH2;
                                    b0Var2 = b0VarH;
                                }
                            }
                            if (b0Var2 != null) {
                                j0Var.h(b0Var2, j0Var.f80925a, true);
                                j0Var.F.setValue(Unit.INSTANCE);
                            } else {
                                e0 e0Var = j0Var.f80928d;
                                j0 j0Var2 = e0Var.f80894a;
                                z1 z1Var = e0Var.f80896c;
                                z1Var.i(z1Var.getFloatValue() + (j0Var2.q() != 0 ? i17 / j0Var2.q() : 0.0f));
                                f5.z1 z1Var2 = (f5.z1) j0Var.B.getF182175a();
                                if (z1Var2 != null) {
                                    z1Var2.l();
                                }
                            }
                            if (r14 != false) {
                                ValueOf = Long.valueOf(j14);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        r1 r1Var = (r1) obj;
                        f4.f.f68735e.getClass();
                        f4.f fVarA = f4.f.a.a();
                        e23.l<Object, Unit> f68799i = fVarA != null ? fVarA.getF68799i() : null;
                        f4.f fVarB = f4.f.a.b(fVarA);
                        try {
                            r1Var.a(j0Var.f80929e);
                            Unit unit = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        } finally {
                            f4.f.a.e(fVarA, fVarB, f68799i);
                        }
                }
            }
        });
        this.f80936l = true;
        this.f80937m = -1;
        b0 b0Var = o0.f80985c;
        t1 t1Var = t1.f135313a;
        t1Var.getClass();
        this.f80940p = new c2(b0Var, t1Var);
        this.f80941q = o0.f80984b;
        this.f80943s = new a2.k();
        this.f80944t = new a2(-1);
        this.f80945u = new a2(i14);
        a4 a4Var = a4.f135041a;
        a4Var.getClass();
        this.f80946v = p3.p0.g(a4Var, new ds.g0(this, 3));
        this.f80947w = p3.p0.g(a4Var, new ds.g0(this, 4));
        final int i16 = 1;
        z0 z0Var = new z0(x1Var, new e23.l(this) { // from class: h2.i0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j0 f80922b;

            {
                this.f80922b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Long] */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // e23.l
            public final Object invoke(Object obj) {
                b0 b0Var2;
                int i17 = i16;
                b0 b0Var3 = null;
                j0 j0Var = this.f80922b;
                switch (i17) {
                    case 0:
                        ?? ValueOf = (Float) obj;
                        float fFloatValue = ValueOf.floatValue();
                        long jP = gl.b.p(j0Var);
                        float f15 = j0Var.f80933i + fFloatValue;
                        long jD = MathKt.d(f15);
                        j0Var.f80933i = f15 - jD;
                        if (Math.abs(fFloatValue) >= 1.0E-4f) {
                            long j8 = jP + jD;
                            long jG = j23.t.g(j8, j0Var.f80932h, j0Var.f80931g);
                            ?? r14 = j8 != jG;
                            long j14 = jG - jP;
                            float f16 = j14;
                            j0Var.f80934j = f16;
                            if (Math.abs(j14) != 0) {
                                j0Var.J.setValue(Boolean.valueOf(f16 > 0.0f));
                                j0Var.K.setValue(Boolean.valueOf(f16 < 0.0f));
                            }
                            int i18 = (int) j14;
                            int i19 = -i18;
                            b0 b0VarH = ((b0) j0Var.f80940p.getF182175a()).h(i19);
                            if (b0VarH == null || (b0Var2 = j0Var.f80926b) == null) {
                                b0Var3 = b0VarH;
                            } else {
                                b0 b0VarH2 = b0Var2.h(i19);
                                if (b0VarH2 != null) {
                                    j0Var.f80926b = b0VarH2;
                                    b0Var3 = b0VarH;
                                }
                            }
                            if (b0Var3 != null) {
                                j0Var.h(b0Var3, j0Var.f80925a, true);
                                j0Var.F.setValue(Unit.INSTANCE);
                            } else {
                                e0 e0Var = j0Var.f80928d;
                                j0 j0Var2 = e0Var.f80894a;
                                z1 z1Var = e0Var.f80896c;
                                z1Var.i(z1Var.getFloatValue() + (j0Var2.q() != 0 ? i18 / j0Var2.q() : 0.0f));
                                f5.z1 z1Var2 = (f5.z1) j0Var.B.getF182175a();
                                if (z1Var2 != null) {
                                    z1Var2.l();
                                }
                            }
                            if (r14 != false) {
                                ValueOf = Long.valueOf(j14);
                            }
                            fFloatValue = ValueOf.floatValue();
                        }
                        return Float.valueOf(fFloatValue);
                    default:
                        r1 r1Var = (r1) obj;
                        f4.f.f68735e.getClass();
                        f4.f fVarA = f4.f.a.a();
                        e23.l<Object, Unit> f68799i = fVarA != null ? fVarA.getF68799i() : null;
                        f4.f fVarB = f4.f.a.b(fVarA);
                        try {
                            r1Var.a(j0Var.f80929e);
                            Unit unit = Unit.INSTANCE;
                            return Unit.INSTANCE;
                        } finally {
                            f4.f.a.e(fVarA, fVarB, f68799i);
                        }
                }
            }
        });
        this.f80948x = z0Var;
        b bVar = new b();
        new a(this);
        this.f80949y = new m(bVar, z0Var, new ds.g0(this, 5));
        this.f80950z = new g2.n();
        this.A = new g2.c();
        this.B = p3.p0.n(null);
        this.C = new c();
        this.D = g6.b.b(0, 0, 15);
        this.E = new y0();
        this.F = s1.a();
        this.G = s1.a();
        Boolean bool = Boolean.FALSE;
        this.H = p3.p0.n(bool);
        this.I = p3.p0.n(bool);
        this.J = p3.p0.n(bool);
        this.K = p3.p0.n(bool);
    }

    public static /* synthetic */ Object g(j0 j0Var, int i14, b2 b2Var, t13.d dVar, int i15) {
        s1.k kVarC = b2Var;
        if ((i15 & 4) != 0) {
            kVarC = s1.l.c(7, 0.0f, 0.0f, null);
        }
        return j0Var.f(i14, kVarC, dVar);
    }

    public static int j(boolean z14, b0 b0Var) {
        List<h> list = b0Var.f80844a;
        int i14 = b0Var.f80852i;
        if (!z14) {
            return (((i) p13.h0.b0(list)).getF80906a() - i14) - 1;
        }
        int i15 = i14 + 1;
        if (i15 < 0) {
            return Integer.MAX_VALUE;
        }
        return ((i) p13.h0.m0(list)).getF80906a() + i15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void u(j0 j0Var, int i14) {
        if (j0Var.f80935k.a()) {
            ge1.b.T(((b0) j0Var.f80940p.getF182175a()).f80863t, null, null, new m0(j0Var, null), 3);
        }
        j0Var.x(i14, 0.0f, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0075, code lost:
    
        if (r8.b(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object v(j0 j0Var, k1 k1Var, e23.p<? super o2, ? super t13.d<? super Unit>, ? extends Object> pVar, t13.d<? super Unit> dVar) {
        d dVar2;
        e23.p pVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i14 = dVar2.f80958f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar2.f80958f = i14 - Integer.MIN_VALUE;
            } else {
                dVar2 = j0Var.new d(dVar);
            }
        } else {
            dVar2 = j0Var.new d(dVar);
        }
        Object obj = dVar2.f80956d;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar2.f80958f;
        if (i15 == 0) {
            o13.r.b(obj);
            dVar2.f80953a = j0Var;
            dVar2.f80954b = k1Var;
            dVar2.f80955c = (v13.i) pVar;
            dVar2.f80958f = 1;
            if (j0Var.i(dVar2) != obj2) {
            }
            pVar2 = pVar;
            return obj2;
        }
        if (i15 == 1) {
            e23.p pVar3 = (e23.p) dVar2.f80955c;
            k1Var = dVar2.f80954b;
            j0Var = dVar2.f80953a;
            o13.r.b(obj);
            pVar2 = pVar3;
        } else {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j0Var = dVar2.f80953a;
            o13.r.b(obj);
        }
        j0Var.f80944t.t(-1);
        return Unit.INSTANCE;
        pVar2 = pVar;
        if (!j0Var.f80935k.a()) {
            j0Var.f80945u.t(j0Var.l());
        }
        p008y1.c0 c0Var = j0Var.f80935k;
        dVar2.f80953a = j0Var;
        dVar2.f80954b = null;
        dVar2.f80955c = null;
        dVar2.f80958f = 2;
    }

    public static Object w(j0 j0Var, int i14, t13.d dVar) {
        j0Var.getClass();
        Object objB = j0Var.b(k1.Default, new n0(j0Var, 0.0f, i14, null), dVar);
        return objB == u13.a.COROUTINE_SUSPENDED ? objB : Unit.INSTANCE;
    }

    @Override // p008y1.e3
    public final boolean a() {
        return this.f80935k.a();
    }

    @Override // p008y1.e3
    public final Object b(k1 k1Var, e23.p<? super o2, ? super t13.d<? super Unit>, ? extends Object> pVar, t13.d<? super Unit> dVar) {
        return v(this, k1Var, pVar, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p008y1.e3
    public final boolean c() {
        return ((Boolean) this.H.getF182175a()).booleanValue();
    }

    @Override // p008y1.e3
    public final float d(float f14) {
        return this.f80935k.d(f14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p008y1.e3
    public final boolean e() {
        return ((Boolean) this.I.getF182175a()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        if (b(u1.k1.Default, r5, r0) == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(int i14, s1.k kVar, t13.d dVar) {
        k0 k0Var;
        if (dVar instanceof k0) {
            k0Var = (k0) dVar;
            int i15 = k0Var.f80965e;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                k0Var.f80965e = i15 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(this, dVar);
            }
        } else {
            k0Var = new k0(this, dVar);
        }
        Object obj = k0Var.f80963c;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = k0Var.f80965e;
        if (i16 != 0) {
            if (i16 == 1) {
                i14 = k0Var.f80961a;
                kVar = k0Var.f80962b;
                o13.r.b(obj);
            } else {
                if (i16 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        if ((i14 == l() && m() == 0.0f) || o() == 0) {
            return Unit.INSTANCE;
        }
        k0Var.f80962b = kVar;
        k0Var.f80961a = i14;
        k0Var.f80965e = 1;
        if (i(k0Var) == obj2) {
        }
        return obj2;
        s1.k kVar2 = kVar;
        double d14 = 0.0f;
        if (-0.5d > d14 || d14 > 0.5d) {
            b2.e.a("pageOffsetFraction 0.0 is not within the range -0.5 to 0.5");
        }
        e23.p<? super o2, ? super t13.d<? super Unit>, ? extends Object> l0Var = new l0(this, k(i14), 0.0f * q(), kVar2, null);
        k0Var.f80962b = null;
        k0Var.f80965e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0127 A[Catch: all -> 0x0176, TryCatch #0 {all -> 0x0176, blocks: (B:53:0x00c3, B:57:0x00d3, B:60:0x00dc, B:63:0x00e9, B:65:0x00f7, B:77:0x0132, B:71:0x0127, B:68:0x010f), top: B:92:0x00c3 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x012d  */
    /* JADX WARN: Code duplicated, block: B:74:0x012e  */
    public final void h(b0 b0Var, boolean z14, boolean z15) {
        List<h> list = b0Var.f80844a;
        int i14 = b0Var.f80856m;
        h hVar = b0Var.f80853j;
        h hVar2 = b0Var.f80854k;
        float f14 = b0Var.f80855l;
        this.f80948x.f75317f = list.size();
        int i15 = b0Var.f80845b;
        this.f80942r = b0Var.f80846c + i15;
        if (!z14 && this.f80925a) {
            this.f80926b = b0Var;
            return;
        }
        boolean z16 = true;
        if (z14) {
            this.f80925a = true;
        }
        e0 e0Var = this.f80928d;
        if (z15) {
            e0Var.f80896c.i(f14);
        } else {
            e0Var.getClass();
            e0Var.f80898e = hVar2 != null ? hVar2.f80910e : null;
            if (e0Var.f80897d || !list.isEmpty()) {
                e0Var.f80897d = true;
                int i16 = hVar2 != null ? hVar2.f80906a : 0;
                e0Var.f80895b.t(i16);
                e0Var.f80899f.a(i16);
                e0Var.f80896c.i(f14);
            }
            boolean z17 = u1.g0.f167494a;
            if (this.f80937m != -1 && !list.isEmpty()) {
                if (this.f80937m != j(this.f80939o, b0Var)) {
                    this.f80937m = -1;
                    z0.b bVar = this.f80938n;
                    if (bVar != null) {
                        bVar.cancel();
                    }
                    this.f80938n = null;
                }
            }
        }
        this.f80940p.setValue(b0Var);
        this.H.setValue(Boolean.valueOf(b0Var.f80857n));
        this.I.setValue(Boolean.valueOf(((hVar != null ? hVar.f80906a : 0) == 0 && i14 == 0) ? false : true));
        if (hVar != null) {
            this.f80929e = hVar.f80906a;
        }
        this.f80930f = i14;
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, Unit> f68793s = fVarA != null ? fVarA.getF68799i() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            if (this.f80936l && b0Var.f80852i < o() && Math.abs(this.f80934j) > 0.5f) {
                float f15 = this.f80934j;
                if (n().getF80848e() == p008y1.b2.Vertical) {
                    if (Math.signum(f15) != Math.signum(-Float.intBitsToFloat((int) (r() & 4294967295L)))) {
                        if (s()) {
                            z16 = false;
                        }
                    }
                } else if (Math.signum(f15) != Math.signum(-Float.intBitsToFloat((int) (r() >> 32)))) {
                    if (s()) {
                        z16 = false;
                    }
                }
                if (z16) {
                    boolean z18 = u1.g0.f167494a;
                    t(this.f80934j, b0Var);
                    Unit unit = Unit.INSTANCE;
                }
            }
            f4.f.a.e(fVarA, fVarB, f68793s);
            this.f80931g = o0.a(b0Var, o());
            o();
            int iA = (int) (b0Var.f80848e == p008y1.b2.Horizontal ? b0Var.a() >> 32 : b0Var.a() & 4294967295L);
            long jE = j23.t.e(b0Var.f80858o.c(iA, i15, -b0Var.f80849f, b0Var.f80847d), 0, iA);
            long j8 = this.f80931g;
            if (jE > j8) {
                jE = j8;
            }
            this.f80932h = jE;
        } catch (Throwable th3) {
            f4.f.a.e(fVarA, fVarB, f68793s);
            throw th3;
        }
    }

    public final Object i(v13.c cVar) {
        Object objA;
        return (this.f80940p.getF182175a() == o0.f80985c && (objA = this.A.a(cVar)) == u13.a.COROUTINE_SUSPENDED) ? objA : Unit.INSTANCE;
    }

    public final int k(int i14) {
        if (o() > 0) {
            return j23.t.e(i14, 0, o() - 1);
        }
        return 0;
    }

    public final int l() {
        return this.f80928d.f80895b.getIntValue();
    }

    public final float m() {
        return this.f80928d.f80896c.getFloatValue();
    }

    public final v n() {
        return (v) this.f80940p.getF182175a();
    }

    public abstract int o();

    /* JADX WARN: Multi-variable type inference failed */
    public final int p() {
        return ((b0) this.f80940p.getF182175a()).f80845b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int q() {
        return ((b0) this.f80940p.getF182175a()).f80846c + p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long r() {
        return ((n4.c) this.f80927c.getF182175a()).f123544a;
    }

    public final boolean s() {
        return ((int) Float.intBitsToFloat((int) (r() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (r() & 4294967295L))) == 0;
    }

    public final void t(float f14, b0 b0Var) {
        z0.b bVar;
        z0.b bVar2;
        z0.b bVar3;
        List<h> list = b0Var.f80844a;
        if (this.f80936l && !list.isEmpty()) {
            boolean z14 = f14 > 0.0f;
            int iJ = j(z14, b0Var);
            if (iJ < 0 || iJ >= o()) {
                return;
            }
            if (iJ != this.f80937m) {
                if (this.f80939o != z14 && (bVar3 = this.f80938n) != null) {
                    bVar3.cancel();
                }
                this.f80939o = z14;
                this.f80937m = iJ;
                this.f80938n = this.f80948x.a(iJ, this.D, true, null);
            }
            if (z14) {
                if ((((i) p13.h0.m0(list)).getF80918m() + (b0Var.f80846c + b0Var.f80845b)) - b0Var.f80850g >= f14 || (bVar2 = this.f80938n) == null) {
                    return;
                }
                bVar2.d();
                return;
            }
            if (b0Var.f80849f - ((i) p13.h0.b0(list)).getF80918m() >= (-f14) || (bVar = this.f80938n) == null) {
                return;
            }
            bVar.d();
        }
    }

    public final void x(int i14, float f14, boolean z14) {
        e0 e0Var = this.f80928d;
        a2 a2Var = e0Var.f80895b;
        z1 z1Var = e0Var.f80896c;
        if (a2Var.getIntValue() != i14 || z1Var.getFloatValue() != f14) {
            this.f80949y.m();
        }
        e0Var.f80895b.t(i14);
        e0Var.f80899f.a(i14);
        z1Var.i(f14);
        e0Var.f80898e = null;
        if (!z14) {
            this.G.setValue(Unit.INSTANCE);
            return;
        }
        f5.z1 z1Var2 = (f5.z1) this.B.getF182175a();
        if (z1Var2 != null) {
            z1Var2.l();
        }
    }

    public j0() {
        this(0, 0.0f, null, 7, null);
    }

    public /* synthetic */ j0(int i14, float f14, x1 x1Var, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? 0.0f : f14, (i15 & 4) != 0 ? null : x1Var);
    }

    public /* synthetic */ j0(int i14, float f14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 0 : i14, (i15 & 2) != 0 ? 0.0f : f14);
    }

    public j0(int i14, float f14) {
        this(i14, f14, null);
    }
}
