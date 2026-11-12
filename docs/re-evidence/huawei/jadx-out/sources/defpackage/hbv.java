package defpackage;

import android.content.Context;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.sportservice.manager.ManagerComponent;
import com.huawei.health.sportservice.template.ComponentName;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.utils.FoundationCommonUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes31.dex */
public class hbv {
    public static boolean b(int i) {
        return i > 0 && i < 220;
    }

    public static boolean b(int i, int i2) {
        if (i2 == 264 || i2 == 265) {
            return i == 0 || i == 1 || i == 2;
        }
        return false;
    }

    public static boolean c(int i) {
        return i == 264 || i == 281 || i == 273;
    }

    public static boolean d(int i) {
        if (i == 264 || i == 265) {
            return true;
        }
        switch (i) {
            case OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER /* 273 */:
            case OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE /* 274 */:
            case OldToNewMotionPath.SPORT_TYPE_TREAD_MACHINE /* 275 */:
                return true;
            default:
                return false;
        }
    }

    public static boolean e(int i) {
        return i == 274 || i == 273 || i == 265;
    }

    public static boolean g(int i) {
        if (!e(i)) {
            return (i == 283 || eej.c() == null || !eej.c().isSupportWorkoutCapabilicy()) ? false : true;
        }
        DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.CONNECTED_MAIN_DEVICES_WITHOUT_AW70, null, "SportService_SportServiceUtils");
        if (deviceInfo == null) {
            LogUtil.j("SportService_SportServiceUtils", "isSportTypeForLinkage getConnectDeviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 0);
    }

    public static boolean f(int i) {
        return g(i) && eej.c() != null && eej.c().isSupportInformCloseOrOpen() && eej.c().isSupportWorkout();
    }

    public static int a(int i) {
        return f(i) ? 1 : 2;
    }

    public static String a(Context context) {
        return FoundationCommonUtil.getAndroidId(context);
    }

    public static ManagerComponent b(Map<String, ManagerComponent> map, int i) {
        if (map == null) {
            LogUtil.j("SportService_SportServiceUtils", "getAchieveComponent managerMap == null");
            return null;
        }
        if (i == 283) {
            return map.get(ComponentName.SKIP_ACHIEVE_MANAGER);
        }
        switch (i) {
            case 400000:
                return map.get(ComponentName.STAND_FLEXION_ACHIEVE_MANAGER);
            case 400001:
                return map.get(ComponentName.SUPINE_LEG_ACHIEVE_MANAGER);
            default:
                LogUtil.a("SportService_SportServiceUtils", "getAchieveComponent sportType:", Integer.valueOf(i));
                return null;
        }
    }
}
