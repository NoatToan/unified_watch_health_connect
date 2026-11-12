package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {212}, m = "getAllDevices", v = 2)
public final class d2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g1 f205478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f205479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f205480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205481d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(g1 g1Var, t13.d<? super d2> dVar) {
        super(dVar);
        this.f205480c = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205479b = obj;
        this.f205481d |= Integer.MIN_VALUE;
        return this.f205480c.t(false, this);
    }
}
