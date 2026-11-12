package c62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel", f = "WorkoutDetailsViewModel.kt", l = {358}, m = "fetchMyWorkoutsClonedFromSource", v = 2)
public final class u1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f24907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24910d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, t13.d<? super u1> dVar) {
        super(dVar);
        this.f24909c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24908b = obj;
        this.f24910d |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.workouts.presentation.details.f.z4(this.f24909c, null, null, this);
    }
}
