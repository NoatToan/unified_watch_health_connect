package ou1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase", f = "TrainingPlanFitnessStatsUseCase.kt", l = {66}, m = "getCyclingAchievementStats", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f134081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f134082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134083c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(i iVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f134082b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134081a = obj;
        this.f134083c |= Integer.MIN_VALUE;
        return this.f134082b.d(null, null, this);
    }
}
