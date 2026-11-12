package af;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import ue.u;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3027a = 0;

    static {
        u.b("NetworkStateTracker");
    }

    public static final ye.f a(ConnectivityManager connectivityManager) {
        boolean zHasCapability;
        connectivityManager.getClass();
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z14 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                zHasCapability = networkCapabilities != null ? networkCapabilities.hasCapability(16) : false;
            } catch (SecurityException unused) {
                u.a().getClass();
            }
            return new ye.f(z14, zHasCapability, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
        } catch (SecurityException unused2) {
            u.a().getClass();
            return new ye.f(false, false, false, true);
        }
    }
}
