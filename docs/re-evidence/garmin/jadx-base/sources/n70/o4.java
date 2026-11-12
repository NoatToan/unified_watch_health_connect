package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj70/k$f;", "secondaryStats", "Lj70/i;", "realTime", "Lj70/j;", "", "Lhd1/m;", "<anonymous>", "(Lj70/k$f;Lj70/i;)Lj70/j;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetSecondaryStatsItemsUseCase$invoke$1$params$6", f = "GetSecondaryStatsItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o4 extends v13.i implements e23.q<j70.k.f, j70.i, t13.d<? super j70.j<String, hd1.m>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j70.k.f f124457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ j70.i f124458b;

    public o4(t13.d<? super o4> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(j70.k.f fVar, j70.i iVar, t13.d<? super j70.j<String, hd1.m>> dVar) {
        o4 o4Var = new o4(dVar);
        o4Var.f124457a = fVar;
        o4Var.f124458b = iVar;
        return o4Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j70.k.f fVar = this.f124457a;
        j70.i iVar = this.f124458b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        String str = fVar != null ? fVar.f97566b : null;
        return new j70.j(yz1.e.a(fVar != null ? fVar.f97565a : null, new v1(str, iVar, 1)), str, iVar != null ? iVar.f97533a : null);
    }
}
