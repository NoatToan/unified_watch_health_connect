package qr;

import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "result", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$deleteActivity$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends Unit>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146775b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(t tVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f146775b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f146775b, dVar);
        vVar.f146774a = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends Unit> v2Var, t13.d<? super Unit> dVar) {
        return ((v) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146774a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        boolean z14 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b;
        t tVar = this.f146775b;
        if (z14) {
            tVar.f146547p.T3(true);
            ((qd2.a) KoinJavaComponent.get$default(qd2.a.class, null, null, 6, null)).i(qd2.a.b.ACTIVITY_LIST);
            ((ou1.g) KoinJavaComponent.get$default(ou1.g.class, null, null, 6, null)).a(true);
            tVar.H1 = true;
            tVar.I1 = true;
            tVar.E4(new nr.w0.d(null, null, nr.a0.SUCCESS, 3, null));
            tVar.f146547p.J(true);
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            nr.w0.d dVar = new nr.w0.d(null, null, nr.a0.FAIL, 3, null);
            int i14 = t.A2;
            tVar.E4(dVar);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error deleting activity: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
        }
        return Unit.INSTANCE;
    }
}
