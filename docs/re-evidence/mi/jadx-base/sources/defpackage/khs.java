package defpackage;

import com.xiaomi.push.service.XMPushService;

/* JADX INFO: loaded from: classes11.dex */
public class khs implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ XMPushService f23862a;

    public khs(XMPushService xMPushService) {
        this.f23862a = xMPushService;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f23862a.f439a = true;
        try {
            x9s.o("try to trigger the wifi digest broadcast.");
            Object systemService = this.f23862a.getApplicationContext().getSystemService("MiuiWifiService");
            if (systemService != null) {
                zbs.n(systemService, "sendCurrentWifiDigestInfo", new Object[0]);
            }
        } catch (Throwable unused) {
        }
    }
}
