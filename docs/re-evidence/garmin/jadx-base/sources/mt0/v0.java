package mt0;

import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class v0 implements com.garmin.android.apps.connectmobile.q1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.p f120893b;

    public /* synthetic */ v0(com.garmin.android.apps.connectmobile.leaderboard.challenges.p pVar, int i14) {
        this.f120892a = i14;
        this.f120893b = pVar;
    }

    @Override // com.garmin.android.apps.connectmobile.q1.a
    public final void g(boolean z14) {
        int i14 = this.f120892a;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.p pVar = this.f120893b;
        switch (i14) {
            case 0:
                if (!z14) {
                    com.garmin.android.apps.connectmobile.q1 q1Var = pVar.B;
                    if (q1Var != null) {
                        q1Var.dismiss();
                    }
                } else {
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.p.c cVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.p.H0;
                    ((kt0.a) KoinJavaComponent.get$default(kt0.a.class, null, null, 6, null)).q(pVar);
                }
                break;
            default:
                if (!z14) {
                    com.garmin.android.apps.connectmobile.q1 q1Var2 = pVar.I;
                    if (q1Var2 != null) {
                        q1Var2.dismiss();
                    }
                } else {
                    pVar.P = true;
                    pVar.requireActivity().invalidateOptionsMenu();
                    pVar.G6();
                    androidx.lifecycle.m.a(null, new pt0.m(pVar.S6(), null), 3).f(pVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.p.g(new t0(pVar, 1)));
                }
                break;
        }
    }
}
