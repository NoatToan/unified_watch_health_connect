package mt0;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.challenges.PagedLeaderboardChallengesDataFilter", f = "PagedLeaderboardChallengesDataFilter.kt", l = {18}, m = "updateAvailableFilters", v = 2)
public final class k3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f120685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f120686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l3 f120687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f120688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(l3 l3Var, t13.d<? super k3> dVar) {
        super(dVar);
        this.f120687c = l3Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f120686b = obj;
        this.f120688d |= Integer.MIN_VALUE;
        return this.f120687c.a(null, this);
    }
}
