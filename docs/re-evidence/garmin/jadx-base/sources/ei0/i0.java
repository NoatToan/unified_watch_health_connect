package ei0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl", f = "FollowRepoImpl.kt", l = {38}, m = "sendFollowRequest", v = 2)
public final class i0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f64241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f64242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f64243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(e eVar, t13.d<? super i0> dVar) {
        super(dVar);
        this.f64243c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64242b = obj;
        this.f64244d |= Integer.MIN_VALUE;
        return this.f64243c.i0(null, this);
    }
}
