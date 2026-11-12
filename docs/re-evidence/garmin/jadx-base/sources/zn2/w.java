package zn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.NewFitPayDeviceServiceProvider", f = "NewFitPayDeviceServiceProvider.kt", l = {290}, m = "getBalanceThroughTransitOperationExecutor", v = 2)
public final class w extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f205902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f205903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f205904c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t tVar, t13.d<? super w> dVar) {
        super(dVar);
        this.f205903b = tVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f205902a = obj;
        this.f205904c |= Integer.MIN_VALUE;
        return t.f(this.f205903b, null, this);
    }
}
