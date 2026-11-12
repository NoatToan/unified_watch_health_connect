package yt0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.ChallengesRepository", f = "ChallengesRepository.kt", l = {85, 101}, m = "getLimitedChallengesForLeaderBoard", v = 2)
public final class m0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f199545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j0 f199546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f199547c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(j0 j0Var, t13.d<? super m0> dVar) {
        super(dVar);
        this.f199546b = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199545a = obj;
        this.f199547c |= Integer.MIN_VALUE;
        return this.f199546b.b(null, this);
    }
}
