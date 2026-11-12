package mt0;

import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.s f120699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.model.p f120700c;

    public /* synthetic */ l1(com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar, com.garmin.android.apps.connectmobile.leaderboard.model.p pVar, int i14) {
        this.f120698a = i14;
        this.f120699b = sVar;
        this.f120700c = pVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f120698a;
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = this.f120700c;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar = this.f120699b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                sVar.E6().f140754a.getClass();
                o53.f0.N(new pt0.x(null)).f(sVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.s.e(new n1(pVar, sVar)));
                break;
            case 1:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                pt0.p pVarE6 = sVar.E6();
                String uuid = pVar.getUuid();
                DateTime dateTimeNow = DateTime.now();
                dateTimeNow.getClass();
                long jLongValue = pVar.getBadgeId().longValue();
                boolean zZ0 = pVar.Z0();
                DateTime endDate = pVar.getEndDate();
                pVarE6.getClass();
                uuid.getClass();
                w9.a aVarA = androidx.lifecycle.v1.a(pVarE6);
                x53.c cVar = o53.s0.f129406a;
                ge1.b.T(aVarA, x53.b.f189152a, null, new pt0.q(pVarE6, uuid, dateTimeNow, jLongValue, zZ0, endDate, null), 2);
                break;
            default:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.w6(sVar, pVar);
                break;
        }
        return Unit.INSTANCE;
    }
}
