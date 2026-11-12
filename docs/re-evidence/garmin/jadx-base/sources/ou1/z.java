package ou1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase", f = "TrainingPlanFitnessStatsUseCase.kt", l = {468}, m = "getLactateThresholdSpeed", v = 2)
public final class z extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocalDate f134120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f134121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f134122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(i iVar, t13.d<? super z> dVar) {
        super(dVar);
        this.f134122c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134121b = obj;
        this.f134123d |= Integer.MIN_VALUE;
        return this.f134122c.l(null, null, null, this);
    }
}
