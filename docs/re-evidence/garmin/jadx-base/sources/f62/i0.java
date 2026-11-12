package f62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel", f = "WorkoutEditCreateViewModel.kt", l = {742, 743}, m = "onStepsChanged", v = 2)
public final class i0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f69255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.r f69256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f69257c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVar, t13.d<? super i0> dVar) {
        super(dVar);
        this.f69256b = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f69255a = obj;
        this.f69257c |= Integer.MIN_VALUE;
        m52.j jVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.f49273q;
        return this.f69256b.N4(this);
    }
}
