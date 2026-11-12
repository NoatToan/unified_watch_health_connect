package defpackage;

import com.huawei.hihealth.HiAppInfo;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.HiHealthClient;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ljt {
    private static final List<String> e;

    static {
        ArrayList arrayList = new ArrayList();
        e = arrayList;
        arrayList.addAll(Arrays.asList("com.huawei.health", "com.huawei.hmos.health", "com.huawei.hmos.health.core", "com.huawei.iossporthealth", "com.aspiegel.health", BaseApplication.APP_PACKAGE_GOOGLE_HEALTH));
    }

    public static boolean c(int i, int i2) {
        if (i == i2) {
            return true;
        }
        kym kymVarJ = kwt.b().j(i);
        HiHealthClient hiHealthClient = new HiHealthClient();
        hiHealthClient.setHiAppInfo(kwi.b().c(kymVarJ.b()));
        hiHealthClient.setHiDeviceInfo(kwy.b(com.huawei.haf.application.BaseApplication.b()).b(kymVarJ.d()));
        kym kymVarJ2 = kwt.b().j(i2);
        HiHealthClient hiHealthClient2 = new HiHealthClient();
        hiHealthClient2.setHiAppInfo(kwi.b().c(kymVarJ2.b()));
        hiHealthClient2.setHiDeviceInfo(kwy.b(com.huawei.haf.application.BaseApplication.b()).b(kymVarJ2.d()));
        boolean zA = a(hiHealthClient, hiHealthClient2);
        LogUtil.a("HiDataSourceUtil", "clientId1= ", Integer.valueOf(i), " clientId2= ", Integer.valueOf(i2), "isSameDataSource result:", Boolean.valueOf(zA));
        return zA;
    }

    public static boolean a(HiHealthClient hiHealthClient, HiHealthClient hiHealthClient2) {
        if (hiHealthClient != null && hiHealthClient2 != null) {
            return a(hiHealthClient.getHiAppInfo()) && a(hiHealthClient2.getHiAppInfo()) && a(hiHealthClient.getHiDeviceInfo(), hiHealthClient2.getHiDeviceInfo());
        }
        LogUtil.a("HiDataSourceUtil", "the client is null, return false");
        return false;
    }

    private static boolean a(HiAppInfo hiAppInfo) {
        if (hiAppInfo == null) {
            LogUtil.a("HiDataSourceUtil", "appInfo is null, return false");
            return false;
        }
        return e.contains(hiAppInfo.getPackageName());
    }

    private static boolean a(HiDeviceInfo hiDeviceInfo, HiDeviceInfo hiDeviceInfo2) {
        if (hiDeviceInfo == null || hiDeviceInfo2 == null || hiDeviceInfo.getDeviceUniqueCode() == null || hiDeviceInfo2.getDeviceUniqueCode() == null) {
            return false;
        }
        return hiDeviceInfo.getDeviceUniqueCode().toUpperCase().replaceAll(":", "").replaceAll("#ANDROID21", "").equals(hiDeviceInfo2.getDeviceUniqueCode().toUpperCase().replaceAll(":", "").replaceAll("#ANDROID21", ""));
    }
}
