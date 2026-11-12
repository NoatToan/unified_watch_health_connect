package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes8.dex */
public class gqz {
    public static boolean b(Context context) {
        NetworkInfo activeNetworkInfo;
        return context != null && (context.getSystemService("connectivity") instanceof ConnectivityManager) && (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.getType() == 1;
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        return (context == null || !(context.getSystemService("connectivity") instanceof ConnectivityManager) || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected() || activeNetworkInfo.getType() == 1) ? false : true;
    }
}
