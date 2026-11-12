package com.sogou.map.loc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;

/* JADX INFO: loaded from: classes18.dex */
final class n1 extends BroadcastReceiver {
    private /* synthetic */ m1 a;

    public n1(m1 m1Var) {
        this.a = m1Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            if (ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION.equals(intent.getAction())) {
                m1 m1Var = this.a;
                m1Var.d = m1Var.b == null ? null : this.a.b.getActiveNetworkInfo();
                if (this.a.e != null) {
                    if (m1.g(this.a)) {
                        r0.b("trigger onWifiConnected");
                        this.a.e.a();
                    } else {
                        r0.b("trigger onWifiDisconnected");
                        this.a.e.b();
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
