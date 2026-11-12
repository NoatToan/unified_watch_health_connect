package yt0;

import com.garmin.android.apps.connectmobile.v2;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.leaderboard.repository.BadgeChallengesRepository", f = "BadgeChallengesRepository.kt", l = {44, 49}, m = "getAvailableBadgeChallenges", v = 2)
public final class c0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f199439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f199440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f199441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v2.b f199442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f199443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x f199444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f199445g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(x xVar, t13.d<? super c0> dVar) {
        super(dVar);
        this.f199444f = xVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f199443e = obj;
        this.f199445g |= Integer.MIN_VALUE;
        return this.f199444f.b(0, 0, false, this);
    }
}
