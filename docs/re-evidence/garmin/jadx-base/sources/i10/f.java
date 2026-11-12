package i10;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connections.groups.challenges.GroupChallengeLeaderboardListPagingSource", f = "GroupChallengeLeaderboardListPagingSource.kt", l = {53, 60, 79, 86, 109, 116}, m = "load", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f87045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f87046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f87047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f87048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f87049e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f87050f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f87051g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f87050f = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f87049e = obj;
        this.f87051g |= Integer.MIN_VALUE;
        return this.f87050f.e(null, this);
    }
}
