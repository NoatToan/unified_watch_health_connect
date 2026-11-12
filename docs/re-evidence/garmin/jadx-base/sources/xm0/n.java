package xm0;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.group.details.leaderboard.GroupLeaderboardListItemPagingSource", f = "GroupLeaderboardListItemPagingSource.kt", l = {142}, m = "replaceLeaderboardProfile", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f191436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f191437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f191438c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f191439d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f191438c = oVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f191437b = obj;
        this.f191439d |= Integer.MIN_VALUE;
        return this.f191438c.g(null, this);
    }
}
