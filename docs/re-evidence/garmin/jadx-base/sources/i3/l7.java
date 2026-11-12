package i3;

import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Li3/l7;", "Lh5/m;", "Lh5/h;", "", "enabled", "isError", "La2/i;", "interactionSource", "Li3/sg;", "colors", "Lo4/r1;", "textFieldShape", "Lg6/f;", "focusedIndicatorWidth", "unfocusedIndicatorWidth", "<init>", "(ZZLa2/i;Li3/sg;Lo4/r1;FFLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l7 extends h5.m implements h5.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f88835c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f88836d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a2.i f88837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f88838f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f88839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f88840h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o53.c2 f88841i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sg f88842j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public s1.b<o4.d0, s1.q> f88843k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public o4.r1 f88844l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final s1.b<g6.f, s1.n> f88845m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final l4.b f88846n;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$1", f = "TextField.kt", l = {1599}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f88847a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l7.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            s1.k kVarB;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f88847a;
            if (i14 == 0) {
                o13.r.b(obj);
                l7 l7Var = l7.this;
                s1.b<o4.d0, s1.q> bVar = l7Var.f88843k;
                if (bVar != null) {
                    sg sgVarD = l7Var.f88842j;
                    if (sgVarD == null) {
                        wg wgVar = wg.f90137a;
                        j2 j2Var = (j2) h5.i.a(l7Var, k2.f88658a);
                        z2.t2 t2Var = (z2.t2) h5.i.a(l7Var, z2.u2.f201804a);
                        wgVar.getClass();
                        sgVarD = wg.d(j2Var, t2Var);
                    }
                    o4.d0 d0VarA = o4.d0.a(sgVarD.c(l7Var.f88835c, l7Var.f88836d, l7Var.f88840h));
                    if (l7Var.f88835c) {
                        s7.f89624a.getClass();
                        kVarB = k9.a((j9) h5.i.a(l7Var, u7.f89886a), n3.h0.FastEffects);
                    } else {
                        kVarB = s1.l.b();
                    }
                    s1.k kVar = kVarB;
                    this.f88847a = 1;
                    obj = s1.b.c(bVar, d0VarA, kVar, null, this, 12);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.IndicatorLineNode$invalidateIndicator$2", f = "TextField.kt", l = {1611}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f88849a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l7.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            s1.k kVarB;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f88849a;
            if (i14 == 0) {
                o13.r.b(obj);
                l7 l7Var = l7.this;
                s1.b<g6.f, s1.n> bVar = l7Var.f88845m;
                g6.f fVarA = g6.f.a((l7Var.f88840h && l7Var.f88835c) ? l7Var.f88838f : l7Var.f88839g);
                if (l7Var.f88835c) {
                    s7.f89624a.getClass();
                    kVarB = k9.a((j9) h5.i.a(l7Var, u7.f89886a), n3.h0.FastSpatial);
                } else {
                    kVarB = s1.l.b();
                }
                s1.k kVar = kVarB;
                this.f88849a = 1;
                if (s1.b.c(bVar, fVarA, kVar, null, this, 12) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.IndicatorLineNode$onAttach$1", f = "TextField.kt", l = {1569}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f88851a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return l7.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f88851a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f88851a = 1;
                if (l7.X1(l7.this, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private l7(boolean z14, boolean z15, a2.i iVar, sg sgVar, o4.r1 r1Var, float f14, float f15) {
        this.f88835c = z14;
        this.f88836d = z15;
        this.f88837e = iVar;
        this.f88838f = f14;
        this.f88839g = f15;
        this.f88842j = sgVar;
        this.f88844l = r1Var;
        this.f88845m = new s1.b<>(g6.f.a((this.f88840h && z14) ? f14 : f15), s1.e2.f155570c, null, null, 12, null);
        l4.c cVar = new l4.c(new l4.f(), new ho0.g(this, 14));
        U1(cVar);
        this.f88846n = cVar;
    }

    public static final Object X1(l7 l7Var, v13.i iVar) {
        l7Var.f88840h = false;
        Object objCollect = l7Var.f88837e.c().collect(new m7(new ArrayList(), l7Var), iVar);
        return objCollect == u13.a.COROUTINE_SUSPENDED ? objCollect : Unit.INSTANCE;
    }

    public final void Y1() {
        ge1.b.T(getCoroutineScope(), null, null, new a(null), 3);
        ge1.b.T(getCoroutineScope(), null, null, new b(null), 3);
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    @Override // h4.r.c
    public final void onAttach() {
        this.f88841i = ge1.b.T(getCoroutineScope(), null, null, new c(null), 3);
        if (this.f88843k == null) {
            sg sgVarD = this.f88842j;
            if (sgVarD == null) {
                wg wgVar = wg.f90137a;
                j2 j2Var = (j2) h5.i.a(this, k2.f88658a);
                z2.t2 t2Var = (z2.t2) h5.i.a(this, z2.u2.f201804a);
                wgVar.getClass();
                sgVarD = wg.d(j2Var, t2Var);
            }
            long jC = sgVarD.c(this.f88835c, this.f88836d, this.f88840h);
            this.f88843k = new s1.b<>(o4.d0.a(jC), r1.k0.f149133a.invoke(o4.d0.g(jC)), null, null, 12, null);
        }
    }

    public /* synthetic */ l7(boolean z14, boolean z15, a2.i iVar, sg sgVar, o4.r1 r1Var, float f14, float f15, p005kotlin.jvm.internal.j jVar) {
        this(z14, z15, iVar, sgVar, r1Var, f14, f15);
    }
}
