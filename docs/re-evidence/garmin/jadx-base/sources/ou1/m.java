package ou1;

import org.joda.time.LocalDate;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase", f = "TrainingPlanFitnessStatsUseCase.kt", l = {615}, m = "getCriticalSwimSpeed", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LocalDate f134076a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f134077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f134078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i f134079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f134080e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f134079d = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134078c = obj;
        this.f134080e |= Integer.MIN_VALUE;
        return this.f134079d.c(null, null, false, this);
    }
}
