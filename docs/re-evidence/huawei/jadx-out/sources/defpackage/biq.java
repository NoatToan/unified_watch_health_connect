package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes23.dex */
public class biq {
    private static ConnectivityManager e;

    public static boolean d(Context context) {
        ConnectivityManager connectivityManagerA;
        NetworkInfo activeNetworkInfo;
        return (context == null || (connectivityManagerA = a(context)) == null || (activeNetworkInfo = connectivityManagerA.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    public static int c(Context context) {
        return b(b(context));
    }

    private static ConnectivityManager a(Context context) {
        if (e == null) {
            e = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
        }
        return e;
    }

    public static NetworkInfo b(Context context) {
        ConnectivityManager connectivityManagerA = a(context);
        if (connectivityManagerA != null) {
            return connectivityManagerA.getActiveNetworkInfo();
        }
        return null;
    }

    public static int b(NetworkInfo networkInfo) {
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
