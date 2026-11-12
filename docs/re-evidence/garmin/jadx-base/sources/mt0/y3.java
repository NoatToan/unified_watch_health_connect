package mt0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lmt0/y3;", "Landroidx/lifecycle/x1$c;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/h0;", "challenge", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/j0;", "team", "", "currentUserProfileId", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/model/h0;Lcom/garmin/android/apps/connectmobile/leaderboard/model/j0;J)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class y3 implements androidx.lifecycle.x1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.leaderboard.model.h0 f120938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.leaderboard.model.j0 f120939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f120940c;

    public y3(com.garmin.android.apps.connectmobile.leaderboard.model.h0 h0Var, com.garmin.android.apps.connectmobile.leaderboard.model.j0 j0Var, long j8) {
        h0Var.getClass();
        j0Var.getClass();
        this.f120938a = h0Var;
        this.f120939b = j0Var;
        this.f120940c = j8;
    }

    @Override // androidx.lifecycle.x1.c
    public final <T extends androidx.lifecycle.u1> T create(Class<T> cls) {
        cls.getClass();
        return new x3(this.f120938a, this.f120939b, this.f120940c);
    }
}
