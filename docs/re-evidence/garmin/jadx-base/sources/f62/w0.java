package f62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutPreCreateViewModel", f = "WorkoutPreCreateViewModel.kt", l = {44, 47, 47}, m = "getDataAsync", v = 2)
public final class w0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.workouts.data.model.y f69354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f69355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f69356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f69357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69358e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(u0 u0Var, t13.d<? super w0> dVar) {
        super(dVar);
        this.f69357d = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f69356c = obj;
        this.f69358e |= Integer.MIN_VALUE;
        return this.f69357d.y4(this);
    }
}
