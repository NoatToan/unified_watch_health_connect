package mn0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.domain.GetHealthStatusDailyMetricValuesUseCase", f = "GetHealthStatusDailyMetricValuesUseCase.kt", l = {146}, m = "getOvernightHrvSummaries", v = 2)
public final class f extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f119704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f119705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f119706c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar, t13.d<? super f> dVar2) {
        super(dVar2);
        this.f119705b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119704a = obj;
        this.f119706c |= Integer.MIN_VALUE;
        return this.f119705b.b(null, this);
    }
}
