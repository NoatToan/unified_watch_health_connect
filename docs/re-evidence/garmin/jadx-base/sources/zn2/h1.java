package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {1429, 1430}, m = "acceptTerms", v = 2)
public final class h1 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f205567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f205568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f205569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205570d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(g1 g1Var, t13.d<? super h1> dVar) {
        super(dVar);
        this.f205569c = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205568b = obj;
        this.f205570d |= Integer.MIN_VALUE;
        return this.f205569c.a(null, null, this);
    }
}
