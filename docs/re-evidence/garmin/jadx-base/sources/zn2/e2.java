package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {222}, m = "getAllHostDevices", v = 2)
public final class e2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f205491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f205492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205493c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(g1 g1Var, t13.d<? super e2> dVar) {
        super(dVar);
        this.f205492b = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205491a = obj;
        this.f205493c |= Integer.MIN_VALUE;
        return this.f205492b.u(this);
    }
}
