package wt1;

import com.garmin.android.apps.connectmobile.v2;
import java.io.IOException;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "Lcom/garmin/android/apps/connectmobile/v2;", "Lfg0/k;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/android/apps/connectmobile/v2;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.atp.RaceEventViewModel$getLinkedEventDTOAndShowAlertIfEventDataChanged$eventDetailsResult$1", f = "RaceEventViewModel.kt", l = {263, 265}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements e23.p<b0, t13.d<? super v2<? extends fg0.k>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f187077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xw1.d f187078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f187079c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(xw1.d dVar, d dVar2, t13.d<? super i> dVar3) {
        super(2, dVar3);
        this.f187078b = dVar;
        this.f187079c = dVar2;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f187078b, this.f187079c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super v2<? extends fg0.k>> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r7 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r7 == r0) goto L27;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f187077a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return (v2) obj;
            }
            if (i14 == 2) {
                o13.r.b(obj);
                return (v2) obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        xw1.d dVar = this.f187078b;
        ww1.h athleteRace = dVar.getAthleteRace();
        Long raceEventId = athleteRace != null ? athleteRace.getRaceEventId() : null;
        ww1.h athleteRace2 = dVar.getAthleteRace();
        String raceEventUuid = athleteRace2 != null ? athleteRace2.getRaceEventUuid() : null;
        d dVar2 = this.f187079c;
        if (raceEventId != null) {
            int i15 = d.f187033q;
            zf0.d dVarC4 = dVar2.C4();
            long jLongValue = raceEventId.longValue();
            this.f187077a = 1;
            obj = dVarC4.d(jLongValue, this);
        } else {
            if (raceEventUuid == null) {
                return new v2.a(new IOException("EventID or EventUuid is null"), null, null, 6, null);
            }
            int i16 = d.f187033q;
            zf0.d dVarC5 = dVar2.C4();
            this.f187077a = 2;
            obj = dVarC5.f(raceEventUuid, this);
        }
        return aVar;
    }
}
