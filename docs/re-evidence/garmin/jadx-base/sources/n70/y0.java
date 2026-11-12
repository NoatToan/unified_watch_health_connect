package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lj70/k$i;", "trainingPlans", "", "enabledSectionsCount", "Lj70/k$h;", "events", "Lj70/w;", "<anonymous>", "(Lj70/k$i;ILj70/k$h;)Lj70/w;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$invoke$1$elements$1$8", f = "GetDashboardItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y0 extends v13.i implements e23.r<j70.k.i, Integer, j70.k.h, t13.d<? super j70.w>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j70.k.i f124760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int f124761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ j70.k.h f124762c;

    public y0(t13.d<? super y0> dVar) {
        super(4, dVar);
    }

    @Override // e23.r
    public final Object invoke(j70.k.i iVar, Integer num, j70.k.h hVar, t13.d<? super j70.w> dVar) {
        int iIntValue = num.intValue();
        y0 y0Var = new y0(dVar);
        y0Var.f124760a = iVar;
        y0Var.f124761b = iIntValue;
        y0Var.f124762c = hVar;
        return y0Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j70.k.i iVar = this.f124760a;
        int i14 = this.f124761b;
        j70.k.h hVar = this.f124762c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        return new j70.w(i14, iVar, hVar != null ? hVar.f97598f : null);
    }
}
