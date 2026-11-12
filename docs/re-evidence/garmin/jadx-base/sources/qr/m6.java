package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lr53/j;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "", "exception", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$unlikeActivity$1$4", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m6 extends v13.i implements e23.q<r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ r53.j f146349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Throwable f146350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f146351c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(t tVar, t13.d<? super m6> dVar) {
        super(3, dVar);
        this.f146351c = tVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super com.garmin.android.apps.connectmobile.v2<? extends Unit>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        m6 m6Var = new m6(this.f146351c, dVar);
        m6Var.f146349a = jVar;
        m6Var.f146350b = th3;
        return m6Var.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Throwable th3 = this.f146350b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        int i14 = t.A2;
        this.f146351c.V5();
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
        String strN = fb1.c.n("Error unliking activity: ", th3.getMessage());
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
        return Unit.INSTANCE;
    }
}
