package defpackage;

import com.xiaomi.ScaleConnectPreference;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.login.region.RegionManagerImpl;

/* JADX INFO: loaded from: classes7.dex */
public class qu6 {
    public static String a(String str, String str2) {
        String str3 = "scale_auth_key__" + str + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + str2;
        Logger.i("getAuthToken() key : " + str3, new Object[0]);
        return ScaleConnectPreference.getString(str3);
    }

    public static boolean b(String str) {
        return str.contains("yunmai.scales.ms3001");
    }

    public static void c(String str, String str2, String str3) {
        String str4 = "scale_auth_key__" + str + RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR + str2;
        Logger.i("saveAuthToken() key : " + str4, new Object[0]);
        ScaleConnectPreference.putString(str4, str3);
    }
}
