package f5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B5\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lf5/q1;", "Lh4/r$c;", "Lh5/i1;", "Lh5/g2;", "", "minDurationMs", "", "minFractionVisible", "Lf5/b0;", "viewportBounds", "Lkotlin/Function1;", "", "", "callback", "<init>", "(JFLf5/b0;Le23/l;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q1 extends h4.r.c implements h5.i1, h5.g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f69063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f69064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e23.l<? super Boolean, Unit> f69065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b0 f69066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q5.g.a f69067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o53.c2 f69068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f69069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f69070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q5.f f69071i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public q5.f f69072j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b f69073k = new b();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "androidx.compose.ui.layout.OnVisibilityChangedNode$checkVisibility$1", f = "OnVisibilityChangedModifier.kt", l = {219}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f69074a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return q1.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f69074a;
            q1 q1Var = q1.this;
            if (i14 == 0) {
                o13.r.b(obj);
                long j8 = q1Var.f69063a;
                this.f69074a = 1;
                if (o53.m0.b(j8, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            q1Var.W1();
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lq5/f;", "bounds", "", "invoke", "(Lq5/f;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends p005kotlin.jvm.internal.w implements e23.l<q5.f, Unit> {
        public b() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.l
        public final Unit invoke(q5.f fVar) {
            q5.f fVar2 = fVar;
            q1 q1Var = q1.this;
            b0 b0Var = q1Var.f69066d;
            q5.f fVar3 = b0Var != null ? (q5.f) b0Var.f68896a.getF182175a() : null;
            q1Var.f69072j = fVar3;
            q1Var.U1(q1Var.f69064b, fVar2, fVar3);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public c() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e23.a
        public final Unit invoke() {
            q1 q1Var = q1.this;
            b0 b0Var = q1Var.f69066d;
            q5.f fVar = b0Var != null ? (q5.f) b0Var.f68896a.getF182175a() : null;
            if (!p005kotlin.jvm.internal.s.g(q1Var.f69072j, fVar)) {
                q1Var.f69072j = fVar;
                q5.f fVar2 = q1Var.f69071i;
                if (fVar2 != null) {
                    q1Var.U1(q1Var.f69064b, fVar2, fVar);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public q1(long j8, float f14, b0 b0Var, e23.l<? super Boolean, Unit> lVar) {
        this.f69063a = j8;
        this.f69064b = f14;
        this.f69065c = lVar;
        this.f69066d = b0Var;
    }

    @Override // h5.g2
    public final void D0() {
        V1();
    }

    public final void U1(float f14, q5.f fVar, q5.f fVar2) {
        float fA;
        this.f69071i = fVar;
        if (fVar2 != null || this.f69066d == null) {
            if (fVar2 != null) {
                fVar.getClass();
                long j8 = fVar2.f142843a;
                long j14 = fVar2.f142844b;
                fA = fVar.a((int) (j8 >> 32), (int) j8, (int) (j14 >> 32), (int) j14);
            } else {
                long j15 = fVar.f142847e;
                fA = fVar.a(0, 0, (int) (j15 >> 32), (int) j15);
            }
            boolean z14 = fA > f14 || fA == 1.0f;
            if (z14 != this.f69069g) {
                this.f69069g = z14;
                o53.c2 c2Var = this.f69068f;
                if (c2Var != null) {
                    c2Var.c(null);
                }
                this.f69068f = null;
                if (z14 != this.f69070h) {
                    if (!z14 || this.f69063a <= 0) {
                        W1();
                    } else {
                        this.f69068f = ge1.b.T(getCoroutineScope(), null, null, new a(null), 3);
                    }
                }
            }
        }
    }

    public final void V1() {
        o53.c2 c2Var = this.f69068f;
        if (c2Var != null) {
            c2Var.c(null);
        }
        this.f69068f = null;
        this.f69069g = false;
        if (this.f69070h) {
            W1();
        }
    }

    public final void W1() {
        o53.c2 c2Var = this.f69068f;
        if (c2Var != null) {
            c2Var.c(null);
        }
        this.f69068f = null;
        this.f69065c.invoke(Boolean.valueOf(this.f69069g));
        this.f69070h = this.f69069g;
    }

    public final void X1() {
        if (this.f69066d != null) {
            h5.j1.a(this, new c());
            return;
        }
        if (this.f69072j != null) {
            this.f69072j = null;
            q5.f fVar = this.f69071i;
            if (fVar != null) {
                U1(this.f69064b, fVar, null);
            }
        }
    }

    @Override // h4.r.c
    public final void onAttach() {
        q5.g.a aVar = this.f69067e;
        if (aVar != null) {
            aVar.b();
        }
        this.f69067e = g0.i(this, this.f69073k);
        X1();
    }

    @Override // h4.r.c
    public final void onDetach() {
        q5.g.a aVar = this.f69067e;
        if (aVar != null) {
            aVar.b();
        }
        V1();
    }

    @Override // h4.r.c
    public final void onReset() {
        V1();
        o53.c2 c2Var = this.f69068f;
        if (c2Var != null) {
            c2Var.c(null);
        }
        this.f69068f = null;
        this.f69069g = false;
        this.f69071i = null;
        this.f69072j = null;
    }

    @Override // h5.i1
    public final void x1() {
        X1();
    }
}
