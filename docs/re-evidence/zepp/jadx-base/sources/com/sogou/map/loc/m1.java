package com.sogou.map.loc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import io.flutter.plugins.connectivity.ConnectivityBroadcastReceiver;

/* JADX INFO: loaded from: classes18.dex */
final class m1 {
    private final Context a;
    private final ConnectivityManager b;
    private NetworkInfo d;
    private o1 e;
    private boolean c = false;
    private final BroadcastReceiver f = new n1(this);

    public m1(Context context) {
        this.a = context;
        this.b = j0.C(context);
    }

    public static /* synthetic */ boolean g(m1 m1Var) {
        NetworkInfo networkInfo = m1Var.d;
        return networkInfo != null && networkInfo.getType() == 1 && m1Var.d.isConnected();
    }

    public final synchronized m1 b() {
        ConnectivityManager connectivityManager = this.b;
        if (connectivityManager != null && !this.c) {
            this.c = true;
            this.d = connectivityManager.getActiveNetworkInfo();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(ConnectivityBroadcastReceiver.CONNECTIVITY_ACTION);
            intentFilter.setPriority(1000);
            this.a.registerReceiver(this.f, intentFilter);
            return this;
        }
        return this;
    }

    public final void d(o1 o1Var) {
        this.e = o1Var;
    }

    public final synchronized m1 e() {
        if (this.b != null && this.c) {
            this.c = false;
            this.a.unregisterReceiver(this.f);
            return this;
        }
        return this;
    }
}
