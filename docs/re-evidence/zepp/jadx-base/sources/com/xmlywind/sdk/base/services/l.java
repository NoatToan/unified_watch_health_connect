package com.xmlywind.sdk.base.services;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes22.dex */
public class l implements j.a {
    public k b = k.STOP;
    public WifiScanReceiver a = new WifiScanReceiver();

    public void a(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.net.wifi.SCAN_RESULTS");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        context.registerReceiver(this.a, intentFilter);
    }

    public void b(Context context) {
        context.unregisterReceiver(this.a);
    }

    @Override // com.xmlywind.sdk.base.services.j.a
    public boolean b() {
        k kVar = this.b;
        k kVar2 = k.RUNNING;
        if (kVar == kVar2) {
            return false;
        }
        a(com.xmlywind.sdk.common.a.n().af());
        this.b = kVar2;
        return true;
    }

    @Override // com.xmlywind.sdk.base.services.j.a
    public void c() {
        if (this.b == k.RUNNING) {
            b(com.xmlywind.sdk.common.a.n().af());
            this.b = k.STOP;
        }
    }
}
