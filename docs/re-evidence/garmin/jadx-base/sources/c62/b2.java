package c62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.details.WorkoutDetailsViewModel", f = "WorkoutDetailsViewModel.kt", l = {1067}, m = "getLatestCriticalSwimSpeed", v = 2)
public final class b2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f24687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.details.f f24688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24689c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, t13.d<? super b2> dVar) {
        super(dVar);
        this.f24688b = fVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f24687a = obj;
        this.f24689c |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.workouts.presentation.details.f.D4(this.f24688b, this);
    }
}
