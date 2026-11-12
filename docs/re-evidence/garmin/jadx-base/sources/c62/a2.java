package c62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel", f = "WorkoutDetailsViewModel.kt", l = {603}, m = "getFbtWorkoutCompatibleActivities", v = 2)
public final class a2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24682c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, t13.d<? super a2> dVar) {
        super(dVar);
        this.f24681b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24680a = obj;
        this.f24682c |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.workouts.presentation.details.f.C4(this.f24681b, this);
    }
}
