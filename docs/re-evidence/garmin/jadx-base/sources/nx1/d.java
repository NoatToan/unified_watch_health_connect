package nx1;

import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.domain.usecase.GetCompletedActivitiesStatsForTrainingPlanUseCase", f = "GetCompletedActivitiesStatsForTrainingPlanUseCase.kt", l = {21}, m = "getCompletedActivityStatsDuringPlan", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DateTime f128216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f128217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f128218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f128219d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f128218c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f128217b = obj;
        this.f128219d |= Integer.MIN_VALUE;
        return this.f128218c.a(null, null, this);
    }
}
