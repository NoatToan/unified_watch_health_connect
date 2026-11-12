package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {260, 262}, m = "getSingleDevice", v = 2)
public final class w2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f205918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f205919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f205920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205921d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(g1 g1Var, t13.d<? super w2> dVar) {
        super(dVar);
        this.f205920c = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205919b = obj;
        this.f205921d |= Integer.MIN_VALUE;
        return this.f205920c.O(0L, this);
    }
}
