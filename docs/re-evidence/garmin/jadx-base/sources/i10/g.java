package i10;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.connections.groups.challenges.GroupChallengeLeaderboardListPagingSource", f = "GroupChallengeLeaderboardListPagingSource.kt", l = {137}, m = "replaceUserProfile", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f87052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f87053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f87054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f87055d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f87054c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f87053b = obj;
        this.f87055d |= Integer.MIN_VALUE;
        int i14 = e.f87034l;
        return this.f87054c.g(null, this);
    }
}
