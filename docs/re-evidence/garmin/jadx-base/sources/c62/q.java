package c62;

import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import java.util.Iterator;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.MultiSportsWorkoutDetailsViewModel", f = "MultiSportsWorkoutDetailsViewModel.kt", l = {80}, m = "populateExerciseListMap", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WorkoutDetailsDTO f24855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Iterator f24856b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.workouts.data.model.h0 f24857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p f24859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24860f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f24859e = pVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24858d = obj;
        this.f24860f |= Integer.MIN_VALUE;
        return p.h5(this.f24859e, null, this);
    }
}
