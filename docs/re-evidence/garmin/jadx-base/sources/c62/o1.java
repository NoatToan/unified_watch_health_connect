package c62;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel", f = "WorkoutDetailsViewModel.kt", l = {1029}, m = "createWorkout-0E7RQCE", v = 2)
public final class o1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WorkoutDetailsDTO f24823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, t13.d<? super o1> dVar) {
        super(dVar);
        this.f24825c = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f24824b = obj;
        this.f24826d |= Integer.MIN_VALUE;
        int i14 = com.garmin.android.apps.connectmobile.workouts.presentation.details.f.J0;
        Object objJ4 = this.f24825c.J4(null, null, this);
        return objJ4 == u13.a.COROUTINE_SUSPENDED ? objJ4 : o13.q.a(objJ4);
    }
}
