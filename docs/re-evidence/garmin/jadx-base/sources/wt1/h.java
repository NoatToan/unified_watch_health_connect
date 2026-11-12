package wt1;

import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.v2;
import java.util.List;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "", "Lxw1/h;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.RaceEventViewModel$getLinkedEventDTOAndShowAlertIfEventDataChanged$changeCoachPlanDTOResult$1", f = "RaceEventViewModel.kt", l = {255}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<b0, t13.d<? super v2<? extends List<? extends xw1.h>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xw1.d f187075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f187076c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xw1.d dVar, d dVar2, t13.d<? super h> dVar3) {
        super(2, dVar3);
        this.f187075b = dVar;
        this.f187076c = dVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f187075b, this.f187076c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends List<? extends xw1.h>>> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f187074a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        xw1.d dVar = this.f187075b;
        xw1.m athletePlanGoal = dVar.getAthletePlanGoal();
        String goal = athletePlanGoal != null ? athletePlanGoal.getGoal() : null;
        Integer goalTimeSeconds = dVar.getGoalTimeSeconds();
        gu1.b bVar = (gu1.b) this.f187076c.f187036c.getValue();
        long athletePlanId = dVar.getAthletePlanId();
        goal.getClass();
        fy1.i.f73924a.getClass();
        String strF = fy1.i.a.f();
        this.f187074a = 1;
        bVar.getClass();
        Object objJ = f0.J(bVar, new gu1.d(bVar, athletePlanId, goal, goalTimeSeconds, strF, null), this);
        return objJ == aVar ? aVar : objJ;
    }
}
