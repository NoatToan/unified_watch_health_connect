package gn2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@v13.e(c = "com.garmin.device.wifi.WifiDataHandler", f = "WifiDataHandler.kt", l = {394}, m = "storeNetworks")
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f78142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f78143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f78144c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(c cVar, t13.d<? super m> dVar) {
        super(dVar);
        this.f78143b = cVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f78142a = obj;
        this.f78144c |= Integer.MIN_VALUE;
        return this.f78143b.r(null, null, this);
    }
}
