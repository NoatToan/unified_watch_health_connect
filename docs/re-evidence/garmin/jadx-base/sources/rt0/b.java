package rt0;

import java.util.List;
import p005kotlin.Metadata;
import t13.d;
import v13.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.leaderboard.data.WeeklyLeaderboardPagingSource", f = "WeeklyLeaderboardPagingSource.kt", l = {61}, m = "replaceLeaderboardProfile", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f154498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f154499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f154500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f154501d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, d<? super b> dVar) {
        super(dVar);
        this.f154500c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154499b = obj;
        this.f154501d |= Integer.MIN_VALUE;
        return this.f154500c.g(null, this);
    }
}
