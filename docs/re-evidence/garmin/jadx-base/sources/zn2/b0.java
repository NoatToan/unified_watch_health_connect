package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayNetworkManager", f = "NewFitPayNetworkManager.kt", l = {702}, m = "configureNetworkManager", v = 2)
public final class b0 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z53.b f205422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f205423b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f205424c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205425d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(u0 u0Var, t13.d<? super b0> dVar) {
        super(dVar);
        this.f205424c = u0Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205423b = obj;
        this.f205425d |= Integer.MIN_VALUE;
        return this.f205424c.a(this);
    }
}
