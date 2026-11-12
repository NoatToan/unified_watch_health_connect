package k90;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.domain.discovery.BleDeviceTypeDiscoveryUseCase$startDeviceTypeDiscovery$1", f = "BleDeviceTypeDiscoveryUseCase.kt", l = {59, 62}, m = "invokeSuspend$sendDeviceFound", v = 2)
public final class m extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q53.t f103581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public dk2.d f103582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f103583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f103584d;

    public m(t13.d<? super m> dVar) {
        super(dVar);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f103583c = obj;
        this.f103584d |= Integer.MIN_VALUE;
        return l.a(null, null, null, null, null, this);
    }
}
