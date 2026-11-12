package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.selfupdate.appupdate.UpdateBase;
import com.huawei.hwversionmgr.utils.handler.AppCheckNewVersionHandler;
import health.compact.a.LocalBroadcast;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class nvg {
    public static void e(int i, int i2, String str) {
        d(i, i2, "", "", str);
    }

    public static void d(int i, int i2, String str, String str2, String str3) {
        LogUtil.a("WearOtaUpdateUtil", "broadcastCheckState: state = ", Integer.valueOf(i), ", result = ", Integer.valueOf(i2), ",content = ", str);
        Intent intent = new Intent("action_app_check_new_version_state");
        intent.addFlags(C.ENCODING_PCM_32BIT_BIG_ENDIAN);
        intent.putExtra("state", i);
        intent.putExtra("result", i2);
        intent.putExtra("content", str);
        intent.putExtra("extra_band_imei", str3);
        if (TextUtils.equals(str2, "true")) {
            intent.putExtra("isForced", true);
        } else {
            intent.putExtra("isForced", false);
        }
        intent.setPackage(BaseApplication.getContext().getPackageName());
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    public static void e(DeviceInfo deviceInfo, String str, UpdateBase updateBase, boolean z, AppCheckNewVersionHandler appCheckNewVersionHandler) {
        if (deviceInfo == null) {
            LogUtil.a("WearOtaUpdateUtil", "deviceInfo is null");
            return;
        }
        LogUtil.a("WearOtaUpdateUtil", "manualBandCheckNewVersion");
        e(10, -1, deviceInfo.getSecurityDeviceId());
        if (updateBase != null) {
            updateBase.checkBandNewVersion(deviceInfo.getProductType(), str, deviceInfo.getSecurityDeviceId(), z, appCheckNewVersionHandler);
        }
    }

    public static boolean e(Context context) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        if (context == null) {
            return false;
        }
        ActivityManager activityManager = context.getSystemService("activity") instanceof ActivityManager ? (ActivityManager) context.getSystemService("activity") : null;
        if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && runningTasks.size() > 0 && runningTasks.get(0).topActivity != null) {
            String className = runningTasks.get(0).topActivity.getClassName();
            LogUtil.a("WearOtaUpdateUtil", "current activity :", className);
            if (TextUtils.equals(className, "com.huawei.ui.main.stories.about.activity.update.AppUpdateDialogActivity") || TextUtils.equals(className, "com.huawei.ui.device.activity.update.UpdateVersionActivity") || TextUtils.equals(className, "com.huawei.ui.device.activity.update.DeviceOtaActivity")) {
                return true;
            }
        }
        return false;
    }

    public static void c() {
        Intent intent = new Intent("action_ota_check_new_version_state");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }
}
