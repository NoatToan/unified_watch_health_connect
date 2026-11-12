package defpackage;

import android.content.Context;
import android.net.wifi.WifiManager;

/* JADX INFO: loaded from: classes4.dex */
public final class pkr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WifiManager f30508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WifiManager.WifiLock f30509b;
    public boolean c;
    public boolean d;

    public pkr(Context context) {
        this.f30508a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void a(boolean z) {
        if (z && this.f30509b == null) {
            WifiManager wifiManager = this.f30508a;
            if (wifiManager == null) {
                toe.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f30509b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.c = z;
        c();
    }

    public void b(boolean z) {
        this.d = z;
        c();
    }

    public final void c() {
        WifiManager.WifiLock wifiLock = this.f30509b;
        if (wifiLock == null) {
            return;
        }
        if (this.c && this.d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
