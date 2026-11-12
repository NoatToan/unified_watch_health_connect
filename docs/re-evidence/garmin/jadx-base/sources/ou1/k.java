package ou1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase", f = "TrainingPlanFitnessStatsUseCase.kt", l = {101}, m = "getActivityPerformanceStats", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f134069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f134070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f134071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f134072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f134073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f134074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f134075g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f134074f = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134073e = obj;
        this.f134075g |= Integer.MIN_VALUE;
        return this.f134074f.b(null, null, null, false, 0.0d, false, this);
    }
}
