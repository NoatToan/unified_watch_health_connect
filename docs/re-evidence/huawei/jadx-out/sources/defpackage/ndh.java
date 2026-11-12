package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes11.dex */
public class ndh {
    public static String b() {
        return Build.DISPLAY;
    }

    public static void a(boolean z) {
        SharedPreferenceManager.a("1001", "key_remote_camera_capability", z);
    }

    public static boolean e() {
        return SharedPreferenceManager.b("1001", "key_remote_camera_capability", true);
    }

    private static String c() {
        String strE = e("key_phone_system_version_name");
        LogUtil.a("RemoteCameraUtils", "getSystemVersionName: ", strE);
        return strE;
    }

    public static void a(String str) {
        LogUtil.a("RemoteCameraUtils", "setSystemVersionName: ", str);
        b("key_phone_system_version_name", str);
    }

    private static String e(String str) {
        return SharedPreferenceManager.e(BaseApplication.b(), "1001", str);
    }

    private static int b(String str, String str2) {
        return SharedPreferenceManager.e(BaseApplication.b(), "1001", str, str2, null);
    }

    public static boolean d() {
        String strC = c();
        return TextUtils.isEmpty(strC) || TextUtils.isEmpty(b()) || !b().equals(strC);
    }

    public static boolean a(DeviceInfo deviceInfo) {
        if (eey.d(deviceInfo, 288)) {
            return true;
        }
        LogUtil.a("RemoteCameraUtils", "checkNewSupportCamera watch not support");
        com.huawei.devicesdk.entity.DeviceInfo deviceInfo2 = new com.huawei.devicesdk.entity.DeviceInfo();
        deviceInfo2.setSportVersion(deviceInfo.getSportVersion());
        deviceInfo2.setDeviceMac(deviceInfo.getDeviceIdentify());
        return cpg.b(deviceInfo2) && deviceInfo.getPowerSaveModel() != 1;
    }
}
