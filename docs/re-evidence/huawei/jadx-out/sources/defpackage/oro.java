package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.core.util.Pair;

/* JADX INFO: loaded from: classes13.dex */
public class oro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile boolean f44610a = true;

    public static Pair<Boolean, String> b(Context context) {
        StringBuilder sb = new StringBuilder();
        if (context == null) {
            sb.append("isNetworkAvailable: context is null.");
            ork.e("NetWorkUtil", "isNetworkAvailable: context is null.");
            f44610a = false;
            return new Pair<>(Boolean.valueOf(f44610a), sb.toString());
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                sb.append('|');
                sb.append("Network no Available: ConnectivityManager is null.");
                ork.e("NetWorkUtil", "Network no Available: ConnectivityManager is null.");
                f44610a = false;
                return new Pair<>(Boolean.valueOf(f44610a), sb.toString());
            }
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                sb.append('|');
                sb.append("Network no Available: ActiveNetwork is null.");
                ork.e("NetWorkUtil", "Network no Available: ActiveNetwork is null.");
                f44610a = false;
                return new Pair<>(Boolean.valueOf(f44610a), sb.toString());
            }
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities == null) {
                sb.append('|');
                sb.append("Network no Available: NetworkCapabilities is null.");
                ork.e("NetWorkUtil", "Network no Available: NetworkCapabilities is null.");
                f44610a = false;
                return new Pair<>(Boolean.valueOf(f44610a), sb.toString());
            }
            if (networkCapabilities.hasCapability(16)) {
                f44610a = true;
                return new Pair<>(Boolean.valueOf(f44610a), sb.toString());
            }
            sb.append('|');
            sb.append("Network not has capability.");
            ork.e("NetWorkUtil", "Network not has capability.");
            f44610a = connectivityManager.isDefaultNetworkActive();
            return new Pair<>(Boolean.valueOf(f44610a), sb.toString());
        } catch (IncompatibleClassChangeError e) {
            String str = "isNetworkAvailable IncompatibleClassChangeError " + ork.c(e);
            sb.append('|');
            sb.append(str);
            ork.b("NetWorkUtil", str);
            f44610a = false;
            return new Pair<>(Boolean.valueOf(f44610a), sb.toString());
        } catch (SecurityException e2) {
            String str2 = "isNetworkAvailable SecurityException " + ork.c(e2);
            sb.append('|');
            sb.append(str2);
            ork.b("NetWorkUtil", str2);
            f44610a = false;
            return new Pair<>(Boolean.valueOf(f44610a), sb.toString());
        }
    }

    public static boolean e(Context context) {
        Boolean bool = b(context).first;
        return bool != null && bool.booleanValue();
    }
}
