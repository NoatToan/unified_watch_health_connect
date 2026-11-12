package zn2;

import ch.qos.logback.classic.Logger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewUserDataManager", f = "NewUserDataManager.kt", l = {236}, m = "getDevices", v = 2)
public final class p2 extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f205728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f205729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205730c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(g1 g1Var, t13.d<? super p2> dVar) {
        super(dVar);
        this.f205729b = g1Var;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205728a = obj;
        this.f205730c |= Integer.MIN_VALUE;
        Logger logger = g1.f205525n;
        return this.f205729b.H(false, this);
    }
}
