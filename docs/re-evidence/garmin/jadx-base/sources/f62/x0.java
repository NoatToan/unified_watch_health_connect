package f62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateViewModel", f = "WorkoutPreCreateViewModel.kt", l = {63}, m = "getExistingWorkoutNames", v = 2)
public final class x0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f69360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f69361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69362c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(u0 u0Var, t13.d<? super x0> dVar) {
        super(dVar);
        this.f69361b = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f69360a = obj;
        this.f69362c |= Integer.MIN_VALUE;
        return this.f69361b.A4(null, this);
    }
}
