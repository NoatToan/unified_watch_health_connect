package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {1670}, m = "getSecurityDomainByUrl", v = 2)
public final class v2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f205899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f205900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205901c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(g1 g1Var, t13.d<? super v2> dVar) {
        super(dVar);
        this.f205900b = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205899a = obj;
        this.f205901c |= Integer.MIN_VALUE;
        return this.f205900b.N(null, this);
    }
}
