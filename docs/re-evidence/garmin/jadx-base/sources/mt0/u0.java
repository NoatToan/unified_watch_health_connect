package mt0;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class u0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.p f120880b;

    public /* synthetic */ u0(com.garmin.android.apps.connectmobile.leaderboard.challenges.p pVar, int i14) {
        this.f120879a = i14;
        this.f120880b = pVar;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f120879a;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.p pVar = this.f120880b;
        switch (i14) {
            case 0:
                z10.i3 i3Var = (z10.i3) pVar.T.getValue();
                Context contextRequireContext = pVar.requireContext();
                contextRequireContext.getClass();
                i3Var.x4(contextRequireContext, false, new u0(pVar, 1));
                break;
            default:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.p.c cVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.p.H0;
                p1.z<String> zVar = td2.a.f163901a;
                if (td2.a.d(td2.a.EnumC3084a.WELLNESS.toString())) {
                    com.garmin.android.apps.connectmobile.r2 r2Var = pVar.X;
                    if (r2Var != null) {
                        r2Var.U7();
                    }
                    androidx.lifecycle.m.a(null, new pt0.h(pVar.S6(), null), 3).f(pVar.getViewLifecycleOwner(), new com.garmin.android.apps.connectmobile.leaderboard.challenges.p.g(new t0(pVar, 2)));
                } else {
                    com.garmin.android.apps.connectmobile.q1.b bVar = com.garmin.android.apps.connectmobile.q1.f41066b;
                    String string = pVar.getString(R.string.challenge_no_tracker);
                    string.getClass();
                    v0 v0Var = new v0(pVar, 0);
                    bVar.getClass();
                    com.garmin.android.apps.connectmobile.q1 q1VarA = com.garmin.android.apps.connectmobile.q1.b.a(0, string, R.string.common_shop_now, R.string.lbl_close, v0Var);
                    pVar.B = q1VarA;
                    androidx.fragment.app.v childFragmentManager = pVar.getChildFragmentManager();
                    childFragmentManager.getClass();
                    q1VarA.v6(childFragmentManager, "challengeErrorDialogTag");
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
