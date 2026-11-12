package uu;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.badges.redesign.BadgesLeaderboardPagingSource", f = "BadgesLeaderboardPagingSource.kt", l = {50}, m = "replaceLeaderboardProfile", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f172722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Integer f172723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f172724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f172725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f172726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f172727f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f172726e = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f172725d = obj;
        this.f172727f |= Integer.MIN_VALUE;
        return this.f172726e.f(null, null, null, this);
    }
}
