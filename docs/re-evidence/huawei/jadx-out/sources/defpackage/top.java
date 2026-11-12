package defpackage;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes18.dex */
public class top {
    public static boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith(".calendar");
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith(".totemweather");
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.endsWith(".contacts");
    }

    public static boolean a() {
        return d() || j() || e() || g() || i();
    }

    public static boolean d() {
        DeviceInfo deviceInfoD = mgg.d("DataSyncSwitchUtils");
        if (deviceInfoD == null) {
            LogUtil.j("DataSyncSwitchUtils", "isSupportCalendarDataSync deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 21);
    }

    public static boolean i() {
        DeviceInfo deviceInfoD = mgg.d("DataSyncSwitchUtils");
        if (deviceInfoD == null) {
            LogUtil.j("DataSyncSwitchUtils", "isSupportHealthCalendarSync deviceInfo is null");
            return false;
        }
        boolean zC = mga.c(deviceInfoD);
        LogUtil.a("DataSyncSwitchUtils", "getSingleFrameDevice: ", Integer.valueOf(deviceInfoD.getSingleFrameDevice()));
        if (zC) {
            if (!CommonUtil.bg() || deviceInfoD.getSingleFrameDevice() == 1) {
                return eey.d(deviceInfoD, 184);
            }
            return false;
        }
        return eey.d(deviceInfoD, 171);
    }

    public static boolean j() {
        DeviceInfo deviceInfoD = mgg.d("DataSyncSwitchUtils");
        if (deviceInfoD == null) {
            LogUtil.j("DataSyncSwitchUtils", "isSupportWeatherDataSync deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfoD, 22);
    }

    public static boolean e() {
        DeviceInfo deviceInfoD = mgg.d("DataSyncSwitchUtils");
        if (deviceInfoD == null) {
            LogUtil.j("DataSyncSwitchUtils", "isSupportContactDataSync deviceInfo is null");
            return false;
        }
        boolean zD = eey.d(deviceInfoD, 23);
        boolean zD2 = eey.d(deviceInfoD, OldToNewMotionPath.SPORT_TYPE_BASKETBALL);
        ReleaseLogUtil.d("R_DataSyncSwitchUtils", "isSupportContactDataSync isSyncContact:", Boolean.valueOf(zD), " isSupportSportContact:", Boolean.valueOf(zD2));
        return zD || zD2;
    }

    public static boolean b() {
        DeviceInfo deviceInfoD = mgg.d("DataSyncSwitchUtils");
        if (deviceInfoD != null) {
            return deviceInfoD.getSingleFrameDevice() == 1;
        }
        LogUtil.j("DataSyncSwitchUtils", "isSupportContactDataSync deviceInfo is null");
        return false;
    }

    public static boolean g() {
        return meo.a().c();
    }

    public static String c() {
        return e((Predicate<String>) new Predicate() { // from class: tor
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return top.a((String) obj);
            }
        });
    }

    public static String d(DeviceInfo deviceInfo) {
        if (!eey.d(deviceInfo, 21) || deviceInfo.getSingleFrameDevice() == 1) {
            return null;
        }
        return e((Predicate<String>) new Predicate() { // from class: tou
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return top.e((String) obj);
            }
        });
    }

    public static String a(DeviceInfo deviceInfo) {
        if (eey.d(deviceInfo, 22)) {
            return e((Predicate<String>) new Predicate() { // from class: tos
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return top.b((String) obj);
                }
            });
        }
        return null;
    }

    public static String e(Predicate<String> predicate) {
        if (CommonUtil.bg() && CommonUtil.ch()) {
            Intent intent = new Intent("com.huawei.intent.action.APP_DATA_SYNC_SWITCH");
            intent.addCategory("android.intent.category.DEFAULT");
            PackageManager packageManager = BaseApplication.getContext().getPackageManager();
            if (packageManager == null) {
                return null;
            }
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            if (CollectionUtils.a(listQueryIntentActivities)) {
                return null;
            }
            LogUtil.a("DataSyncSwitchUtils", "getSystemSupportSyncAppPackage aps:", Integer.valueOf(listQueryIntentActivities.size()));
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                if (resolveInfo.activityInfo != null && predicate.test(resolveInfo.activityInfo.packageName)) {
                    return resolveInfo.activityInfo.packageName;
                }
            }
        }
        return null;
    }
}
