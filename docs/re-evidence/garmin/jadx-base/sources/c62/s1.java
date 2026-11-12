package c62;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel", f = "WorkoutDetailsViewModel.kt", l = {619, 626, 626}, m = "fetchExtraMSNWorkoutDetailsAsync", v = 2)
public final class s1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WorkoutDetailsDTO f24882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WorkoutDetailsDTO f24883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public WorkoutDetailsDTO f24884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WorkoutDetailsDTO f24885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WorkoutDetailsDTO f24886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public /* synthetic */ Object f24889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24891j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, t13.d<? super s1> dVar) {
        super(dVar);
        this.f24890i = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24889h = obj;
        this.f24891j |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.workouts.presentation.details.f.y4(this.f24890i, null, null, this);
    }
}
