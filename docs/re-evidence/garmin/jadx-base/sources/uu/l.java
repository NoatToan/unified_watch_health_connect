package uu;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.BadgesLeaderboardPagingSource", f = "BadgesLeaderboardPagingSource.kt", l = {29, 33}, m = "load", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f172717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f172718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f172719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f172720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f172721e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n nVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f172720d = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f172719c = obj;
        this.f172721e |= Integer.MIN_VALUE;
        return this.f172720d.e(null, this);
    }
}
