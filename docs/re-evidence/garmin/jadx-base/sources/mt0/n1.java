package mt0;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class n1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120759a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.s f120760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.model.p f120761c;

    public /* synthetic */ n1(com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar, com.garmin.android.apps.connectmobile.leaderboard.model.p pVar) {
        this.f120760b = sVar;
        this.f120761c = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f120759a;
        com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = this.f120761c;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar = this.f120760b;
        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                if (g3Var == null || pVar.getUuid() == null || pVar.getBadgeId() == null) {
                    g22.e.c(sVar);
                } else {
                    sVar.F6(pVar);
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.s.a aVar2 = com.garmin.android.apps.connectmobile.leaderboard.challenges.s.F;
                g3Var.getClass();
                Boolean bool = (Boolean) g3Var.f35301b;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    com.garmin.android.apps.connectmobile.i2.a aVar3 = com.garmin.android.apps.connectmobile.i2.f36769a;
                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                    aVar3.getClass();
                    com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "BadgeChallengeDetailsFragment", "checkAutoChallengeParticipant hasJoinedAutoChallenge = " + zBooleanValue + ", result = " + g3Var);
                    if (zBooleanValue) {
                        sVar.F6(pVar);
                    } else {
                        sVar.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.x xVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.f37955a;
                        Context contextRequireContext = sVar.requireContext();
                        contextRequireContext.getClass();
                        l1 l1Var = new l1(sVar, pVar, 0);
                        xVar.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.x.w(l1Var, contextRequireContext);
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n1(com.garmin.android.apps.connectmobile.leaderboard.model.p pVar, com.garmin.android.apps.connectmobile.leaderboard.challenges.s sVar) {
        this.f120761c = pVar;
        this.f120760b = sVar;
    }
}
