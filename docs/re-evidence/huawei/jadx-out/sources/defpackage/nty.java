package defpackage;

import com.huawei.health.sportservice.SportDataOutputApi;
import health.compact.a.LogUtil;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes11.dex */
public class nty {
    public static boolean d() {
        return gcn.c().isSportingStatus() || c() || b();
    }

    public static boolean b() {
        int iD = hcb.a().d();
        LogUtil.b("Track_SportStatusUtils", "isSportOrFitRunning fitState = ", Integer.valueOf(iD));
        return iD == 2 || iD == 5;
    }

    public static boolean c() {
        SportDataOutputApi sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
        if (sportDataOutputApi == null || sportDataOutputApi.getStatus() == 0 || sportDataOutputApi.getStatus() == 3) {
            return false;
        }
        LogUtil.b("Track_SportStatusUtils", "getIsSporting");
        return true;
    }

    public static boolean e() {
        SportDataOutputApi sportDataOutputApi = (SportDataOutputApi) Services.d("SportService", SportDataOutputApi.class);
        if (sportDataOutputApi == null || sportDataOutputApi.getStatus() != 0) {
            return false;
        }
        LogUtil.b("Track_SportStatusUtils", "getIsIdle");
        return true;
    }

    public static boolean a() {
        return gcn.c().getSportState() == 0 && e();
    }
}
