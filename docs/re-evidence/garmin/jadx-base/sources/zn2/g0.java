package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayNetworkManager", f = "NewFitPayNetworkManager.kt", l = {279}, m = "getDevice", v = 2)
public final class g0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f205522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f205523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205524c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(u0 u0Var, t13.d<? super g0> dVar) {
        super(dVar);
        this.f205523b = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205522a = obj;
        this.f205524c |= Integer.MIN_VALUE;
        return this.f205523b.d(null, this);
    }
}
