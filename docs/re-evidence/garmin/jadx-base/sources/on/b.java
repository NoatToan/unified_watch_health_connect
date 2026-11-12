package on;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.health.data.HealthRepositoryImpl", f = "HealthRepositoryImpl.kt", l = {89}, m = "deleteActivity", v = 2)
public final class b extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f132998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f132999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f133000c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, t13.d<? super b> dVar) {
        super(dVar);
        this.f132999b = aVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f132998a = obj;
        this.f133000c |= Integer.MIN_VALUE;
        return this.f132999b.f(null, null, this);
    }
}
