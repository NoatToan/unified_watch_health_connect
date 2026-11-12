package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* JADX INFO: loaded from: classes20.dex */
public class xpf {
    public static boolean c() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) xml.d().getSystemService("connectivity");
            if (connectivityManager == null) {
                xnd.d("BaseOverSeaUtil", "isNetworkConnected has no ConnectivityManager");
                return false;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return (activeNetworkInfo != null && activeNetworkInfo.isConnected()) || e(connectivityManager);
        } catch (RuntimeException unused) {
            xnd.a("BaseOverSeaUtil", "isNetworkConnected error Runtime");
        } catch (Exception unused2) {
            xnd.a("BaseOverSeaUtil", "isNetworkConnected error");
        }
    }

    private static boolean e(ConnectivityManager connectivityManager) {
        xnd.d("BaseOverSeaUtil", "judgeNetAgain start");
        if (Build.VERSION.SDK_INT >= 29) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                xnd.d("BaseOverSeaUtil", "judgeNetAgain has no NetworkCapabilities");
                return false;
            }
            if (networkCapabilities.hasCapability(12)) {
                xnd.d("BaseOverSeaUtil", "judgeNetAgain true 12");
                return true;
            }
        }
        return false;
    }
}
