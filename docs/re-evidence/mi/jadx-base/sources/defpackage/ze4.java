package defpackage;

import android.net.ConnectivityManager;
import androidx.annotation.RequiresPermission;

/* JADX INFO: loaded from: classes.dex */
public final class ze4 {
    @RequiresPermission("android.permission.ACCESS_NETWORK_STATE")
    public static boolean a(ConnectivityManager connectivityManager) {
        return connectivityManager.isActiveNetworkMetered();
    }
}
