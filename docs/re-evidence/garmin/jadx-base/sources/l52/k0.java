package l52;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl", f = "WorkoutsRepositoryImpl.kt", l = {305}, m = "getExerciseListWithTranslation", v = 2)
public final class k0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c83.a0 f110295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.repcounting.model.c f110296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f110297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z f110298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f110299e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(z zVar, t13.d<? super k0> dVar) {
        super(dVar);
        this.f110298d = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f110297c = obj;
        this.f110299e |= Integer.MIN_VALUE;
        return this.f110298d.k(null, false, this);
    }
}
