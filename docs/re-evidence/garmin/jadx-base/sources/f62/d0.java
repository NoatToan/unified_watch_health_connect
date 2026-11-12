package f62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel", f = "WorkoutEditCreateViewModel.kt", l = {1541, 1551, 1559, 1560}, m = "checkStepLimitAndApply", v = 2)
public final class d0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l52.e f69225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f69226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.r f69227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f69228d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVar, t13.d<? super d0> dVar) {
        super(dVar);
        this.f69227c = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f69226b = obj;
        this.f69228d |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.workouts.presentation.edit.r.x4(this.f69227c, null, this);
    }
}
