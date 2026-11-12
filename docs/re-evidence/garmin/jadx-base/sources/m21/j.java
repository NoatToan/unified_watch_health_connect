package m21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lg01/n;", "it", "", "<anonymous>", "(Lg01/n;)Z"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodSearchViewModel$applyEvent$2", f = "FoodSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<g01.n, t13.d<? super Boolean>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f116142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f116143b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f116143b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f116143b, dVar);
        jVar.f116142a = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(g01.n nVar, t13.d<? super Boolean> dVar) {
        return ((j) create(nVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        g01.n nVar = (g01.n) this.f116142a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (nVar instanceof g01.n.a) {
            b11.a aVar2 = ((g01.n.a) nVar).f74224a;
            if (aVar2 instanceof b11.a.b) {
                return Boolean.valueOf(((b11.a.b) aVar2).f14228d != ((a.b) this.f116143b).f116061a);
            }
        }
        return Boolean.TRUE;
    }
}
