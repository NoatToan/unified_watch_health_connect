package bo2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.alipay.AlipayAppletInstallationViewModel", f = "AlipayAppletInstallationViewModel.kt", l = {226, 227}, m = "pollUntil", v = 2)
public final class n extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e23.l f19351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e23.l f19352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19353c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f19354d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f19355e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(e eVar, t13.d<? super n> dVar) {
        super(dVar);
        this.f19354d = eVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f19353c = obj;
        this.f19355e |= Integer.MIN_VALUE;
        return e.z4(this.f19354d, null, null, this);
    }
}
