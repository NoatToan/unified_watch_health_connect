package s1;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.animation.core.TransitionKt$rememberTransition$1$1", f = "Transition.kt", l = {2174}, m = "invokeSuspend", v = 1)
public final class y1 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f155853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a2 f155854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f155855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a2<Object> f155856d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(a2<Object> a2Var, t13.d<? super y1> dVar) {
        super(2, dVar);
        this.f155856d = a2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new y1(this.f155856d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((y1) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [S, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, o13.l] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        z53.b bVar;
        a2<Object> a2Var;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f155855c;
        if (i14 == 0) {
            o13.r.b(obj);
            a2<Object> a2Var2 = this.f155856d;
            a1 a1Var = (a1) a2Var2;
            a1Var.getClass();
            ((f4.v) w1.f155836b.getValue()).d(a1Var, w1.f155835a, a1Var.f155467g);
            bVar = a1Var.f155470j;
            this.f155853a = bVar;
            this.f155854b = a2Var2;
            this.f155855c = 1;
            if (bVar.c(this) == aVar) {
                return aVar;
            }
            a2Var = a2Var2;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a2Var = this.f155854b;
            bVar = this.f155853a;
            o13.r.b(obj);
        }
        try {
            ((a1) a2Var).f155464d = ((a1) a2Var).f155462b.getF182175a();
            o53.k kVar = ((a1) a2Var).f155469i;
            if (kVar != null) {
                int i15 = o13.q.f128596b;
                kVar.resumeWith(((a1) a2Var).f155462b.getF182175a());
            }
            ((a1) a2Var).f155469i = null;
            Unit unit = Unit.INSTANCE;
            return Unit.INSTANCE;
        } finally {
            bVar.e(null);
        }
    }
}
