package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {371}, m = "refreshAllCachedTransitCards", v = 2)
public final class h3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f205574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f205575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205576c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(g1 g1Var, t13.d<? super h3> dVar) {
        super(dVar);
        this.f205575b = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205574a = obj;
        this.f205576c |= Integer.MIN_VALUE;
        return this.f205575b.h0(this);
    }
}
