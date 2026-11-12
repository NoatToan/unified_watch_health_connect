package c62;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutScheduleDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel", f = "WorkoutDetailsViewModel.kt", l = {665, 678, 673, 682}, m = "fetchExerciseList", v = 2)
public final class r1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WorkoutDetailsDTO f24869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m52.k f24870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z52.a f24871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r53.j f24872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WorkoutDetailsDTO f24873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WorkoutScheduleDTO f24874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l1 f24875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f24876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f24877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24879k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, t13.d<? super r1> dVar) {
        super(dVar);
        this.f24878j = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24877i = obj;
        this.f24879k |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.workouts.presentation.details.f.x4(this.f24878j, this);
    }
}
