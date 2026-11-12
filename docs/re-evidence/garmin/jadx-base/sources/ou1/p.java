package ou1;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.domain.TrainingPlanFitnessStatsUseCase", f = "TrainingPlanFitnessStatsUseCase.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "getFitnessCoachStatsAPI", v = 2)
public final class p extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f134098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f134099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f134100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f134101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(i iVar, t13.d<? super p> dVar) {
        super(dVar);
        this.f134100c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f134099b = obj;
        this.f134101d |= Integer.MIN_VALUE;
        return this.f134100c.e(null, null, this);
    }
}
