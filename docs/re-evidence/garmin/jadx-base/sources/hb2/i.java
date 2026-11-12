package hb2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes8.dex */
public class i {
    static {
        Pattern.compile("(https?://).+").matcher("");
    }

    public static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        return (context == null || (activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }
}
