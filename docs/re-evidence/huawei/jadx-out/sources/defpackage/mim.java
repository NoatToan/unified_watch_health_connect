package defpackage;

import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.ProcessUtil;
import health.compact.a.SharedPreferenceManager;

/* JADX INFO: loaded from: classes10.dex */
public class mim {
    public static String d(String str) {
        return SharedPreferenceManager.b("DeviceSettingConfigUtil", str, "");
    }

    public static void a(String str, String str2) {
        SharedPreferenceManager.c("DeviceSettingConfigUtil", str, str2);
    }

    public static void d(String str, String str2) {
        b(str, str2, null);
    }

    public static void b(final String str, final String str2, final IBaseResponseCallback iBaseResponseCallback) {
        mhs.a().setSwitchSetting(str, str2, new IBaseResponseCallback() { // from class: mim.2
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                String str3 = str;
                LogUtil.a("DeviceSettingConfigUtil", "saveSwitchSetting switchKey:", str3, " errorCode:", Integer.valueOf(i), " switchSetting:", str3);
                if (i == 0) {
                    mim.a(str, str2);
                }
                IBaseResponseCallback iBaseResponseCallback2 = iBaseResponseCallback;
                if (iBaseResponseCallback2 != null) {
                    iBaseResponseCallback2.a(i, obj);
                }
            }
        });
    }

    public static void e(final DeviceInfo deviceInfo, final String str, String str2) {
        if (!ProcessUtil.b()) {
            LogUtil.j("DeviceSettingConfigUtil", "setDeviceSwitchSetting is not MainProcess");
        } else {
            b(str, str2, new IBaseResponseCallback() { // from class: mim.1
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    String str3 = str;
                    LogUtil.a("DeviceSettingConfigUtil", "setDeviceSwitchSetting switchKey:", str3, " errorCode:", Integer.valueOf(i), " switchSetting:", str3);
                    if (i == 0) {
                        lvb.e().b("notify_device_setting_changer", deviceInfo, 0, str);
                    }
                }
            });
        }
    }
}
