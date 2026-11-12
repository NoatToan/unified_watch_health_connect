package m21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg01/n;", "it", "", "<anonymous>", "(Lg01/n;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodSearchViewModel$applyEvent$3", f = "FoodSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class k extends v13.i implements e23.p<g01.n, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f116144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f116145b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f116145b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f116145b, dVar);
        kVar.f116144a = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(g01.n nVar, t13.d<? super Boolean> dVar) {
        return ((k) create(nVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        g01.n nVar = (g01.n) this.f116144a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (nVar instanceof g01.n.a) {
            b11.a aVar2 = ((g01.n.a) nVar).f74224a;
            if (aVar2 instanceof b11.a.c) {
                return Boolean.valueOf(!p005kotlin.jvm.internal.s.g(((b11.a.c) aVar2).f14238e.f14253a, ((a.c) this.f116145b).f116062a));
            }
        }
        return Boolean.TRUE;
    }
}
