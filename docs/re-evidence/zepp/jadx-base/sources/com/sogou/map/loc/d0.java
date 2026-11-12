package com.sogou.map.loc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiConfiguration;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes18.dex */
final class d0 extends BroadcastReceiver {
    private /* synthetic */ r1 a;

    public d0(r1 r1Var) {
        this.a = r1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        List<WifiConfiguration> configuredNetworks;
        try {
            String action = intent.getAction();
            if (!"android.net.wifi.WIFI_STATE_CHANGED".equals(action)) {
                if ("android.net.wifi.SCAN_RESULTS".equals(action)) {
                    new e0(this.a, (byte) 0).execute(1);
                    return;
                }
                return;
            }
            this.a.d = intent.getIntExtra("wifi_state", 4);
            this.a.e = intent.getIntExtra("previous_wifi_state", 4);
            r0.b("WIFI_STATE_CHANGED_ACTION: " + this.a.e + " -> " + this.a.d + ", " + this.a.q);
            synchronized (this.a.o) {
                if (!this.a.q && this.a.d != 3 && this.a.e == 3) {
                    this.a.f = false;
                }
                int i = this.a.d;
                if (i != 2) {
                    if (i != 3) {
                        if (this.a.p != null) {
                            r0.b("scan reject by wifistate");
                            this.a.p.b(null);
                        }
                        if (this.a.m != null) {
                            this.a.m.b(Boolean.FALSE);
                        }
                    } else {
                        if (this.a.q && (configuredNetworks = this.a.b.getConfiguredNetworks()) != null) {
                            for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                                if (wifiConfiguration.status != 1 && this.a.b.disableNetwork(wifiConfiguration.networkId)) {
                                    this.a.s.add(Integer.valueOf(wifiConfiguration.networkId));
                                }
                            }
                        }
                        if (this.a.m != null) {
                            this.a.m.b(Boolean.TRUE);
                        }
                    }
                }
            }
        } catch (RejectedExecutionException | Exception unused) {
        }
    }
}
