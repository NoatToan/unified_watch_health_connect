package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {989}, m = "deletePaymentCard", v = 2)
public final class a2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f205415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f205416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f205417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(g1 g1Var, t13.d<? super a2> dVar) {
        super(dVar);
        this.f205417c = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205416b = obj;
        this.f205418d |= Integer.MIN_VALUE;
        return this.f205417c.q(null, null, this);
    }
}
