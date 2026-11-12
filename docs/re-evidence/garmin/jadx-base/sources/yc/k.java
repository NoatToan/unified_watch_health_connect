package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@"}, d2 = {"T", "R", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", l = {105}, m = "invokeSuspend")
public final class k extends v13.i implements e23.q<r53.j<? super g1<Object>>, v2<Object>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f196102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f196103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.b0 f196104d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t13.d dVar, o53.b0 b0Var, c cVar) {
        super(3, dVar);
        this.f196104d = b0Var;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super g1<Object>> jVar, v2<Object> v2Var, t13.d<? super Unit> dVar) {
        k kVar = new k(dVar, this.f196104d, null);
        kVar.f196102b = jVar;
        kVar.f196103c = v2Var;
        return kVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196101a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.j jVar = this.f196102b;
            g1 g1Var = new g1(this.f196104d, (v2) this.f196103c, null);
            this.f196101a = 1;
            if (jVar.emit(g1Var, this) == aVar) {
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
