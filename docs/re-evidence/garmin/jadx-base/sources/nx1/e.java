package nx1;

import p005kotlin.Metadata;
import r53.p2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.domain.usecase.GetCompletedActivitiesStatsForTrainingPlanUseCase", f = "GetCompletedActivitiesStatsForTrainingPlanUseCase.kt", l = {15, 15}, m = "invoke", v = 2)
public final class e extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p2 f128220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f128222c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f128223d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, t13.d<? super e> dVar) {
        super(dVar);
        this.f128222c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f128221b = obj;
        this.f128223d |= Integer.MIN_VALUE;
        return this.f128222c.b(null, null, this);
    }
}
