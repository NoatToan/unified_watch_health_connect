package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ln70/p1$a;", "deviceInfo", "", "hasUnreadNotifications", "Lo70/x;", "syncState", "Lo70/a0;", "<anonymous>", "(Ln70/p1$a;ZLo70/x;)Lo70/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetToolbarDataUseCase$invoke$1", f = "GetToolbarDataUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b6 extends v13.i implements e23.r<p1.a, Boolean, o70.x, t13.d<? super o70.a0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ p1.a f124051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ boolean f124052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ o70.x f124053c;

    public b6(t13.d<? super b6> dVar) {
        super(4, dVar);
    }

    @Override // e23.r
    public final Object invoke(p1.a aVar, Boolean bool, o70.x xVar, t13.d<? super o70.a0> dVar) {
        boolean zBooleanValue = bool.booleanValue();
        b6 b6Var = new b6(dVar);
        b6Var.f124051a = aVar;
        b6Var.f124052b = zBooleanValue;
        b6Var.f124053c = xVar;
        return b6Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        p1.a aVar = this.f124051a;
        boolean z14 = this.f124052b;
        o70.x xVar = this.f124053c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        return new o70.a0(aVar, z14, xVar);
    }
}
