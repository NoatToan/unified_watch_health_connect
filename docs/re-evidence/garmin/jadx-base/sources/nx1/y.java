package nx1;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.domain.usecase.WorkoutStepsScreensUseCase", f = "WorkoutStepsScreensUseCase.kt", l = {574, 575, 576}, m = "initWorkoutStepsScreensForPredefinedPlanRestart", v = 2)
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f128267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f128268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f128269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f128270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f128271e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(c0 c0Var, t13.d<? super y> dVar) {
        super(dVar);
        this.f128270d = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f128269c = obj;
        this.f128271e |= Integer.MIN_VALUE;
        return this.f128270d.d(null, null, null, this);
    }
}
