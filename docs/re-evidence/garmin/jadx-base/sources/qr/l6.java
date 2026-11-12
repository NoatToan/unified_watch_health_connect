package qr;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "result", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$unlikeActivity$1$3", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l6 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends Unit>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146335b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(t tVar, t13.d<? super l6> dVar) {
        super(2, dVar);
        this.f146335b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        l6 l6Var = new l6(this.f146335b, dVar);
        l6Var.f146334a = obj;
        return l6Var;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends Unit> v2Var, t13.d<? super Unit> dVar) {
        return ((l6) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146334a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        boolean z14 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b;
        t tVar = this.f146335b;
        if (z14) {
            tVar.H1 = true;
            tVar.s5().getValue().f185114g = false;
            ActivityListItemDTO activityListItemDTO = tVar.f146569x;
            if (activityListItemDTO != null) {
                activityListItemDTO.V0 = tVar.s5().getValue().f185113f;
            }
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            int i14 = t.A2;
            tVar.V5();
        }
        return Unit.INSTANCE;
    }
}
