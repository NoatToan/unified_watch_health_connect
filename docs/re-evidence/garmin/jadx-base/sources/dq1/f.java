package dq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.domain.GraduationConsentRefreshCoordinator", f = "GraduationConsentRefreshCoordinator.kt", l = {202, 112, 213, 213}, m = "awaitRefresh", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f60736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f60737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f60738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public z53.b f60739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f60740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f60741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ d f60742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f60743h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(dVar2);
        this.f60742g = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60741f = obj;
        this.f60743h |= Integer.MIN_VALUE;
        d.a aVar = d.f60719j;
        return this.f60742g.c(null, false, this);
    }
}
