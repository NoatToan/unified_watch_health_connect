package g62;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.MultiSportViewModel", f = "MultiSportViewModel.kt", l = {385}, m = "getExerciseList", v = 2)
public final class y extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f76121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c f76122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f76123c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c cVar, t13.d<? super y> dVar) {
        super(dVar);
        this.f76122b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f76121a = obj;
        this.f76123c |= Integer.MIN_VALUE;
        return com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.c.W4(this.f76122b, null, false, this);
    }
}
