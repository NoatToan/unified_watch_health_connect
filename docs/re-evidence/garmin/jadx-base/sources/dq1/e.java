package dq1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.startup.domain.GraduationConsentRefreshCoordinator", f = "GraduationConsentRefreshCoordinator.kt", l = {202, 130, 213, 213}, m = "awaitInFlightRefresh", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f60730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f60731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z53.b f60732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f60733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f60734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f60735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(dVar2);
        this.f60734e = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f60733d = obj;
        this.f60735f |= Integer.MIN_VALUE;
        d.a aVar = d.f60719j;
        return this.f60734e.b(this);
    }
}
