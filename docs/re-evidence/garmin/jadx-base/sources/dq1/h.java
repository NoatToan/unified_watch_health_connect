package dq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.domain.GraduationConsentRefreshCoordinator", f = "GraduationConsentRefreshCoordinator.kt", l = {202}, m = "clearLatestFullConsentRefresh", v = 2)
public final class h extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f60748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f60749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f60750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f60751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(d dVar, t13.d<? super h> dVar2) {
        super(dVar2);
        this.f60750c = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60749b = obj;
        this.f60751d |= Integer.MIN_VALUE;
        d.a aVar = d.f60719j;
        return this.f60750c.d(this);
    }
}
