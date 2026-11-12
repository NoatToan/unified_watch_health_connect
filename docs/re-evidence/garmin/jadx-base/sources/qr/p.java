package qr;

import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f146412a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f146413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ am.x0 f146414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ps.r f146415d;

    public /* synthetic */ p(t tVar, am.x0 x0Var, ps.r rVar) {
        this.f146413b = tVar;
        this.f146414c = x0Var;
        this.f146415d = rVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f146412a;
        ps.r rVar = this.f146415d;
        t tVar = this.f146413b;
        switch (i14) {
            case 0:
                int i15 = t.A2;
                Long activityId = rVar.getActivityId();
                if (activityId == null || activityId.longValue() < 0) {
                    com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.f(com.garmin.android.apps.connectmobile.a2.ACTIVITIES, "ActivityDetailsViewModel", "navigateToActivityDetails legActivityId is " + activityId);
                } else {
                    tVar.E4(new nr.w0.j(new nr.h(activityId.longValue(), this.f146414c, tVar.f146569x, false, tVar.C, false, 32, null)));
                }
                break;
            default:
                int i16 = t.A2;
                ps.q1 summaryDTO = rVar.getSummaryDTO();
                DateTime dateTimeW4 = summaryDTO != null ? summaryDTO.W4() : null;
                am.x0 x0Var = this.f146414c;
                tVar.E4(new nr.w0.r0(am.z0.d(x0Var, x0Var), x0Var, dateTimeW4));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ p(t tVar, ps.r rVar, am.x0 x0Var) {
        this.f146413b = tVar;
        this.f146415d = rVar;
        this.f146414c = x0Var;
    }
}
