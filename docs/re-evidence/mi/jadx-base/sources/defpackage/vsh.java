package defpackage;

import com.tencent.mmkv.MMKV;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnPluginLog;

/* JADX INFO: loaded from: classes5.dex */
public class vsh {
    public static void a(String str) {
        RnPluginLog.i("delDeviceNativeData,did=" + str);
        MMKV.G("rn.plugin.record.id", 2).J(str);
    }

    public static String b(String str) {
        String strK = MMKV.G("rn.plugin.record.id", 2).k(str, "");
        RnPluginLog.i("getNativePrivacyConfirmationVersion,did=" + str + ",version=" + strK);
        return strK;
    }

    public static void c(String str, String str2) {
        zie.a().b(str, str2);
        RnPluginLog.i("setNativePrivacyConfirmationVersion,did=" + str + ",version=" + str2);
        MMKV.G("rn.plugin.record.id", 2).u(str, str2);
    }
}
