package ei0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl", f = "FollowRepoImpl.kt", l = {51, 57, 59}, m = "setApprovalRequired", v = 2)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f64255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f64256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f64257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64258d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(e eVar, t13.d<? super k0> dVar) {
        super(dVar);
        this.f64257c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64256b = obj;
        this.f64258d |= Integer.MIN_VALUE;
        return this.f64257c.z0(false, this);
    }
}
