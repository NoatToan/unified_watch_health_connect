package i62;

import androidx.lifecycle.y0;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.msn.MSNWorkoutListViewModel", f = "MSNWorkoutListViewModel.kt", l = {44}, m = "fetchMSNWorkoutsAsync", v = 2)
public final class k extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f91860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f91861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f91862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f91863d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, t13.d<? super k> dVar) {
        super(dVar);
        this.f91862c = lVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f91861b = obj;
        this.f91863d |= Integer.MIN_VALUE;
        return l.x4(this.f91862c, null, this);
    }
}
