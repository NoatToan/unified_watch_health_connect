package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {1508}, m = "getCardTransactions", v = 2)
public final class g2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f205540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f205541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205542c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(g1 g1Var, t13.d<? super g2> dVar) {
        super(dVar);
        this.f205541b = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205540a = obj;
        this.f205542c |= Integer.MIN_VALUE;
        return this.f205541b.v(null, this);
    }
}
