package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lr53/j;", "Lyc/m1;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.MulticastedPagingData$asPagingData$1", f = "CachedPagingData.kt", l = {51}, m = "invokeSuspend")
public final class d1 extends v13.i implements e23.p<r53.j<? super m1<Object>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1<Object> f195826a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(g1<Object> g1Var, t13.d<? super d1> dVar) {
        super(2, dVar);
        this.f195826a = g1Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d1(this.f195826a, dVar);
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super m1<Object>> jVar, t13.d<? super Unit> dVar) {
        return ((d1) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f195826a.getClass();
        return Unit.INSTANCE;
    }
}
