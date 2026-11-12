package c62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel", f = "WorkoutDetailsViewModel.kt", l = {1471, 1472}, m = "loadSavedWorkout", v = 2)
public final class d2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.lifecycle.w0 f24711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f24712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f24713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f24714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f24715e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24716f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24717g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, t13.d<? super d2> dVar) {
        super(dVar);
        this.f24716f = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24715e = obj;
        this.f24717g |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.workouts.presentation.details.f.F4(this.f24716f, null, null, null, this);
    }
}
