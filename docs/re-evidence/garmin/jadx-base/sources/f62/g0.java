package f62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.WorkoutEditCreateViewModel", f = "WorkoutEditCreateViewModel.kt", l = {575, 578}, m = "getPace", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public m52.k f69242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f69243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.r f69244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f69245d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.garmin.android.apps.connectmobile.workouts.presentation.edit.r rVar, t13.d<? super g0> dVar) {
        super(dVar);
        this.f69244c = rVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f69243b = obj;
        this.f69245d |= Integer.MIN_VALUE;
        return this.f69244c.I4(null, this);
    }
}
