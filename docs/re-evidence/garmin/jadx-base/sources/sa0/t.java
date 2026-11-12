package sa0;

import ch.qos.logback.core.net.SyslogConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.wifi.WiFiNetworksViewModel", f = "WiFiNetworksViewModel.kt", l = {SyslogConstants.LOG_LOCAL2}, m = "testNetwork", v = 2)
public final class t extends v13.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f158250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f158251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f158252c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(n nVar, t13.d<? super t> dVar) {
        super(dVar);
        this.f158251b = nVar;
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        this.f158250a = obj;
        this.f158252c |= Integer.MIN_VALUE;
        return n.z4(this.f158251b, null, null, this);
    }
}
