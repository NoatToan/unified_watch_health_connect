package nx1;

import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.domain.usecase.WorkoutStepsScreensUseCase", f = "WorkoutStepsScreensUseCase.kt", l = {435, 460}, m = "initWorkoutStepsScreensForGetFitPlanRestart", v = 2)
public final class x extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f128262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f128263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f128264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f128265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f128266e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(c0 c0Var, t13.d<? super x> dVar) {
        super(dVar);
        this.f128265d = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f128264c = obj;
        this.f128266e |= Integer.MIN_VALUE;
        return this.f128265d.c(null, this);
    }
}
