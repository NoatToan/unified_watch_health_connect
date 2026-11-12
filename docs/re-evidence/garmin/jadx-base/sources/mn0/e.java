package mn0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.healthstatus.domain.GetHealthStatusDailyMetricValuesUseCase", f = "GetHealthStatusDailyMetricValuesUseCase.kt", l = {139}, m = "getMetricExtraDetails", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f119701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f119702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f119703c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, t13.d<? super e> dVar2) {
        super(dVar2);
        this.f119702b = dVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f119701a = obj;
        this.f119703c |= Integer.MIN_VALUE;
        return this.f119702b.a(null, null, this);
    }
}
