package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.example.statistics.export.OneTrackConstant;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes11.dex */
public class ubs implements Callable<xbs> {
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public xbs call() {
        NetworkInfo activeNetworkInfo;
        Context contextB = odt.b();
        if (contextB == null) {
            return null;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) contextB.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
            if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return null;
            }
            return new xbs(activeNetworkInfo);
        } catch (Exception unused) {
            return null;
        }
    }
}
