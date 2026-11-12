package g2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.e2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000bB+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lg2/v;", "", "Lo53/b0;", "coroutineScope", "Lo4/q0;", "graphicsContext", "Lkotlin/Function0;", "", "onLayerPropertyChanged", "<init>", "(Lo53/b0;Lo4/q0;Le23/a;)V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f75250s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final long f75251t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o53.b0 f75252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o4.q0 f75253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e23.a<Unit> f75254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public s1.f0<Float> f75255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s1.f0<g6.k> f75256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1.f0<Float> f75257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f75258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p3.c2 f75259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p3.c2 f75260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p3.c2 f75261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p3.c2 f75262k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f75263l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f75264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public r4.c f75265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s1.b<g6.k, s1.o> f75266o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s1.b<Float, s1.n> f75267p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p3.c2 f75268q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f75269r;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", f = "LazyLayoutItemAnimation.kt", l = {171}, m = "invokeSuspend", v = 1)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f75270a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return v.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f75270a;
            if (i14 == 0) {
                o13.r.b(obj);
                s1.b<Float, s1.n> bVar = v.this.f75267p;
                Float f14 = new Float(1.0f);
                this.f75270a = 1;
                if (bVar.g(f14, this) == aVar) {
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
    @v13.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend", v = 1)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f75272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f75273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v f75274c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ s1.f0<Float> f75275d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ r4.c f75276e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z14, v vVar, s1.f0<Float> f0Var, r4.c cVar, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f75273b = z14;
            this.f75274c = vVar;
            this.f75275d = f0Var;
            this.f75276e = cVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f75273b, this.f75274c, this.f75275d, this.f75276e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        
            if (r13 == r0) goto L22;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f75272a;
            int i15 = 0;
            v vVar = this.f75274c;
            try {
                if (i14 == 0) {
                    o13.r.b(obj);
                    if (this.f75273b) {
                        s1.b<Float, s1.n> bVar = vVar.f75267p;
                        Float f14 = new Float(0.0f);
                        this.f75272a = 1;
                        if (bVar.g(f14, this) == aVar) {
                        }
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                a aVar2 = v.f75250s;
                vVar.d(false);
                return Unit.INSTANCE;
                s1.b<Float, s1.n> bVar2 = vVar.f75267p;
                Float f15 = new Float(1.0f);
                s1.f0<Float> f0Var = this.f75275d;
                w wVar = new w(this.f75276e, vVar, i15);
                this.f75272a = 2;
                obj = s1.b.c(bVar2, f15, f0Var, wVar, this, 4);
            } catch (Throwable th3) {
                a aVar3 = v.f75250s;
                vVar.d(false);
                throw th3;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", l = {218}, m = "invokeSuspend", v = 1)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f75277a;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return v.this.new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f75277a;
            if (i14 == 0) {
                o13.r.b(obj);
                s1.b<g6.k, s1.o> bVar = v.this.f75266o;
                this.f75277a = 1;
                if (bVar.h(this) == aVar) {
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
    @v13.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", l = {222}, m = "invokeSuspend", v = 1)
    public static final class e extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f75279a;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return v.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f75279a;
            if (i14 == 0) {
                o13.r.b(obj);
                s1.b<Float, s1.n> bVar = v.this.f75267p;
                this.f75279a = 1;
                if (bVar.h(this) == aVar) {
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
    @v13.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", l = {226}, m = "invokeSuspend", v = 1)
    public static final class f extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f75281a;

        public f(t13.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return v.this.new f(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f75281a;
            if (i14 == 0) {
                o13.r.b(obj);
                s1.b<Float, s1.n> bVar = v.this.f75267p;
                this.f75281a = 1;
                if (bVar.h(this) == aVar) {
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

    static {
        long j8 = Integer.MAX_VALUE;
        g6.k.a aVar = g6.k.f76003b;
        f75251t = (j8 & 4294967295L) | (j8 << 32);
    }

    public v(o53.b0 b0Var, o4.q0 q0Var, e23.a<Unit> aVar) {
        this.f75252a = b0Var;
        this.f75253b = q0Var;
        this.f75254c = aVar;
        Boolean bool = Boolean.FALSE;
        this.f75259h = p3.p0.n(bool);
        this.f75260i = p3.p0.n(bool);
        this.f75261j = p3.p0.n(bool);
        this.f75262k = p3.p0.n(bool);
        long j8 = f75251t;
        this.f75263l = j8;
        g6.k.f76003b.getClass();
        this.f75264m = 0L;
        this.f75265n = q0Var != null ? q0Var.a() : null;
        String str = null;
        this.f75266o = new s1.b<>(g6.k.a(0L), e2.f155574g, null, str, 12, null);
        Float fValueOf = Float.valueOf(1.0f);
        p005kotlin.jvm.internal.m mVar = p005kotlin.jvm.internal.m.f105803a;
        this.f75267p = new s1.b<>(fValueOf, e2.f155568a, str, null, 12, null);
        this.f75268q = p3.p0.n(g6.k.a(0L));
        this.f75269r = j8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        r4.c cVar = this.f75265n;
        s1.f0<Float> f0Var = this.f75255d;
        boolean zBooleanValue = ((Boolean) this.f75260i.getF182175a()).booleanValue();
        o53.b0 b0Var = this.f75252a;
        if (zBooleanValue || f0Var == null || cVar == null) {
            if (b()) {
                if (cVar != null) {
                    cVar.f(1.0f);
                }
                ge1.b.T(b0Var, null, null, new b(null), 3);
                return;
            }
            return;
        }
        d(true);
        boolean zB = b();
        boolean z14 = !zB;
        if (!zB) {
            cVar.f(0.0f);
        }
        ge1.b.T(b0Var, null, null, new c(z14, this, f0Var, cVar, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b() {
        return ((Boolean) this.f75261j.getF182175a()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        o4.q0 q0Var;
        boolean zBooleanValue = ((Boolean) this.f75259h.getF182175a()).booleanValue();
        o53.b0 b0Var = this.f75252a;
        if (zBooleanValue) {
            f(false);
            ge1.b.T(b0Var, null, null, new d(null), 3);
        }
        if (((Boolean) this.f75260i.getF182175a()).booleanValue()) {
            d(false);
            ge1.b.T(b0Var, null, null, new e(null), 3);
        }
        if (b()) {
            e(false);
            ge1.b.T(b0Var, null, null, new f(null), 3);
        }
        this.f75258g = false;
        g6.k.f76003b.getClass();
        g(0L);
        this.f75263l = f75251t;
        r4.c cVar = this.f75265n;
        if (cVar != null && (q0Var = this.f75253b) != null) {
            q0Var.b(cVar);
        }
        this.f75265n = null;
        this.f75255d = null;
        this.f75257f = null;
        this.f75256e = null;
    }

    public final void d(boolean z14) {
        this.f75260i.setValue(Boolean.valueOf(z14));
    }

    public final void e(boolean z14) {
        this.f75261j.setValue(Boolean.valueOf(z14));
    }

    public final void f(boolean z14) {
        this.f75259h.setValue(Boolean.valueOf(z14));
    }

    public final void g(long j8) {
        this.f75268q.setValue(g6.k.a(j8));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg2/v$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ v(o53.b0 b0Var, o4.q0 q0Var, e23.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(b0Var, (i14 & 2) != 0 ? null : q0Var, (i14 & 4) != 0 ? new g12.m(1) : aVar);
    }
}
