package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp3/s2$d;", "it", "", "<anonymous>", "(Lp3/s2$d;)Z"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", l = {}, m = "invokeSuspend", v = 1)
public final class t2 extends v13.i implements e23.p<s2.d, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f135314a;

    public t2(t13.d<? super t2> dVar) {
        super(2, dVar);
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t2 t2Var = new t2(dVar);
        t2Var.f135314a = obj;
        return t2Var;
    }

    @Override // e23.p
    public final Object invoke(s2.d dVar, t13.d<? super Boolean> dVar2) {
        return ((t2) create(dVar, dVar2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        return Boolean.valueOf(((s2.d) this.f135314a) == s2.d.ShutDown);
    }
}
