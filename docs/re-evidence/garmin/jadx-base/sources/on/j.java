package on;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.data.HealthRepositoryImpl", f = "HealthRepositoryImpl.kt", l = {61, 71}, m = "updateDeviceMetadata", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sn.f f133032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f133033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f133034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f133035d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(a aVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f133034c = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133033b = obj;
        this.f133035d |= Integer.MIN_VALUE;
        int i14 = a.f132994d;
        return this.f133034c.g(null, this);
    }
}
