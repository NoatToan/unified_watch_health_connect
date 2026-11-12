package qr;

import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "Lmo1/f;", "result", "", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.presentation.ActivityDetailsViewModel$likeActivity$2", f = "ActivityDetailsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class a6 extends v13.i implements e23.p<com.garmin.android.apps.connectmobile.v2<? extends mo1.f>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f146099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146100b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a6(t tVar, t13.d<? super a6> dVar) {
        super(2, dVar);
        this.f146100b = tVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        a6 a6Var = new a6(this.f146100b, dVar);
        a6Var.f146099a = obj;
        return a6Var;
    }

    @Override // e23.p
    public final Object invoke(com.garmin.android.apps.connectmobile.v2<? extends mo1.f> v2Var, t13.d<? super Unit> dVar) {
        return ((a6) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        com.garmin.android.apps.connectmobile.v2 v2Var = (com.garmin.android.apps.connectmobile.v2) this.f146099a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        boolean z14 = v2Var instanceof com.garmin.android.apps.connectmobile.v2.b;
        t tVar = this.f146100b;
        if (z14) {
            tVar.H1 = true;
            mo1.f fVar = (mo1.f) ((com.garmin.android.apps.connectmobile.v2.b) v2Var).f47386a;
            tVar.s5().getValue().f185114g = false;
            if (tVar.s5().getValue().f185111d == null || tVar.s5().getValue().f185110c == null) {
                tVar.s5().getValue().f185111d = fVar.getUuid();
                tVar.s5().getValue().f185110c = new Long(fVar.getConversationLikePk());
            }
            ActivityListItemDTO activityListItemDTO = tVar.f146569x;
            if (activityListItemDTO != null) {
                activityListItemDTO.V0 = tVar.s5().getValue().f185113f;
            }
            ActivityListItemDTO activityListItemDTO2 = tVar.f146569x;
            if (activityListItemDTO2 != null) {
                activityListItemDTO2.f29263f1 = tVar.s5().getValue().f185111d;
            }
            Long l14 = tVar.s5().getValue().f185110c;
            if (l14 != null) {
                long jLongValue = l14.longValue();
                ActivityListItemDTO activityListItemDTO3 = tVar.f146569x;
                if (activityListItemDTO3 != null) {
                    activityListItemDTO3.f29266g1 = jLongValue;
                }
            }
        } else {
            if (!(v2Var instanceof com.garmin.android.apps.connectmobile.v2.a)) {
                lc.u0.r();
                return null;
            }
            if (zy0.g.a(((com.garmin.android.apps.connectmobile.v2.a) v2Var).f47384b)) {
                nr.w0.t1 t1Var = nr.w0.t1.f127542a;
                int i14 = t.A2;
                tVar.E4(t1Var);
            }
            int i15 = t.A2;
            tVar.V5();
        }
        return Unit.INSTANCE;
    }
}
