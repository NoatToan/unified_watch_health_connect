package sa0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.wifi.WiFiNetworksViewModel", f = "WiFiNetworksViewModel.kt", l = {79}, m = "scanWiFiNetworks", v = 2)
public final class q extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f158231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f158232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f158233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f158234d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar, t13.d<? super q> dVar) {
        super(dVar);
        this.f158233c = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f158232b = obj;
        this.f158234d |= Integer.MIN_VALUE;
        return n.x4(this.f158233c, 0L, this);
    }
}
