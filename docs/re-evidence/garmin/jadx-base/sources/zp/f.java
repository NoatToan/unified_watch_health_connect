package zp;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.repository.AvailableMetricsRepository", f = "AvailableMetricsRepository.kt", l = {35}, m = "getAvailableMetrics", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f206555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f206556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f206557c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(e eVar, t13.d<? super f> dVar) {
        super(dVar);
        this.f206556b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f206555a = obj;
        this.f206557c |= Integer.MIN_VALUE;
        return this.f206556b.a(this);
    }
}
