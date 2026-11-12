package defpackage;

import android.content.Context;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lsn {
    public static boolean c(Context context) {
        if (context != null) {
            return GooglePlayServicesUtil.isGooglePlayServicesAvailable(context) == 0;
        }
        LogUtil.j("GoogleServiceUtils", "isInstallGooglePlayServicesNoDialog context is null");
        return false;
    }
}
