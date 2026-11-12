package du0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIEventSharingProto;
import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.commands.DistanceEventSharingCommand$execute$1", f = "DistanceEventSharingCommand.kt", l = {45, 46}, m = "invokeSuspend", v = 2)
public final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gu0.b f61220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f61222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a f61223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(2, dVar);
        this.f61223d = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        b bVar = new b(this.f61223d, dVar);
        bVar.f61222c = obj;
        return bVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:45:0x010d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0112  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        gu0.b bVar;
        lu0.b bVar2;
        List<ju0.b> list;
        List<ju0.b> list2;
        GDIEventSharingProto.AlertType alertType;
        boolean z14;
        boolean z15;
        List<ju0.b> list3;
        List<ju0.b> list4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f61221b;
        a aVar2 = this.f61223d;
        if (i14 == 0) {
            r.b(obj);
            a2 a2Var = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "DistanceEventSharingCommand", "execute():");
            ju0.e eVar = (ju0.e) aVar2.f61218f.getValue();
            long j8 = aVar2.f61214b;
            this.f61222c = null;
            this.f61221b = 1;
            ju0.e.a aVar3 = ju0.e.f100881g;
            obj = eVar.a(j8, this, false);
            if (obj != aVar) {
            }
            return aVar;
        }
        if (i14 == 1) {
            r.b(obj);
        } else {
            if (i14 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = this.f61220a;
            r.b(obj);
        }
        List list5 = (List) obj;
        bVar2 = new lu0.b(aVar2.f61213a);
        GDIEventSharingProto.ActivityAlertDetails activityAlertDetails = aVar2.f61215c;
        bVar2.f114957d = activityAlertDetails.getTotalDistance();
        bVar2.f114956c = activityAlertDetails.getTotalTime();
        bVar2.f114958e = activityAlertDetails.getLapTime();
        bVar2.f114959f = activityAlertDetails.getAveragePace();
        bVar2.f114960g = activityAlertDetails.getEstFinishTime();
        bVar2.f114966m = activityAlertDetails.getSportType().getSportFitType();
        bVar2.f114963j = activityAlertDetails.getSessionDist();
        bVar2.e(lu0.c.DISTANCE);
        if (bVar != null && (list4 = bVar.f79041f) != null && list4.contains(ju0.b.CUMULATIVE_TIME)) {
            a2 a2Var2 = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "DistanceEventSharingCommand", "getDistanceStringFormat() current model has isMsgContentCumulativeTimeOn");
            bVar2.f();
        }
        if (bVar != null && (list3 = bVar.f79041f) != null && list3.contains(ju0.b.PACE_SPEED)) {
            a2 a2Var3 = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.b(a2Var3, "DistanceEventSharingCommand", "getDistanceStringFormat() current model has isMsgContentPaceSpeedOn");
            bVar2.j();
        }
        if (bVar != null && (list2 = bVar.f79041f) != null && list2.contains(ju0.b.LAST_LAP_TIME)) {
            a2 a2Var4 = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.b(a2Var4, "DistanceEventSharingCommand", "getDistanceStringFormat() current model has isMsgContentLastLapTimeOn");
            alertType = aVar2.f61216d;
            if (alertType != GDIEventSharingProto.AlertType.ACTIVITY_AUTO_LAP || alertType == GDIEventSharingProto.AlertType.ACTIVITY_MANUAL_LAP) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (alertType == GDIEventSharingProto.AlertType.ACTIVITY_DISTANCE) {
                z15 = true;
            } else {
                z15 = false;
            }
            bVar2.h(bVar.f79044i, z14, z15, alertType == GDIEventSharingProto.AlertType.ACTIVITY_TIME);
        }
        if (bVar != null && (list = bVar.f79041f) != null && list.contains(ju0.b.EST_COMPLETION_TIME)) {
            a2 a2Var5 = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.b(a2Var5, "DistanceEventSharingCommand", "getDistanceStringFormat() current model has isEstimatedCompletionTimeOn");
            bVar2.g();
        }
        aVar2.f61217e.a(bVar2.a(), list5);
        return Unit.INSTANCE;
        gu0.b bVar3 = (gu0.b) obj;
        ju0.e eVar2 = (ju0.e) aVar2.f61218f.getValue();
        this.f61222c = null;
        this.f61220a = bVar3;
        this.f61221b = 2;
        ju0.e.a aVar4 = ju0.e.f100881g;
        Object objB = eVar2.b(false, this);
        if (objB != aVar) {
            bVar = bVar3;
            obj = objB;
            List list6 = (List) obj;
            bVar2 = new lu0.b(aVar2.f61213a);
            GDIEventSharingProto.ActivityAlertDetails activityAlertDetails2 = aVar2.f61215c;
            bVar2.f114957d = activityAlertDetails2.getTotalDistance();
            bVar2.f114956c = activityAlertDetails2.getTotalTime();
            bVar2.f114958e = activityAlertDetails2.getLapTime();
            bVar2.f114959f = activityAlertDetails2.getAveragePace();
            bVar2.f114960g = activityAlertDetails2.getEstFinishTime();
            bVar2.f114966m = activityAlertDetails2.getSportType().getSportFitType();
            bVar2.f114963j = activityAlertDetails2.getSessionDist();
            bVar2.e(lu0.c.DISTANCE);
            if (bVar != null) {
                a2 a2Var6 = a2.LIVE_EVENT_SHARING;
                i2.f36769a.getClass();
                i2.a.b(a2Var6, "DistanceEventSharingCommand", "getDistanceStringFormat() current model has isMsgContentCumulativeTimeOn");
                bVar2.f();
            }
            if (bVar != null) {
                a2 a2Var7 = a2.LIVE_EVENT_SHARING;
                i2.f36769a.getClass();
                i2.a.b(a2Var7, "DistanceEventSharingCommand", "getDistanceStringFormat() current model has isMsgContentPaceSpeedOn");
                bVar2.j();
            }
            if (bVar != null) {
                a2 a2Var8 = a2.LIVE_EVENT_SHARING;
                i2.f36769a.getClass();
                i2.a.b(a2Var8, "DistanceEventSharingCommand", "getDistanceStringFormat() current model has isMsgContentLastLapTimeOn");
                alertType = aVar2.f61216d;
                if (alertType != GDIEventSharingProto.AlertType.ACTIVITY_AUTO_LAP) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (alertType == GDIEventSharingProto.AlertType.ACTIVITY_DISTANCE) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                bVar2.h(bVar.f79044i, z14, z15, alertType == GDIEventSharingProto.AlertType.ACTIVITY_TIME);
            }
            if (bVar != null) {
                a2 a2Var9 = a2.LIVE_EVENT_SHARING;
                i2.f36769a.getClass();
                i2.a.b(a2Var9, "DistanceEventSharingCommand", "getDistanceStringFormat() current model has isEstimatedCompletionTimeOn");
                bVar2.g();
            }
            aVar2.f61217e.a(bVar2.a(), list6);
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
