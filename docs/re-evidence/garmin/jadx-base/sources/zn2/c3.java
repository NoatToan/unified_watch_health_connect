package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {593}, m = "isMaxNumberOfCardsReached", v = 2)
public final class c3 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f205458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f205459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f205460c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f205461d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(g1 g1Var, t13.d<? super c3> dVar) {
        super(dVar);
        this.f205460c = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205459b = obj;
        this.f205461d |= Integer.MIN_VALUE;
        return this.f205460c.Z(0L, this);
    }
}
