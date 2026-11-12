package yg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.livesessionview.ui.workout.WorkoutViewModel", f = "WorkoutViewModel.kt", l = {61}, m = "registerDataHandlerListener", v = 2)
public final class v0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f197224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f197225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f197226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(u0 u0Var, t13.d<? super v0> dVar) {
        super(dVar);
        this.f197225b = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f197224a = obj;
        this.f197226c |= Integer.MIN_VALUE;
        return u0.x4(this.f197225b, null, this);
    }
}
