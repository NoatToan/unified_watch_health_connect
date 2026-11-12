package on;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.data.HealthRepositoryImpl", f = "HealthRepositoryImpl.kt", l = {113}, m = "getAllActivities", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f133012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f133013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133014c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f133013b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f133012a = obj;
        this.f133014c |= Integer.MIN_VALUE;
        return this.f133013b.a(0, 0, this);
    }
}
