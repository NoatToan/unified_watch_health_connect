package nx1;

import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.domain.usecase.WorkoutStepsScreensUseCase", f = "WorkoutStepsScreensUseCase.kt", l = {429, 430}, m = "initWorkoutStepsScreensForPrimaries", v = 2)
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList f128201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f128202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f128203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c0 f128204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f128205e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, t13.d<? super b0> dVar) {
        super(dVar);
        this.f128204d = c0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f128203c = obj;
        this.f128205e |= Integer.MIN_VALUE;
        return this.f128204d.e(null, null, false, this);
    }
}
