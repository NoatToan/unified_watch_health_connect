package mt0;

import android.view.View;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class q2 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0 f120826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.model.a0 f120827c;

    public /* synthetic */ q2(com.garmin.android.apps.connectmobile.leaderboard.challenges.f0 f0Var, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, int i14) {
        this.f120825a = i14;
        this.f120826b = f0Var;
        this.f120827c = a0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f120825a;
        com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var = this.f120827c;
        com.garmin.android.apps.connectmobile.leaderboard.challenges.f0 f0Var = this.f120826b;
        switch (i14) {
            case 0:
                int i15 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.b.f37472d;
                f0Var.f37467c.W4(a0Var.getUuid());
                break;
            default:
                int i16 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                f0Var.f37467c.p(a0Var.getUuid());
                break;
        }
    }
}
