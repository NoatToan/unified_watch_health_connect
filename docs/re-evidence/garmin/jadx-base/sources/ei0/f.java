package ei0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.follow.FollowRepoImpl", f = "FollowRepoImpl.kt", l = {77}, m = "acceptIncomingFollowingRequest", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f64206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f64207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f64208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f64209d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f64208c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f64207b = obj;
        this.f64209d |= Integer.MIN_VALUE;
        return this.f64208c.I3(null, this);
    }
}
