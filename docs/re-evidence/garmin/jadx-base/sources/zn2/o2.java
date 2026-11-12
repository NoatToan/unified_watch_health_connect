package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {251}, m = "getDeviceSuspendable", v = 2)
public final class o2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f205714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f205715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f205716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(g1 g1Var, t13.d<? super o2> dVar) {
        super(dVar);
        this.f205716c = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205715b = obj;
        this.f205717d |= Integer.MIN_VALUE;
        return this.f205716c.G(0L, this, false);
    }
}
