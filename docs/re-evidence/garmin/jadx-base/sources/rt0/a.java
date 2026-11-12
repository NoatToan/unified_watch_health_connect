package rt0;

import p005kotlin.Metadata;
import t13.d;
import v13.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@e(c = "com.garmin.android.apps.connectmobile.leaderboard.data.WeeklyLeaderboardPagingSource", f = "WeeklyLeaderboardPagingSource.kt", l = {34, 38}, m = "load", v = 2)
public final class a extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f154494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f154495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f154496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f154497d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, d<? super a> dVar) {
        super(dVar);
        this.f154496c = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f154495b = obj;
        this.f154497d |= Integer.MIN_VALUE;
        return this.f154496c.e(null, this);
    }
}
