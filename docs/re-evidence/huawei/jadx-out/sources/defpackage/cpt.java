package defpackage;

import android.text.TextUtils;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class cpt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f31242b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f31243c;
    private static Map<String, ArrayList<Long>> d = new ConcurrentHashMap(16);

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            LogUtil.e("ReconnectPowerConsumptionUtil", "isAllowReconnect deviceIdentify is empty.");
            return false;
        }
        ArrayList<Long> arrayList = d.get(str2);
        if (arrayList == null) {
            LogUtil.e("ReconnectPowerConsumptionUtil", "isAllowReconnect list is null.");
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (arrayList) {
            Iterator<Long> it = arrayList.iterator();
            while (it.hasNext()) {
                if (jCurrentTimeMillis - it.next().longValue() > 3600000) {
                    it.remove();
                }
            }
        }
        if (arrayList.size() <= 20) {
            return true;
        }
        ReleaseLogUtil.d("DEVMGR_ReconnectPowerConsumptionUtil", "isAllowReconnect remainConnectCount is more than 20.");
        if (!TextUtils.isEmpty(str)) {
            cqp.a(100052, str, "", "");
        }
        return false;
    }

    public static void a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("ReconnectPowerConsumptionUtil", "updateAbnormalDeviceInfo deviceIdentify is empty.");
            return;
        }
        if (i == 4 || i == 3) {
            e(str);
        } else if (i == 2) {
            d.remove(str);
        } else {
            LogUtil.e("ReconnectPowerConsumptionUtil", "updateAbnormalDeviceInfo other connect state no handle.");
        }
    }

    private static void e(String str) {
        LogUtil.b("ReconnectPowerConsumptionUtil", "addDeviceInfo deviceIdentify: ", cpl.a(str));
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (str.equals(f31242b) && jCurrentTimeMillis - f31243c < 500) {
            ReleaseLogUtil.d("ReconnectPowerConsumptionUtil", "The same device reports two statuses during a pairing process.");
            f31242b = str;
            f31243c = jCurrentTimeMillis;
            return;
        }
        f31242b = str;
        f31243c = jCurrentTimeMillis;
        if (!d.containsKey(str)) {
            LogUtil.e("ReconnectPowerConsumptionUtil", "addDeviceInfo deviceInfo is not exist.");
            ArrayList<Long> arrayList = new ArrayList<>(16);
            arrayList.add(Long.valueOf(System.currentTimeMillis()));
            d.put(str, arrayList);
            return;
        }
        ArrayList<Long> arrayList2 = d.get(str);
        if (arrayList2 != null) {
            synchronized (arrayList2) {
                arrayList2.add(Long.valueOf(System.currentTimeMillis()));
            }
            d.put(str, arrayList2);
            LogUtil.e("ReconnectPowerConsumptionUtil", "addDeviceInfo deviceInfo is exist:", Integer.valueOf(arrayList2.size()));
        }
    }
}
