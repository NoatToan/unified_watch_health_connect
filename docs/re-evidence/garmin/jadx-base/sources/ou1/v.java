package ou1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase", f = "TrainingPlanFitnessStatsUseCase.kt", l = {549}, m = "getFunctionalThresholdPower", v = 2)
public final class v extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocalDate f134112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f134113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f134114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134115d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(i iVar, t13.d<? super v> dVar) {
        super(dVar);
        this.f134114c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134113b = obj;
        this.f134115d |= Integer.MIN_VALUE;
        return this.f134114c.j(null, null, null, this);
    }
}
