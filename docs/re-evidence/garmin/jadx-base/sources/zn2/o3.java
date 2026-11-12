package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {1302}, m = "verifyCardVerificationCallbackUrl", v = 2)
public final class o3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f205718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f205719b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(g1 g1Var, t13.d<? super o3> dVar) {
        super(dVar);
        this.f205719b = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205718a = obj;
        this.f205720c |= Integer.MIN_VALUE;
        return this.f205719b.m0(null, null, this);
    }
}
