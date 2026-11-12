package du0;

import android.content.Context;
import bs2.nv;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.proto.generated.GDIEventSharingProto;
import e23.p;
import java.util.List;
import o13.r;
import o13.t;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.commands.TransitionEventSharingCommand$execute$1", f = "TransitionEventSharingCommand.kt", l = {49, 50}, m = "invokeSuspend", v = 2)
public final class h extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public gu0.b f61254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f61255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f61256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f61257d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f61257d = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f61257d, dVar);
        hVar.f61256c = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0088  */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        gu0.b bVar;
        List<ju0.c> list;
        b0 b0Var = (b0) this.f61256c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f61255b;
        g gVar = this.f61257d;
        if (i14 == 0) {
            r.b(obj);
            a2 a2Var = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.b(a2Var, "TransitionEventSharingCommand", "execute()");
            ju0.e eVar = (ju0.e) gVar.f61252e.getValue();
            long j8 = gVar.f61249b;
            this.f61256c = b0Var;
            this.f61255b = 1;
            ju0.e.a aVar2 = ju0.e.f100881g;
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
            bVar = this.f61254a;
            r.b(obj);
        }
        List list2 = (List) obj;
        t tVar = gVar.f61252e;
        lu0.a aVar3 = gVar.f61251d;
        Context context = gVar.f61248a;
        long j14 = gVar.f61249b;
        GDIEventSharingProto.ActivityAlertDetails activityAlertDetails = gVar.f61250c;
        gu0.c cVarB = ((fu0.e) ((ju0.e) tVar.getValue()).f100886e.getValue()).b(j14);
        int i15 = cVarB != null ? cVarB.f79046b : 0;
        if (bVar != null || (list = bVar.f79040e) == null || !list.contains(ju0.c.EVERY_TRANSITION)) {
            a2 a2Var2 = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.p(a2Var2, "TransitionEventSharingCommand", "isMsgTriggerEveryTransitionSelected is false, not sending message");
            return Unit.INSTANCE;
        }
        if (activityAlertDetails.getLastSportType().getSportFitType() == nv.TRANSITION.f20362a) {
            lu0.b bVar2 = new lu0.b(context);
            bVar2.f114961h = activityAlertDetails.getSessionTime();
            bVar2.f114966m = activityAlertDetails.getSportType().getSportFitType();
            int i16 = i15 + 1;
            bVar2.f114962i = i16;
            bVar2.e(lu0.c.TRANSITION_ENDED);
            aVar3.a(bVar2.a(), list2);
            ju0.e eVar2 = (ju0.e) gVar.f61252e.getValue();
            eVar2.getClass();
            ((fu0.e) eVar2.f100886e.getValue()).c(new gu0.c(j14, i16));
            return Unit.INSTANCE;
        }
        a2 a2Var3 = a2.LIVE_EVENT_SHARING;
        String strN = fb1.c.n("Received Sport: ", nv.a(new Short((short) activityAlertDetails.getLastSportType().getSportFitType())).name());
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "TransitionEventSharingCommand", strN);
        lu0.b bVar3 = new lu0.b(context);
        bVar3.f114965l = activityAlertDetails.getLastSportType().getSportFitType();
        bVar3.f114961h = activityAlertDetails.getSessionTime();
        bVar3.f114963j = activityAlertDetails.getSessionDist();
        bVar3.f114959f = activityAlertDetails.getAveragePace();
        bVar3.f114964k = activityAlertDetails.getLocalTime();
        bVar3.f114956c = activityAlertDetails.getTotalTime();
        bVar3.e(lu0.c.TRANSITION_STARTED);
        aVar3.a(bVar3.a(), list2);
        return Unit.INSTANCE;
        gu0.b bVar4 = (gu0.b) obj;
        ju0.e eVar3 = (ju0.e) gVar.f61252e.getValue();
        this.f61256c = b0Var;
        this.f61254a = bVar4;
        this.f61255b = 2;
        ju0.e.a aVar4 = ju0.e.f100881g;
        Object objB = eVar3.b(false, this);
        if (objB != aVar) {
            bVar = bVar4;
            obj = objB;
            List list3 = (List) obj;
            t tVar2 = gVar.f61252e;
            lu0.a aVar5 = gVar.f61251d;
            Context context2 = gVar.f61248a;
            long j15 = gVar.f61249b;
            GDIEventSharingProto.ActivityAlertDetails activityAlertDetails2 = gVar.f61250c;
            gu0.c cVarB2 = ((fu0.e) ((ju0.e) tVar2.getValue()).f100886e.getValue()).b(j15);
            if (cVarB2 != null) {
            }
            if (bVar != null) {
            }
            a2 a2Var4 = a2.LIVE_EVENT_SHARING;
            i2.f36769a.getClass();
            i2.a.p(a2Var4, "TransitionEventSharingCommand", "isMsgTriggerEveryTransitionSelected is false, not sending message");
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
