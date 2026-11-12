package xm0;

import com.garmin.android.apps.connectmobile.leaderboard.model.d0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.leaderboard.GroupLeaderboardListItemPagingSource", f = "GroupLeaderboardListItemPagingSource.kt", l = {114, 117, 125}, m = "getGroupLeaderboardV2", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d0 f191430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f191431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f191432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f191433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o f191434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f191435f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f191434e = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f191433d = obj;
        this.f191435f |= Integer.MIN_VALUE;
        return this.f191434e.f(null, null, 0, 0, this);
    }
}
