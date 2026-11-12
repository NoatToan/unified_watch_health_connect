package ou1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase", f = "TrainingPlanFitnessStatsUseCase.kt", l = {52}, m = "getActivitiesPerformanceStats", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f134066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f134067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134068c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f134067b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134066a = obj;
        this.f134068c |= Integer.MIN_VALUE;
        return this.f134067b.a(null, null, null, this);
    }
}
