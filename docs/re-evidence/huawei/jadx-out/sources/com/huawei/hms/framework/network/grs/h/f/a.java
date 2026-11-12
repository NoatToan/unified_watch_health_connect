package com.huawei.hms.framework.network.grs.h.f;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.huawei.hms.framework.common.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f13342a = "a";

    public static boolean a(Context context) {
        String str = f13342a;
        Logger.i(str, "isNetCapabilityValidated start");
        if (context == null) {
            Logger.w(str, "Context is null");
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            Logger.w(str, "connectivityManager is null");
            return false;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            Logger.w(str, "no activeNetwork");
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
            }
            Logger.w(str, "getNetworkCapabilities is null");
            return false;
        } catch (SecurityException e) {
            Logger.e(f13342a, "getNetworkCapabilities error: " + e.getMessage());
            return false;
        }
    }
}
