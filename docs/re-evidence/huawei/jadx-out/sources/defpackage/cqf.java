package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.haf.application.BaseApplication;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import health.compact.a.LogUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.SharedPreferenceManager;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class cqf {
    public static boolean b(Context context, String str) {
        if (context == null || str == null) {
            LogUtil.e("WearLinkCommonUtil", "isServiceRunning null");
            return false;
        }
        Object systemService = BaseApplication.b().getSystemService("activity");
        List<ActivityManager.RunningServiceInfo> runningServices = systemService instanceof ActivityManager ? ((ActivityManager) systemService).getRunningServices(30) : null;
        if (runningServices != null && runningServices.size() > 0) {
            Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
            while (it.hasNext()) {
                if (it.next().service.getClassName().equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String b() {
        String strSubstring;
        LogUtil.b("WearLinkCommonUtil", "WearLinkCommonUtil getSnInfo");
        String strE = cot.e();
        String upperCase = "unknown";
        if (!TextUtils.isEmpty("unknown")) {
            upperCase = strE.toUpperCase(Locale.ENGLISH);
        } else {
            LogUtil.e("WearLinkCommonUtil", "androidId is isEmpty");
        }
        String strEncodeToString = Base64.encodeToString(upperCase.getBytes(Charset.defaultCharset()), 0);
        if (strEncodeToString.length() >= 6) {
            strSubstring = strEncodeToString.substring(0, 6);
        } else {
            strSubstring = "000000";
        }
        LogUtil.b("WearLinkCommonUtil", "sn:", cpl.a(strSubstring));
        return strSubstring;
    }

    public static boolean c(Context context, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("WearLinkCommonUtil", "reconnectDeviceInfo is null");
            return false;
        }
        boolean z = deviceInfo.getSupportAccountSwitch() == 1;
        LogUtil.b("WearLinkCommonUtil", "reconnectDeviceInfo is ", deviceInfo.getDeviceName(), "isSupportAccountSwitch ", Boolean.valueOf(z));
        if (z) {
            return xgx.d().isLogin(context);
        }
        return true;
    }

    public static boolean b(com.huawei.devicesdk.entity.DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.e("WearLinkCommonUtil", "reconnectDeviceInfo is null");
            return false;
        }
        if (SharedPreferenceManager.b(Integer.toString(PrebakedEffectId.RT_FLY), "is_base_service_model", false)) {
            return false;
        }
        DeviceCapability deviceCapabilityD = cnk.c().d(deviceInfo.getDeviceMac());
        boolean zIsSupportAccountSwitch = deviceCapabilityD != null ? deviceCapabilityD.isSupportAccountSwitch() : false;
        LogUtil.b("WearLinkCommonUtil", "reconnectDeviceInfo is ", deviceInfo.getDeviceName(), "isSupportAccountSwitch ", Boolean.valueOf(zIsSupportAccountSwitch));
        if (zIsSupportAccountSwitch) {
            return xgx.d().isLogin(BaseApplication.b());
        }
        return true;
    }

    public static boolean d() {
        return ProcessUtil.c().endsWith(":PhoneService");
    }
}
