package mt0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.AdHocChallengeManagePlayersPagingSource", f = "AdHocChallengeManagePlayersPagingSource.kt", l = {44}, m = "load", v = 2)
public final class a0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public yc.h3.a f120502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f120503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f120504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f120505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z zVar, t13.d<? super a0> dVar) {
        super(dVar);
        this.f120504c = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f120503b = obj;
        this.f120505d |= Integer.MIN_VALUE;
        return this.f120504c.e(null, this);
    }
}
