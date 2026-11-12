package n70;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "devicesCount", "Lj70/r;", "userFocus", "Lo70/e0;", "<anonymous>", "(ILj70/r;)Lo70/e0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.domain.GetWelcomeCardDataUseCase$invoke$1", f = "GetWelcomeCardDataUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class r6 extends v13.i implements e23.q<Integer, j70.r, t13.d<? super o70.e0>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ int f124536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ j70.r f124537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q6 f124538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6(q6 q6Var, t13.d<? super r6> dVar) {
        super(3, dVar);
        this.f124538c = q6Var;
    }

    @Override // e23.q
    public final Object invoke(Integer num, j70.r rVar, t13.d<? super o70.e0> dVar) {
        int iIntValue = num.intValue();
        r6 r6Var = new r6(this.f124538c, dVar);
        r6Var.f124536a = iIntValue;
        r6Var.f124537b = rVar;
        return r6Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        int i14 = this.f124536a;
        j70.r rVar = this.f124537b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GetWelcomeCardDataUseCase", "devicesCount[" + i14 + "] userFocus[" + rVar + "]");
        boolean z14 = i14 == 0;
        boolean z15 = rVar == j70.r.f97629l;
        if (z14) {
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GetWelcomeCardDataUseCase", "User NO DEVICE");
            return new o70.e0(x70.h.NO_DEVICE, false);
        }
        if (!z15) {
            return null;
        }
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "GetWelcomeCardDataUseCase", "User focus UNSET");
        return new o70.e0(x70.h.USER_WITH_DEVICE, false);
    }
}
