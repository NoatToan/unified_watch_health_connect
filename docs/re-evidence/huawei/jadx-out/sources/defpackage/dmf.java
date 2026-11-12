package defpackage;

import com.huawei.haf.application.BaseApplication;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes27.dex */
public class dmf {
    public static String b() {
        return e() + "/dataStat/goalAchieve/querySummary";
    }

    public static String c() {
        return e() + "/dataStat/goalAchieve/queryEncourage";
    }

    private static String e() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl");
    }
}
