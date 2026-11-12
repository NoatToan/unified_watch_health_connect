package defpackage;

import android.text.TextUtils;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes11.dex */
public class mpu {
    private static final Object e = new Object();
    private static Map<String, ArrayList<Long>> d = new ConcurrentHashMap(16);

    public static boolean d(String str) {
        synchronized (e) {
            if (TextUtils.isEmpty(str)) {
                LogUtil.j("DataSyncPowerConsumptionUtil", "isAllowReconnect deviceIdentify is empty.");
                return false;
            }
            ArrayList<Long> arrayList = d.get(str);
            if (arrayList == null) {
                LogUtil.j("DataSyncPowerConsumptionUtil", "isAllowReconnect list is null.");
                return true;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Iterator<Long> it = arrayList.iterator();
            while (it.hasNext()) {
                if (jCurrentTimeMillis - it.next().longValue() > 1800000) {
                    it.remove();
                }
            }
            if (arrayList.size() <= 5) {
                return true;
            }
            ReleaseLogUtil.e("DEVMGR_DataSyncPowerConsumptionUtil", "isAllowReconnect remainConnectCount is more than 5.");
            return false;
        }
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("DataSyncPowerConsumptionUtil", "updateAbnormalDeviceInfo deviceIdentify is empty.");
        } else {
            b(str);
        }
    }

    private static void b(String str) {
        LogUtil.a("DataSyncPowerConsumptionUtil", "addDeviceInfo deviceIdentify: ", cpl.a(str));
        if (!d.containsKey(str)) {
            LogUtil.j("DataSyncPowerConsumptionUtil", "addDeviceInfo deviceInfo is not exist.");
            ArrayList<Long> arrayList = new ArrayList<>(16);
            arrayList.add(Long.valueOf(System.currentTimeMillis()));
            d.put(str, arrayList);
            return;
        }
        ArrayList<Long> arrayList2 = d.get(str);
        if (arrayList2 != null) {
            arrayList2.add(Long.valueOf(System.currentTimeMillis()));
            d.put(str, arrayList2);
            LogUtil.j("DataSyncPowerConsumptionUtil", "addDeviceInfo deviceInfo is exist:", Integer.valueOf(arrayList2.size()));
        }
    }
}
