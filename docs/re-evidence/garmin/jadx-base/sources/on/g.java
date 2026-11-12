package on;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.data.HealthRepositoryImpl", f = "HealthRepositoryImpl.kt", l = {104}, m = "updateActivityName", v = 2)
public final class g extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f133019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f133020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133021c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(a aVar, t13.d<? super g> dVar) {
        super(dVar);
        this.f133020b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133019a = obj;
        this.f133021c |= Integer.MIN_VALUE;
        return this.f133020b.d(null, null, null, this);
    }
}
