package c62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel", f = "WorkoutDetailsViewModel.kt", l = {370}, m = "getExerciseList", v = 2)
public final class z1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24940c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, t13.d<? super z1> dVar) {
        super(dVar);
        this.f24939b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24938a = obj;
        this.f24940c |= Integer.MIN_VALUE;
        return this.f24939b.P4(null, false, this);
    }
}
