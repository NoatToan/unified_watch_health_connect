package dq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.domain.GraduationConsentRefreshCoordinator", f = "GraduationConsentRefreshCoordinator.kt", l = {91, 202, 214, 96}, m = "fetchPendingConsents", v = 2)
public final class i extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.a f60752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f60753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f60754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f60755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f60756e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, t13.d<? super i> dVar2) {
        super(dVar2);
        this.f60755d = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60754c = obj;
        this.f60756e |= Integer.MIN_VALUE;
        return this.f60755d.e(this);
    }
}
