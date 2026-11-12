package qr;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lcom/garmin/android/apps/connectmobile/activities/newmodel/l0;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$getTankPressure$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b4 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends com.garmin.android.apps.connectmobile.activities.newmodel.l0>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146116b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(t tVar, t13.d<? super b4> dVar) {
        super(2, dVar);
        this.f146116b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b4 b4Var = new b4(this.f146116b, dVar);
        b4Var.f146115a = obj;
        return b4Var;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends com.garmin.android.apps.connectmobile.activities.newmodel.l0> v2Var, t13.d<? super Unit> dVar) {
        return ((b4) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146115a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        if (v2Var instanceof com.garmin.android.apps.connectmobile.v2.b) {
            ((r53.z1) this.f146116b.f146545o1.getValue()).setValue(((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a);
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.ACTIVITIES;
            String strN = fb1.c.n("Error fetching tanks pressure: ", ((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47385c);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.f(a2Var, "ActivityDetailsViewModel", strN);
        }
        return Unit.INSTANCE;
    }
}
