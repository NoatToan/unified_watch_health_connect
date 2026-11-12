package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class mgt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, mgp> f41664a = new HashMap(16);
    private static int e;

    public static void d(String str, int i) {
        mgp mgpVar;
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceBatteryInfo", "configBattery id is empty");
            return;
        }
        if (f41664a.containsKey(str)) {
            mgpVar = f41664a.get(str);
            mgpVar.c(i);
        } else {
            mgpVar = new mgp(i);
        }
        f41664a.put(str, mgpVar);
    }

    public static void d(String str, mgp mgpVar) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceBatteryInfo", "configBatteryCollection id is empty");
        } else {
            f41664a.put(str, mgpVar);
        }
    }

    public static void e(int i) {
        e = i;
    }

    public static int b(String str) {
        return a(str).d();
    }

    public static mgp a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DeviceBatteryInfo", "fetchDeviceBattery id is empty");
            return new mgp(-1);
        }
        mgp mgpVar = f41664a.get(str);
        if (mgpVar != null) {
            return mgpVar;
        }
        LogUtil.j("DeviceBatteryInfo", "fetchDeviceBattery device battery is null");
        return new mgp(-1);
    }
}
