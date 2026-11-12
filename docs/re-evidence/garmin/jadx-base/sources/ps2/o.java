package ps2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.garminpay.wallet.DeviceWallet", f = "DeviceWallet.kt", l = {804}, m = "getProducts", v = 2)
public final class o extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ms2.e f140528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f140529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f140530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f140531d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(n nVar, t13.d<? super o> dVar) {
        super(dVar);
        this.f140530c = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f140529b = obj;
        this.f140531d |= Integer.MIN_VALUE;
        return this.f140530c.j(null, this);
    }
}
