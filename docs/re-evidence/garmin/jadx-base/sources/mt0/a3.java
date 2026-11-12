package mt0;

import org.joda.time.DateTime;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a3 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 f120512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.model.a0 f120513c;

    public /* synthetic */ a3(com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 h0Var, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, int i14) {
        this.f120511a = i14;
        this.f120512b = h0Var;
        this.f120513c = a0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        com.garmin.android.apps.connectmobile.g3<pt0.f0.b> g3VarA;
        int i14 = this.f120511a;
        com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var = this.f120513c;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.h0 h0Var = this.f120512b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                h0Var.J6().f140660a.getClass();
                o53.f0.N(new pt0.x(null)).f(h0Var.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.d(new ml0.e(5, a0Var, h0Var)));
                break;
            case 1:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                pt0.f0 f0VarJ6 = h0Var.J6();
                String badgeUuid = a0Var.getBadgeUuid();
                DateTime dateTimeNow = DateTime.now();
                dateTimeNow.getClass();
                long jLongValue = a0Var.getBadgeId().longValue();
                boolean zJ0 = a0Var.j0();
                DateTime endDate = a0Var.getEndDate();
                f0VarJ6.getClass();
                badgeUuid.getClass();
                com.garmin.android.apps.connectmobile.y<com.garmin.android.apps.connectmobile.g3<pt0.f0.b>> yVarD = f0VarJ6.f140665f.d();
                if (((yVarD == null || (g3VarA = yVarD.a()) == null) ? null : g3VarA.f35300a) != fw.p.LOADING) {
                    w9.a aVarA = androidx.lifecycle.v1.a(f0VarJ6);
                    x53.c cVar = o53.s0.f129406a;
                    ge1.b.T(aVarA, x53.b.f189152a, null, new pt0.g0(f0VarJ6, badgeUuid, dateTimeNow, jLongValue, zJ0, endDate, null), 2);
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                h0Var.S6(a0Var);
                break;
        }
        return Unit.INSTANCE;
    }
}
