package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Lr53/j;", "", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.PageFetcherSnapshotState$consumePrependGenerationIdAsFlow$1", f = "PageFetcherSnapshotState.kt", l = {}, m = "invokeSuspend")
public final class g2 extends v13.i implements e23.p<r53.j<? super Integer>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e2<Object, Object> f195986a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(e2<Object, Object> e2Var, t13.d<? super g2> dVar) {
        super(2, dVar);
        this.f195986a = e2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g2(this.f195986a, dVar);
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super Integer> jVar, t13.d<? super Unit> dVar) {
        return ((g2) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        e2<Object, Object> e2Var = this.f195986a;
        e2Var.f195888i.i(new Integer(e2Var.f195886g));
        return Unit.INSTANCE;
    }
}
