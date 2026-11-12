package k90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.BleDeviceTypeDiscoveryFilterImpl", f = "BleDeviceTypeDiscoveryFilterImpl.kt", l = {18}, m = "filterDevice", v = 2)
public final class j extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public dk2.d f103500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f103501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f103502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f103503d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, t13.d<? super j> dVar) {
        super(dVar);
        this.f103502c = iVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f103501b = obj;
        this.f103503d |= Integer.MIN_VALUE;
        return this.f103502c.a(null, this);
    }
}
