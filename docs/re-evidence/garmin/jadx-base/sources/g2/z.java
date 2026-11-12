package g2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", l = {106}, m = "invokeSuspend", v = 1)
public final class z extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f75310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f75311b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(v vVar, t13.d<? super z> dVar) {
        super(2, dVar);
        this.f75311b = vVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new z(this.f75311b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((z) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f75310a;
        v vVar = this.f75311b;
        if (i14 == 0) {
            o13.r.b(obj);
            s1.b<g6.k, s1.o> bVar = vVar.f75266o;
            g6.k.f76003b.getClass();
            g6.k kVarA = g6.k.a(0L);
            this.f75310a = 1;
            if (bVar.g(kVarA, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        g6.k.f76003b.getClass();
        v.a aVar2 = v.f75250s;
        vVar.g(0L);
        vVar.f(false);
        return Unit.INSTANCE;
    }
}
