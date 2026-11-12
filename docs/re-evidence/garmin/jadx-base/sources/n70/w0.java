package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lj70/k$h;", "events", "", "enabledSectionsCount", "Lo70/k;", "<anonymous>", "(Lj70/k$h;I)Lo70/k;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetDashboardItemsUseCase$invoke$1$elements$1$6", f = "GetDashboardItemsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class w0 extends v13.i implements e23.q<j70.k.h, Integer, t13.d<? super o70.k>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ j70.k.h f124703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ int f124704b;

    public w0(t13.d<? super w0> dVar) {
        super(3, dVar);
    }

    @Override // e23.q
    public final Object invoke(j70.k.h hVar, Integer num, t13.d<? super o70.k> dVar) {
        int iIntValue = num.intValue();
        w0 w0Var = new w0(dVar);
        w0Var.f124703a = hVar;
        w0Var.f124704b = iIntValue;
        return w0Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        j70.k.h hVar = this.f124703a;
        int i14 = this.f124704b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        return new o70.k(i14, hVar);
    }
}
