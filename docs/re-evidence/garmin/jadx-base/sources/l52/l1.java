package l52;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.workouts.data.WorkoutsRepositoryImpl", f = "WorkoutsRepositoryImpl.kt", l = {116}, m = "getWorkoutsAsync", v = 2)
public final class l1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f110303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f110304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f110305c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(z zVar, t13.d<? super l1> dVar) {
        super(dVar);
        this.f110304b = zVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f110303a = obj;
        this.f110305c |= Integer.MIN_VALUE;
        return this.f110304b.l(this);
    }
}
