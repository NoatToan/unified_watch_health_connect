package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {200}, m = "getUser", v = 2)
public final class y2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f205947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f205948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205949c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(g1 g1Var, t13.d<? super y2> dVar) {
        super(dVar);
        this.f205948b = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205947a = obj;
        this.f205949c |= Integer.MIN_VALUE;
        return this.f205948b.Q(false, this);
    }
}
