package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "Lyc/g1;", "prev", "next", "<anonymous>", "(Lyc/g1;Lyc/g1;)Lyc/g1;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", l = {104}, m = "invokeSuspend")
public final class l extends v13.i implements e23.q<g1<Object>, g1<Object>, t13.d<? super g1<Object>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ g1 f196132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ g1 f196133c;

    public l(t13.d<? super l> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(g1<Object> g1Var, g1<Object> g1Var2, t13.d<? super g1<Object>> dVar) {
        l lVar = new l(dVar);
        lVar.f196132b = g1Var;
        lVar.f196133c = g1Var2;
        return lVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196131a;
        if (i14 != 0) {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            g1 g1Var = this.f196132b;
            o13.r.b(obj);
            return g1Var;
        }
        o13.r.b(obj);
        g1 g1Var2 = this.f196132b;
        g1 g1Var3 = this.f196133c;
        this.f196132b = g1Var3;
        this.f196131a = 1;
        g1Var2.f195985c.f196027d.c(null);
        return Unit.INSTANCE == aVar ? aVar : g1Var3;
    }
}
