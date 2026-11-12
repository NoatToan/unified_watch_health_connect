package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayNetworkManager", f = "NewFitPayNetworkManager.kt", l = {262}, m = "getDevices", v = 2)
public final class h0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f205564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f205565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205566c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(u0 u0Var, t13.d<? super h0> dVar) {
        super(dVar);
        this.f205565b = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205564a = obj;
        this.f205566c |= Integer.MIN_VALUE;
        return this.f205565b.e(0, null, this);
    }
}
