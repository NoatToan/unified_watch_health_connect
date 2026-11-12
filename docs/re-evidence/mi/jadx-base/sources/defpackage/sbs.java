package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes11.dex */
public class sbs extends ConnectivityManager.NetworkCallback {
    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        super.onAvailable(network);
        obs.u();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        super.onLost(network);
        obs.u();
    }
}
