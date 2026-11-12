package vc2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes11.dex */
public final class h {
    public static final b a(ConnectivityManager connectivityManager) {
        d dVar;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return b.c.f177084b;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        NetworkCapabilities networkCapabilities = activeNetwork != null ? connectivityManager.getNetworkCapabilities(activeNetwork) : null;
        if (networkCapabilities == null) {
            dVar = d.UNKNOWN;
        } else if (networkCapabilities.hasCapability(11)) {
            dVar = d.NOT_METERED;
        } else {
            dVar = networkCapabilities.hasCapability(25) ? d.TEMPORARILY_NOT_METERED : d.METERED;
        }
        return new b.C3312b(dVar);
    }

    public static final ConnectivityManager b(Context context) {
        Object systemService = context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            return (ConnectivityManager) systemService;
        }
        return null;
    }
}
