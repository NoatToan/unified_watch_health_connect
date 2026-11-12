package com.huawei.updatesdk.sdk.foundation.utils.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes20.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConnectivityManager f29914a;

    public static boolean d(Context context) {
        ConnectivityManager connectivityManagerB;
        if (context == null || (connectivityManagerB = b(context)) == null) {
            return false;
        }
        NetworkInfo activeNetworkInfo = connectivityManagerB.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return a(connectivityManagerB);
        }
        return true;
    }

    public static int c(Context context) {
        return a(a(context));
    }

    private static ConnectivityManager b(Context context) {
        if (f29914a == null) {
            f29914a = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        }
        return f29914a;
    }

    private static boolean a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasCapability(16);
    }

    private static NetworkInfo a(Context context) {
        ConnectivityManager connectivityManagerB = b(context);
        if (connectivityManagerB != null) {
            return connectivityManagerB.getActiveNetworkInfo();
        }
        return null;
    }

    public static int a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            int type = networkInfo.getType();
            if (1 == type || 13 == type) {
                return 1;
            }
            if (type == 0) {
                switch (networkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case 15:
                        return 3;
                    case 13:
                        return 4;
                    default:
                        return 0;
                }
            }
        }
        return 0;
    }
}
