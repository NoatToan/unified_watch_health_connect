package mt0;

import android.content.Context;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120554a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.model.p f120555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.q f120556c;

    public /* synthetic */ c1(com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar, com.garmin.android.apps.connectmobile.leaderboard.model.p pVar) {
        this.f120556c = qVar;
        this.f120555b = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        com.garmin.android.apps.connectmobile.g3 g3Var = (com.garmin.android.apps.connectmobile.g3) obj;
        switch (this.f120554a) {
            case 0:
                g3Var.getClass();
                Boolean bool = (Boolean) g3Var.f35301b;
                if (bool != null) {
                    boolean zBooleanValue = bool.booleanValue();
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar = this.f120556c;
                    com.garmin.android.apps.connectmobile.leaderboard.model.p pVar = this.f120555b;
                    if (zBooleanValue) {
                        qVar.y6(pVar);
                    } else {
                        qVar.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.x xVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.x.f37955a;
                        Context contextRequireContext = qVar.requireContext();
                        contextRequireContext.getClass();
                        d1 d1Var = new d1(qVar, pVar, 0);
                        xVar.getClass();
                        com.garmin.android.apps.connectmobile.leaderboard.challenges.x.w(d1Var, contextRequireContext);
                    }
                }
                break;
            default:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar2 = this.f120556c;
                if (g3Var != null) {
                    com.garmin.android.apps.connectmobile.leaderboard.model.p pVar2 = this.f120555b;
                    if (pVar2.getUuid() == null || pVar2.getBadgeId() == null) {
                        g22.e.c(qVar2);
                    } else {
                        qVar2.y6(pVar2);
                    }
                } else {
                    g22.e.c(qVar2);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c1(com.garmin.android.apps.connectmobile.leaderboard.model.p pVar, com.garmin.android.apps.connectmobile.leaderboard.challenges.q qVar) {
        this.f120555b = pVar;
        this.f120556c = qVar;
    }
}
