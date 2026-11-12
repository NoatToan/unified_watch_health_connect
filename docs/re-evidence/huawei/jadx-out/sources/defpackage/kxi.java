package defpackage;

import android.content.Context;
import android.os.Build;
import com.huawei.haf.application.BaseApplication;
import com.huawei.hihealth.HiDeviceInfo;
import com.huawei.hihealth.util.ReleaseLogUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OperationKey;
import com.huawei.utils.FoundationCommonUtil;
import health.compact.a.HuaweiHealth;
import health.compact.a.LogAnonymous;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class kxi {
    public static int c(Context context, int i) {
        return kxq.c().d(kwg.b().d(i), 0);
    }

    public static boolean c(int i, int i2, Context context) {
        if (context == null || i <= 0) {
            LogUtil.j("ManagerUtil", "checkUserId context is null or userID <= 0");
            return false;
        }
        String strD = kwg.b().d(i2);
        return strD != null && strD.equals(kxq.c().d(i));
    }

    public static boolean a(int i, int i2, Context context) {
        if (context == null || i2 < 0) {
            return false;
        }
        return kwg.b().d(i2, kxq.c().d(i));
    }

    public static int e(Context context, int i, int i2) {
        if (context == null || i < 0) {
            LogUtil.j("ManagerUtil", "getCheckAppUserId appid or context error");
            return 0;
        }
        kwg kwgVarB = kwg.b();
        kxq kxqVarC = kxq.c();
        if (i2 <= 0) {
            LogUtil.d("ManagerUtil", "getCheckAppUserId get main userId");
            return kxqVarC.d(kwgVarB.d(i), 0);
        }
        if (kwgVarB.d(i, kxqVarC.d(i2))) {
            return i2;
        }
        LogUtil.j("ManagerUtil", "getCheckAppUserId no such owner from accountInfo, app is ", Integer.valueOf(i), " owner is ", Integer.valueOf(i2));
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005e  */
    public static int c(Context context, String str) {
        boolean zB;
        int iC = kwy.b(context).c(str);
        if (iC > 0) {
            return iC;
        }
        try {
            zB = !ljq.h(BaseApplication.b(), 0) ? ljq.b(BaseApplication.b(), 0) : false;
            try {
                try {
                    int iA = a(context, str);
                    if (zB) {
                        ljq.g(BaseApplication.b(), 0);
                    }
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return iA;
                } catch (Exception e) {
                    e = e;
                    ReleaseLogUtil.b("Debug_ManagerUtil", "getDeviceId: ", LogAnonymous.b(e));
                    if (zB) {
                        ljq.c(BaseApplication.b(), 0);
                    }
                    return 0;
                }
            } catch (Throwable th) {
                th = th;
                if (zB) {
                    ljq.c(BaseApplication.b(), 0);
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            zB = false;
        } catch (Throwable th2) {
            th = th2;
            zB = false;
            if (zB) {
                ljq.c(BaseApplication.b(), 0);
            }
            throw th;
        }
    }

    private static int a(Context context, String str) {
        int iC = kwy.b(context).c(str);
        if (iC > 0 || !FoundationCommonUtil.getAndroidId(context).equals(str)) {
            return iC;
        }
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("execute", "insertLocalPhone");
        ljv.d(context).c(OperationKey.HEALTH_APP_PROBABILITY_PROBLEM_85070032.value(), linkedHashMap, false);
        LogUtil.j("ManagerUtil", "getDeviceID deviceUUID = android_ ");
        HiDeviceInfo hiDeviceInfo = new HiDeviceInfo(32);
        hiDeviceInfo.setDeviceUniqueCode(str);
        hiDeviceInfo.setDeviceName(Build.MANUFACTURER);
        hiDeviceInfo.setFirmwareVersion(Build.VERSION.RELEASE);
        hiDeviceInfo.setHardwareVersion(Build.VERSION.RELEASE);
        hiDeviceInfo.setSoftwareVersion(Build.VERSION.RELEASE);
        hiDeviceInfo.setManufacturer(Build.PRODUCT);
        hiDeviceInfo.setModel(kwd.c());
        hiDeviceInfo.setDeviceMac(Build.USER);
        int iC2 = (int) kwy.b(context).c(hiDeviceInfo);
        LogUtil.d("ManagerUtil", "getDeviceID deviceUUID = android_ device = ", Integer.valueOf(iC2));
        return iC2;
    }

    public static boolean e(Context context, String str) {
        return str.equals(kwg.b().d(kwi.b().b(HuaweiHealth.c()))) && str.equals(kwg.b().d(kwi.b().b(ljp.e(context))));
    }
}
