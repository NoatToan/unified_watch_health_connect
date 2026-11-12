package i62;

import androidx.lifecycle.y0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.msn.MSNWorkoutExerciseViewModel", f = "MSNWorkoutExerciseViewModel.kt", l = {48}, m = "fetchMSNWorkoutExerciseAsync", v = 2)
public final class d extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f91836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f91837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f91838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f91839d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, t13.d<? super d> dVar) {
        super(dVar);
        this.f91838c = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f91837b = obj;
        this.f91839d |= Integer.MIN_VALUE;
        return e.x4(this.f91838c, null, this);
    }
}
