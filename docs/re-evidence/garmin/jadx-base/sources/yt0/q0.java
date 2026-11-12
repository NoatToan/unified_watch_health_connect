package yt0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.ChallengesRepository", f = "ChallengesRepository.kt", l = {107}, m = "updateLimitedChallenges", v = 2)
public final class q0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v2 f199580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.c0 f199581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f199582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j0 f199583d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f199584e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(j0 j0Var, t13.d<? super q0> dVar) {
        super(dVar);
        this.f199583d = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199582c = obj;
        this.f199584e |= Integer.MIN_VALUE;
        int i14 = j0.f199514c;
        return this.f199583d.d(null, this);
    }
}
