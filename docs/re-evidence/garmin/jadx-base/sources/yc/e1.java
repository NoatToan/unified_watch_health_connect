package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "Lr53/j;", "Lyc/m1;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.MulticastedPagingData$asPagingData$2", f = "CachedPagingData.kt", l = {53}, m = "invokeSuspend")
public final class e1 extends v13.i implements e23.q<r53.j<? super m1<Object>>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1<Object> f195879a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(g1<Object> g1Var, t13.d<? super e1> dVar) {
        super(3, dVar);
        this.f195879a = g1Var;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super m1<Object>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new e1(this.f195879a, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f195879a.getClass();
        return Unit.INSTANCE;
    }
}
