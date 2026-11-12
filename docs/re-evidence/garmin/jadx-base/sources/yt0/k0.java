package yt0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.ChallengesRepository", f = "ChallengesRepository.kt", l = {64, 74}, m = "getCompletedChallenges", v = 2)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f199523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f199524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.leaderboard.model.c0 f199525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f199526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0 f199527f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f199528g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(j0 j0Var, t13.d<? super k0> dVar) {
        super(dVar);
        this.f199527f = j0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199526e = obj;
        this.f199528g |= Integer.MIN_VALUE;
        return this.f199527f.a(0, 0, null, null, this);
    }
}
