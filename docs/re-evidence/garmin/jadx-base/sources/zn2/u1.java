package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {950}, m = "createTokenDpp", v = 2)
public final class u1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ep2.l f205872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f205873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f205874c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(g1 g1Var, t13.d<? super u1> dVar) {
        super(dVar);
        this.f205874c = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205873b = obj;
        this.f205875d |= Integer.MIN_VALUE;
        return this.f205874c.l(null, null, this);
    }
}
