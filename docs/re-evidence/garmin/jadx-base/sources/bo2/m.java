package bo2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel", f = "AlipayAppletInstallationViewModel.kt", l = {109}, m = "isDeviceOnBoardingRequired", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f19349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f19350c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f19349b = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f19348a = obj;
        this.f19350c |= Integer.MIN_VALUE;
        return this.f19349b.D4(this);
    }
}
