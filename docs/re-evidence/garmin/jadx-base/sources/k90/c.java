package k90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.BleDeviceDiscoveryFilterImpl", f = "BleDeviceDiscoveryFilterImpl.kt", l = {38}, m = "filterDevice", v = 2)
public final class c extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dk2.d f103437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f103438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f103439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f103440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, t13.d<? super c> dVar) {
        super(dVar);
        this.f103439c = bVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f103438b = obj;
        this.f103440d |= Integer.MIN_VALUE;
        return this.f103439c.a(null, null, this);
    }
}
