package ei0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl", f = "FollowRepoImpl.kt", l = {69}, m = "fetchApprovalText", v = 2)
public final class l extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f64259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f64260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64261c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, t13.d<? super l> dVar) {
        super(dVar);
        this.f64260b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64259a = obj;
        this.f64261c |= Integer.MIN_VALUE;
        return this.f64260b.K(this);
    }
}
