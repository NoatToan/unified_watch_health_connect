package i71;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.trainingstatus.domain.dashboard.LastTrainingStatusDeviceDataSourceImpl", f = "LastTrainingStatusDeviceDataSourceImpl.kt", l = {13, 17, 24}, m = "fetchData", v = 2)
public final class u extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f91998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f91999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f92000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f92001d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(t tVar, t13.d<? super u> dVar) {
        super(dVar);
        this.f92000c = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f91999b = obj;
        this.f92001d |= Integer.MIN_VALUE;
        return this.f92000c.a(false, this);
    }
}
