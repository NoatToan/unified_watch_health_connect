package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "Lr53/j;", "Lyc/v2;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.CachedPagingDataKt$cachedIn$5", f = "CachedPagingData.kt", l = {111}, m = "invokeSuspend")
public final class n extends v13.i implements e23.q<r53.j<? super v2<Object>>, Throwable, t13.d<? super Unit>, Object> {
    public n(c cVar, t13.d<? super n> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super v2<Object>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new n(null, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        return Unit.INSTANCE;
    }
}
