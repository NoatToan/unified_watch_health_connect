package ou1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase", f = "TrainingPlanFitnessStatsUseCase.kt", l = {79}, m = "getRunningAchievementStats", v = 2)
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f134008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f134009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f134010c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(i iVar, t13.d<? super b0> dVar) {
        super(dVar);
        this.f134009b = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134008a = obj;
        this.f134010c |= Integer.MIN_VALUE;
        return this.f134009b.m(null, null, this);
    }
}
