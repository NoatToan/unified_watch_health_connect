package com.mapbox.common;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
class ConnectionChangeCallback extends ConnectivityManager.NetworkCallback {
    private final WeakReference<Reachability> reachability;

    public ConnectionChangeCallback(Reachability reachability) {
        this.reachability = new WeakReference<>(reachability);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyReachability$0() {
        Reachability reachability = this.reachability.get();
        if (reachability != null) {
            reachability.onNetworkChanged();
        }
    }

    private void notifyReachability() throws Throwable {
        boolean z14 = Looper.myLooper() == Looper.getMainLooper();
        a aVar = new a(this, 0);
        if (z14) {
            aVar.run();
        } else {
            new Handler(Looper.getMainLooper()).post(aVar);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) throws Throwable {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) throws Throwable {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) throws Throwable {
        notifyReachability();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() throws Throwable {
        notifyReachability();
    }
}
