package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.example.statistics.export.OneTrackConstant;

/* JADX INFO: loaded from: classes2.dex */
public class vkg {
    public static NetworkInfo a(Context context) {
        return ((ConnectivityManager) context.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY)).getActiveNetworkInfo();
    }

    public static int b(Context context) {
        int i;
        NetworkInfo networkInfoA = a(context);
        if (networkInfoA == null || !networkInfoA.isAvailable()) {
            return -1;
        }
        if (networkInfoA.getType() == 1) {
            return 1;
        }
        if (networkInfoA.getType() != 0) {
            return 5;
        }
        switch (networkInfoA.getSubtype()) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
            case 16:
                i = 2;
                break;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
            case 17:
                return 3;
            case 13:
            case 18:
                i = 4;
                break;
            default:
                String subtypeName = networkInfoA.getSubtypeName();
                return (subtypeName.equalsIgnoreCase("TD-SCDMA") || subtypeName.equalsIgnoreCase("WCDMA") || subtypeName.equalsIgnoreCase("CDMA2000")) ? 3 : 5;
        }
        return i;
    }

    public static boolean c(Context context) {
        int iB = b(context);
        return 3 == iB || 2 == iB || 4 == iB;
    }

    public static boolean d(Context context) {
        NetworkInfo networkInfoA = a(context);
        return networkInfoA != null && networkInfoA.isConnected();
    }

    public static boolean e(Context context) {
        int iB = b(context);
        return 5 == iB || -1 == iB;
    }
}
