package ou1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase", f = "TrainingPlanFitnessStatsUseCase.kt", l = {497}, m = "getLactateThresholdHeartRate", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocalDate f134116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f134117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f134118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134119d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(i iVar, t13.d<? super x> dVar) {
        super(dVar);
        this.f134118c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134117b = obj;
        this.f134119d |= Integer.MIN_VALUE;
        return this.f134118c.k(null, null, null, this);
    }
}
