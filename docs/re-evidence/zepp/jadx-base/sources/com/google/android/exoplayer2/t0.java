package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Log;

/* JADX INFO: loaded from: classes2.dex */
final class t0 {
    private static final String e = "WifiLockManager";
    private static final String f = "ExoPlayer:WifiLockManager";

    @Nullable
    private final WifiManager a;

    @Nullable
    private WifiManager.WifiLock b;
    private boolean c;
    private boolean d;

    public t0(Context context) {
        this.a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.b;
        if (wifiLock == null) {
            return;
        }
        if (this.c && this.d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void a(boolean enabled) {
        if (enabled && this.b == null) {
            WifiManager wifiManager = this.a;
            if (wifiManager == null) {
                Log.w(e, "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, f);
                this.b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.c = enabled;
        c();
    }

    public void b(boolean stayAwake) {
        this.d = stayAwake;
        c();
    }
}
