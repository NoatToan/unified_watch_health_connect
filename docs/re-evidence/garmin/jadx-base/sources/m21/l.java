package m21;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg01/n;", "it", "<anonymous>", "(Lg01/n;)Lg01/n;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.nutrition.presentation.search.viewmodel.FoodSearchViewModel$applyEvent$4", f = "FoodSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l extends v13.i implements e23.p<g01.n, t13.d<? super g01.n>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f116146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f116147b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(a aVar, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f116147b = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l lVar = new l(this.f116147b, dVar);
        lVar.f116146a = obj;
        return lVar;
    }

    @Override // e23.p
    public final Object invoke(g01.n nVar, t13.d<? super g01.n> dVar) {
        return ((l) create(nVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        g01.n nVar = (g01.n) this.f116146a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (!(nVar instanceof g01.n.a)) {
            return nVar;
        }
        b11.a aVar2 = ((g01.n.a) nVar).f74224a;
        if (!(aVar2 instanceof b11.a.C0202a)) {
            return nVar;
        }
        b11.a.C0202a c0202a = (b11.a.C0202a) aVar2;
        String str = c0202a.f14222e.f14253a;
        a.d dVar = (a.d) this.f116147b;
        return p005kotlin.jvm.internal.s.g(str, dVar.f116063a) ? new g01.n.a(b11.a.C0202a.d(c0202a, null, 0.0d, dVar.f116064b, 123)) : nVar;
    }
}
