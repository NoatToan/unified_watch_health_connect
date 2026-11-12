package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {1349}, m = "hasUnprocessedCommitsForDevice", v = 2)
public final class b3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f205436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f205437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205438c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(g1 g1Var, t13.d<? super b3> dVar) {
        super(dVar);
        this.f205437b = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205436a = obj;
        this.f205438c |= Integer.MIN_VALUE;
        return this.f205437b.Y(0L, null, this);
    }
}
