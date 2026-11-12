package l70;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl", f = "DashboardRepositoryImpl.kt", l = {617}, m = "fetchPersonalRecords", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f110828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f110829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110830c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(e eVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f110829b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f110828a = obj;
        this.f110830c |= Integer.MIN_VALUE;
        return e.a(this.f110829b, this);
    }
}
