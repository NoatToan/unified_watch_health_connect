package ou1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase", f = "TrainingPlanFitnessStatsUseCase.kt", l = {166}, m = "getFrogCoachDailyStatsAPI", v = 2)
public final class s extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f134104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f134105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f134106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134107d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(i iVar, t13.d<? super s> dVar) {
        super(dVar);
        this.f134106c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134105b = obj;
        this.f134107d |= Integer.MIN_VALUE;
        return this.f134106c.g(null, null, this);
    }
}
