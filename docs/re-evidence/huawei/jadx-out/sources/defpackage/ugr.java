package defpackage;

import com.huawei.haf.application.BaseApplication;
import health.compact.a.GRSManager;

/* JADX INFO: loaded from: classes19.dex */
public class ugr {
    private static String a() {
        return GRSManager.c(BaseApplication.b()).getUrl("healthCloudUrl");
    }

    public static String b() {
        return a() + "/healthExpansion/3rdService/getDoctorBasicInfo";
    }

    public static String c() {
        return a() + "/healthExpansion/3rdService/getDoctorImInfo";
    }

    public static String e() {
        return a() + "/healthExpansion/3rdService/queryExclusiveGuardianStatus";
    }
}
