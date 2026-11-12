package g2;

import p005kotlin.Metadata;
import p005kotlin.Unit;
import s1.e2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg2/b1;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o53.c2 f75056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s1.m<Float, s1.n> f75057b;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
    @v13.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutScrollDeltaBetweenPasses$updateScrollDeltaForApproach$2$1", f = "LazyLayoutScrollDeltaBetweenPasses.kt", l = {79}, m = "invokeSuspend", v = 1)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f75058a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return b1.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f75058a;
            if (i14 == 0) {
                o13.r.b(obj);
                s1.m<Float, s1.n> mVar = b1.this.f75057b;
                Float f14 = new Float(0.0f);
                s1.j1 j1VarC = s1.l.c(1, 0.0f, 400.0f, new Float(0.5f));
                this.f75058a = 1;
                if (s1.q1.f(mVar, f14, j1VarC, true, null, this, 8) == aVar) {
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

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public b1() {
        p005kotlin.jvm.internal.m mVar = p005kotlin.jvm.internal.m.f105803a;
        s1.d2 d2Var = e2.f155568a;
        Object objValueOf = Float.valueOf(0.0f);
        this.f75057b = new s1.m<>(d2Var, objValueOf, (s1.r) d2Var.f155546a.invoke((T) objValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(float f14, g6.c cVar, o53.b0 b0Var) {
        if (f14 <= cVar.s0(c1.f75068a)) {
            return;
        }
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, Unit> f68799i = fVarA != null ? fVarA.getF68733f() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            float fFloatValue = ((Number) this.f75057b.f155628b.getF182175a()).floatValue();
            o53.c2 c2Var = this.f75056a;
            if (c2Var != null) {
                c2Var.c(null);
            }
            s1.m<Float, s1.n> mVar = this.f75057b;
            if (mVar.f155632f) {
                this.f75057b = s1.v.d(mVar, fFloatValue - f14, 0.0f, 30);
            } else {
                p005kotlin.jvm.internal.m mVar2 = p005kotlin.jvm.internal.m.f105803a;
                this.f75057b = new s1.m<>(e2.f155568a, Float.valueOf(-f14), null, 0L, 0L, false, 60, null);
            }
            this.f75056a = ge1.b.T(b0Var, null, null, new a(null), 3);
            Unit unit = Unit.INSTANCE;
        } finally {
            f4.f.a.e(fVarA, fVarB, f68799i);
        }
    }
}
