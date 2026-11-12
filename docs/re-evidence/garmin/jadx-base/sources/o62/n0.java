package o62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditViewModel", f = "WorkoutStepEditViewModel.kt", l = {383}, m = "uploadAudioNote", v = 2)
public final class n0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f129725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j f129726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f129727c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVar, t13.d<? super n0> dVar) {
        super(dVar);
        this.f129726b = jVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f129725a = obj;
        this.f129727c |= Integer.MIN_VALUE;
        return this.f129726b.N4(this);
    }
}
