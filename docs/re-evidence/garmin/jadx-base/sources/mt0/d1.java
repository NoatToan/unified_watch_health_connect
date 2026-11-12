package mt0;

import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.q f120569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.model.p f120570c;

    public /* synthetic */ d1(com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar, com.garmin.android.apps.connectmobile.leaderboard.model.p pVar, int i14) {
        this.f120568a = i14;
        this.f120569b = qVar;
        this.f120570c = pVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f120568a;
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = this.f120570c;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar = this.f120569b;
        switch (i14) {
            case 0:
                qVar.v6().f140754a.getClass();
                o53.f0.N(new pt0.x(null)).f(qVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.q.d(new c1(pVar, qVar)));
                break;
            case 1:
                pt0.p pVarV6 = qVar.v6();
                String uuid = pVar.getUuid();
                DateTime dateTimeNow = DateTime.now();
                dateTimeNow.getClass();
                long jLongValue = pVar.getBadgeId().longValue();
                boolean zZ0 = pVar.Z0();
                DateTime endDate = pVar.getEndDate();
                pVarV6.getClass();
                uuid.getClass();
                w9.a aVarA = androidx.lifecycle.v1.a(pVarV6);
                x53.c cVar = o53.s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new pt0.q(pVarV6, uuid, dateTimeNow, jLongValue, zZ0, endDate, null), 2);
                break;
            default:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.q.u6(qVar, pVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
