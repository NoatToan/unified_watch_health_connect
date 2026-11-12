package yc;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "T", "Lo53/b0;", "Lyc/j3;", "<anonymous>", "(Lo53/b0;)Lyc/j3;"}, k = 3, mv = {1, 8, 0})
@v13.e(c = "androidx.paging.AsyncPagingDataDiffer$presenter$1$presentPagingDataEvent$2$diffResult$1", f = "AsyncPagingDataDiffer.kt", l = {}, m = "invokeSuspend")
public final class h extends v13.i implements e23.p<o53.b0, t13.d<? super j3>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z2.e<Object> f195989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f<Object> f195990b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z2.e<Object> eVar, f<Object> fVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f195989a = eVar;
        this.f195990b = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f195989a, this.f195990b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super j3> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        z2.e<Object> eVar = this.f195989a;
        return l3.a(eVar.f196699b, eVar.f196698a, this.f195990b.f195903a);
    }
}
