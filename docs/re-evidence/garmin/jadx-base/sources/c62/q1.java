package c62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel", f = "WorkoutDetailsViewModel.kt", l = {1446, 1451}, m = "ensureWorkoutSaved-IoAF18A", v = 2)
public final class q1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f24861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24864d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, t13.d<? super q1> dVar) {
        super(dVar);
        this.f24863c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f24862b = obj;
        this.f24864d |= Integer.MIN_VALUE;
        int i14 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
        Object objL4 = this.f24863c.L4(this);
        return objL4 == u13.a.COROUTINE_SUSPENDED ? objL4 : o13.q.a(objL4);
    }
}
