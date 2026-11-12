package cu0;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventService;
import e23.p;
import o13.r;
import o53.b0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.liveeventsharing.LiveEventService$scheduleTimers$1", f = "LiveEventService.kt", l = {173}, m = "invokeSuspend", v = 2)
public final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f55563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f55564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LiveEventService f55565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f55566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LiveEventService liveEventService, long j8, t13.d<? super c> dVar) {
        super(2, dVar);
        this.f55565c = liveEventService;
        this.f55566d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        c cVar = new c(this.f55565c, this.f55566d, dVar);
        cVar.f55564b = obj;
        return cVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Long l14;
        b0 b0Var = (b0) this.f55564b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f55563a;
        LiveEventService liveEventService = this.f55565c;
        if (i14 == 0) {
            r.b(obj);
            ju0.e eVarA = LiveEventService.a(liveEventService);
            this.f55564b = b0Var;
            this.f55563a = 1;
            ju0.e.a aVar2 = ju0.e.f100881g;
            obj = eVarA.a(this.f55566d, this, false);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        gu0.b bVar = (gu0.b) obj;
        if (bVar != null && (l14 = bVar.f79038c) != null) {
            DateTime dateTime = new DateTime(l14.longValue());
            String strN = fb1.c.n("Live Event Sharing end time is: ", new DateTime(dateTime).toString("M/d/yy HH:mm"));
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.b(a2Var, "LiveEventService", strN);
            DateTime dateTimePlusHours = dateTime.plusHours(1);
            DateTime dateTimeNow = DateTime.now();
            if (dateTime.isAfterNow()) {
                liveEventService.f38485c.schedule(new b(liveEventService), dateTime.getMillis() - dateTimeNow.getMillis());
                i2.a.b(a2Var, "LiveEventService", "The 24hr timer has been schedule to " + new DateTime(dateTime).toString("M/d/yy HH:mm"));
            } else if (dateTimeNow.isBefore(dateTimePlusHours)) {
                liveEventService.f38485c.schedule(new a(liveEventService), dateTimePlusHours.getMillis() - dateTimeNow.getMillis());
                i2.a.b(a2Var, "LiveEventService", "The extra timer has been scheduled to " + new DateTime(dateTimePlusHours).toString("M/d/yy HH:mm"));
            } else {
                i2.a.b(a2Var, "LiveEventService", "Current Time is past 25 hours of the original time when live event sharing was set! No need for a timer! Turning off live event sharing");
                LiveEventService.b(liveEventService);
            }
        }
        return Unit.INSTANCE;
    }
}
