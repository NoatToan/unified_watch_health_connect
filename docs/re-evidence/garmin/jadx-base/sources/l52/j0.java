package l52;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl", f = "WorkoutsRepositoryImpl.kt", l = {322}, m = "getExerciseListTranslated", v = 2)
public final class j0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.d[] f110285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f110286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f110287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f110288d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(z zVar, t13.d<? super j0> dVar) {
        super(dVar);
        this.f110287c = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f110286b = obj;
        this.f110288d |= Integer.MIN_VALUE;
        return this.f110287c.O(null, false, null, this);
    }
}
