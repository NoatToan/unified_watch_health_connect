package mt0;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeTermsActivity;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a4 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 f120515b;

    public /* synthetic */ a4(com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var, int i14) {
        this.f120514a = i14;
        this.f120515b = w0Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f120514a;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var = this.f120515b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.a aVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.M0;
                f12.l.f68084a.getClass();
                if (f12.l.a.a().S0()) {
                    w0Var.p7();
                    h4 h4VarV7 = w0Var.v7();
                    if (h4VarV7.f120603c.length() > 0) {
                        ge1.b.T(androidx.lifecycle.v1.a(h4VarV7), null, null, new d4(h4VarV7, null), 3);
                    }
                } else {
                    AdHocChallengeTermsActivity.a aVar2 = AdHocChallengeTermsActivity.f37181c;
                    androidx.fragment.app.m mVarRequireActivity = w0Var.requireActivity();
                    aVar2.getClass();
                    Intent intent = new Intent(mVarRequireActivity, (Class<?>) AdHocChallengeTermsActivity.class);
                    intent.putExtra("GCM_challenge_is_vivokid", true);
                    w0Var.startActivityForResult(intent, 4);
                }
                return Unit.INSTANCE;
            case 1:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.M0;
                Context contextRequireContext = w0Var.requireContext();
                contextRequireContext.getClass();
                return new com.garmin.android.apps.connectmobile.leaderboard.challenges.x0(contextRequireContext, w0Var);
            default:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.a aVar4 = com.garmin.android.apps.connectmobile.leaderboard.challenges.w0.M0;
                return w0Var.requireActivity().getOnBackPressedDispatcher();
        }
    }
}
