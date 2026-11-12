package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B%\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Li3/oh;", "Lh4/r$c;", "Lh5/c0;", "La2/i;", "interactionSource", "", "checked", "Ls1/f0;", "", "animationSpec", "<init>", "(La2/i;ZLs1/f0;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class oh extends h4.r.c implements h5.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a2.i f89216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f89217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s1.f0<Float> f89218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f89219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public s1.b<Float, s1.n> f89220e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1.b<Float, s1.n> f89221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f89222g = Float.NaN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f89223h = Float.NaN;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.material3.ThumbNode$measure$1", f = "Switch.kt", l = {272}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f89224a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f89226c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f14, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f89226c = f14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return oh.this.new a(this.f89226c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f89224a;
            if (i14 == 0) {
                o13.r.b(obj);
                oh ohVar = oh.this;
                s1.b<Float, s1.n> bVar = ohVar.f89221f;
                if (bVar != null) {
                    Float f14 = new Float(this.f89226c);
                    s1.k kVar = ohVar.f89219d ? hf.f88351f : ohVar.f89218c;
                    this.f89224a = 1;
                    obj = s1.b.c(bVar, f14, kVar, null, this, 12);
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
    @v13.e(c = "androidx.compose.material3.ThumbNode$measure$2", f = "Switch.kt", l = {278}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f89227a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f89229c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f14, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f89229c = f14;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return oh.this.new b(this.f89229c, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f89227a;
            if (i14 == 0) {
                o13.r.b(obj);
                oh ohVar = oh.this;
                s1.b<Float, s1.n> bVar = ohVar.f89220e;
                if (bVar != null) {
                    Float f14 = new Float(this.f89229c);
                    s1.k kVar = ohVar.f89219d ? hf.f88351f : ohVar.f89218c;
                    this.f89227a = 1;
                    obj = s1.b.c(bVar, f14, kVar, null, this, 12);
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
    @v13.e(c = "androidx.compose.material3.ThumbNode$onAttach$1", f = "Switch.kt", l = {227}, m = "invokeSuspend")
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f89230a;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class a<T> implements r53.j {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ p005kotlin.jvm.internal.p0 f89232a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ oh f89233b;

            public a(p005kotlin.jvm.internal.p0 p0Var, oh ohVar) {
                this.f89232a = p0Var;
                this.f89233b = ohVar;
            }

            @Override // r53.j
            public final Object emit(Object obj, t13.d dVar) {
                a2.h hVar = (a2.h) obj;
                boolean z14 = hVar instanceof a2.l.b;
                p005kotlin.jvm.internal.p0 p0Var = this.f89232a;
                if (z14) {
                    p0Var.f105807a++;
                } else if ((hVar instanceof a2.l.c) || (hVar instanceof a2.l.a)) {
                    p0Var.f105807a--;
                }
                boolean z15 = p0Var.f105807a > 0;
                oh ohVar = this.f89233b;
                if (ohVar.f89219d != z15) {
                    ohVar.f89219d = z15;
                    h5.k.g(ohVar).T();
                }
                return Unit.INSTANCE;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return oh.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f89230a;
            if (i14 == 0) {
                o13.r.b(obj);
                p005kotlin.jvm.internal.p0 p0Var = new p005kotlin.jvm.internal.p0();
                oh ohVar = oh.this;
                r53.i<a2.h> iVarC = ohVar.f89216a.c();
                a aVar2 = new a(p0Var, ohVar);
                this.f89230a = 1;
                if (iVarC.collect(aVar2, this) == aVar) {
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

    public oh(a2.i iVar, boolean z14, s1.f0<Float> f0Var) {
        this.f89216a = iVar;
        this.f89217b = z14;
        this.f89218c = f0Var;
    }

    @Override // h4.r.c
    /* JADX INFO: renamed from: getShouldAutoInvalidate */
    public final boolean getF69013b() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h5.c0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final f5.a1 mo5measure3p2s80s(f5.b1 b1Var, f5.y0 y0Var, long j8) {
        float f14;
        boolean z14 = (y0Var.a0(g6.a.j(j8)) == 0 || y0Var.l0(g6.a.i(j8)) == 0) ? false : true;
        if (this.f89219d) {
            n3.c1.f122741a.getClass();
            f14 = n3.c1.f122755o;
        } else {
            f14 = (z14 || this.f89217b) ? hf.f88346a : hf.f88347b;
        }
        float fS0 = b1Var.s0(f14);
        s1.b<Float, s1.n> bVar = this.f89221f;
        int iFloatValue = (int) (bVar != null ? bVar.e().floatValue() : fS0);
        g6.a.f75987b.getClass();
        f5.v1 v1VarQ = y0Var.Q(g6.a.C1525a.c(iFloatValue, iFloatValue));
        float fD1 = hf.f88349d - b1Var.d1(fS0);
        g6.f.a aVar = g6.f.f75994b;
        float fS1 = b1Var.s0(fD1 / 2.0f);
        float fS2 = b1Var.s0((hf.f88348c - hf.f88346a) - hf.f88350e);
        boolean z15 = this.f89219d;
        if (z15 && this.f89217b) {
            n3.c1.f122741a.getClass();
            fS1 = fS2 - b1Var.s0(n3.c1.f122759s);
        } else if (z15 && !this.f89217b) {
            n3.c1.f122741a.getClass();
            fS1 = b1Var.s0(n3.c1.f122759s);
        } else if (this.f89217b) {
            fS1 = fS2;
        }
        s1.b<Float, s1.n> bVar2 = this.f89221f;
        int i14 = 3;
        if (!p005kotlin.jvm.internal.s.e(bVar2 != null ? (Float) bVar2.f155491e.getF182175a() : null, fS0)) {
            ge1.b.T(getCoroutineScope(), null, null, new a(fS0, null), 3);
        }
        s1.b<Float, s1.n> bVar3 = this.f89220e;
        if (!p005kotlin.jvm.internal.s.e(bVar3 != null ? (Float) bVar3.f155491e.getF182175a() : null, fS1)) {
            ge1.b.T(getCoroutineScope(), null, null, new b(fS1, null), 3);
        }
        if (Float.isNaN(this.f89223h) && Float.isNaN(this.f89222g)) {
            this.f89223h = fS0;
            this.f89222g = fS1;
        }
        return f5.b1.h0(b1Var, iFloatValue, iFloatValue, new cq.p(v1VarQ, this, fS1, i14));
    }

    @Override // h4.r.c
    public final void onAttach() {
        ge1.b.T(getCoroutineScope(), null, null, new c(null), 3);
    }
}
